package Tek.Framework.Steps;

import Tek.Framework.Pages.ProfilePage;
import Tek.Framework.Utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class ProfilePageSteps extends SeleniumUtilities {

    @And("click on profile button")
    public void ClickOnProfile(){
        clickOnElement(ProfilePage.CLICK_PROFILE);

    }

    @And("validate STATUS is {string}")
    public void status(String status){
        boolean ActiveIsEnabled = isElementEnabled(ProfilePage.STATUS);
        Assert.assertTrue(ActiveIsEnabled);
        }
    @And("validate USER TYPE is {string}")
    public void userType(String userType){
        boolean CSRIsEnabled = isElementEnabled(ProfilePage.USER_TYPE);
        Assert.assertTrue(CSRIsEnabled);
    }
    @And("validate FULL NAME is {string}")
    public void FullName(String Name){
        boolean FullNameIsEnabled = isElementEnabled(ProfilePage.FULL_NAME);
        Assert.assertTrue(FullNameIsEnabled);
    }
    @And("validate USERNAME is {string}")
    public void UserName(String name){
        boolean UserNameIsEnabled = isElementEnabled(ProfilePage.USERNAME);
        Assert.assertTrue(UserNameIsEnabled);
    }
    @And("validate AUTHORITIES is {string}")
    public void Authorities(String AUTHORITIES ){
        boolean AuthoritiesIsEnabled = isElementEnabled(ProfilePage.AUTHORITIES);
        Assert.assertTrue(AuthoritiesIsEnabled);
    }

    @And("click on Logout button")
    public void LogoutButton(){
        clickOnElement(ProfilePage.LOGOUT_BUTTON);
    }
    }

