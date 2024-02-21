package Tek.Framework.Steps;

import Tek.Framework.Utility.seleniumUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends seleniumUtilities {

    @Before
    public void beforeScenarios() {
        setupBrowser();
    }

    @After
    public void AfterScenarios() {
        quitBrowser();
    }

}