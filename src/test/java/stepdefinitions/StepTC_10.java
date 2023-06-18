package stepdefinitions;

import function.*;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepTC_10 {
    common_function commonFunction;
    login_function loginFunction ;
    dashboard_function dashboardFunction;
    purchases_function purchasesFunction;
    listPurchases_function listPurchasesFunction;
    addPurchases_function addPurchasesFunction;
    public StepTC_10(TestContext testContext){
        commonFunction = testContext.getCommonFunction();
        dashboardFunction = testContext.getDashboardFunction();
        purchasesFunction =testContext.getPurchasesFunction();
        listPurchasesFunction = testContext.getListPurchasesFunction();
        addPurchasesFunction = testContext.getAddPurchasesFunction();
    }
    @Given("user on the add purchases page")
    public void userOnTheAddPurchasesPage() {
        purchasesFunction.clickPurchasesButton();
        commonFunction.sleep(2000);
        addPurchasesFunction = purchasesFunction.clickAddPurchasesButton();
    }

    @When("user input some purchases informations required")
    public void userInputSomePurchasesInformationsRequired() {
        addPurchasesFunction.inputSupplierAndProduct();
    }

    @And("click Submit")
    public void clickSubmit() {
        addPurchasesFunction.clickSubmitButton();
    }

    @Then("dispayled message : Purchase successfully added")
    public void dispayledMessagePurchaseSuccessfullyAdded() {
        commonFunction.sleep(3000);
        addPurchasesFunction.verifyAddPurchasesSuccess();
    }
}
