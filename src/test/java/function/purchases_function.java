package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import page.purchases_page;

public class purchases_function   {
    public purchases_page purchasesPage  = new purchases_page();
    public common_function commonFunction = new common_function();



    public void clickPurchasesButton(){
        commonFunction.clicks(purchasesPage.btnPurchases);
    }
    public listPurchases_function clickListPurchasesButton(){
        commonFunction.clicks(purchasesPage.btnListPurchases);
        return new listPurchases_function();
    }
    public addPurchases_function clickAddPurchasesButton(){
        commonFunction.clicks(purchasesPage.btnAddPurchases);
        return new addPurchases_function();
    }

}
