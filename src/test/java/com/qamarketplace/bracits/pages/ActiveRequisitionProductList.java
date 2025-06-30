package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActiveRequisitionProductList extends BasePage {
    public ActiveRequisitionProductList(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }
    public ActiveRequisitionProductList clickAddToCartBtn() {
        getWebElement(By.cssSelector("button.button-1.cart-button")).click();
        return getInstance(ActiveRequisitionProductList.class);
    }
}
