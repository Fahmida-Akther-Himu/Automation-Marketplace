package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.ConfigReader;
import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.OverviewPage;
import com.qamarketplace.bracits.pages.base.BasePage;
import com.qamarketplace.bracits.util.QaMarketPlaceString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test
    public void checkLoginPageTitle() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), QaMarketPlaceString.LOGIN_TITLE);
    }

    @Test
    public void loginShouldSucceed() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), QaMarketPlaceString.LOGIN_TITLE);

        loginPage = loginPage
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword());

        OverviewPage overviewPage = (OverviewPage) loginPage
                .clickLoginBtn();
        Assert.assertEquals(loginPage.getPageTittle(), QaMarketPlaceString.HOMEPAGE_TITLE);
        Assert.assertTrue(overviewPage.hasLogoutLink());
    }


    @Test
    public void loginShouldSucceed_2() {
        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(overviewPage.hasLogoutLink());

    }

//    public static void loginAs(String role) {
//        WebDriver driver = new ChromeDriver();
//        driver.get(ConfigReader.getProperty("baseUrl"));
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        String usernameKey = role + ".Username";
//        String passwordKey = role + ".Password";
//
//        String username = ConfigReader.getProperty(usernameKey);
//        String password = ConfigReader.getProperty(passwordKey);
//
//        if (username == null || password == null) {
//            throw new RuntimeException("Credentials not found for role: " + role);
//        }
//
//        loginPage.login(username, password);
//
//        // Add assertions or additional navigation as needed
//        driver.quit();
//    }
//
//    public static void main(String[] args) {
//        loginAs("initiator");  // or "approver", "vendor"
//    }

}
