package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.CheckoutPage;
import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.OverviewPage;
import com.qamarketplace.bracits.pages.ShoppingCart;
import com.qamarketplace.bracits.util.QaMarketPlaceString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {

    @Test
    public void successfullyViewShoppingCart_1() throws InterruptedException {

        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        CheckoutPage shoppingCart = overviewPage.getInstance(ShoppingCart.class)
                .clickShoppingCart1()
                .selectVendor()
                .selectItemQuantity("1")
                .selectUpdateShoppingCart()
                .selectTermsAndCondition()
                .clickCheckout();

        Assert.assertTrue(shoppingCart.hasLogoutLink());
    }

}
