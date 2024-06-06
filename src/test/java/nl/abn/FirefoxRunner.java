package nl.abn;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import nl.abn.util.Browsers;
import nl.abn.util.TestContext;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/nl/abn/"},
        glue = "nl.abn.stepdefs",
        plugin = {"pretty", "html:target/cucumber.html"}
)
public class FirefoxRunner {
    @BeforeClass
    public static void setupBrowser() {
        TestContext.getInstance().setDriver((Browsers.FIREFOX.create()));
    }

    @AfterClass
    public static void closeBrowser() {
        WebDriver driver = TestContext.getInstance().getDriver();
        driver.quit();
    }
}
