package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.BuildYourOwnComputerPage;
import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.DesktopsPage;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;


// @Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod
    public void intInt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputersTab();
        String actualText = computerPage.getComputersText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText, "User is not navigated to Computer page");
    }

    @Test(groups = {"smoke"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnComputersTab();
        computerPage.clickDesktopsLink();
        String actualText = desktopsPage.getDesktopsText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText, expectedText, "User is not navigated to Desktops page");
    }

    @Test(dataProvider = "ComputerData", dataProviderClass = TestData.class, retryAnalyzer = RetryAnalyser.class, groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(
            String processor, String ram, String hdd, String os, String software) {

        homePage.clickOnComputersTab();
        computerPage.clickDesktopsLink();
        desktopsPage.clickOnElement(By.linkText("Build your own computer"));
        buildYourOwnComputerPage.selectProcessor(processor);
        buildYourOwnComputerPage.selectRam(ram);
        buildYourOwnComputerPage.selectHdd(hdd);
        buildYourOwnComputerPage.selectOs(os);
        buildYourOwnComputerPage.selectSoftware(software);
        buildYourOwnComputerPage.clickAddToCartButton();

        String actualMessage = buildYourOwnComputerPage.getCartSuccessMessage();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage, expectedMessage, "Product is not added to the cart successfully");
    }
}
