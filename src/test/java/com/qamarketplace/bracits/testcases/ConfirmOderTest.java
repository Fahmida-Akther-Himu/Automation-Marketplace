package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.*;
import com.qamarketplace.bracits.util.QaMarketPlaceString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfirmOderTest extends BaseTest{
    @Test
    public void successfullyConfirmOrder() throws InterruptedException {

        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
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
}
