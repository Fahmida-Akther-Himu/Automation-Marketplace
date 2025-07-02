package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Long.parseLong;

public class PendingApprovalOrders extends BasePage {
    public PendingApprovalOrders(WebDriver driver) {
        super(driver);
    }
    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }
    public OrderHistoryView clickApproverName() {
        getWebElement(By.cssSelector("a[class='ico-account']")).click();
        return getInstance(OrderHistoryView.class);
    }
    public OrderHistoryView clickPendingApprovalOrderList() {
        getWebElement(By.cssSelector("a[href='/customer/pendingApprovalOrders']")).click();
//        Thread.sleep(parseLong("2000"));
        return getInstance(OrderHistoryView.class);
    }

    public PendingApprovalOrders clickOrder(){
        getWebElement(By.cssSelector("input[value='1086']")).click();
        return this;
    }
    public PendingApprovalOrders clickApproveButton() throws InterruptedException {
        getWebElement(By.cssSelector("button[id='pendingApprovalOrder-selected']")).click();
        Thread.sleep(parseLong("2000"));
        return this;
    }

}
