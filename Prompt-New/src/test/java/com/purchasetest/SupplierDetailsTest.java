package com.purchasetest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.base.Base;
import com.pages.Login;
import com.purchase.SupplierDetailsPage;
import com.listener.CustomListener;
import com.util.Utility;

@Listeners(CustomListener.class)
public class SupplierDetailsTest extends Base {
	SupplierDetailsPage suppDetails;

	public String totalSuppCount;

	@Test(enabled = true)
	public void CreateSupplier() throws Exception {
		System.out.println("1");
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Create supplier");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.createSupplier();
		//getting passed after changing locators
	}

	@Test(enabled = true)
	public void UploadSupplier() throws Exception {
		System.out.println("2");
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Upload supplier");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.uploadSupplier();
		//Passed after changing locators
	}

	@Test(enabled = true)
	public void UpdateSupplier() throws Exception {
		System.out.println("3");
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Update Supplier");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.updateSupplier();
		Thread.sleep(4000);
		//Passed  
	}

	@Test(enabled = true)
	public void CreateSupplierNegative() throws Exception {
		System.out.println("4");
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Create supplier Negative Scenario");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.createSupplierNegative();
		//Getting passed
	}

	@Test(enabled = true)
	public void SupplierDelete() throws Exception {
		System.out.println("5");
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Delete Supplier verification");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.deleteSupplier();
		// Steps missing
	}

	@Test(enabled = true)
	public void SupplierAllTransaction() throws Exception {
		System.out.println("6");
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("All transaction page verification");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.TransactionAllSupp();
		//no status
	}

	@Test(enabled = true)
	public void SupplierPurchaseOrder() throws Exception {
		System.out.println("7");
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Purchase Order transaction page verification");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.TransactionPurchaseOrderSupp();
		// the page after clicking specific purchase order number is not being opened. 
	}

	@Test(enabled = true)
	public void SupplierPurchaseInvoice() throws Exception {
		System.out.println("8");
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Purchase Invoice transaction page verification");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.TransactionPurchaseInvoiceSupp();
		// the app is not responding after some page
	}

	@Test(enabled = true)
	public void SupplierPaymentTrans() throws Exception {
		System.out.println("9");
		Utility.logger();
		suppDetails = new SupplierDetailsPage();
		create_extent_test("Payment transaction page verification");
		new Login().login(Utility.excelRead(2, 0, "SupplierDetails"), Utility.excelRead(2, 1, "SupplierDetails"));
		suppDetails.TransactionPaymentSupp();
		//getting passed after changing the supplier name
	}
}
