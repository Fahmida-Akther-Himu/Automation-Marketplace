package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDetailsView extends BasePage {


    public OrderDetailsView(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }

    public OrderDetailsView clickConfirmationHyperlink() {
        getWebElement(By.linkText("Click here for order details.")).click();
        return getInstance(OrderDetailsView.class);
    }
}
