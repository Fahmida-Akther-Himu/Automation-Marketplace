package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.OrderHistoryView;
import com.qamarketplace.bracits.pages.OverviewPage;
import com.qamarketplace.bracits.pages.PendingApprovalOrders;
import org.testng.annotations.Test;

public class OrderApproveTest extends BaseTest{
    @Test
    public void successfullyConfirmedOrder() throws InterruptedException {

        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        OrderHistoryView orderHistoryView = page.getInstance(OrderHistoryView.class)
                .clickApproverName()
                .clickPendingApprovalOrderList();
        PendingApprovalOrders pendingApprovalOrders=page.getInstance(PendingApprovalOrders.class)
                .clickOrder()
                .clickApproveButton();

    }


}
