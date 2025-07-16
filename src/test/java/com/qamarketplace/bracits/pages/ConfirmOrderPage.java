package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmOrderPage extends BasePage {
    public ConfirmOrderPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }

    public ConfirmOrderPage clickContinue() {
        getWebElement(By.cssSelector("button[id='chkContinue']")).click();
        return this;
    }

    public ConfirmOrderPage enterOrderRemarks() {
        getWebElement(By.id("confirmOrderRemarks")).sendKeys("The order places by order initiator");
        return this;
    }

    public ConfirmOrderPage selectTermsAndCondition() {
        getWebElement(By.id("termsofservice")).click();
        return this;
    }

    public CheckoutCompletePage clickConfirm() {
        getWebElement(By.cssSelector("button[class='button-1 confirm-order-next-step-button']")).click();
        return getInstance(CheckoutCompletePage.class);
    }
}
