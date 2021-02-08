package com.financepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class LedgerAccountsDetailsPage extends Base {

	String ledgername = "New Investment11";
	String description = "No need to describe";

	String categoryname = "New category11";
	String startnumber = "1000";
	String endnumber = "2000";

	String ledgergroupname = "New Group1";

	@FindBy(xpath = "(//*[text()='Finance'])[1]")
	public WebElement financeTab;

	@FindBy(xpath = "(//*[text()='Ledger Accounts'])[1]")
	public WebElement ledgerAccountTab;

	@FindBy(xpath = "//*[@ref=\"gridPanel\"]")
	public WebElement ledgerAccountTable;

	@FindBy(xpath = "(//*[@col-id=\"ledgerAccountName\"])[2]")
	public WebElement ledgerFirstName;

	@FindBy(xpath = "(//div[@col-id=\"categoryName\"])[5]")
	public WebElement categoryFirstName;

	@FindBy(xpath = "//*[@id=\"root\"]//div[2]/div//div[2]/div[2]/div//div[1]/div/div[3]/div[2]/div/div/div[1]/div[1]")
	public WebElement ledgerGrpFirstName;

	@FindBy(xpath = "//*[@placeholder=\"Search\"]")
	public WebElement searchField;

	@FindBy(xpath = "(//div[text()='Category'])[2]")
	public WebElement categoryTab;

	@FindBy(xpath = "(//div[text()='Category'])[2]")
	public WebElement categoryTabTable;

	@FindBy(xpath = "(//div[text()='Ledger Account Group'])[2]")
	public WebElement ledgerGroupTab;

	@FindBy(xpath = "(//div[text()='Ledger Account Group'])")
	public WebElement ledgerGroupTabTable;

	@FindBy(xpath = "(//*[@placeholder=\"Enter Ledger Name\"])[2]")
	public WebElement ledgerGrpName;

	@FindBy(xpath = "(//*[text()='Category Group'])[1]")
	public WebElement categoryGroup;

	@FindBy(xpath = "(//*[text()='New Ledger'])[1]")
	public WebElement newLedgerButton;

	@FindBy(xpath = "//*[@placeholder=\"Enter Ledger Name\"]")
	public WebElement newLedgerName;

	@FindBy(xpath = "//*[@placeholder=\"Enter Description\"]")
	public WebElement newLedgerDesription;

	@FindBy(xpath = "(//*[@class=\"ant-select-selection-search-input\"])[1]")
	public WebElement accountGroupDrop;

	@FindBy(xpath = "(//*[@class=\"ant-select-selection-search-input\"])[2]")
	public WebElement ledgerBalanceText;

	@FindBy(xpath = "//*[@placeholder=\"Enter category Name\"]")
	public WebElement categoryName;

	@FindBy(xpath = "//*[@placeholder=\"Enter Ledger Account Number\"]")
	public WebElement accountNumber;

	@FindBy(xpath = "//*[text()='Create Account']")
	public WebElement createAccountButton;

	@FindBy(xpath = "//*[text()='Create Category']")
	public WebElement createCategoryButton;

	@FindBy(xpath = "//*[text()='Create Ledger Account Group']")
	public WebElement createledgerGrpButton;

	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement submitButton;

	@FindBy(xpath = "//*[@placeholder=\"Enter Starting Number\"]")
	public WebElement stratNnumber;

	@FindBy(xpath = "//*[@placeholder=\"Enter Ending Account Number\"]")
	public WebElement endNumber;

	@FindBy(xpath = "(//*[@class=\"ant-select-selection-search-input\"])[3]")
	public WebElement categoryGroupDrop;

	public LedgerAccountsDetailsPage() {
		PageFactory.initElements(driver, this);
	}

////////////////////Ledger Account search Verification ///////////////////////////

	public void LedgerSearchVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(ledgerAccountTab);
		Utility.implicitwait();

		if ((ledgerAccountTable.isDisplayed() && (ledgerGroupTabTable.isDisplayed()) && (categoryTabTable.isDisplayed())
				&& (categoryGroup.isDisplayed()))) {

			et.log(LogStatus.PASS,
					"Ledger Accounts Details, Ledger account group, category and category group are Displayed ",
					et.addScreenCapture(pass(
							"Ledger Accounts Details, Ledger account group, category and category group are Displayed ")));

		} else {

			et.log(LogStatus.FAIL, "Ledger Accounts Details are not Displayed ",
					et.addScreenCapture(fail("Ledger Accounts Details are not Displayed ")));
		}

		String actsearchname = ledgerFirstName.getText();

		Utility.enterText(searchField, actsearchname);
		Utility.implicitwait();
		String expsearchname = ledgerFirstName.getText();

		if (actsearchname.equalsIgnoreCase(expsearchname)) {

			et.log(LogStatus.PASS, "Ledger Account is searched and searched result is correct ",
					et.addScreenCapture(pass("Ledger Account is searched and searched result is correct")));

		} else {

			et.log(LogStatus.FAIL, "Ledger Account searched result is not correct",
					et.addScreenCapture(fail("Ledger Account searched result is not correct")));
		}

	}

