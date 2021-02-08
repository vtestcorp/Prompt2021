package com.financetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.financepage.ProfitLossDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class ProfitLossTest extends Base {

	ProfitLossDetailsPage profitlossdetails;

	@Test(enabled = true, priority = 1)
	public void VerificationProfitLoss() throws Exception {

		Utility.logger();
		profitlossdetails = new ProfitLossDetailsPage();
		create_extent_test("verification of Profit Loss details and popup opened using number links");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		profitlossdetails.ProfitLossVerification();
		Utility.implicitwait();
	}

}
