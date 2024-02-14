package Tek.Framework.Pages;

import org.openqa.selenium.By;

public class CreateAccountPage {

    public static final By EMAIL = By.name("email");
    public static final By TITLE = By.id("title");
    public static final By FIRSTNAME = By.name("firstName");
    public static final By LASTNAME = By.name("lastName");
    public static final By GENDER = By.name("gender");
    public static final By MARITAL = By.name("maritalStatus");
    public static final By EMPLOYMENT = By.name("employmentStatus");
    public static final By BIRTH = By.id("dateOfBirth");

    public static final By clickOnCreateAccount = By.xpath("//button[@class='chakra-button css-jut409']");
    public static final By SIGN_IN_ACCOUNT_PAGE = By.xpath("//h2[@class='chakra-heading css-18j379d'][1]");
    public static final By VALIDATE_EMAIL_ADDRESS = By.xpath("//h2[@class='chakra-heading css-18j379d'][2]");

    public static final By ERROR_MASSAGE_EMAIL_EXIST = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat']");


}
