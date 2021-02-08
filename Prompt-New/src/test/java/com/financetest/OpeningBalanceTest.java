package com.financetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.financepage.OpeningBalanceDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class OpeningBalanceTest extends Base {

	OpeningBalanceDetailsPage openingdetails;

	@Test(enabled = true, priority = 1)
	public void VerificationOpeningBalance() throws Exception {

		Utility.logger();
		openingdetails = new OpeningBalanceDetailsPage();
		create_extent_test("verification of Opening balance search");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		openingdetails.OpeningBalanceVerification();
		Utility.implicitwait();
	}

}