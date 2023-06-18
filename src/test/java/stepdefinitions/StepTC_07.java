package stepdefinitions;

import function.*;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepTC_07 {
    common_function commonFunction;
    login_function loginFunction ;
    dashboard_function dashboardFunction;
    product_function productFunction;
    listProducts_function listProductFunction;
    printBarcodes_function printBarcodesFunction;
    public StepTC_07(TestContext testContext){
        commonFunction = testContext.getCommonFunction();
        dashboardFunction = testContext.getDashboardFunction();
        productFunction = testContext.getProductFunction();
        printBarcodesFunction =testContext.getPrintBarcodesFunction();
    }
    @Given("user on the Print Barcode\\/Label page")
    public void userOnThePrintBarcodeLabelPage() {
        printBarcodesFunction = productFunction.clickPrintBarcodeButton();
        commonFunction.sleep(2000);
    }

    @When("user add some informations to print barcode")
    public void userAddSomeInformationsToPrintBarcode() {
        printBarcodesFunction.inputNameItem("Kiwi");                    // input name
        commonFunction.sleep(3000);
        printBarcodesFunction.selectStyle("18 per sheet (a4) (2.5\" x 1.835\")");   //select style
        printBarcodesFunction.selectSiteName();                                     //select site name
        printBarcodesFunction.selectProductName();                                  //select product name
        printBarcodesFunction.selectCurrencies();                                  //select currencies
        printBarcodesFunction.selectPrice();                                        //select price
        printBarcodesFunction.selectUnit();                                         //select unit
        printBarcodesFunction.selectCategory();                                     //select category
        printBarcodesFunction.selectVariants();                                     //select variants
        printBarcodesFunction.selectProductImage();                                  //select product image
        printBarcodesFunction.selectPromotionalPrice();                               //select promotional price
    }

    @And("click update")
    public void clickUpdate() {
        printBarcodesFunction.clickUpdateButton();
    }

    @Then("the page display bar code")
    public void thePageDisplayBarCode() {
        printBarcodesFunction.verifyBarcode();
    }
}
