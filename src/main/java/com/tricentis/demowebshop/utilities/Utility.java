package com.tricentis.demowebshop.utilities;

import com.tricentis.demowebshop.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends ManageBrowser {

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will click on given locator path
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     *This method will select dropdown
     */
    public void selectFromDropDown(By by, String text) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

    // This method will get list of we elements
    public List<WebElement> getWebElements(By by) {
        return driver.findElements(by);
    }


    /**
     * This method is for hover mouse on element and click it
     */
    public void mouseHoverAndClick(By by) {
        WebElement element = driver.findElement(by);
        new org.openqa.selenium.interactions.Actions(driver).moveToElement(element).click().perform();
    }

    /**
     * This method is for hover mouse on element
     */
    public void mouseToElement(By by) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(by);
        actions.moveToElement(element).perform();
    }

    public void selectByIndexFromDropdown(By by,int value) {
        WebElement dropdownForProcessor = driver.findElement(by);
        Select select1 = new Select(dropdownForProcessor);
        select1.selectByIndex(value);
    }

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
}
