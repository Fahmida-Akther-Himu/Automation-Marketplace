package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.OverviewPage;
import com.qamarketplace.bracits.pages.base.BasePage;
import com.qamarketplace.bracits.util.QaMarketPlaceString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    /*@Test
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
        Assert.assertTrue(overviewPage.hasLogoutLink());
    }*/

    @Test
    public void loginShouldSucceed_2() {
        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(overviewPage.hasLogoutLink());

    }


}
