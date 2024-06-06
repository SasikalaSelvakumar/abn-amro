package nl.abn.pageobjects;

import org.openqa.selenium.By;

public class HomePage extends AbstractPage {

    public String getHomeMenuLabel() {
        return webDriver.findElement(By.className("navigation")).findElement(By.className("menu"))
                .findElement(By.className("home")).getText();
    }
    public String getProductsMenuLabel() {
        return webDriver.findElement(By.className("navigation")).findElement(By.className("menu"))
                .findElement(By.className("products")).getText();
    }
    public String getContactsMenuLabel() {
        return webDriver.findElement(By.className("navigation")).findElement(By.className("menu"))
                .findElement(By.className("contact")).getText();
    }
    public void logout() {
        webDriver.findElement(By.id("navigation")).findElement(By.id("user")).click();
        webDriver.findElement(By.id("logout")).click();
    }

    public boolean isHomePageShown() {
        try {
            return webDriver.findElement(By.id("navigation")).isDisplayed();
        } catch (Throwable e) {
            return false;
        }
    }
}