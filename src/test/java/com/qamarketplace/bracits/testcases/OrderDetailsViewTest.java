package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.OrderDetailsView;
import com.qamarketplace.bracits.pages.OrderHistoryView;
import com.qamarketplace.bracits.pages.OverviewPage;
import com.qamarketplace.bracits.pages.base.Page;
import com.qamarketplace.bracits.util.QaMarketPlaceString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderDetailsViewTest extends BaseTest{
    @Test
    public void successfullyViewOrderDetail(){
        LoginPage loginPage = page.getInstance(LoginPage.class);
        //Assert.assertEquals(loginPage.getPageTittle(), QaMarketPlaceString.LOGIN_TITLE);

        loginPage = loginPage
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword());

        OverviewPage overviewPage = (OverviewPage) loginPage
                .clickLoginBtn();
        OrderHistoryView orderHistoryView = (OrderHistoryView) overviewPage
                .clickUserName();
        OrderDetailsView orderDetailsView=(OrderDetailsView) orderHistoryView
                .clickOrderDetailView();

        Assert.assertTrue(overviewPage.hasLogoutLink());
    }
//
//    @Test
//    public void successfullyViewOrderDetail1(){
//        OverviewPage overviewPage = Page.getInstance(LoginPage.class)
//                .clickCommonLogin()
//                .fillUsername(getUsername())
//                .fillPassword(getPassword())
//                .clickLoginBtn();
//
//
//        OrderDetailsView orderDetailsView = OrderHistoryView.getInstance(OverviewPage.class)
//                .clickUserName()
//                .clickOrderDetailView();
//////        OrderDetailsView orderDetailsView=(OrderDetailsView) orderHistoryView
////                .clickOrderDetailView();
//
//        Assert.assertTrue(overviewPage.hasLogoutLink());
//    }



}
