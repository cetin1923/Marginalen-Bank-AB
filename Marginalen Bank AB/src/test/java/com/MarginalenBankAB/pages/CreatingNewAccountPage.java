package com.MarginalenBankAB.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CreatingNewAccountPage extends BasePage {



    @FindBy(xpath = "(//a[contains(text(),'Spara')])[1]")
    public WebElement SparaButton;

    @FindBy(xpath = "(//a[contains(text(),'Sparkontot')])[1]")
    public WebElement SparKontotButton;

    @FindBy(xpath = "//a[contains(text(),'Börja spara nu')]")
    public WebElement BorjaSparaNuButton;

    @FindBy(name = "applicant_firstname")
    public WebElement FirstName;

    @FindBy(name = "applicant_familyname")
    public WebElement FamilyName;

    @FindBy(name = "applicant_email")
    public WebElement eMail;

    @FindBy(name = "applicant_tel_second")
    public WebElement phoneNumber;

    @FindBy(name = "applicant_ssnr")
    public WebElement IdNumber;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SubmitButton;

    @FindBy(xpath = "//label[@for='applicant_gatca-no']")
    public WebElement CBoxHemvistNej;

    @FindBy(xpath = "//label[@for='applicant_pep-no']")
    public WebElement CBoxOffentligNej;

    @FindBy(xpath = "//label[starts-with(@for,'q_depositor_')]")
    public List<WebElement> CBoxDepositor;

    // @FindBy(xpath = "//label[starts-with(@for,'q_deposit_freq-')]")
    // public List<WebElement> CBoxFrequency;
    // NOTE: To randomize the radio button I declared the WE in stepdefs

    @FindBy(xpath = "//label[starts-with(@for,'q_deposit_from_')]")
    public List<WebElement> CBoxFrom;

    // @FindBy(xpath = "//label[starts-with(@for,'q_withdrawal_freq-')]")
    // public List<WebElement> CBoxFrequencyWD;
    // NOTE: To randomize the radio button I declared the WE in stepdefs

    @FindBy(xpath = "//label[starts-with(@for,'q_purpose_')]")
    public List<WebElement> CBoxSyftet;

    @FindBy(xpath = "//label[starts-with(@for,'q_origin_')]")
    public List<WebElement> CBoxPengarFrom;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SkickaAnsokanButton;

    @FindBy(xpath = "//span[@class='FormStepIcon FormStepIcon--last is-active']")
    public WebElement Page4;




}
