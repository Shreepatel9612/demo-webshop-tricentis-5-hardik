package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu']//a")
    List<WebElement> allMenuLinks;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(css = "img[alt='nopCommerce demo store']")
    WebElement logo;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Computers'])[1]")
    WebElement computerTab;


    public void clickOnComputersTab() {
        computerTab.click();
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public void clickRegisterLink() {
        registerLink.click();
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public boolean isLogoutLinkDisplayed() {
        return logoutLink.isDisplayed();
    }
}
