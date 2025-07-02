package com.qamarketplace.bracits.testcases;

import com.qamarketplace.bracits.pages.*;
import org.testng.annotations.Test;

public class ReceivableOrderListTest extends BaseTest{

    @Test
    public void successfullyReceivableOrderListview() throws InterruptedException {
        Administration overviewPage = page.getInstance(LoginPage.class)
                .clickCommonLogin()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn()
                .clickAdministration()
                .clickOrderManagement()
                .clickReceivableOrderList();
        CompleteReceiveDetails completeReceiveDetails = page.getInstance(CompleteReceiveDetails.class)
                .clickView()
                .enterChallanNumber()
                .selectReceivableItem()
                .enterReceivedRemarks()
                .clickSubmitReceivedItems();
        ItemReceiveList itemReceiveList=page.getInstance(ItemReceiveList.class)
                .clickConfirmButton();


    }
}
