package stepdefinitions;

import function.*;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StepTC_06 {
    common_function commonFunction;
    login_function loginFunction ;
    dashboard_function dashboardFunction;
    product_function productFunction;
    listProducts_function listProductFunction;
    printBarcodes_function printBarcodesFunction;
    public StepTC_06(TestContext testContext){
        commonFunction = testContext.getCommonFunction();
        dashboardFunction = testContext.getDashboardFunction();
        productFunction = testContext.getProductFunction();
        printBarcodesFunction =testContext.getPrintBarcodesFunction();
    }
    @And("click Print Barcode\\/Label")
    public void clickPrintBarcodeLabel() {
        printBarcodesFunction = productFunction.clickPrintBarcodeButton();
    }

    @Then("the Print Barcode\\/Label page displayed")
    public void thePrintBarcodeLabelPageDisplayed() {
        commonFunction.sleep(3000);
        printBarcodesFunction.verifyPrintBarcodesPage();
    }
}
