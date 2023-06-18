package stepdefinitions;

import core.baseTest;
import function.login_function;
import hooks.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import keywords.WebUI;

public class StepTC_01 {
    login_function loginFunction ;

    public StepTC_01(TestContext testContext){
        loginFunction = testContext.getLoginFunction();
    }

    @Then("user should see the username text, password text, login button, remember me")
    public void userShouldSeeTheUsernameTextPasswordTextLoginButtonRememberMe() {
         loginFunction.verifyLoginPage();
    }
}
