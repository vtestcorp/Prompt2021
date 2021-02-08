package com.PS.SalesTest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.CreditMemoAddNewDeleteDetailsPage;
import com.util.Utility;


public class CreditMemoAddNewDeleteTest extends Base {

	CreditMemoAddNewDeleteDetailsPage salesAddNewDetails;

////////credit Memo //////////

	@Test(enabled = false, priority = 1)
	public void addNewCreditMemoCustomer() throws Exception {
       System.out.println("1");
		Utility.logger();
		salesAddNewDetails = new CreditMemoAddNewDeleteDetailsPage();
		create_extent_test("Create customer credit memo add new");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.creditMemoAddNewCustomer();
		Utility.implicitwait();
	}

	@Test(enabled = false, priority = 2)
	public void addNewCreditMemoRelation() throws Exception {
		System.out.println("2");
		Utility.logger();
		salesAddNewDetails = new CreditMemoAddNewDeleteDetailsPage();
		create_extent_test("credit memo ADD NEW and DELETE for Relationship address ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.creditMemoAddNewDelRelation();
		Utility.implicitwait();
	}

	@Test(enabled = true, priority = 3)
	public void addNewCreditMemoBilling() throws Exception {
		System.out.println("3");
		Utility.logger();
		salesAddNewDetails = new CreditMemoAddNewDeleteDetailsPage();
		create_extent_test("credit memo ADD NEW and DELETE for Billing Address");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		salesAddNewDetails.creditMemoAddNewDelBilling();
		//data mismatch from excel file
	}
	
	@Test(enabled = true, priority = 4)
	public void addNewCreditMemoUOM() throws Exception {
		System.out.println("4");
		Utility.logger();
		salesAddNewDetails = new CreditMemoAddNewDeleteDetailsPage();
		create_extent_test("credit memo ADD NEW and DELETE for UOM ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.creditMemoAddNewDelUOM();
		//above test case is getting executed half way. Wrong logic in steps
	}
	//locator for add-new not getting identified and clicked
	@Test(enabled = false, priority = 5)
	public void addNewCreditMemoTax() throws Exception {
		System.out.println("5");
		Utility.logger();
		salesAddNewDetails = new CreditMemoAddNewDeleteDetailsPage();
		create_extent_test("credit memo ADD NEW and DELETE for Tax");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.creditMemoAddNewDelTax();
		Utility.implicitwait();
	}
	//test case passed below
	@Test(enabled = false, priority = 6)
	public void addNewCreditMemoProduct() throws Exception {
		System.out.println("6");
		Utility.logger();
		salesAddNewDetails = new CreditMemoAddNewDeleteDetailsPage();
		create_extent_test("credit memo ADD NEW and DELETE for Product");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesAddNewDetails.creditMemoAddNewDelProduct();
		Utility.implicitwait();
		//span[contains(text(),'Infinity')]
	}
	
}
