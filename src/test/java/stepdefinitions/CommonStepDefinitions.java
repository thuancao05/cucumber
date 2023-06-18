package stepdefinitions;


import function.common_function;
import function.dashboard_function;
import function.login_function;
import hooks.TestContext;
import keywords.WebUI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CommonStepDefinitions {

    TestContext testContext;
    common_function commonFunction;
    login_function loginFunction;
    dashboard_function dashboardFunction;



    public CommonStepDefinitions(TestContext testContext) {
        this.testContext = testContext;
        commonFunction = testContext.getCommonFunction();
        loginFunction = testContext.getLoginFunction();
        dashboardFunction = testContext.getDashboardFunction();
    }
    @Given("user navigate to Login page {string}")
    public void userNavigateToLoginPage(String URL) {
        // open website
        WebUI.openURL("https://sma.tecdiary.net/admin/login");
    }

    @And("click login button")
    public void clickLoginButton() {
        dashboardFunction = loginFunction.clickLoginButton();
    }
    @Given("user logged in as an admin")
    public void userLoggedInAsAnAdmin() {
        userNavigateToLoginPage("https://sma.tecdiary.net/admin/login");
        loginFunction.verifyLoginPage();
        loginFunction.inputUsername("admin@tecdiary.com");
        loginFunction.inputPassword("12345678");
        clickLoginButton();
        commonFunction.sleep(2000);
    }

//    @And("click Products")
//    public void clickProducts() {
//        commonFunction.sleep(3000);
//        productFunction.clickProductsButton();
//    }
//
//    @And("click List Products")
//    public void clickListProducts() {
//        commonFunction.sleep(3000);
//        listProductFunction = productFunction.clickListProductsButton();
//    }


}
