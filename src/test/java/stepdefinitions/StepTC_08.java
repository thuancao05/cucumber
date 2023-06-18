package stepdefinitions;

import function.*;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepTC_08 {
    common_function commonFunction;
    sale_function saleFunction;
    addSale_function addSaleFunction;
    dashboard_function dashboardFunction;

    public StepTC_08(TestContext testContext){
        commonFunction = testContext.getCommonFunction();
        dashboardFunction = testContext.getDashboardFunction();
        saleFunction = testContext.getSaleFunction();
        addSaleFunction = testContext.getAddSaleFunction();

    }
    @Given("user on the add sale page")
    public void userOnTheAddSalePage() {
        saleFunction.clickButtonSale();
        commonFunction.sleep(2000);
        addSaleFunction = saleFunction.clickButtonAddSale();
        commonFunction.sleep(2000);

    }

    @When("user input some information required")
    public void userInputSomeInformationRequired() {
        addSaleFunction.inputCustomerAndProduct();
    }

    @And("click submit")
    public void clickSubmit() {
        addSaleFunction.clicksubmitButton();
    }

    @Then("the page dispayled message : Sale successfully added")
    public void thePageDispayledMessageSaleSuccessfullyAdded() {
        addSaleFunction.verifyAddSuccess();
    }
}
