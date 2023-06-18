package stepdefinitions;

import function.*;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepTC_05 {
    common_function commonFunction;
    login_function loginFunction ;
    dashboard_function dashboardFunction;
    product_function productFunction;
    listProducts_function listProductFunction;
    detailProduct_function detailProductFunction;
    editProduct_function editProductFunction;
    public StepTC_05(TestContext testContext){
        commonFunction = testContext.getCommonFunction();

        dashboardFunction = testContext.getDashboardFunction();
        productFunction = testContext.getProductFunction();
        listProductFunction = testContext.getListProductFunction();
        detailProductFunction =testContext.getDetailProductFunction();
    }

    @Given("user on detail Mouse product page")
    public void userOnDetailMouseProductPage() {
        commonFunction.sleep(3000);
        productFunction.clickProductsButton();
        listProductFunction = productFunction.clickListProductsButton();
        detailProductFunction = listProductFunction.clickMouseProduct();
    }

    @When("click to the button edit product")
    public void clickToTheButtonEditProduct() {
        editProductFunction = detailProductFunction.clickEditButton();
    }

    @And("change some infomations product")
    public void changeSomeInfomationsProduct() {
        editProductFunction.verifyEditProductPage();                        //verify product page
        editProductFunction.selectProductType("Combo");                     //select product type
        editProductFunction.selectBarcode("EAN8");                          //select barcode
        editProductFunction.selectTaxMethod("Exclusive");                   //select tax method
        editProductFunction.clickEditProduct();
        commonFunction.sleep(5000);
    }

    @Then("the page displayed message: Product price does not match with combo items' price")
    public void thePageDisplayedMessageProductPriceDoesnTMatchWithComboItemsPrice() {
        Assert.assertTrue(false);
    }
}
