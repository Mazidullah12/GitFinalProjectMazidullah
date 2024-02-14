package Tek.Framework.Steps;

import Tek.Framework.Utility.SeleniumUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends SeleniumUtilities {

    @Before
    public void beforeScenarios() {
        SetupBrowser();
    }

    @After
    public void AfterScenarios() {
    CloseBrowser();
    }

}