package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage selectVendor1(int index) {
        new Select(getWebElement(By.id("radio1"))).selectByIndex(index);

        return this;
    }

    public ShoppingCartPage selectVendor2(String text) {
        new Select(getWebElement(By.id("radio1"))).selectByVisibleText(text);

        return this;
    }

    public ShoppingCartPage selectTermsOfService(int index) {
        new Select(getWebElement(By.cssSelector("input[id^='terms']"))).selectByIndex(index);

        return this;
    }

    public ShoppingCartPage selectCheckout(int index) {
        new Select(getWebElement(By.cssSelector("input[id^='terms']"))).selectByIndex(index);

        return this;
    }

}
