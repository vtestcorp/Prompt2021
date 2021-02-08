package com.inventorytest;

import org.testng.annotations.Test;

import com.base.Base;
import com.inventory.WareHouseDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class WareHouseTest extends Base {

	WareHouseDetailsPage wareHouseDetails;

	@Test(enabled = false)
	public void WarehouseCreation() throws Exception {
        System.out.println("1");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("creating new warehouse ");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		wareHouseDetails.CreateWareHouse();
		//passed after fetching the value from the Excel file directly into the script
	}

	@Test(enabled = false)
	public void WarehouseCreationNegative() throws Exception {
		System.out.println("2");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("New warehouse negative validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		wareHouseDetails.CreateWareHouseNegative();
		//getting passed after verifying the error message for name field
	}

	@Test(enabled = false)
	public void WarehouseDeleteItems() throws Exception {
		System.out.println("3");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("New warehouse with Items delete validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		wareHouseDetails.DeleteWareHouseItems();
		Utility.implicitwait();
		//previous status passed
	}

	@Test(enabled = true)
	public void WarehouseDelete() throws Exception {
		System.out.println("4");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("New warehouse without delete validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		wareHouseDetails.DeleteWareHouse();
		Utility.implicitwait();

	}

	@Test(enabled = false)
	public void WarehouseUpdate() throws Exception {
		System.out.println("5");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("updating warehouse validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		wareHouseDetails.UpdateWareHouse();
		//passed after editing the script
	}

	@Test(enabled = false)
	public void ValidationstockSummary() throws Exception {
		System.out.println("6");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("updating warehouse validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		wareHouseDetails.StockSummaryValidation();
		Thread.sleep(2000);
		//getting passed after omitting unnecessary steps
	}

	@Test(enabled = false)
	public void ValidationstockVariant() throws Exception {
		System.out.println("7");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("updating warehouse validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		wareHouseDetails.StockVariantValidation();
		Thread.sleep(2000);

	}

	@Test(enabled = true)
	public void ValidationstockAdjustment() throws Exception {
		System.out.println("8");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("Stock Adjusment validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		wareHouseDetails.StockAdjustmentValidation();
		Thread.sleep(2000);

	}

	@Test(enabled = true)
	public void ValidationAgedStock() throws Exception {
		System.out.println("9");
		Utility.logger();
		wareHouseDetails = new WareHouseDetailsPage();
		create_extent_test("Aged Stock validation");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		wareHouseDetails.AgedStockValidation();
		Thread.sleep(2000);

	}

}
