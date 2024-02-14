package Tek.Framework.Steps;

import Tek.Framework.Pages.LoginPage;
import Tek.Framework.Utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps extends SeleniumUtilities {


    @When("click on login button")
    public void ClickOnLogin(){
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }

@Then("enter userName {string} and password {string}")
    public void FillUPACCOUNT(String userName, String Password){
        sendText(LoginPage.USER_NAME, userName);
        sendText(LoginPage.PASSWORD, Password);
}

    @When("click on Sign In Button")
    public void ClickOnSignIn(){
        clickOnElement(LoginPage.CLICK_SIGN_IN);
    }

    @And("validate error User massage shows as expected")
    public void ErrorUserMassage(){
        boolean ErrorIsEnabled = isElementEnabled(LoginPage.USER_WRONG);
        Assert.assertTrue(ErrorIsEnabled);
    }

    @And("validate error Password massage shows as expected")
    public void ErrorPasswordMassage(){
        boolean ErrorIsEnabled = isElementEnabled(LoginPage.PASSWORD_WRONG);
        Assert.assertTrue(ErrorIsEnabled);
    }
}
