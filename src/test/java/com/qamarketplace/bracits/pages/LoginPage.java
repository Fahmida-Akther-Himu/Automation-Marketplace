package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {

        super(driver);
    }
//    WebDriver driver;
//
//    @FindBy(className = "btnStyle vendor-login-white ")  // Replace with actual locator
//    WebElement loginFormOpenField;
//    @FindBy(id = "Username")  // Replace with actual locator
//    WebElement usernameField;
//
//    @FindBy(id = "Password")  // Replace with actual locator
//    WebElement passwordField;
//
//    @FindBy(className = "btnStyle vendor-login ")  // Replace with actual locator
//    WebElement loginButton;
//
//
//    public LoginPage(WebDriver driver) {
//        super();
//
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//
//    public void login(String Username, String Password) {
//        loginFormOpenField.click();
//        usernameField.sendKeys(Username);
//        passwordField.sendKeys(Password);
//        loginButton.click();
//    }
//    static ConfigReader config = new ConfigReader();
//    public void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//
//        // Test for Order Initiator
//        loginWithRole(driver, "orderInitiator");
//
//        // Logout or refresh session
//        driver.manage().deleteAllCookies();
//        driver.navigate().refresh();
//
//        // Test for Order Approver
//        loginWithRole(driver, "orderApprover");
//
//        driver.manage().deleteAllCookies();
//        driver.navigate().refresh();
//
//        // Test for Vendor
//        loginWithRole(driver, "vendor");
//
//        driver.quit();
//    }
//
//    public void loginWithRole(WebDriver driver, String role) {
//        String username = config.getProperty(role + ".username");
//        String password = config.getProperty(role + ".password");
//
//        driver.get("https://stackoverflow.com/users/login");
//
//        // Login form fields
////        driver.findElement(By.id("email")).sendKeys(username);
////        driver.findElement(By.id("password")).sendKeys(password);
////        driver.findElement(By.id("submit-button")).click();
//
//        getWebElement(By.id("orderInitiator.username")).sendKeys(username);
//        getWebElement(By.id("orderInitiator.password")).sendKeys(password);
//        getWebElement(By.cssSelector("button[type='submit']")).click();
//
//        // Add validation, wait, or logout logic as needed
//    }


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

    public OverviewPage doLogin(String username, String password) {
        return fillUsername(username)
                .fillPassword(password)
                .clickLoginBtn();
    }





//    public VendorAcknowledge doLogin1(String username, String password) {
//        return fillUsername(username)
//                .fillPassword(password)
//                .clickLoginBtn();
//    }


}