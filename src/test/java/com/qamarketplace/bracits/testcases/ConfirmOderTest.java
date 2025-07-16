package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfirmOderTest extends BaseTest{
    @Test(priority = 0)
    public void successfullyConfirmOrder() throws InterruptedException {

        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .doLogin(getOrderInitiatorUsername(), getOrderInitiatorPassword());

        CheckoutPage shoppingCart = overviewPage.getInstance(ShoppingCart.class)
                .clickShoppingCart1()
                .selectVendor()
//                .selectItemQuantity("1")
//                .selectUpdateShoppingCart()
                .selectTermsAndCondition()
                .clickCheckout();
        CheckoutCompletePage checkoutPage = shoppingCart.getInstance(CheckoutPage.class)
                .enterExpectedLocation()
                .enterReceivingPerson()
                .clickAddSchedule()
                .clickContinue()
                .enterOrderRemarks()
                .selectTermsAndCondition()
                .clickConfirm();
        OrderDetailsView orderDetailsView = checkoutPage.getInstance(OrderDetailsView.class)
                .clickConfirmationHyperlink();


        Assert.assertTrue(checkoutPage.hasLogoutLink());
    }

    @Test(priority = 1)
    public void successfullyApprovedOrder() throws InterruptedException {

        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .doLogin(getOrderApproverUsername(), getOrderApproverPassword());
//                 .doLogin(getOrderInitiatorUsername(), getOrderInitiatorPassword());
        OrderHistoryView orderHistoryView = page.getInstance(OrderHistoryView.class)
                .clickApproverName()
                .clickPendingApprovalOrderList();
        PendingApprovalOrders pendingApprovalOrders=page.getInstance(PendingApprovalOrders.class)
                .clickOrder()
                .clickApproveButton();

    }


    @Test(priority = 2)
    public void successfullyDashboardAcknowledge() throws InterruptedException {
        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .doLogin(getVendorUsername(), getVendorPassword());
        VendorDashboard vendorDashboard = page.getInstance(VendorDashboard.class)
                .clickAcknowledgeButton()
                .clickYesButton();

    }
    @Test(priority = 3)
    public void successfullyReceiveOrder() throws InterruptedException {
        Administration overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .doLogin(getOrderReceiverUsername(), getVendorPassword())
                .clickAdministration()
                .clickOrderManagement()
                .clickReceivableOrderList();
        CompleteReceiveDetails completeReceiveDetails=page.getInstance(CompleteReceiveDetails.class)
                .clickView()
                .enterChallanNumber()
                .selectReceivableItem()
                .enterReceivedRemarks()
                .clickSubmitReceivedItems();
        ItemReceiveList itemReceiveList=page.getInstance(ItemReceiveList.class)
                .clickConfirmButton();

    }
    @Test(priority = 4)
    public void successfullyVendorSendBack() throws InterruptedException {
        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .doLogin(getVendorUsername(), getVendorPassword());
        VendorDashboard vendorDashboard = page.getInstance(VendorDashboard.class)
                .clickSendBackButton()
//                .showSendBackPopup()
                .enterSendBackReasons()
                .clickSendBackSubmitButton();


    }

//    @Test
//    public void successfullyReceivableOrderListviewDuplicateChallan() throws InterruptedException {
//        Administration overviewPage = page.getInstance(LoginPage.class)
//                .clickCommonLogin()
//                .fillUsername(getUsername())
//                .fillPassword(getPassword())
//                .clickLoginBtn()
//                .clickAdministration()
//                .clickOrderManagement()
//                .clickReceivableOrderList();
//        CompleteReceiveDetails completeReceiveDetails = page.getInstance(CompleteReceiveDetails.class)
//                .clickView()
//                .enterChallanNumber()
//                .selectReceivableItem()
//                .enterReceivedRemarks()
//                .clickSubmitReceivedItems();
//        ItemReceiveList itemReceiveList=page.getInstance(ItemReceiveList.class)
//                .clickConfirmButton();
//
//
//    }


}
