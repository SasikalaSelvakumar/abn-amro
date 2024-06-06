package nl.abn.stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import nl.abn.pageobjects.HomePage;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageStepDefs {

    private HomePage homePage;

    @Before
    public void before() {
        homePage = new HomePage();
    }

    @Then("I see the home page")
    public void iSeeHomePage() {
        assertTrue(homePage.isHomePageShown());
    }

    @Then("I see the navigation bar with the menus (.*), (.*) and (.*)")
    public void iSeeMenus(String homeLabel, String productlabel, String contactLabel) {
        Assert.assertEquals(homePage.getHomeMenuLabel(), homeLabel);
        Assert.assertEquals(homePage.getProductsMenuLabel(), productlabel);
        Assert.assertEquals(homePage.getContactsMenuLabel(), contactLabel);
    }
}