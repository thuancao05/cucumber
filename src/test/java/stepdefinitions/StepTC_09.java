package stepdefinitions;

import function.*;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepTC_09 {
    common_function commonFunction;
    login_function loginFunction ;
    dashboard_function dashboardFunction;
    purchases_function purchasesFunction;
    listPurchases_function listPurchasesFunction;
    public StepTC_09(TestContext testContext){
        commonFunction = testContext.getCommonFunction();
        dashboardFunction = testContext.getDashboardFunction();
        purchasesFunction =testContext.getPurchasesFunction();
        listPurchasesFunction = testContext.getListPurchasesFunction();
    }
    @When("click Purchases")
    public void clickPurchases() {
        purchasesFunction.clickPurchasesButton();
        commonFunction.sleep(2000);
    }

    @And("click List Purchases")
    public void clickListPurchases() {
        listPurchasesFunction = purchasesFunction.clickListPurchasesButton();
        commonFunction.sleep(2000);
    }

    @Then("the Purchases table displayed : format datetime by dd\\/mm\\/yyy hh:mm:ss,  Reference No order by DESC, Dispayed {int} Purchases")
    public void thePurchasesTableDisplayedFormatDatetimeByDdMmYyyHhMmSsReferenceNoOrderByDESCDispayedPurchases(int arg0) {
        listPurchasesFunction.checkDateFormat();
        listPurchasesFunction.checkSortDESC();
        listPurchasesFunction.checkTotalInTable();
    }
}
