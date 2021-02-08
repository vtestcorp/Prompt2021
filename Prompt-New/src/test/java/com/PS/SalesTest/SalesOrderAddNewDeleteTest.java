package com.PS.SalesTest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.SalesOrderAddNewDeleteDetailsPage;
import com.util.Utility;

public class SalesOrderAddNewDeleteTest extends Base{
	
	
/////// Sales Order ////////
	
	SalesOrderAddNewDeleteDetailsPage salesAddNewDetails;

	/*@Test(enabled = true, priority = 1)
	public void addNewSalesOrderCustomer() throws Exception {
		System.out.println("1");
		Utility.logger();
		salesAddNewDetails = new SalesOrderAddNewDeleteDetailsPage();
		create_extent_test("Create customer sales order add new");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesOrderAddNewCustomer();
		
	}*/

	/*@Test(enabled = true, priority = 2)
	public void addNewSSalesOrderRelation() throws Exception {
		System.out.println("2");
		Utility.logger();
		salesAddNewDetails = new SalesOrderAddNewDeleteDetailsPage();
		create_extent_test("sales order ADD NEW and DELETE for Relationship address ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesOrderAddNewDelRelation();
		
	}*/

	@Test(enabled = true, priority = 3)
	public void addNewSalesOrderBilling() throws Exception {
		System.out.println("3");
		Utility.logger();
		salesAddNewDetails = new SalesOrderAddNewDeleteDetailsPage();
		create_extent_test("sales order ADD NEW and DELETE for Billing Address");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesOrderAddNewDelBilling();
		
	}

	/*@Test(enabled = true, priority = 4)
	public void addNewSalesOrderUOM() throws Exception {
		System.out.println("4");
		Utility.logger();
		salesAddNewDetails = new SalesOrderAddNewDeleteDetailsPage();
		create_extent_test("sales order ADD NEW and DELETE for UOM ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesOrderAddNewDelUOM();
		
	}*/

	/*@Test(enabled = true, priority = 5)
	public void addNewSalesOrderTax() throws Exception {
		System.out.println("5");
		Utility.logger();
		salesAddNewDetails = new SalesOrderAddNewDeleteDetailsPage();
		create_extent_test("sales order ADD NEW and DELETE for Tax");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesOrderAddNewDelTax();
		
	}*/

	@Test(enabled = true, priority = 6)
	public void addNewSalesOrderProduct() throws Exception {
		System.out.println("6");
		Utility.logger();
		salesAddNewDetails = new SalesOrderAddNewDeleteDetailsPage();
		create_extent_test("sales order ADD NEW and DELETE for Product");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesOrderAddNewDelProduct();
		
	}

	@Test(enabled = true, priority = 7)
	public void addNewSalesOrderShipping() throws Exception {
		System.out.println("7");
		Utility.logger();
		salesAddNewDetails = new SalesOrderAddNewDeleteDetailsPage();
		create_extent_test("sales order ADD NEW and DELETE for Shipping address");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesOrderAddNewDelShipping();
		
	}

	/*@Test(enabled = true, priority = 8)
	public void addNewSalesOrderPaymentTerm() throws Exception {
		System.out.println("8");
		Utility.logger();
		salesAddNewDetails = new SalesOrderAddNewDeleteDetailsPage();
		create_extent_test("sales order ADD NEW and DELETE for Payment Term");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesOrderAddNewDelPaymentTerm();	
	}*/

	@Test(enabled = true, priority = 9)
	public void addNewSalesOrderExpense() throws Exception {
		System.out.println("9");
		Utility.logger();
		salesAddNewDetails = new SalesOrderAddNewDeleteDetailsPage();
		create_extent_test("sales order ADD NEW and DELETE for Expense");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesOrderAddNewDelExpense();
		
	}

}
