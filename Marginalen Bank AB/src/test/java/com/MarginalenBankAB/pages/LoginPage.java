package com.MarginalenBankAB.pages;

import com.MarginalenBankAB.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//button[@id='js-id-masterlogin']")
    public WebElement loginButton;

    @FindBy(xpath = "//b[text()='Internetbank Privat']")
    public WebElement InternetBankPrivateOption;

    @FindBy(xpath = "//span[text()='Säkerhetsdosa']")
    public WebElement SakerhetsDosaOption;

    @FindBy(xpath = "//input[@id='identificationNumber']")
    public WebElement PersonNummer;

    @FindBy(xpath = "//input[@id='otp']")
    public WebElement Engangskod;

    @FindBy(xpath = "//button[@type= 'submit']")
    public WebElement FortsattButton; //you do not need to use it as you send Keys.ENTER below

    public void login(String userNameStr, String passwordStr) throws InterruptedException {

        PersonNummer.sendKeys(userNameStr);
        Thread.sleep(2);
        Engangskod.sendKeys(passwordStr + Keys.ENTER);
    }

}
