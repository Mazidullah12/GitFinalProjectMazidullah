package Tek.Framework.Steps;

import Tek.Framework.Pages.homePage;
import Tek.Framework.Utility.seleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class homepageSteps extends seleniumUtilities {


@Then("validate title on the top left corner")
public void OpenBrowserAndNavigate(){
     String actualTitle = getElementText(homePage.HOME_PAGE_TITLE);

     Assert.assertEquals("TEK Insurance App", actualTitle);
}


    @Then("create Primary Account is enabled")
    public void validationCreatePrimaryAccountEnabled(){
boolean isSignInEnabled = isElementEnabled(homePage.CREATE_PRIMARY_ACCOUNT);
Assert.assertTrue(isSignInEnabled);
    }


    @When("Click on Create Primary Account button")
    public void ClickPrimaryAccount(){
        clickOnElement(homePage.CREATE_ACCOUNT_BUTTON);

    }

    @Then("validate title on the top")
    public void NavigateTitleOnTop(){
        boolean isSignInEnabled = isElementEnabled(homePage.CREATE_PRIMARY_ACCOUNT_HOLDER);
        Assert.assertTrue(isSignInEnabled);
    }
}
