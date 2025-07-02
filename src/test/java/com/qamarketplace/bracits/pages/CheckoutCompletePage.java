package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage {
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }

    public CheckoutCompletePage clickConfirm() {
        getWebElement(By.cssSelector("button[class='button-1 confirm-order-next-step-button']")).click();
        return this;
    }
    public CheckoutCompletePage viewOrderConfirmation(){
        getWebElement(By.tagName("Your order has been successfully submitted for approval."));
        return this;
    }
    public OrderDetailsView clickConfirmationHyperlink(){
        getWebElement(By.linkText("Click here for order details.")).click();
        return getInstance(OrderDetailsView.class);
    }


}
