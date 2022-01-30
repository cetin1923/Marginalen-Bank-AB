package com.MarginalenBankAB.step_definitions;

import com.MarginalenBankAB.pages.CreatingNewAccountPage;
import com.MarginalenBankAB.utilities.BrowserUtils;
import com.MarginalenBankAB.utilities.ConfigurationReader;
import com.MarginalenBankAB.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class CreateANewAccountStepDefs {

    CreatingNewAccountPage createAccount = new CreatingNewAccountPage();

    Faker faker = new Faker();
    Random rn = new Random();

    @Given("the user is on the web page")
    public void the_user_is_on_the_web_page() throws InterruptedException {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(2);

        createAccount.AcceptCookieAlert.click();
        BrowserUtils.waitFor(2);

    }

    @When("the user clicks on SPARA tab")
    public void the_user_clicks_on_SPARA_tab() {

        createAccount.SparaButton.click();
        BrowserUtils.waitFor(4);

    }

    @When("the user clicks on SPARKONTO sub tab")
    public void the_user_clicks_on_SPARKONTO_sub_tab() {

        createAccount.SparKontotButton.click();
        BrowserUtils.waitFor(4);

    }

    @When("the user clicks on BORJA SPARA NU button")
    public void the_user_clicks_on_BORJA_SPARA_NU_button() {

        createAccount.BorjaSparaNuButton.click();
        BrowserUtils.waitFor(4);

    }

    @Then("the user is able land on to PERSONUPPGIFTER page")
    public void the_user_is_able_land_on_to_PERSONUPPGIFTER_page() {

        String expected_title = "Öppna Sparkontot - Marginalen";
        String actual_title = Driver.get().getTitle();

        Assert.assertEquals(expected_title, actual_title);

        System.out.println("The user landed on the PERSONUPPGIFTER page");

    }

    @When("the user types the required personal info")
    public void the_user_types_the_required_personal_info() {

        createAccount.FirstName.sendKeys(faker.name().firstName());
        BrowserUtils.waitFor(1);
        createAccount.FamilyName.sendKeys(faker.name().lastName());
        BrowserUtils.waitFor(1);
        createAccount.eMail.sendKeys(faker.internet().emailAddress());
        BrowserUtils.waitFor(1);
        createAccount.phoneNumber.sendKeys("0727777070");
        BrowserUtils.waitFor(1);
        createAccount.IdNumber.sendKeys("198508255224");
        BrowserUtils.waitFor(1);
        createAccount.phoneNumber.click();

    }

    @When("the user clicks on the forward button")
    public void the_user_clicks_on_the_forward_button() {

        BrowserUtils.clickWithJS(createAccount.SubmitButton );
        BrowserUtils.waitFor(1);

    }

    @Then("the user lands on FRAGOR page")
    public void the_user_lands_on_FRAGOR_page() {

        String expectedTitle = "Öppna Sparkontot - Marginalen";
        String actualTitle = Driver.get().getTitle();
        BrowserUtils.waitFor(2);

        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("The user is on the FROGOR page");

    }

    @When("the user selects the related FRAGOR checkboxes")
    public void the_user_selects_the_related_FRAGOR_checkboxes() {

        BrowserUtils.clickWithJS(createAccount.CBoxHemvistNej);
        BrowserUtils.waitFor(1);

        BrowserUtils.clickWithJS(createAccount.CBoxOffentligNej);
        BrowserUtils.waitFor(1);

    }

    @Then("the user lands on ANVANDNING page")
    public void the_user_lands_on_ANVANDNING_page() {

        BrowserUtils.clickWithJS(createAccount.SubmitButton);
        BrowserUtils.waitFor(1);

    }

    @When("the user selects the related ANVANDNING checkboxes")
    public void the_user_selects_the_related_ANVANDNING_checkboxes() {

        //checkbox
        for (WebElement q1 : createAccount.CBoxDepositor) {
            q1.click();
            BrowserUtils.waitFor(1);
        }

        //radiobutton
        int i = rn.nextInt(2)+1;
        WebElement q2 =Driver.get().findElement(By.xpath("//label[starts-with(@for,'q_deposit_freq-" + i + "')]"));
        BrowserUtils.clickWithJS(q2);

        //checkbox
        for (WebElement q3 : createAccount.CBoxFrom) {
            BrowserUtils.clickWithJS(q3);
            BrowserUtils.waitFor(1);
        }

        //radiobutton
        int j = rn.nextInt(2)+1;
        WebElement q4 =Driver.get().findElement(By.xpath("//label[starts-with(@for,'q_withdrawal_freq-" + j + "')]"));
        BrowserUtils.clickWithJS(q4);

        //checkbox
        for (WebElement q5 : createAccount.CBoxSyftet) {
            BrowserUtils.clickWithJS(q5);
            BrowserUtils.waitFor(1);
        }

        //checkbox
        for (WebElement q6 : createAccount.CBoxPengarFrom) {
            BrowserUtils.clickWithJS(q6);
            BrowserUtils.waitFor(1);
        }

    }

    @When("the clicks on the forward button")
    public void the_clicks_on_the_forward_button() {

        BrowserUtils.clickWithJS(createAccount.SubmitButton );
        BrowserUtils.waitFor(5);

    }

    @Then("the user lands on the GRANSKA%SKICKA page")
    public void the_user_lands_on_the_GRANSKA_SKICKA_page() {

        Assert.assertTrue(createAccount.Page4.isDisplayed());
        System.out.println("The user is on the FRAGOR page");
        BrowserUtils.waitFor(2);

    }

    @When("the user clicks on the SKICKA ANSOKAN button")
    public void the_user_clicks_on_the_SKICKA_ANSOKAN_button() {

         // BrowserUtils.clickWithJS(createAccount.SkickaAnsokanButton);

         /*     NOTE
         I did not click on the click on the
         Skicka ansökan button in order not to open an account :)
        */
    }

    @Then("the user makes application for a new account successfully.")
    public void the_user_makes_application_for_a_new_account_successfully() {

         //   NOTE :  Verification is not done as there is no new account which is opened.


    }

}
