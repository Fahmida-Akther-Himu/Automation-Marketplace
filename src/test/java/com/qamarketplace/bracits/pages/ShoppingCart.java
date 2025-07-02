package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends BasePage {
    public ShoppingCart(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }

    public ShoppingCart clickShoppingCart1() {
        getWebElement(By.cssSelector("span[class='cart-label']")).click();
        return this;
    }

    public ShoppingCart selectVendor() {
        getWebElement(By.cssSelector("input[id='radio19']")).click();

        return this;
    }

    public ShoppingCart selectItemQuantity(String quantity) {

        getWebElement(By.cssSelector("input[class='qty-input']")).sendKeys(quantity);
        return this;
    }

    public ShoppingCart selectUpdateShoppingCart() {
        getWebElement(By.cssSelector("[class='button-2 update-cart-button']")).click();
        return this;
    }

    public ShoppingCart selectTermsAndCondition() {
        getWebElement(By.cssSelector("[id='termsofservice']")).click();
        return this;
    }

    public CheckoutPage clickCheckout() {
        getWebElement(By.cssSelector("button[id='checkout']")).click();
        return getInstance(CheckoutPage.class);
    }

}
