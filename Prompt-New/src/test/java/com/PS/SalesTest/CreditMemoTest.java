package com.PS.SalesTest;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.Login;
import com.sales.CreditMemoDetailsPage;
import com.util.Utility;

public class CreditMemoTest extends Base {

	CreditMemoDetailsPage salesDetails;

	@Test(enabled = true, priority = 1)
	public void CreateCreditMemo() throws Exception {
        System.out.println("1");
		Utility.logger();
		salesDetails = new CreditMemoDetailsPage();
		create_extent_test("Create Credit Memo");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		salesDetails.creditMemoCreate();

	}

	/*@Test(enabled = true, priority = 2)
	public void NegavtiveCreditMemo() throws Exception {
		System.out.println("2");
		Utility.logger();
		salesDetails = new CreditMemoDetailsPage();
		create_extent_test("Credit Memo Error Message verification");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.CreditMemoNegative();

	}*/

	/*@Test(enabled = true, priority = 3)
	public void creditMemoCal() throws Exception {
		System.out.println("3");
		Utility.logger();
		salesDetails = new CreditMemoDetailsPage();
		create_extent_test("credit memo calculation  for Suammary");
		new Login().login(Utility.excelRead(2, 0, "CustomerDetails"), Utility.excelRead(2, 1, "CustomerDetails"));
		Utility.implicitwait();
		salesDetails.creditMemoCralculation();

	}*/

}
