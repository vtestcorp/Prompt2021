package com.financetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.financepage.LedgerAccountsDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class LedgerAccountsTest extends Base {

	LedgerAccountsDetailsPage ledgerAccountsDetails;

	@Test(enabled = true, priority = 1)
	public void VerificationCategory() throws Exception {

		Utility.logger();
		ledgerAccountsDetails = new LedgerAccountsDetailsPage();
		create_extent_test("verification of Search of ledger account");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		ledgerAccountsDetails.LedgerSearchVerification();
		Utility.implicitwait();
	}

	@Test(enabled = true, priority = 2)
	public void VerificationCreationLedger() throws Exception {

		Utility.logger();
		ledgerAccountsDetails = new LedgerAccountsDetailsPage();
		create_extent_test("verification of creation of ledger account");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		ledgerAccountsDetails.LedgerCreateVerification();
		Utility.implicitwait();
	}

	@Test(enabled = true, priority = 3)
	public void VerificationLedgerCreeation() throws Exception {

		Utility.logger();
		ledgerAccountsDetails = new LedgerAccountsDetailsPage();
		create_extent_test("verification of creation of category");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		ledgerAccountsDetails.CategoryCreateVerification();
		Utility.implicitwait();
	}

	@Test(enabled = true, priority = 4)
	public void VerificationLedgerGropuCreeation() throws Exception {

		Utility.logger();
		ledgerAccountsDetails = new LedgerAccountsDetailsPage();
		create_extent_test("verification of creation of Ledger Group");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		ledgerAccountsDetails.LedgerGroupCreateVerification();
		Utility.implicitwait();
	}
}
