package function;

import core.basePage;
import org.openqa.selenium.WebDriver;
import page.product_page;

public class product_function  {
    public product_page productPage = new product_page();
    public common_function commonFunction = new common_function();
    //ham click nut products
    public void clickProductsButton(){
        commonFunction.clicks(productPage.btnProducts);
    }

    //ham click nut list product sau khi da click nut product
    public listProducts_function clickListProductsButton(){
        commonFunction.clicks(productPage.btnListProducts);
        return new listProducts_function();
    }
    //ham click nut print barcode/label sau khi da click nut product
    public printBarcodes_function clickPrintBarcodeButton(){
        commonFunction.clicks(productPage.btnPrintBarcode);
        return new printBarcodes_function();
    }


}
