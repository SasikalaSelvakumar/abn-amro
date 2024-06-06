package nl.abn.util;

import org.openqa.selenium.WebDriver;

public class TestContext {
    private  WebDriver driver;
    private static TestContext testContext;

    public static TestContext getInstance() {
        if (testContext == null) {
            testContext = new TestContext();
        }
        return testContext;
    }
    private TestContext() {
    }

    public WebDriver getDriver() {
        if(driver == null){
            driver = Browsers.FIREFOX.create();
        }
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
