package nl.abn.stepdefs;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import nl.abn.domain.User;
import nl.abn.pageobjects.LoginPage;

import nl.abn.util.TestContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDefs {
    private LoginPage loginPage;
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginStepDefs.class.getName());

    @Before
    public void before() {
        loginPage = new LoginPage();
    }

    @Given("abn application is available")
    public void applicationIsAvailable() {
        loginPage.accessAbnApplication();
    }

    @And("^I login as (invalid|valid) user$")
    public void iLoginAsAnInvalidUser(String validOrInvalidUser) {
        if (validOrInvalidUser.equalsIgnoreCase("invalid")) {
            loginPage.loginAsUser(User.INVALID_USER);
        } else {
            loginPage.loginAsUser(User.QA_USER1);
        }
    }

    @And("^I login as a (.*)$")
    public void iLoginAsValidUser(User validUser) {
            loginPage.loginAsUser(validUser);
    }

    @Then("I still see the login page")
    public void iSeeTheLoginPage() {
        assertTrue(loginPage.isPageExist());
    }

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = TestContext.getInstance().getDriver();

        if (scenario.isFailed()) {
            try {
                scenario.write("Scenario failed, current URL is " + driver.getCurrentUrl());
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (Throwable somePlatformsDontSupportScreenshotsOrBrowserHasDied) {
                LOGGER.error("Failed to create screenshot", somePlatformsDontSupportScreenshotsOrBrowserHasDied);
            } finally {
                driver.quit();
            }
        }
    }

    @Given("I logged in abn application")
    public void iLoggedInabnApplication() {
        LOGGER.info("User already logged in");
    }
}