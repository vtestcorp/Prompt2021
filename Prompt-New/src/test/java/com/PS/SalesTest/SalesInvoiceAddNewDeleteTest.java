package com.PS.SalesTest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.SalesInvoiceAddNewDeleteDetailsPage;
import com.util.Utility;

public class SalesInvoiceAddNewDeleteTest extends Base {
	
	
	SalesInvoiceAddNewDeleteDetailsPage salesAddNewDetails;
	
	
/////// Sales Invoice ////////

	/*@Test(enabled = true,priority = 1)
	public void addNewSalesInvoiceCustomer() throws Exception {
        System.out.println("1");
		Utility.logger();
		salesAddNewDetails = new SalesInvoiceAddNewDeleteDetailsPage();
		create_extent_test("Create customer sales invoice add new");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesInvoiceAddNewCustomer();
		
	}*/

	@Test(enabled = true,priority = 2)
	public void addNewSalesInvoiceRelation() throws Exception {
		System.out.println("2");
		Utility.logger();
		salesAddNewDetails = new SalesInvoiceAddNewDeleteDetailsPage();
		create_extent_test("sales invoice ADD NEW and DELETE for Relationship address ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesInvoiceAddNewDelRelation();
		
	}

	@Test(enabled = true,priority = 3)
	public void addNewSalesInvoiceBilling() throws Exception {
		System.out.println("3");
		Utility.logger();
		salesAddNewDetails = new SalesInvoiceAddNewDeleteDetailsPage();
		create_extent_test("sales Invoice ADD NEW and DELETE for Billing Address");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesInvoiceAddNewDelBilling();
		
	}

	/*@Test(enabled = true,priority = 4)
	public void addNewSalesInvoiceUOM() throws Exception {
		System.out.println("4");
		Utility.logger();
		salesAddNewDetails = new SalesInvoiceAddNewDeleteDetailsPage();
		create_extent_test("sales Invoice ADD NEW and DELETE for UOM ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesInvoiceAddNewDelUOM();
		
	}*/

	/*@Test(enabled = true,priority = 5)
	public void addNewSalesInvoiceTax() throws Exception {
		System.out.println("5");
		Utility.logger();
		salesAddNewDetails = new SalesInvoiceAddNewDeleteDetailsPage();
		create_extent_test("sales invoice ADD NEW and DELETE for Tax");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesInvoiceAddNewDelTax();		
	}*/

	@Test(enabled = true,priority = 6)
	public void addNewSalesInvoiceProduct() throws Exception {
		System.out.println("6");
		Utility.logger();
		salesAddNewDetails = new SalesInvoiceAddNewDeleteDetailsPage();
		create_extent_test("sales Invoice ADD NEW and DELETE for Product");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesInvoiceAddNewDelProduct();
		
	}

	@Test(enabled = true,priority = 7)
	public void addNewSalesInvoiceShipping() throws Exception {
		System.out.println("7");
		Utility.logger();
		salesAddNewDetails = new SalesInvoiceAddNewDeleteDetailsPage();
		create_extent_test("sales Invoice ADD NEW and DELETE for Shipping address");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesInvoiceAddNewDelShipping();
		
	}

	/*@Test(enabled = true,priority = 8)
	public void addNewSalesInvoicePaymentTerm() throws Exception {
		System.out.println("8");
		Utility.logger();
		salesAddNewDetails = new SalesInvoiceAddNewDeleteDetailsPage();
		create_extent_test("sales Invoice ADD NEW and DELETE for Payment Term");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesInvoiceAddNewDelPaymentTerm();
		
	}*/

	@Test(enabled = true,priority = 9)
	public void addNewSalesInvoiceExpense() throws Exception {
		System.out.println("9");
		Utility.logger();
		salesAddNewDetails = new SalesInvoiceAddNewDeleteDetailsPage();
		create_extent_test("sales Invoice ADD NEW and DELETE for Expense");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.salesInvoiceAddNewDelExpense();
		
	
	}
}
