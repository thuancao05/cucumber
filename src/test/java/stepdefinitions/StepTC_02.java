package stepdefinitions;

import function.dashboard_function;
import function.login_function;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepTC_02 {
    login_function loginFunction ;
    dashboard_function dashboardFunction;
    public StepTC_02(TestContext testContext){
        loginFunction = testContext.getLoginFunction();
        dashboardFunction = testContext.getDashboardFunction();

    }
    @When("user enter email {string} and password: {string}")
    public void userEnterEmailAndPassword(String username, String password) {
        loginFunction.inputUsername("admin@tecdiary.com");
        loginFunction.inputPassword("12345678");
    }

    @Then("user should be redirected to the admin page")
    public void userShouldBeRedirectedToTheAdminPage() {
    }

    @And("user should see the Message, Overview Chart, Quick Links, Latest Five, Best Sellers")
    public void userShouldSeeTheMessageOverviewChartQuickLinksLatestFiveBestSellers() {
        dashboardFunction.verifyDashboardPage();
    }
}
