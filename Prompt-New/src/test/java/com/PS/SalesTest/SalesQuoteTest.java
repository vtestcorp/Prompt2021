package com.PS.SalesTest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.SalesQuoteDetailsPage;
import com.util.Utility;

public class SalesQuoteTest extends Base{
	
	SalesQuoteDetailsPage salesDetails;
	
	@Test(enabled = true,priority = 1)
	public void CreateSalesQuote() throws Exception {
        System.out.println("1");		
		Utility.logger();
		salesDetails = new SalesQuoteDetailsPage();
		create_extent_test("Create sales quote");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		salesDetails.salesQuoteCreate();	
	}

	
	@Test(enabled = true,priority =2)
	public void NegavtiveSalesQuote() throws Exception {
        System.out.println("2");
		Utility.logger();
		salesDetails = new SalesQuoteDetailsPage();
		create_extent_test("Sales Quote Error Message verification");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.salesQuoteNegative();
		
	}
	
	@Test(enabled = true,priority = 3)
	public void removePDFsalesQuote() throws Exception {
        System.out.println("3");
		Utility.logger();
		salesDetails = new SalesQuoteDetailsPage();
		create_extent_test("Create sales invoice add new ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.salesQuoteRemovePDF();		
	}
		
	@Test(enabled = true,priority = 4)
	public void salesQuoteCalc() throws Exception {
        System.out.println("4");
		Utility.logger();
		salesDetails = new SalesQuoteDetailsPage();
		create_extent_test("sales quote calculation  for Suammary");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.salesQuoteCalculation();		
	}
}