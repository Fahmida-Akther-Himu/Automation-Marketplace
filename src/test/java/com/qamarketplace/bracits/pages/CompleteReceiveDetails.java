package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Long.parseLong;

public class CompleteReceiveDetails extends BasePage {
    public CompleteReceiveDetails(WebDriver driver) {
        super(driver);
    }
    public CompleteReceiveDetails clickView() throws InterruptedException {
        getWebElement(By.cssSelector("td[class=' button-column']")).click();
        Thread.sleep(parseLong("2000"));
        return this;
    }
    public CompleteReceiveDetails enterChallanNumber() throws InterruptedException {
        getWebElement(By.cssSelector("input[id='challanNumber']")).sendKeys("Test receive item 2666 !@# 1");
        Thread.sleep(parseLong("2000"));
        return this;
    }
    public CompleteReceiveDetails selectReceivableItem(){
        getWebElement(By.cssSelector("input[id='itemSelect2666']")).click();
        return this;
    }
    public CompleteReceiveDetails enterReceivedRemarks() throws InterruptedException {
        getWebElement(By.cssSelector("input[id='receivedRemarksText']")).sendKeys("Test remarks");
        Thread.sleep(parseLong("2000"));
        return this;
    }
    public CompleteReceiveDetails clickSubmitReceivedItems() throws InterruptedException {
        getWebElement(By.cssSelector("button[id='receiveAllItems']")).click();
        Thread.sleep(parseLong("2000"));
        return this;
    }

    public ItemReceiveList clickConfirmButton() throws InterruptedException {
        getWebElement(By.cssSelector("button[id='confirm']")).click();
        Thread.sleep(parseLong("2000"));
        return getInstance(ItemReceiveList.class);
    }



}
