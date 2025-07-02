package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Long.*;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {

        return getWebElements(By.linkText("Log out")).size() > 0;
    }


    public CheckoutPage enterExpectedLocation() {
        getWebElement(By.cssSelector("input[id='location38132112']")).sendKeys("Head office");
        return this;
    }


    public CheckoutPage enterReceivingPerson() throws InterruptedException {
        getWebElement(By.cssSelector("input[name='deliveryInfo38132112']")).sendKeys("00000761");
        Thread.sleep(parseLong("7000"));

        return this;
    }

    public CheckoutPage clickAddSchedule() throws InterruptedException {
        getWebElement(By.cssSelector("button[id='addScheduleButton38132112']")).click();
        Thread.sleep(parseLong("1000"));
        return this;
    }

    public ConfirmOrderPage clickContinue() throws InterruptedException {
        getWebElement(By.cssSelector("button[id='chkContinue']")).click();
        Thread.sleep(parseLong("2000"));
        return getInstance(ConfirmOrderPage.class);
    }

    public ConfirmOrderPage enterOrderRemarks() {
        getWebElement(By.id("confirmOrderRemarks")).sendKeys("The order places by order initiator");
        return getInstance(ConfirmOrderPage.class);
    }

    public ConfirmOrderPage selectTermsAndCondition() {
        getWebElement(By.id("termsofservice")).click();
        return getInstance(ConfirmOrderPage.class);
    }


    public CheckoutCompletePage clickConfirm() {
        getWebElement(By.cssSelector("button[class='button-1 confirm-order-next-step-button']")).click();
        return getInstance(CheckoutCompletePage.class);
    }


}
