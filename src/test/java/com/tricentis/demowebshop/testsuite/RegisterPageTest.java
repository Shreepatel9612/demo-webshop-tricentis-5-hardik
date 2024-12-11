package com.tricentis.demowebshop.testsuite;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.RegisterPage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


// @Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {

    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod
    public void intInt() {
        registerPage = new RegisterPage();
        homePage = new HomePage();
    }


    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickRegisterLink();
        Assert.assertEquals(registerPage.getRegisterText(), "Register");
    }


    @Test(groups = {"smoke"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {

        homePage.clickRegisterLink();
        registerPage.clickRegisterButton();

        Assert.assertEquals(registerPage.getFirstNameError(), "First name is required.");
        Assert.assertEquals(registerPage.getLastNameError(), "Last name is required.");
        Assert.assertEquals(registerPage.getEmailError(), "Email is required.");
        Assert.assertEquals(registerPage.getPasswordError(), "Password is required.");
        Assert.assertEquals(registerPage.getConfirmPasswordError(), "Password is required.");
    }


    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {

        homePage.clickRegisterLink();

        registerPage.selectGenderFemale();
        registerPage.enterFirstName("shree");
        registerPage.enterLastName("patel");
        registerPage.enterEmail("shree9612@gmail.com");
        registerPage.enterPassword("228015");
        registerPage.enterConfirmPassword("228015");
        registerPage.clickRegisterButton();

        Assert.assertEquals(registerPage.getRegistrationSuccessMessage(), "Your registration completed");
    }
}
