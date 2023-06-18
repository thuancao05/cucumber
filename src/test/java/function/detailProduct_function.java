package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.detailProduct_page;


public class detailProduct_function   {
    public detailProduct_page detailProductPage = new detailProduct_page();
    public common_function commonFunction = new common_function();

    public void verifyDetailProducPage(){
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.imageProduct));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblBarcode));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblQrcode));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblType));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblName));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblCode));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblCategory));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblUnit));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblCost));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblPrice));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblTaxRate));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblTaxMethod));
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblAlertQuantity));
 //       Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.lblProductDetail));
        System.out.println("Verified detail product page");

    }

    // ham click nut edit
    public editProduct_function clickEditButton(){
        commonFunction.clicks(detailProductPage.btnEdit);
        return new editProduct_function();
    }

}
