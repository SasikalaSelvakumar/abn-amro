package nl.abn.pageobjects;

import nl.abn.domain.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends AbstractPage {

    //endpoint should be moved to properties file to make it configurable for different env
    private static final String URL = "file:///Users/sasikalaganesh/Downloads/testautomation-web/index.html";

    public void accessAbnApplication() {
        webDriver.get(URL);
    }

    public void loginAsUser(User user) {

        waitUntilLoginFormIsShown();

        WebElement loginFormWebElement = webDriver.findElement(By.id("login"));

        loginFormWebElement.findElement(By.id("email")).sendKeys(user.getUserName());
        loginFormWebElement.findElement(By.id("password")).sendKeys(user.getPassword());
        loginFormWebElement.findElement(By.className("btn-login")).click();
    }

    private void waitUntilLoginFormIsShown() {
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));

    }
    public Boolean isPageExist()
    {
        return webDriver.findElement(By.id("login")).isDisplayed();
    }
}