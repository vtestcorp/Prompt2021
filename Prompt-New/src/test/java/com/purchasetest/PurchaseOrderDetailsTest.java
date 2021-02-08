package com.purchasetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.purchase.PurchaseOrderDetailsPage;
import com.util.Utility;

public class PurchaseOrderDetailsTest extends Base{
	
	PurchaseOrderDetailsPage purchasedetails;
	
	/*@Test(enabled = true, priority = 1)
	public void CreatePurchaseOrder() throws Exception {
		System.out.println("1");
		Utility.logger();
		purchasedetails = new PurchaseOrderDetailsPage();
		create_extent_test("Create Purchase Order and verify");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		purchasedetails.purchaseOrderCreate();	
	}*/
	
	@Test(enabled = true, priority = 2)
	public void CalculationPurchaseOrder() throws Exception {
		System.out.println("2");
		Utility.logger();
		purchasedetails = new PurchaseOrderDetailsPage();
		create_extent_test(" Purchase Order calculation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		purchasedetails.purchaseOrderCalculation();			
	}

}
