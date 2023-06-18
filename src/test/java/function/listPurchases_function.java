package function;

import core.basePage;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import page.listPurchases_page;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class listPurchases_function  {
    public listPurchases_page listPurchasesPage  = new listPurchases_page();
    public common_function commonFunction = new common_function();

    //lay tong so dong trong bang
    public int getTotalRowInTable(By by){
        commonFunction.scrollToElement(by);
        List<WebElement> elementList = DriverManager.getDriver().findElements(by);
        int rowTotal = elementList.size();
        System.out.println("Total Row : " + rowTotal);
        return rowTotal;
    }

    public void checkTotalInTable(){
        Assert.assertEquals(getTotalRowInTable(listPurchasesPage.rowInTable), 9);
    }

    //ham kiem tra dinh dang ngay cua cot Date
    public void checkDateFormat()  {
        int column = 2;                                                 // Date la cot 2 trong bang
        int rowTotal = getTotalRowInTable(listPurchasesPage.rowInTable);    //Tong so cot trong bang
        for (int i = 1; i<= rowTotal; i++){
            WebElement element = DriverManager.getDriver().findElement(By.xpath("//table[@id='POData']/tbody/tr[" + i + "]/td[" + column + "]"));
            commonFunction.scrollToElement(element);
            System.out.println(element.getText());

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");   // dinh dang ngay dung
            try{
                Date date = formatter.parse(element.getText());
            }catch (Exception e){
                e.printStackTrace();
                Assert.assertTrue(false);
            }

        }

    }

    //ham kiem tra sap xep DESC cua cot ID
    public void checkSortDESC(){
        int column = 3;                                                 // ID la cot 3 trong bang
        int rowTotal = getTotalRowInTable(listPurchasesPage.rowInTable);    //Tong so cot trong bang
        ArrayList<String> obtainedList = new ArrayList<>();             // Tao danh sach moi theo bang tren web
        for (int i = 1; i<= rowTotal; i++) {
            WebElement element = DriverManager.getDriver().findElement(By.xpath("//table[@id='POData']/tbody/tr[" + i + "]/td[" + column + "]"));
            commonFunction.scrollToElement(element);
            obtainedList.add(element.getText());                        //Them tung dong vao danh sach theo bang tren web (1)
            System.out.println(element.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList){
            sortedList.add(s);                                          //sao chep danh sach ra phien ban 2     (2)
            System.out.println(s);
        }
        Collections.sort(sortedList);
        sortedList.sort(Collections.reverseOrder());                    //Sap xep danh sach phien ban 2 theo DESC
        Assert.assertEquals(obtainedList,sortedList);                   //So sanh danh sach luc dau voi danh sach da sap xep .(1) va (2)

    }
}
