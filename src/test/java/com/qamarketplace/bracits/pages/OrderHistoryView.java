package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryView extends BasePage {

    public OrderHistoryView(WebDriver driver) {
        super(driver);
    }


    public OrderDetailsView clickOrderDetailView() {
        getWebElement(By.cssSelector("button[onclick='setLocation(\"/orderdetails/1086\")']")).click();
        return getInstance(OrderDetailsView.class);
    }

    public OrderHistoryView clickApproverName() {
        getWebElement(By.cssSelector("a[class='ico-account']")).click();
        return this;
    }

    public OrderHistoryView clickPendingApprovalOrderList() {
        // getWebElement(By.tagName("Pending Approval Orders"));
        getWebElement(By.cssSelector("a[href='/customer/pendingApprovalOrders']")).click();
        return this;
    }
}
