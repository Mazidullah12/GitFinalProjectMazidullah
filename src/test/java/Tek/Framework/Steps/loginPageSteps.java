package Tek.Framework.Steps;

import Tek.Framework.Pages.loginPage;
import Tek.Framework.Utility.seleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginPageSteps extends seleniumUtilities {


    @When("click on login button")
    public void ClickOnLogin(){
        clickOnElement(loginPage.LOGIN_BUTTON);
    }

@Then("enter userName {string} and password {string}")
    public void FillUPACCOUNT(String userName, String Password){
        sendText(loginPage.USER_NAME, userName);
        sendText(loginPage.PASSWORD, Password);
}

    @When("click on Sign In Button")
    public void ClickOnSignIn(){
        clickOnElement(loginPage.CLICK_SIGN_IN);
    }

    @And("validate error User massage shows as expected")
    public void ErrorUserMassage(){
        boolean ErrorIsEnabled = isElementEnabled(loginPage.USER_WRONG);
        Assert.assertTrue(ErrorIsEnabled);
    }

    @And("validate error Password massage shows as expected")
    public void ErrorPasswordMassage(){
        boolean ErrorIsEnabled = isElementEnabled(loginPage.PASSWORD_WRONG);
        Assert.assertTrue(ErrorIsEnabled);
    }
}
