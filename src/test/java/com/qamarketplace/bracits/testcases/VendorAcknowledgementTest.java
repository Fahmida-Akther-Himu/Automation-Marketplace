package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.OverviewPage;
import com.qamarketplace.bracits.pages.VendorDashboard;
import org.testng.annotations.Test;

public class VendorAcknowledgementTest extends BaseTest {
    @Test
    public void successfullyDashboardAcknowledge() throws InterruptedException {
        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();

        VendorDashboard vendorDashboard = page.getInstance(VendorDashboard.class)
                .clickAcknowledgeButton()
                .clickYesButton();

    }

    @Test
    public void successfullyDashboardAcknowledge1() throws InterruptedException {
        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();

        VendorDashboard vendorDashboard = page.getInstance(VendorDashboard.class)
                .clickAcknowledgeButton()
                .clickYesButton();

    }
}
