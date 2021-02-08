package com.PS.SalesTest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.SalesInvoiceDetailsPage;
import com.util.Utility;

public class SalesInvoiceTest extends Base{
	
	SalesInvoiceDetailsPage salesDetails;
	
	@Test(enabled = true, priority = 1)
	public void CreateSalesInvoice() throws Exception {
		System.out.println("1");
		Utility.logger();
		salesDetails = new SalesInvoiceDetailsPage();
		create_extent_test("Create sales Invoice");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.salesInvoiceCreate();	
	}
	
	
	@Test(enabled = true, priority = 2)
	public void salesInvoiceCal() throws Exception {
		System.out.println("2");
		Utility.logger();
		salesDetails = new SalesInvoiceDetailsPage();
		create_extent_test("sales Invoice calculation  for Suammary");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.salesInvoiceCalculation();		
	}
	
	
	@Test(enabled = true, priority = 3)
	public void NegavtiveSalesInvoice() throws Exception {
		System.out.println("3");
		Utility.logger();
		salesDetails = new SalesInvoiceDetailsPage();
		create_extent_test("Sales Invoice Error Message verification");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.SalesInvoiceNegative();		
	}

}
