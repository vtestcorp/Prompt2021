package com.inventorytest;

import org.testng.annotations.Test;

import com.base.Base;
import com.inventory.ExtrasDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class ExtrasDetailsTest extends Base {

	ExtrasDetailsPage extrasDetails;

	@Test(enabled = true, priority = 1)
	public void VerificationCategory() throws Exception {
        System.out.println("1");
		Utility.logger();
		extrasDetails = new ExtrasDetailsPage();
		create_extent_test("verification of creation and delete category");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		extrasDetails.CategoryVerification();
	}

	/*@Test(enabled = true, priority = 2)
	public void VerificationCategoryDelete() throws Exception {
System.out.println("2");
		Utility.logger();
		extrasDetails = new ExtrasDetailsPage();
		create_extent_test("verification of deleting category with products");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		extrasDetails.CategoryDeleteVerification();
		Utility.implicitwait();
	}*/

	@Test(enabled = true, priority = 3)
	public void VerificationCategoryUpdate() throws Exception {
		System.out.println("3");
		Utility.logger();
		extrasDetails = new ExtrasDetailsPage();
		create_extent_test("verification of updating category name");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		extrasDetails.CategoryUpdateVerification();
		Utility.implicitwait();
	}

	/*@Test(enabled = true, priority = 4)
	public void VerificationManufacturer() throws Exception {
		System.out.println("4");
		Utility.logger();
		extrasDetails = new ExtrasDetailsPage();
		create_extent_test("verification of creation,update Manufacturer");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		extrasDetails.ManufacturerVerification();
		Utility.implicitwait();
	}*/

	@Test(enabled = true, priority = 5)
	public void VerificationDeleteManufacturer() throws Exception {
		System.out.println("5");
		Utility.logger();
		extrasDetails = new ExtrasDetailsPage();
		create_extent_test("verification of  delete Manufacturer");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		extrasDetails.ManufacturerDeleteVerification();
		Utility.implicitwait();
	}

	@Test(enabled = true, priority = 6)
	public void VerificationBrand() throws Exception {
		System.out.println("6");
		Utility.logger();
		extrasDetails = new ExtrasDetailsPage();
		create_extent_test("verification of creation,update Brands");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		extrasDetails.BrandsVerification();
		Utility.implicitwait();
	}

	@Test(enabled = true, priority = 7)
	public void VerificationDeleteBrands() throws Exception {
		System.out.println("7");
		Utility.logger();
		extrasDetails = new ExtrasDetailsPage();
		create_extent_test("verification of  delete Brands");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		extrasDetails.BrandsDeleteVerification();
		Utility.implicitwait();
	}

	@Test(enabled = true, priority = 8)
	public void VerificationUOM() throws Exception {
		System.out.println("8");
		Utility.logger();
		extrasDetails = new ExtrasDetailsPage();
		create_extent_test("verification of creation,update UOM");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		extrasDetails.UOMVerification();
		Utility.implicitwait();
	}

	@Test(enabled = true, priority = 9)
	public void VerificationUOMBrands() throws Exception {
		System.out.println("9");
		Utility.logger();
		extrasDetails = new ExtrasDetailsPage();
		create_extent_test("verification of  delete UOM");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		extrasDetails.UOMDeleteVerification();
		Utility.implicitwait();
	}

}
