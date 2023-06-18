package stepdefinitions;

import core.baseTest;
import driver.DriverManager;
import function.login_function;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.WebUI;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;

public class Steptest {
    login_function loginFunction;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        baseTest.createDriver();
        DriverManager.getDriver().get("https://sma.tecdiary.net/admin/login");
    }

    @When("I enter my username and password")
    public void iEnterMyUsernameAndPassword() {
        loginFunction = new login_function();
        loginFunction.inputUsername("rrsadad");
        loginFunction.inputPassword("123123");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("I click the Login button")
    public void iClickTheLoginButton() {
        loginFunction.clickLoginButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("I should be taken to the Dashboard page")
    public void iShouldBeTakenToTheDashboardPage() {
    }

    @And("I should see the {string} menu")
    public void iShouldSeeTheMenu(String arg0) {
    }
}
