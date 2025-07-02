package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import com.qamarketplace.bracits.testcases.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Long.parseLong;

public class ItemReceiveList extends BasePage {
    public ItemReceiveList(WebDriver driver) {
        super(driver);
    }

    public ItemReceiveList clickConfirmButton() throws InterruptedException {
        getWebElement(By.cssSelector("button[id='confirm']")).click();
        Thread.sleep(parseLong("2000"));
        return this;
    }
}
