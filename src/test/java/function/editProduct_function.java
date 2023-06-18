package function;

import core.basePage;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import page.editProduct_page;

public class editProduct_function   {
    public editProduct_page editProductPage = new editProduct_page();
    public common_function commonFunction = new common_function();

    //ham verify
    public void verifyEditProductPage(){
        Assert.assertTrue(commonFunction.isDisplayed(editProductPage.lblProductCode));
        Assert.assertTrue(commonFunction.isDisplayed(editProductPage.lblProductName));
        Assert.assertTrue(commonFunction.isDisplayed(editProductPage.lblProductType));
        Assert.assertTrue(commonFunction.isDisplayed(editProductPage.lblSlug));
        Assert.assertTrue(commonFunction.isDisplayed(editProductPage.lblBarcode));
        System.out.println("Verified edit product page ");
    }

    //ham chon produc type
    public void selectProductType(String type){   //nut select nay bi an, nen phai xoa attribute style = "display:none" truoc khi thao tac
        commonFunction.removeAttribute(editProductPage.cbProductType, "style");       //xoa attribute style = "display:none"

        // chon stype
        WebElement cbTypeTxtBox = DriverManager.getDriver().findElement(editProductPage.cbProductType);
        Select selectType = new Select(cbTypeTxtBox);
        selectType.selectByValue(type.toLowerCase());

        commonFunction.setAttribute(editProductPage.cbProductType,"style", "display:none"); //thiet lap lai attribute style = "display:none"
        commonFunction.sleep(3000);
    }
    //ham chon Barcode symbology
    public void selectBarcode(String code){  //nut select nay bi an, nen phai xoa attribute style = "display:none" truoc khi thao tac
        commonFunction.removeAttribute(editProductPage.cbBarcode, "style");       //xoa attribute style = "display:none"

        // chon barcode
        WebElement cbTypeTxtBox = DriverManager.getDriver().findElement(editProductPage.cbBarcode);
        Select selectType = new Select(cbTypeTxtBox);
        selectType.selectByValue(code.toLowerCase());

        commonFunction.setAttribute(editProductPage.cbBarcode,"style", "display:none"); //thiet lap lai attribute style = "display:none"
        commonFunction.sleep(3000);
    }
//    //ham chon Tax method
    public void selectTaxMethod(String method){  //nut select nay bi an, nen phai xoa attribute style = "display:none" truoc khi thao tac
        commonFunction.removeAttribute(editProductPage.cbTaxMethod, "style");       //xoa attribute style = "display:none"

        // chon barcode
        WebElement cbTypeTxtBox = DriverManager.getDriver().findElement(editProductPage.cbTaxMethod);
        Select selectType = new Select(cbTypeTxtBox);
        String i = "0";
        if(method.equals("Exclusive"))
            i = "1";
        selectType.selectByValue(i);

        commonFunction.setAttribute(editProductPage.cbTaxMethod,"style", "display:none"); //thiet lap lai attribute style = "display:none"
        commonFunction.sleep(3000);
    }
    //ham click button edit product
    public void clickEditProduct(){
        commonFunction.clicks(editProductPage.btnEditProduct);
    }
}
