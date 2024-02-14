package Tek.Framework.Pages;

import org.openqa.selenium.By;

public class ProfilePage {

    public static final By CLICK_PROFILE = By.xpath("//button[@class='chakra-button chakra-button css-1lzp9bh']");
    public static final By STATUS = By.xpath("//span[@class='css-1ny2kle']");
    public static final By USER_TYPE = By.xpath("(//p[@class='chakra-text css-0'])[4]");
    public static final By FULL_NAME = By.xpath("(//p[@class='chakra-text css-0'])[5]");
    public static final By USERNAME = By.xpath("(//p[@class='chakra-text css-0'])[6]");
    public static final By AUTHORITIES = By.xpath("//li[@class='css-0']");

    public static final By LOGOUT_BUTTON = By.xpath("//button[@class='chakra-button css-1x18d5s']");

}
