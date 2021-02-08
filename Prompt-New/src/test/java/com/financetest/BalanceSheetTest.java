package com.financetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.financepage.BalanceSheetDeatailsPage;
import com.pages.Login;
import com.util.Utility;

public class BalanceSheetTest extends Base {

	BalanceSheetDeatailsPage balanceSheetDetails;

	@Test(enabled = true, priority = 1)
	public void VerificationCategory() throws Exception {

		Utility.logger();
		balanceSheetDetails = new BalanceSheetDeatailsPage();
		create_extent_test("verification of Balance sheet details and popup opened using number links");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		balanceSheetDetails.BalanceSheetVerification();

	}

	@Test(enabled = true, priority = 2)
	public void VerificationAdditionCategory() throws Exception {

		Utility.logger();
		balanceSheetDetails = new BalanceSheetDeatailsPage();
		create_extent_test("verification of addition of a,b,c,d columns");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		balanceSheetDetails.BalanceSheetAdditionVerification();

	}

}
