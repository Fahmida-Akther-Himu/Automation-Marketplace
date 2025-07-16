package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Long.parseLong;

public class VendorDashboard extends BasePage {


    public VendorDashboard(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {
        return getWebElements(By.linkText("Log Out")).size() > 0;
    }

    // write down all the elements here with locator format
    // Vendor acknowledge checked from vendor dashboard panel
    public VendorDashboard clickAcknowledgeButton() throws InterruptedException {
        getWebElement(By.cssSelector("a[onclick='openAcknowledgementModal(2459)']")).click();
        Thread.sleep(parseLong("2000"));
        return this;
    }

    public VendorDashboard clickYesButton() throws InterruptedException {
        getWebElement(By.cssSelector("button[onclick='acknowledgeSubmit()']")).click();
        Thread.sleep(parseLong("5000"));
        return this;
    }

    // Vendor send back checked from vendor dashboard panel
    public VendorDashboard clickSendBackButton() throws InterruptedException {
        getWebElement(By.xpath("//a[@onclick='openSendbackModal(2456)']")).click();
        Thread.sleep(parseLong("5000"));
        return this;
    }

    public VendorDashboard showSendBackPopup() throws InterruptedException {
        getWebElement(By.tagName("Send back Order"));
        Thread.sleep(parseLong("2000"));
        return this;
    }

    public VendorDashboard enterSendBackReasons() throws InterruptedException {
        getWebElement(By.id("reasons")).clear();
        getWebElement(By.cssSelector("textarea[id='reasons'][name='reasons']")).sendKeys("SendBackR 2456");
//      getWebElement(By.xpath("//textarea[@id='reasons']")).clear();
//      getWebElement(By.id("reasons")).sendKeys("Send back reasons");
//      getWebElement(By.cssSelector("textarea#reasons.form-control")).sendKeys(sendBack_reasons);
//      Send back reasons~!@#$%^&*()_+}{|?:?><~`,./?;[]=-\Docx word?confirm? is a verb in its present tense, meaning that it happens right now currently. the word ?confirmed? is this same word in the past tense, meaning that confirmation occurred in the past. 2556
        Thread.sleep(parseLong("5000"));
        return this;
    }

    public VendorDashboard clickSendBackSubmitButton() throws InterruptedException {
        getWebElement(By.cssSelector("form#sendbackForm button[type='submit']")).click();
        Thread.sleep(parseLong("5000"));
        return this;
    }


    public VendorDashboard clickOrderManagementMenu() throws InterruptedException {
        getWebElement(By.cssSelector("i[class='nav-icon fas fa-shopping-cart']")).click();
        getWebElement(By.cssSelector("a[href='/Admin/Order/List']")).click();
        Thread.sleep(parseLong("2000"));
        return this;
    }

}
