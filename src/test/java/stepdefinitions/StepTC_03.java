package stepdefinitions;

import function.*;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StepTC_03 {
    common_function commonFunction;
    login_function loginFunction ;
    product_function productFunction;
    listProducts_function listProductFunction;
    public StepTC_03(TestContext testContext){
        commonFunction = testContext.getCommonFunction();
        loginFunction = testContext.getLoginFunction();
        productFunction = testContext.getProductFunction();
    }
    @And("click Products")
    public void clickProducts() {
        commonFunction.sleep(3000);
        productFunction.clickProductsButton();
    }

    @And("click List Products")
    public void clickListProducts() {
        commonFunction.sleep(3000);
        listProductFunction = productFunction.clickListProductsButton();
    }

    @Then("user should see Image, Code, Name, Brand, Category, Cost, Price, Quantity, Unit, Alert Quantity, Actions")
    public void userShouldSeeImageCodeNameBrandCategoryCostPriceQuantityUnitAlertQuantityActions() {
        commonFunction.sleep(3000);
        listProductFunction.verifyListProductsPage();
    }
}
