package Tek.Framework.Steps;

import Tek.Framework.Pages.CreateAccountPage;
import Tek.Framework.Pages.homePage;
import Tek.Framework.Utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreatePrimaryAccountSteps extends SeleniumUtilities {


    @Then("Fill up the form {string} {string} {string} {string} {string} {string} {string} {string}")
    public void FillUpForm(String email, String Title, String firstName, String lastName, String gender,
                           String maritalStatus, String employment, String DataOfBirth) {
        sendText(CreateAccountPage.EMAIL, email);
        sendText(CreateAccountPage.TITLE, Title);
        sendText(CreateAccountPage.FIRSTNAME, firstName);
        sendText(CreateAccountPage.LASTNAME, lastName);
        sendText(CreateAccountPage.GENDER, gender);
        sendText(CreateAccountPage.MARITAL, maritalStatus);
        sendText(CreateAccountPage.EMPLOYMENT, employment);
        sendText(CreateAccountPage.BIRTH, String.valueOf((DataOfBirth)));
    }

    @And("click on create Account Button")
    public void clickOnCreateAccount() {
        clickOnElement(CreateAccountPage.clickOnCreateAccount);
    }

    @And("validate user navigate to sign up your account page")
    public void ValidateName() {
        boolean isNameEnabled = isElementEnabled(CreateAccountPage.SIGN_IN_ACCOUNT_PAGE);
        Assert.assertTrue(isNameEnabled);
    }

    @And("validate email address \"mazidullah15@gmail.com\" shows as expected")
    public void ValidateEmail() {
        boolean isEmailEnabled = isElementEnabled(CreateAccountPage.VALIDATE_EMAIL_ADDRESS);
        Assert.assertTrue(isEmailEnabled);
    }

    @And("validate error massage shows as expected")
    public void ErrorMassage() {
        boolean isErrorEnabled = isElementEnabled(CreateAccountPage.ERROR_MASSAGE_EMAIL_EXIST);
        Assert.assertTrue(isErrorEnabled);
    }

}