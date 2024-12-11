package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(css = "h1")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement displayDropdown;

    @CacheLookup
    @FindBy(id = "products-viewmode")
    WebElement selectProductListDropdown;

    public String getDesktopsText() {
        return desktopsText.getText();
    }
}
