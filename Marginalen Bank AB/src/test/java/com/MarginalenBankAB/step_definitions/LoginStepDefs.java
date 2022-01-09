package com.MarginalenBankAB.step_definitions;

import com.MarginalenBankAB.pages.LoginPage;
import com.MarginalenBankAB.utilities.BrowserUtils;
import com.MarginalenBankAB.utilities.ConfigurationReader;
import com.MarginalenBankAB.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;


public class LoginStepDefs {

    @When("the user enters invalid credentials")
    public void the_user_enters_invalid_credentials() throws InterruptedException {

        LoginPage login = new LoginPage();
        BrowserUtils.clickWithJS(login.loginButton);
        BrowserUtils.waitFor(2);

        BrowserUtils.clickWithJS(login.InternetBankPrivateOption);
        BrowserUtils.waitFor(6);

        BrowserUtils.clickWithJS(login.SakerhetsDosaOption);
        BrowserUtils.waitFor(2);

        String username = ConfigurationReader.get("private_username");
        String password = ConfigurationReader.get("private_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
        BrowserUtils.waitFor(2);
    }

    @Then("the user should NOT be able to login")
    public void the_user_should_NOT_be_able_to_login() throws InterruptedException {

        String actualTitle = Driver.get().getTitle();
        BrowserUtils.waitFor(2);
        Assert.assertEquals("Marginalen - Ett fel har inträffat eller sessionen har stängts",actualTitle);
        Thread.sleep(2);
    }

    @And("the title contains {string}")
    public void the_title_contains(String expectedTitle) throws InterruptedException {
        System.out.println("Expected Title is " + expectedTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
        Thread.sleep(3);
    }
}
