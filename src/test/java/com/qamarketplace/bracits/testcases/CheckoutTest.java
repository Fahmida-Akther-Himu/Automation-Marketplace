package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.*;
import com.qamarketplace.bracits.util.QaMarketPlaceString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {
    @Test
    public void successfullyViewCheckout() throws InterruptedException {

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
        ConfirmOrderPage checkoutPage = shoppingCart.getInstance(CheckoutPage.class)
                .enterExpectedLocation()
                .enterReceivingPerson()
                .clickAddSchedule()
                .clickContinue()
                .enterOrderRemarks()
                .selectTermsAndCondition();


        Assert.assertTrue(checkoutPage.hasLogoutLink());
    }

    @Test
    public void successfullyViewCheckout_1() throws InterruptedException {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTittle(), QaMarketPlaceString.LOGIN_TITLE);

        loginPage = loginPage
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword());

        OverviewPage overviewPage = (OverviewPage) loginPage
                .clickLoginBtn();


        ShoppingCart shoppingCart = (ShoppingCart) overviewPage
                .clickShoppingCart1();
        ShoppingCart shoppingCart1 = (ShoppingCart) shoppingCart
                .selectVendor();
        ShoppingCart shoppingCart2 = (ShoppingCart) shoppingCart
                .selectItemQuantity("1");

        ShoppingCart shoppingCart3 = (ShoppingCart) shoppingCart
                .selectUpdateShoppingCart();
        ShoppingCart shoppingCart4 = (ShoppingCart) shoppingCart
                .selectTermsAndCondition();
        CheckoutPage checkoutPage = (CheckoutPage) shoppingCart
                .clickCheckout();
        CheckoutPage checkoutPage1 = (CheckoutPage) checkoutPage
                .enterExpectedLocation();
        CheckoutPage checkoutPage2 = (CheckoutPage) checkoutPage
                .enterReceivingPerson();
        CheckoutPage checkoutPage3 = (CheckoutPage) checkoutPage
                .clickAddSchedule();
//        ConfirmOrderPage confirmOrderPage =(ConfirmOrderPage) checkoutPage
//               .clickContinue();
//        ConfirmOrderPage confirmOrderPage1 = (ConfirmOrderPage) confirmOrderPage
//                                                       .enterOrderRemarks()
//                                                               .selectTermsAndCondition()
//                                                                       .clickConfirm();

//        OverviewPage overviewPage = page.getInstance(LoginPage.class)
//                .clickCommonLogin()
//                .fillUsername(getUsername())
//                .fillPassword(getPassword())
//                .clickLoginBtn();
//        CheckoutPage shoppingCart = overviewPage.getInstance(ShoppingCart.class)
//                .clickShoppingCart1()
//                .selectVendor()
//                .selectItemQuantity("1")
//                .selectUpdateShoppingCart()
//                .selectTermsAndCondition()
//                .clickCheckout();

        Assert.assertTrue(checkoutPage.hasLogoutLink());
    }
}
