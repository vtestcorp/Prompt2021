package com.financetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.financepage.TrialBalancedetailsPage;
import com.pages.Login;
import com.util.Utility;

public class TrialBalanceTest extends Base {

	TrialBalancedetailsPage trialbalancedetails;

	@Test(enabled = true, priority = 1)
	public void VerificationTrialBalance() throws Exception {

		Utility.logger();
		trialbalancedetails = new TrialBalancedetailsPage();
		create_extent_test("verification of Trial Balance details and popup opened using number links");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Thread.sleep(4000);
		trialbalancedetails.TrialBalanceVerification();
		Thread.sleep(2000);
	}

	@Test(enabled = true, priority = 2)
	public void VerificationTrialBalanceAddition() throws Exception {

		Utility.logger();
		trialbalancedetails = new TrialBalancedetailsPage();
		create_extent_test("verification of addition of debit and credit numbers addition");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		trialbalancedetails.TrialBalanceAdditionVerification();
		Utility.implicitwait();
	}
}
