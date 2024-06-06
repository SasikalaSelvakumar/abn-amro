package nl.abn.stepdefs;

import cucumber.api.java.en.And;
import nl.abn.pageobjects.HomePage;

public class CommonStepDefs {

    @And("I logout the application")
    public void iLogoutTheApplication(){
        new HomePage().logout();
    }
}
