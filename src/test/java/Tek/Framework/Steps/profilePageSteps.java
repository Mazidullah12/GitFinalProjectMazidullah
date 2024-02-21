package Tek.Framework.Steps;

import Tek.Framework.Pages.profilePage;
import Tek.Framework.Utility.seleniumUtilities;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class profilePageSteps extends seleniumUtilities {

    @And("click on profile button")
    public void ClickOnProfile(){
        clickOnElement(profilePage.CLICK_PROFILE);

    }

    @And("validate STATUS is {string}")
    public void status(String status){
        boolean ActiveIsEnabled = isElementEnabled(profilePage.STATUS);
        Assert.assertTrue(ActiveIsEnabled);
        }
    @And("validate USER TYPE is {string}")
    public void userType(String userType){
        boolean CSRIsEnabled = isElementEnabled(profilePage.USER_TYPE);
        Assert.assertTrue(CSRIsEnabled);
    }
    @And("validate FULL NAME is {string}")
    public void FullName(String Name){
        boolean FullNameIsEnabled = isElementEnabled(profilePage.FULL_NAME);
        Assert.assertTrue(FullNameIsEnabled);
    }
    @And("validate USERNAME is {string}")
    public void UserName(String name){
        boolean UserNameIsEnabled = isElementEnabled(profilePage.USERNAME);
        Assert.assertTrue(UserNameIsEnabled);
    }
    @And("validate AUTHORITIES is {string}")
    public void Authorities(String AUTHORITIES ){
        boolean AuthoritiesIsEnabled = isElementEnabled(profilePage.AUTHORITIES);
        Assert.assertTrue(AuthoritiesIsEnabled);
    }

    @And("click on Logout button")
    public void LogoutButton(){
        clickOnElement(profilePage.LOGOUT_BUTTON);
    }
    }

