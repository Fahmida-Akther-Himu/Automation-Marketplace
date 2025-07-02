package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Long.parseLong;

public class VendorAcknowledge extends BasePage {
    public VendorAcknowledge(WebDriver driver) {
        super(driver);
    }
    public boolean hasLogoutLink() {
        return getWebElements(By.linkText("Log Out")).size() > 0;
    }
    public VendorAcknowledge clickAcknowledgeButton() throws InterruptedException {
        getWebElement(By.cssSelector("a[onclick='openAcknowledgementModal(1086)']")).click();
        Thread.sleep(parseLong("2000"));
        return this;
    }
    public VendorAcknowledge clickYesButton() throws InterruptedException {
        getWebElement(By.cssSelector("button[onclick='acknowledgeSubmit()']")).click();
        Thread.sleep(parseLong("2000"));
        return this;
    }

}
