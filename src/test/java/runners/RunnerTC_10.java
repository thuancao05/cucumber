package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/Login/TC_10.feature",
        glue = {"stepdefinitions",
                "core",
                "function",
                "page",
                "hooks"
        },
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)
@Test
public class RunnerTC_10 extends AbstractTestNGCucumberTests {

}