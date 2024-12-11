package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {


    @CacheLookup
    @FindBy(css = "h1")
    WebElement computersText;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(linkText = "Notebooks")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(linkText = "Software")
    WebElement softwareLink;


    public void clickDesktopsLink() {
        desktopsLink.click();
    }

    public String getComputersText() {
        return getTextFromElement(computersText);
    }
}
