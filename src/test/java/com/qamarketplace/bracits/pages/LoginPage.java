package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public LoginPage clickCommonLogin() {
        getWebElement(By.cssSelector("[class='btnStyle vendor-login-white ']")).click();
        return this;
    }

    public LoginPage fillUsername(String Username) {
        getWebElement(By.id("Username")).sendKeys(Username);
        return this;
    }

    public LoginPage fillPassword(String Password) {
        getWebElement(By.id("Password")).sendKeys(Password);
        return this;
    }

    public OverviewPage clickLoginBtn() {
        getWebElement(By.cssSelector("button[type='submit']")).click();
        return getInstance(OverviewPage.class);


    }

}