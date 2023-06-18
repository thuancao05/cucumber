package function;

import core.basePage;
import driver.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.addSale_page;

public class addSale_function  {
    public addSale_page addSalePage = new addSale_page();
    public common_function commonFunction = new common_function();


    public void inputCustomerAndProduct(){
        WebElement element = DriverManager.getDriver().findElement(addSalePage.seCus);
        element.click();
        commonFunction.sendKeys(addSalePage.txtCustomser, "1");
        commonFunction.sleep(1000);
        commonFunction.press(Keys.ENTER);
        commonFunction.sendKeys(addSalePage.txtProduct, "kiwi");
        commonFunction.sleep(1000);
    }

    //ham click submit
    public void clicksubmitButton(){
        commonFunction.clicks(addSalePage.btnSubmit);
    }
    public void verifyAddSuccess(){
        commonFunction.isDisplayed(addSalePage.lblAlertSuccess);
    }
}
