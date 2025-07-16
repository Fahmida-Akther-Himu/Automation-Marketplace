package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.base.BasePage;
import com.qamarketplace.bracits.pages.base.Page;
import com.qamarketplace.bracits.util.QaMarketPlaceString;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiveRequisitionProductListTest extends BaseTest {

    @Test
    public void openCheckingRequisitionListShouldSucceed1(){
        LoginPage LoginPage = page.getInstance(LoginPage.class);
        //Assert.assertEquals(loginPage.getPageTitle(), QaMarketPlaceString.LOGIN_TITLE);
    }

}
