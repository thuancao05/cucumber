package function;

import core.basePage;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import page.printBarcodes_page;

public class printBarcodes_function  {
    public printBarcodes_page printBarcodesPage = new printBarcodes_page();
    public common_function commonFunction = new common_function();

    //ham verify
    public void verifyPrintBarcodesPage(){
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblAddProduct));
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblStyle));
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblPrint));
        System.out.println("Verified print barcode page");
    }

    //ham dien add item
    public void inputNameItem(String name){
        commonFunction.sendKeys(printBarcodesPage.txtAddItem, name);
    }

    //ham chon style item
    public void selectStyle(String style){
        commonFunction.removeAttribute(printBarcodesPage.cbStyle, "style");       //xoa attribute style = "display:none"

        // chon style
        WebElement cbStyleTxtBox = DriverManager.getDriver().findElement(printBarcodesPage.cbStyle);
        Select selectStyle = new Select(cbStyleTxtBox);
        String i = "0";
        if(style.equals("40 per sheet (a4) (1.799\" x 1.003\")"))
            i = "40";
        else if (style.equals("30 per sheet (2.625\" x 1\")")) {
            i = "30";
        }else if (style.equals("24 per sheet (a4) (2.48\" x 1.334\")")) {
            i = "24";
        }
        else if (style.equals("20 per sheet (4\" x 1\")")) {
            i = "20";
        }
        else if (style.equals("18 per sheet (a4) (2.5\" x 1.835\")")) {
            i = "18";
        }
        else if (style.equals("14 per sheet (4\" x 1.33\")")) {
            i = "14";
        }
        else if (style.equals("12 per sheet (a4) (2.5\" x 2.834\")")) {
            i = "12";
        }
        else if (style.equals("10 per sheet (4\" x 2\")")) {
            i = "10";
        }
        else if (style.equals("Continuous feed")) {
            i = "50";
        }
        selectStyle.selectByValue(i);

        commonFunction.setAttribute(printBarcodesPage.cbStyle,"style", "display:none"); //thiet lap lai attribute style = "display:none"
        commonFunction.sleep(3000);
    }

    //ham check phan tu da checked chua
    public boolean isChecked(By by){
        String check = "";
        check = commonFunction.getAttribute("class", DriverManager.getDriver().findElement(by));
        if(check.equals("icheckbox_square-blue"))
            return false;

        return true;
    }
    //ham select site name
    public void selectSiteName(){
        if(!isChecked(printBarcodesPage.checkSiteName))
            commonFunction.clicks(printBarcodesPage.lblSiteName);
    }
    //ham select product name
    public void selectProductName(){
        if(!isChecked(printBarcodesPage.checkProductName))
            commonFunction.clicks(printBarcodesPage.lblProductName);
    }
    //ham select price
    public void selectPrice(){
        if(!isChecked(printBarcodesPage.checkPrice))
            commonFunction.clicks(printBarcodesPage.lblPrice);
    }
    //ham select currencies
    public void selectCurrencies(){
        if(!isChecked(printBarcodesPage.checkCurrencies))
            commonFunction.clicks(printBarcodesPage.lblCurrencies);
    }

    //ham select Unit
    public void selectUnit(){
        if(!isChecked(printBarcodesPage.checkUnit))
            commonFunction.clicks(printBarcodesPage.lblUnit);
    }
    //ham select category
    public void selectCategory(){
        if(!isChecked(printBarcodesPage.checkCategory))
            commonFunction.clicks(printBarcodesPage.lblCategory);
    }
    //ham select variants
    public void selectVariants(){
        if(!isChecked(printBarcodesPage.checkVariants))
            commonFunction.clicks(printBarcodesPage.lblVariants);
    }
    //ham select Product Image
    public void selectProductImage(){
        if(!isChecked(printBarcodesPage.checkProductImage))
            commonFunction.clicks(printBarcodesPage.lblProductImage);
    }

    //ham select promotional price
    public void selectPromotionalPrice(){
        if(!isChecked(printBarcodesPage.checkPromotionalPrice))
            commonFunction.clicks(printBarcodesPage.lblPromotionalPrice);
    }

    //ham click button update
    public void clickUpdateButton(){
        commonFunction.clicks(printBarcodesPage.btnUpdate);
    }

    //ham verify barcode
    public void verifyBarcode(){
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblBarcodeImage));
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblBarcodeName));
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblBarcodeCategory));
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblBarcodePrice));
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblBarcodeSite));
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblBarcodeProductImage));
        Assert.assertTrue(commonFunction.isDisplayed(printBarcodesPage.lblBarcodeUnit));
        System.out.println("Verified barcode !");
    }
}
