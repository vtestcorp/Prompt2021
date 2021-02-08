package com.purchasetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.purchase.PurchaseInvoiceDetailsPage;
import com.util.Utility;

public class PurchaseInvoiceDetailsTest extends Base{
	
	PurchaseInvoiceDetailsPage purchasedetails;
		
	@Test(enabled = true, priority = 1)
	public void CreatePurchaseInvoice() throws Exception {
		System.out.println("1");
		Utility.logger();
		purchasedetails = new PurchaseInvoiceDetailsPage();
		create_extent_test("Create Purchase Invoice and verify");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		purchasedetails.purchaseInvoiceCreate();
		//getting passed after adding robot code for entering text
	}
	@Test(enabled = true, priority = 2)
	public void CalculationPurchaseInvoice() throws Exception {
		System.out.println("2");
		Utility.logger();
		purchasedetails = new PurchaseInvoiceDetailsPage();
		create_extent_test(" Purchase Invoice calculation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		purchasedetails.purchaseInvoiceCalculation();	
	}
	
}
