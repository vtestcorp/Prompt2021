package com.PS.SalesTest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.RFQDetailsPage;
import com.util.Utility;

public class RFQTest extends Base{
	
	
	RFQDetailsPage purchasedetails;
	
	@Test(enabled = true, priority = 1)
	public void CreateRfq() throws Exception {
		
		Utility.logger();
		purchasedetails = new RFQDetailsPage();
		create_extent_test("Create RFQ and verify");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		purchasedetails.rfqCreate();
		
		
	}

}
