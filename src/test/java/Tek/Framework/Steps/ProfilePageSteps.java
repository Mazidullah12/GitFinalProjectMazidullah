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

    @And("validate STATUS is \"Active\"")
    public void Active(){
        boolean ActiveIsEnabled = isElementEnabled(ProfilePage.STATUS);
        Assert.assertTrue(ActiveIsEnabled);
        }
    @And("validate USER TYPE is \"CSR\"")
    public void CSR(){
        boolean CSRIsEnabled = isElementEnabled(ProfilePage.USER_TYPE);
        Assert.assertTrue(CSRIsEnabled);
    }
    @And("validate FULL NAME is \"Supervisor\"")
    public void FullName(){
        boolean FullNameIsEnabled = isElementEnabled(ProfilePage.FULL_NAME);
        Assert.assertTrue(FullNameIsEnabled);
    }
    @And("validate USERNAME is \"supervisor\"")
    public void UserName(){
        boolean UserNameIsEnabled = isElementEnabled(ProfilePage.USERNAME);
        Assert.assertTrue(UserNameIsEnabled);
    }
    @And("validate AUTHORITIES is \"admin\"")
    public void Authorities(){
        boolean AuthoritiesIsEnabled = isElementEnabled(ProfilePage.AUTHORITIES);
        Assert.assertTrue(AuthoritiesIsEnabled);
    }

    @And("click on Logout button")
    public void LogoutButton(){
        clickOnElement(ProfilePage.LOGOUT_BUTTON);
    }
    }

