package com.financetest;

import org.testng.annotations.Test;

import com.base.Base;
import com.financepage.JournalsDetailsPage;
import com.pages.Login;
import com.util.Utility;

public class JournalsTest extends Base {

	JournalsDetailsPage journalsdetailspage;

	@Test(enabled = true, priority = 1)
	public void VerificationJournal() throws Exception {

		Utility.logger();
		journalsdetailspage = new JournalsDetailsPage();
		create_extent_test("verification of Journal Page Created");

		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		journalsdetailspage.JournalPageVerification();
		Utility.implicitwait();
	}
}
