package stepdefinitions;

import function.*;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepTC_04 {
    common_function commonFunction;
    login_function loginFunction ;
    dashboard_function dashboardFunction;
    product_function productFunction;
    listProducts_function listProductFunction;
    detailProduct_function detailProductFunction;
    public StepTC_04(TestContext testContext){
        commonFunction = testContext.getCommonFunction();
        dashboardFunction = testContext.getDashboardFunction();
        listProductFunction = testContext.getListProductFunction();
        detailProductFunction =testContext.getDetailProductFunction();
    }


    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        dashboardFunction.verifyDashboardPage();
    }

    @And("click to the Lemon product")
    public void clickToTheLemonProduct() {
        detailProductFunction = listProductFunction.clickLemonProduct();
    }

    @Then("the product detail page displayed")
    public void theProductDetailPageDisplayed() {
        detailProductFunction.verifyDetailProducPage();
    }
}
