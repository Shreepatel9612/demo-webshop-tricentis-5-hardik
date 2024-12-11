package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @FindBy(css = "h1")
    WebElement registerText;

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy(xpath = "//span[@for='FirstName']")
    WebElement firstNameError;

    @FindBy(xpath = "//span[@for='LastName']")
    WebElement lastNameError;

    @FindBy(xpath = "//span[@for='Email']")
    WebElement emailError;

    @FindBy(xpath = "//span[@for='Password']")
    WebElement passwordError;

    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    WebElement confirmPasswordError;

    @FindBy(id = "gender-female")
    WebElement genderFemaleRadio;

    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @FindBy(id = "LastName")
    WebElement lastNameField;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(css = "div.result")
    WebElement registrationSuccessMessage;



    public String getRegisterText() {
        return registerText.getText();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public String getFirstNameError() {
        return firstNameError.getText();
    }

    public String getLastNameError() {
        return lastNameError.getText();
    }

    public String getEmailError() {
        return emailError.getText();
    }

    public String getPasswordError() {
        return passwordError.getText();
    }

    public String getConfirmPasswordError() {
        return confirmPasswordError.getText();
    }
    public void selectGenderFemale() {
        genderFemaleRadio.click();
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public String getRegistrationSuccessMessage() {
        return registrationSuccessMessage.getText();
    }
}
