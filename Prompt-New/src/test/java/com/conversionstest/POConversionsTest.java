package com.conversionstest;

import org.testng.annotations.Test;

import com.base.Base;
import com.conversions.POConversionsDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class POConversionsTest extends Base {

	POConversionsDetailsPage poconversionsDetails;

	@Test(enabled = true, priority = 1)
	public void VerificationPurchaseOrder() throws Exception {

		Utility.logger();
		poconversionsDetails = new POConversionsDetailsPage();
		create_extent_test("verification of purchase order staus and quantity in rupees");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		poconversionsDetails.purchaseOrderVerify();
	}

	@Test(enabled = true, priority = 2)
	public void VerificationPurchaseCurrency() throws Exception {

		Utility.logger();
		poconversionsDetails = new POConversionsDetailsPage();
		create_extent_test("verification of purchase order staus and quantity in Dollars");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		poconversionsDetails.purchaseOrderCurrencyVerify();
		Utility.implicitwait();
	}
}
