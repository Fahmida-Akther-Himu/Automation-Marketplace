package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VendorOrderList extends BasePage {
    public VendorOrderList(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {
        return getWebElements(By.linkText("Log Out")).size() > 0;
    }
//
//       public OverviewPage clickLoginBtn() {
//        getWebElement(By.cssSelector("button[type='submit']")).click();
//        return getInstance(OverviewPage.class);
//
//
//    }

    public VendorOrderList clickOrderManagement() throws InterruptedException{
    getWebElement(By.cssSelector("i[class='nav-icon fas fa-shopping-cart']")).click();
    getWebElement(By.cssSelector("a[href='/Admin/Order/List']")).click();
    return this;
    }
}
