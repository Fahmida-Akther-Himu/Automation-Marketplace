package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Long.parseLong;

public class Administration extends BasePage {
    public Administration(WebDriver driver) {
        super(driver);
    }
    public Administration clickAdministration(){
        getWebElement(By.cssSelector("a[class='administration']")).click();
        return this;
    }
    public Administration clickOrderManagement() throws InterruptedException {
        getWebElement(By.cssSelector("i[class='nav-icon fas fa-shopping-cart']")).click();
        Thread.sleep(parseLong("2000"));
        return this;
    }

    public Administration clickReceivableOrderList(){
        getWebElement(By.cssSelector("a[href='/Admin/Order/ReceivableOrderList']")).click();
        return this;
    }

    public CompleteReceiveDetails clickView(){
        getWebElement(By.tagName("View")).click();
        return getInstance(CompleteReceiveDetails.class);
    }


}
