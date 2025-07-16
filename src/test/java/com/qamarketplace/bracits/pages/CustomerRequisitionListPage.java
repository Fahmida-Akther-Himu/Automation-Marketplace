package com.qamarketplace.bracits.pages;

import com.qamarketplace.bracits.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerRequisitionListPage extends BasePage {

    public CustomerRequisitionListPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {
        return getWebElements(By.linkText("Log Out")).size() > 0;
    }

    public ActiveRequisitionProductList clickRequisitionNumber() {
        getWebElement(By.linkText("RequisitionNumber")).click();
        return getInstance(ActiveRequisitionProductList.class);
    }

}
