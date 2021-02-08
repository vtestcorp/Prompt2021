package com.inventorytest;

import org.testng.annotations.Test;

import com.base.Base;
import com.inventory.ProductPriceListDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class ProductPriceDetailsTest extends Base {

	ProductPriceListDetailsPage productPriceDetails;

	/*@Test(enabled = true)
	public void VerificationProductPrice() throws Exception {
        System.out.println("1");
		Utility.logger();
		productPriceDetails = new ProductPriceListDetailsPage();
		create_extent_test("verification of price details of product");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		productPriceDetails.ProductPriceVerification();
		Utility.implicitwait();
	}*/

	@Test(enabled = true)
	public void VerificationPriceList() throws Exception {
		System.out.println("2");
		Utility.logger();
		productPriceDetails = new ProductPriceListDetailsPage();
		create_extent_test("verification of creation of price list");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		productPriceDetails.PriceListVerification();
		Utility.implicitwait();

	}

	@Test(enabled = true)
	public void VerificationPriceListNegative() throws Exception {
		System.out.println("3");
		Utility.logger();
		productPriceDetails = new ProductPriceListDetailsPage();
		create_extent_test("verification of error message of price list");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		productPriceDetails.PriceListVerificationNegative();
		Utility.implicitwait();

	}
}
