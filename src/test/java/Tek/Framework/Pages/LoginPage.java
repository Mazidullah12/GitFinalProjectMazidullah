package Tek.Framework.Pages;

import org.openqa.selenium.By;

public class LoginPage {

    public static final By LOGIN_BUTTON = By.xpath("//a[@class='chakra-button css-ez23ye']");
    public static final By USER_NAME = By.name("username");
    public static final By PASSWORD = By.name("password");
    public static final By CLICK_SIGN_IN = By.xpath("//button[@type='submit']");
    public static final By USER_WRONG = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat']");
    public static final By PASSWORD_WRONG = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat']");

}