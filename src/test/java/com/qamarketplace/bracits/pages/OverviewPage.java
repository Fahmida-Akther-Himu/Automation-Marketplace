package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Long.parseLong;

public class OverviewPage extends BasePage {

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }

    public CustomerRequisitionListPage clickViewDetails() {
        getWebElement(By.linkText("View Details")).click();
        return getInstance(CustomerRequisitionListPage.class);
    }

    public ShoppingCartPage clickShoppingCart() {
        getWebElement(By.linkText("Shopping cart")).click();
        return getInstance(ShoppingCartPage.class);
    }

    public OrderHistoryView clickUserName() {
        getWebElement(By.cssSelector("a[class='ico-account']")).click();
        return getInstance(OrderHistoryView.class);
    }

    public ShoppingCart clickShoppingCart1() {
        getWebElement(By.cssSelector("span[class='cart-label']")).click();
        return getInstance(ShoppingCart.class);
    }

    public VendorDashboard clickAcknowledgeButton() {
        getWebElement(By.cssSelector("a[onclick='openAcknowledgementModal(1089)']")).click();
        return getInstance(VendorDashboard.class);
    }
    public VendorDashboard clickYesButton() {
        getWebElement(By.cssSelector("button[onclick='acknowledgeSubmit()']")).click();
        return getInstance(VendorDashboard.class);
    }

    public Administration clickAdministration(){
        getWebElement(By.cssSelector("a[class='administration']")).click();
        return getInstance(Administration.class);
    }

    public VendorDashboard clickOrderManagementMenu() throws InterruptedException {
        getWebElement(By.cssSelector("i[class='nav-icon fas fa-shopping-cart']")).click();
        getWebElement(By.cssSelector("a[href='/Admin/Order/List']")).click();
        Thread.sleep(parseLong("2000"));
        return getInstance(VendorDashboard.class);
    }

}