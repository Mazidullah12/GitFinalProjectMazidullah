package Tek.Framework.Steps;

import Tek.Framework.Pages.AccountPage;
import Tek.Framework.Pages.CreateAccountPage;
import Tek.Framework.Utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountPageSteps extends SeleniumUtilities {

    @When("click on account page")
    public void clickOnAccountLink() {
        clickOnElement(AccountPage.ACCOUNTS_LINK);

    }
    @Then("validate card title to be {string}")
    public void validateCardTitleToBe(String expectedCardTitle) {
        String actualCardTitle = getElementText(AccountPage.ACCOUNT_CARD_TITLE);
        Assert.assertEquals(expectedCardTitle,actualCardTitle);

    }
    @When("change items per page to {string}")
    public void changeItemsPerPageTo(String itemPerPage) {
        sendText(AccountPage.ITEM_PER_PAGE_SELECT, itemPerPage);
    }

}
