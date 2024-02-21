package Tek.Framework.Pages;

import org.openqa.selenium.By;

public class plansPage {

    public static final By PLANS_BUTTON = By.xpath("(//a[@class='chakra-button css-1uz106q'])[2]");
    public static final By TABLE_ROW = By.xpath("//table/tbody/tr");
    public static final By CREATED_DATE = By.xpath("//table/tbody/tr/td[4]");
    public static final By EXPIRED_DATE = By.xpath("//table/tbody/tr/td[5]");
}
