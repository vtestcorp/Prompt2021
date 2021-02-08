package com.financetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.financepage.BusinessExpenseDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class BusinessExpenseTest extends Base {

	BusinessExpenseDetailsPage businessExpenseDetails;

	@Test(enabled = true, priority = 1)
	public void VerificationCategory() throws Exception {

		Utility.logger();
		businessExpenseDetails = new BusinessExpenseDetailsPage();
		create_extent_test("verification of Search of ledger account");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));

		Utility.implicitwait();
		businessExpenseDetails.BusinessExpenseVerification();
		Utility.implicitwait();
	}

}
