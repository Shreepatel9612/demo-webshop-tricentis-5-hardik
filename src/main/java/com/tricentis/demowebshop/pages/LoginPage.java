package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(css = ".topic-html-content-header")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement welcomeLoginText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Login was unsuccessful. Please correct the errors ')]")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logoutLink;


    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clickOnLoginLink() {
        loginLink.click();
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getWelcomeMessage() {
        return welcomeText.getText();
    }

    public String getWelcomeLoginMessage() {
        return welcomeLoginText.getText();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void clickLogoutLink() {
        logoutLink.click();
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public boolean isLogoutLinkDisplayed() {
        return logoutLink.isDisplayed();
    }

    public boolean isLoginLinkDisplayed() {
        return loginLink.isDisplayed();
    }
}
