package nl.abn.pageobjects;

import nl.abn.util.TestContext;
import org.openqa.selenium.WebDriver;

class AbstractPage {
    final WebDriver webDriver = TestContext.getInstance().getDriver();
}
