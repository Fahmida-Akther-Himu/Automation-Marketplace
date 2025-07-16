package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.OverviewPage;
import com.qamarketplace.bracits.util.QaMarketPlaceString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerRequisitionListTest extends BaseTest {
    //public Object loginPage;

    @Test
    public void openCheckingRequisitionListShouldSucceed() {
//        LoginPage LoginPage = page.getInstance(LoginPage.class);
//        Assert.assertEquals(LoginPage.getPageTittle(), QaMarketPlaceString.LOGIN_TITLE);
//        LoginPage = LoginPage
//                .clickCommonLogin()
//                .fillUsername(getUsername())
//                .fillPassword(getPassword());
//
//        OverviewPage overviewPage = (OverviewPage) LoginPage.clickLoginBtn();
//        Assert.assertTrue(overviewPage.hasLogoutLink());

        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(overviewPage.hasLogoutLink());
    }

}