////////////////////Ledger Account create Verification ///////////////////////////

	public void LedgerCreateVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(ledgerAccountTab);
		Utility.implicitwait();
		Utility.click(newLedgerButton);
		Utility.implicitwait();
		Utility.enterText(newLedgerName, ledgername);
		Utility.enterText(newLedgerDesription, description);
		Utility.click(accountGroupDrop);
		driver.findElement(By.xpath("//div[@name='Investments']")).click();
		Utility.click(ledgerBalanceText);
		driver.findElement(By.xpath("//div[@name='Debit']")).click();
		Utility.implicitwait();

		Utility.click(createAccountButton);
		Utility.implicitwait();
		Utility.click(submitButton);

		try {
			createAccountButton.isDisplayed();
			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));

		} catch (Exception e) {

			Utility.enterText(searchField, ledgername);
			Utility.implicitwait();
			String expsearchname = ledgerFirstName.getText();

			if (ledgername.equalsIgnoreCase(expsearchname)) {

				et.log(LogStatus.PASS, "Ledger Account is created successfuly ",
						et.addScreenCapture(pass("Ledger Account is createded successfuly")));

			} else {

				et.log(LogStatus.FAIL, "Ledger Account is not created successfuly",
						et.addScreenCapture(fail("Ledger Account is created not successfuly")));
			}

		}

	}

//////////////////// Category create Verification ///////////////////////////

	public void CategoryCreateVerification() throws Exception {

		Thread.sleep(4000);
		Utility.click(financeTab);
		Utility.click(ledgerAccountTab);
		Utility.implicitwait();
		Utility.click(newLedgerButton);
		Utility.implicitwait();
		Utility.click(categoryTab);
		Utility.enterText(categoryName, categoryname);
		Utility.enterText(stratNnumber, startnumber);
		Utility.enterText(endNumber, endnumber);

		Utility.click(categoryGroupDrop);
		driver.findElement(By.xpath("//div[@name='Asset']")).click();
		Utility.implicitwait();

		Utility.click(createCategoryButton);
		Utility.implicitwait();
		Utility.click(submitButton);

		try {
			createCategoryButton.isDisplayed();
			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));

		} catch (Exception e) {

			Utility.click(categoryTab);
			Utility.enterText(searchField, categoryname);
			Utility.implicitwait();
			String expsearchname = categoryFirstName.getText();

			if (categoryname.equalsIgnoreCase(expsearchname)) {

				et.log(LogStatus.PASS, "Category is created successfuly ",
						et.addScreenCapture(pass("Category is createded successfuly")));

			} else {

				et.log(LogStatus.FAIL, "Category is not created successfuly",
						et.addScreenCapture(fail("Category is created not successfuly")));
			}

		}

	}

//////////////////// Ledger Group create Verification ///////////////////////////

	public void LedgerGroupCreateVerification() throws Exception {

		Thread.sleep(4000);
		Utility.click(financeTab);
		Utility.click(ledgerAccountTab);
		Utility.implicitwait();
		Utility.click(newLedgerButton);
		Utility.implicitwait();
		Utility.click(ledgerGroupTab);
		Utility.implicitwait();
		Utility.enterText(ledgerGrpName, ledgergroupname);
		Utility.click(categoryGroupDrop);
		driver.findElement(By.xpath("//div[@name='Current Assets']")).click();
		Utility.implicitwait();

		Utility.click(createledgerGrpButton);
		Utility.implicitwait();
		Utility.click(submitButton);

		try {
			createledgerGrpButton.isDisplayed();
			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));

		} catch (Exception e) {

			Utility.click(ledgerGroupTabTable);
			Utility.enterText(searchField, ledgergroupname);
			Utility.implicitwait();
			String expsearchname = ledgerGrpFirstName.getText();

			if (ledgergroupname.equalsIgnoreCase(expsearchname)) {

				et.log(LogStatus.PASS, "Ledger Group is created successfuly ",
						et.addScreenCapture(pass("Ledger Group is createded successfuly")));

			} else {

				et.log(LogStatus.FAIL, "Ledger Group is not created successfuly",
						et.addScreenCapture(fail("Ledger Group is created not successfuly")));
			}

		}

	}

}
