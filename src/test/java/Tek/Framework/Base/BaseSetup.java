package Tek.Framework.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {

    public static WebDriver driver;
    public void SetupBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(" https://dev.insurance.tekschool-students.com/");
    }

    public WebDriver getDriver(){
        return driver;
    }


    public void CloseBrowser(){
        if (driver != null)
            driver.quit();
    }
}
