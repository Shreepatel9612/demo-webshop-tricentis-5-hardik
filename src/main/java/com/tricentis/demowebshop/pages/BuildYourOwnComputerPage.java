package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BuildYourOwnComputerPage extends Utility {


    @FindBy(xpath = "//h1[text()='Build your own computer']")
    WebElement buildYourOwnComputerText;

    @FindBy(css = "#product_attribute_16_5_4")
    WebElement processorDropdown;

    @FindBy(id = "product_attribute_16_6_5")
    WebElement ramDropdown;

    @FindBy(id = "product_attribute_16_3_6_18")
    WebElement hdd320GBRadio;

    @FindBy(id = "product_attribute_16_3_6_19")
    WebElement hdd400GBRadio;

    @FindBy(id = "product_attribute_16_4_7_20")
    WebElement osWindows7Radio;

    @FindBy(id = "product_attribute_16_4_7_21")
    WebElement osWindows10Radio;

    @FindBy(id = "product_attribute_16_8_8_22")
    WebElement softwareMicrosoftOffice;

    @FindBy(id = "product_attribute_16_8_8_23")
    WebElement softwareAcrobatReader;

    @FindBy(id = "product_attribute_16_8_8_24")
    WebElement softwareTotalCommander;

    @FindBy(id = "add-to-cart-button-16")
    WebElement addToCartButton;

    @FindBy(css = ".content")
    WebElement cartSuccessMessage;

    public BuildYourOwnComputerPage() {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectProcessor(String processor) {
        new Select(processorDropdown).selectByVisibleText(processor);
    }

    public void selectRam(String ram) {
        new Select(ramDropdown).selectByVisibleText(ram);
    }

    public void selectHdd(String hdd) {
        if (hdd.equalsIgnoreCase("320 GB")) {
            hdd320GBRadio.click();
        } else if (hdd.equalsIgnoreCase("400 GB")) {
            hdd400GBRadio.click();
        }
    }

    public void selectOs(String os) {
        if (os.contains("Windows 7")) {
            osWindows7Radio.click();
        } else if (os.contains("Windows 10")) {
            osWindows10Radio.click();
        }
    }

    public void selectSoftware(String software) {
        if (software.contains("Microsoft Office")) {
            softwareMicrosoftOffice.click();
        }
        if (software.contains("Acrobat Reader")) {
            softwareAcrobatReader.click();
        }
        if (software.contains("Total Commander")) {
            softwareTotalCommander.click();
        }
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public String getCartSuccessMessage() {
        return cartSuccessMessage.getText();
    }
}
