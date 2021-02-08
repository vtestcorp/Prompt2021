package com.PS.SalesTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.CustomerDetailsPage;
import com.listener.CustomListener;
import com.util.Utility;

@Listeners(CustomListener.class)
public class CustomerDetailsTest extends Base {
	CustomerDetailsPage custDetails;
	public String totalCustCount;

	@Test(priority = 1, enabled = false)
	public void CreateCustomer() throws Exception {
		System.out.println("1");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Create customer/ Search Customer validation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		custDetails.createCustomer();
		// the above test case is running but cust details are not be found and verified
		// in the system
	}

	@Test(priority = 2, enabled = false)
	public void UploadCustomer() throws Exception {
		System.out.println("2");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Upload Custoemr validation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.uploadCustomer();

	}

	@Test(priority = 3, enabled = false)
	public void UpdateCustomer() throws Exception {
		System.out.println("3");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Update Customer Validation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		custDetails.updateCustomer();

	}

	@Test(priority = 4, enabled = false)
	public void CreateCustomerNegative() throws Exception {
		System.out.println("4");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Create customer Negative Scenario");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.createCustomerNegative();
	}

	@Test(priority = 5, enabled = false)
	public void searchCustomer() throws Exception {
		System.out.println("5");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Search Customer Validation");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		custDetails.searchCustomer();
		Thread.sleep(1000);
	}

	@Test(priority = 6, enabled = false)
	public void CustomerLogActivity() throws Exception {
		System.out.println("6");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Log Activity");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CustomerLogActivity();
	}

	@Test(priority = 7, enabled = false)
	public void CustomerLogCommunication() throws Exception {
		System.out.println("7");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Log Communication");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CustomerLogCommunication();
	}

	@Test(priority = 8, enabled = false)
	public void CustomerSalesOrder() throws Exception {
		System.out.println("8");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Sales Order creation using action button verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.SalesOrdeCustomer();
	}

	@Test(priority = 9, enabled = false)
	public void CustomerSalesInvoice() throws Exception {
		System.out.println("9");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Sales Invoice creation using action button verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.SalesInvoiceCustomer();
	}

	@Test(priority = 10, enabled = false)
	public void CustomerCreditMemo() throws Exception {
		System.out.println("10");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Customer Credit Memo creation using action button verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CreditMemoCustomer();
		// the above test case is pass after changing the locators
	}

	@Test(priority = 11, enabled=false)
	public void CustomerDelete1() throws Exception {
		System.out.println("11");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Deleting Customers with Transactions verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.DeleteCustomerTrans();
	}

	@Test(priority = 12, enabled = false)
	public void CustomerDelete2() throws Exception {
		System.out.println("12");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Deleting Customers verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		custDetails.DeleteCustomer();
		//getting staleelementexception
	}

	@Test(priority = 13, enabled = false)
	public void ShowContactValidation() throws Exception {
		System.out.println("13");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Show Contact verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.ShowContact();
		//getting passed after giving details for existing customer
	}

	@Test(priority = 14, enabled = false)
	public void ShowAddrerssValidation() throws Exception {
		System.out.println("14");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Show Address verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.ShowAddress();
		//Using data for address for the existing customers and reduced the editing steps. Getting passed
	}

	@Test(priority = 15, enabled = true)
	public void TransactionAllValidation() throws Exception {
		System.out.println("15");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("All Transaction verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.TransactionAll();
		//not able to identify a webelement transactionaction
	}

	@Test(priority = 16, enabled = false)
	public void TransactionSalesOrderValidation() throws Exception {
		System.out.println("16");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Sales odrer transaction verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.TransactionSalesOrder();
	}

	@Test(priority = 17, enabled = false)
	public void TransactionCreditMemoValidation() throws Exception {
		System.out.println("17");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Credit Memo transaction verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.TransactionCreditMemo();
		//passed with change in locators and ommiting few steps which are no longer needed
	}

	@Test(priority = 18, enabled = false)
	public void TransactionPaymentValidation() throws Exception {
		System.out.println("18");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Payment transaction verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.TransactionPayment();
		//test case passed
	}

	@Test(priority = 19, enabled = false)
	public void ExcelDownloadValidation() throws Exception {
		System.out.println("19");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Download Excel Files verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.CustdownloadExcelValidation();
		//passed after using JS Click for checkbox
	}

	@Test(priority = 20, enabled = false)
	public void PdfDownloadValidation() throws Exception {
		System.out.println("20");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Download PDF Files verification ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		custDetails.CustdownloadPdfValidation();
		//passed after using JSClick for checkbox
	}

	@Test(priority = 21, enabled = true)
	public void EmailValid() throws Exception {
		System.out.println("21");
		Utility.logger();
		custDetails = new CustomerDetailsPage();
		create_extent_test("Email Validation ");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		custDetails.EmailValidation();
		//cannot send keys in email id and subject in the last step
	}

}