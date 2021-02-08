package com.purchasetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.purchase.PurchaseRequestDetailsPage;
import com.util.Utility;

public class PurchaseRequestDetailsTest extends Base {
	
		
	PurchaseRequestDetailsPage purchasedetails;
	
	@Test(enabled = true, priority = 1)
	public void CreatePurchaseRequest() throws Exception {
		
		Utility.logger();
		purchasedetails = new PurchaseRequestDetailsPage();
		create_extent_test("Create Purchase Request and verify");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		purchasedetails.purchaseRequestCreate();
			
	}

}
