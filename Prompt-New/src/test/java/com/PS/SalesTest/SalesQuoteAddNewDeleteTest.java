package com.PS.SalesTest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.SalesQuoteAddNewDeleteDetailsPage;
import com.util.Utility;

public class SalesQuoteAddNewDeleteTest extends Base {

	SalesQuoteAddNewDeleteDetailsPage salesAddNewDetails;

////////sales Quote //////////
	
	/*@Test(enabled = true, priority = 1)
	public void addNewSalesQuoteCustomer() throws Exception {
        System.out.println("1");
		Utility.logger();
		salesAddNewDetails = new SalesQuoteAddNewDeleteDetailsPage();
		create_extent_test("Create customer sales quote add new");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesQuoteAddNewCustomer();
		
	}*/

	@Test(enabled = true, priority = 2)
	public void addNewSalesQuoteRelation() throws Exception {
		System.out.println("2");
		Utility.logger();
		salesAddNewDetails = new SalesQuoteAddNewDeleteDetailsPage();
		create_extent_test("sales Quote ADD NEW and DELETE for Relationship address ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesQuoteAddNewDelRelation();
		
	}

	@Test(enabled = true, priority = 3)
	public void addNewSalesQuoteBilling() throws Exception {
		System.out.println("3");
		Utility.logger();
		salesAddNewDetails = new SalesQuoteAddNewDeleteDetailsPage();
		create_extent_test("sales Quote ADD NEW and DELETE for Billing Address");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesQuoteAddNewDelBilling();
		
	}

	/*@Test(enabled = true, priority = 4)
	public void addNewSalesQuoteUOM() throws Exception {
		System.out.println("4");
		Utility.logger();
		salesAddNewDetails = new SalesQuoteAddNewDeleteDetailsPage();
		create_extent_test("sales Quote ADD NEW and DELETE for UOM ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesQuoteAddNewDelUOM();
		
	}*/

/*	@Test(enabled = true, priority = 5)
	public void addNewSalesQuoteTax() throws Exception {
		System.out.println("5");
		Utility.logger();
		salesAddNewDetails = new SalesQuoteAddNewDeleteDetailsPage();
		create_extent_test("sales Quote ADD NEW and DELETE for Tax");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesQuoteAddNewDelTax();
		
	}*/

	/*@Test(enabled = true, priority = 6)
	public void addNewSalesQuoteProduct() throws Exception {
		System.out.println("6");
		Utility.logger();
		salesAddNewDetails = new SalesQuoteAddNewDeleteDetailsPage();
		create_extent_test("sales Quote ADD NEW and DELETE for Product");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesQuoteAddNewDelProduct();		
	}*/
}