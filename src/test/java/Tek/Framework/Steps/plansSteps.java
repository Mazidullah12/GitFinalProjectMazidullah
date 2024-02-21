package Tek.Framework.Steps;

import Tek.Framework.Pages.plansPage;
import Tek.Framework.Utility.seleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Tek.Framework.Utility.seleniumUtilities.DateTimeUtility.getCurrentDate;
import static Tek.Framework.Utility.seleniumUtilities.DateTimeUtility.getExpiredDate;

public class plansSteps extends seleniumUtilities {

    @And("click on the plans link")
    public void PlansButton() {
        clickOnElement(plansPage.PLANS_BUTTON);
    }


    @Then("validate table row count to be {int}")
    public void validateTableRowCountToBe(int expectedRows) {
        List<WebElement> tableRows = getElements(plansPage.TABLE_ROW);
        Assert.assertEquals(expectedRows,tableRows.size());

    }

    @Then("validate create date is today's date EST Time Zone")
    public void validateCreateDate() {

        List<WebElement> elements = getElements(plansPage.CREATED_DATE);
        String[] actualDate = new String[elements.size()];
        int i = 0;
        for(WebElement element:elements){
            actualDate[i] = element.getText();
            String expectedDate = getCurrentDate();
            Assert.assertEquals(expectedDate,actualDate[i]);

        }
    }
    @Then("validate expire date is day after EST Time Zone")
    public void validateExpireDate() {

        List<WebElement> elements = getElements(plansPage.EXPIRED_DATE);
        String[] actualDate = new String[elements.size()];
        int i = 0;
        for(WebElement element:elements){
            actualDate[i] = element.getText();
            String expectedDate = getExpiredDate();
            Assert.assertEquals(expectedDate,actualDate[i]);

        }

    }

}