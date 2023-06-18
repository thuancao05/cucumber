package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import page.sale_page;

public class sale_function  {
    public sale_page salePage = new sale_page();
    public common_function commonFunction = new common_function();

    //clcik button sale
    public void clickButtonSale(){
        commonFunction.clicks(salePage.btnSale);
    }
    //clcik button add sale
    public addSale_function clickButtonAddSale(){
        commonFunction.clicks(salePage.btnAddSale);
        return new addSale_function();
    }
}
