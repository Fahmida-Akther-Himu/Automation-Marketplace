package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.OrderHistoryView;
import com.qamarketplace.bracits.pages.OverviewPage;
import com.qamarketplace.bracits.util.QaMarketPlaceString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderHistoryTest extends BaseTest{
    @Test
    public void successfullyViewOrderHistory(){
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), QaMarketPlaceString.LOGIN_TITLE);

        loginPage = loginPage
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword());

        OverviewPage overviewPage = (OverviewPage) loginPage
                .clickLoginBtn();
        OrderHistoryView orderHistoryView = (OrderHistoryView) overviewPage
                .clickUserName();

        Assert.assertTrue(overviewPage.hasLogoutLink());
    }
}
