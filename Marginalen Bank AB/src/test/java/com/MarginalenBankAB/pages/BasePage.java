package com.MarginalenBankAB.pages;

import com.MarginalenBankAB.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//footer/button[contains(text(),'Acceptera alla')]")
    public WebElement AcceptCookieAlert;

}
