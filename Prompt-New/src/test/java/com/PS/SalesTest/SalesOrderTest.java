package com.PS.SalesTest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.SalesOrderDetailsPage;
import com.util.Utility;

public class SalesOrderTest extends Base{
	
	SalesOrderDetailsPage salesDetails;
	
	/*@Test(enabled = true,priority = 1)
	public void CreateSalesOrder() throws Exception {
		System.out.println("1");
		Utility.logger();
		salesDetails = new SalesOrderDetailsPage();
		create_extent_test("Create Sales Order");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.salesOrderCreate();		
	}*/

	
	@Test(enabled = true,priority = 2)
	public void SalesOrderCal() throws Exception {
		System.out.println("2");
		Utility.logger();
		salesDetails = new SalesOrderDetailsPage();
		create_extent_test("Sales Order calculation for Suammary");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.salesOrderCalculation();
		
	}
	
	
	/*@Test(enabled = true,priority = 3)
	public void NegavtiveSalesOrder() throws Exception {
		System.out.println("3");
		Utility.logger();
		salesDetails = new SalesOrderDetailsPage();
		create_extent_test("Sales Order Error Message verification");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.SalesOrderNegative();
		
	}*/
}
