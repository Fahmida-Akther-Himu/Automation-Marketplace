package com.qamarketplace.bracits.testcases;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.qamarketplace.bracits.pages.LoginPage;
import com.qamarketplace.bracits.pages.OverviewPage;
import com.qamarketplace.bracits.pages.VendorAcknowledge;
import org.testng.annotations.Test;

public class VendorAcknowledgementTest extends BaseTest {
    @Test
    public void successfullyDashboardAcknowledge() throws InterruptedException {
        OverviewPage overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();

        VendorAcknowledge vendorAcknowledge = page.getInstance(VendorAcknowledge.class)
                .clickAcknowledgeButton()
                .clickYesButton();

    }
}
