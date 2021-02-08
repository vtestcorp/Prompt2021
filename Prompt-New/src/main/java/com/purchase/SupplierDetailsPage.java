package com.purchase;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class SupplierDetailsPage extends Base {

	String suppliername = Utility.excelRead(2, 2, "SupplierDetails");
	String importsuppliername = Utility.excelReadHssf(1, 0, "ImportSuppliers1");
	String suppDelete = Utility.excelRead(7, 37, "SupplierDetails");
	String suppDeleteTrans = "Glory Rubber (P) Ltd";
	String suppDeleteTransaction="Delete DEMO";
	String suppDetails="Brand Junction";

	@FindBy(xpath = "//*[text()='Purchase']")
	public WebElement purchaseButton;

	@FindBy(xpath = "//*[text()='Suppliers']/..")
	public WebElement supplierButton;

	@FindBy(xpath = "(//div[@class=\"ag-react-container\"]//button)[3]")
	public WebElement actionButton3;

	@FindBy(xpath = "//*[text()='Edit Supplier']/..")
	public WebElement edit_supp_option;

	@FindBy(xpath = "//span[@class=\"dropdown active ant-dropdown-trigger\"]")
	public WebElement uploadDownArrow;

	@FindBy(xpath = "//*[text()='Import Suppliers']")
	public WebElement importButton;

	@FindBy(xpath = "//input[@name='Maharashtra']")
	public WebElement selectstate1;

	@FindBy(xpath = "//div[@name='Dr.']")
	public WebElement Title;

	@FindBy(xpath = "//a[contains(@href,'admin/suppliers')]")
	public WebElement SupplierMenuBtn;

	@FindBy(xpath = "//button[contains(text(),'New Supplier')]")
	public WebElement newSupplier;

	@FindBy(xpath = "//input[@placeholder='Enter Supplier Name']")
	public WebElement supplierName;

	@FindBy(xpath = "//*[text()='Select Payment Term']/..")
	public WebElement paymentTerm;

	@FindBy(xpath = "//*[text()='Select Supplier Type']/..")
	public WebElement supplierType;

	@FindBy(xpath = "//input[@placeholder='Enter Website Url']")
	public WebElement companyWebsite;

	@FindBy(xpath = "//*[text()='Select Supplier Source']/..")
	public WebElement supplierSource;

	@FindBy(xpath = "//*[text()='Select Company Rating']/..")
	public WebElement rateYourCompany;

	@FindBy(xpath = "//*[text()='Select Industry']/..")
	public WebElement industry;

	@FindBy(xpath = "//input[@placeholder='Relationship Since Date']")
	public WebElement relationship;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitSupplier;

	@FindBy(xpath = "//input[@placeholder='Street Name']") // Street Name
	public WebElement streetname1;

	@FindBy(xpath = "//input[@placeholder='(//input[@placeholder='State/Province/Region'])[2]']") // Street Name
	public WebElement stateProvinance;

	@FindBy(xpath = "(//input[@placeholder='City'])[1]")
	public WebElement city1;

	@FindBy(xpath = "//div[text()='State']/parent::div")
	public WebElement state1;

	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
	public WebElement zipcode1;

	@FindBy(xpath = "//*[text()='Select Country']/..")
	public WebElement country1;

	@FindBy(xpath = "//div[@class=\"billing-address-information\"]")
	public WebElement scrollDown;

	@FindBy(xpath = "(//input[@placeholder=\"State/Province/Region\"])[1]")
	public WebElement stateName;

	@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary\"]")
	public WebElement save;

	@FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-primary\"])[2]")
	public WebElement save1;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitbtn;

	@FindBy(xpath = "//*[text()='suppliers deleted successfully']")
	public WebElement errorMessage;

	@FindBy(xpath = "//div[@class=\"ant-notification-notice-description\"]")
	public WebElement errorMessageTrans;
	
	@FindBy (xpath = "//*[text()='Validation Failed']")
	public WebElement errorMsgTran;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters supplier name']")
	public WebElement searchbox;

	@FindBy(xpath = "//div[@class=\"ant-table-content\"]")
	public WebElement allTransactionTable;

	@FindBy(xpath = "//*[@id=\"root\"]//div[2]/div[3]/div/div[2]/div[1]//div[3]//div/div/table/tbody")
	public WebElement purchaseTranTable;
	
	@FindBy (xpath = "(//div[@class='ant-table-wrapper customer-transactions-table'])[1]")
	public WebElement purchaseTransactionTable;

	@FindBy(xpath = "//*[@id=\"root\"]/div//div[2]//div[2]//div[2]/div[4]/div")
	public WebElement purchaseInvTranTable;
	
	@FindBy (xpath = "(//div[@class='ant-table'])[1]")
	public WebElement purchaseInvoiceTransactionTable;

	@FindBy(xpath = "(//a[@class=\"company-name\"])[1]")
	public WebElement transactionCompany;

	@FindBy(xpath = "//div[@role=\"tab\"][text()='Purchase Order']")
	public WebElement transactionPurchaseOrder;

	@FindBy(xpath = "//div[@role=\"tab\"][text()='Invoice']")
	public WebElement transactionPurchaseInvoice;

	@FindBy(xpath = "//div[@role=\"tab\"][text()='Credit Memo']")
	public WebElement transactionCreditMemo;

	@FindBy(xpath = "//div[@role=\"tab\"][text()='Payment']")
	public WebElement transactionPayment;

	@FindBy(xpath = "//div//p[text()='No Data']")
	public WebElement tablePaymentNoData;

	@FindBy(xpath = "//td[@colspan=\"6\"]")
	public WebElement blankTableTransaction;

	@FindBy(xpath = "(//td[@class=\"ant-table-cell\"]//div/.)[1]")
	public WebElement trasactionClick;

	@FindBy(xpath = "//*[@id=\"root\"]//div[2]/div[3]//div[1]/div[2]/div[3]//div/table/tbody/tr[1]/td[2]")
	public WebElement trasactionClickPurchaseOrder;

	@FindBy(xpath = "//*[@id=\"root\"]//div[1]/div[2]/div[4]//div/table/tbody/tr[1]/td[2]")
	public WebElement trasactionClickPurchaseInvoice;

	@FindBy(xpath = "(//*[@id=\"root\"]//div[6]//table/tbody//tr//td[2])[1]")
	public WebElement trasactionClickCredit;

	@FindBy(xpath = "//div[@class=\"button-group-action\"]")
	public WebElement bottomButtonsFullScreen;

	@FindBy(xpath = "//*[text()='Download']/..")
	public WebElement downloadTransaction;

	@FindBy(xpath = "(//button[@class=\"ant-btn action-btn small\"])[1]")
	public WebElement transactionAction;

	@FindBy(xpath = "//*[@id=\"root\"]//div/table/tbody/tr[1]/td[7]/div/button")
	public WebElement transactionAction1;

	@FindBy(xpath = "//*[@id=\"root\"]//div[4]//table/tbody/tr[1]/td[9]/div/button")
	public WebElement transactionAction2;

	@FindBy(xpath = "//*[text()='Delete']/..")
	public By deleteTransaction;

	@FindBy(xpath = "//tr[1]//td[8]//div[1]//button[1]")
	public By deleteTransaction1;

	@FindBy(xpath = "//div[@aria-rowindex='2']//button[1]")
	public WebElement actionButton;

	@FindBy(xpath = "(//a[@class=\"company-name\"])[1]")
	public static WebElement actSuppName;

	@FindBy(xpath = "//span[text()='Shipping address same as billing']/parent::label")
	public WebElement sameAsBillingAddress1;

	@FindBy(xpath = "//div[@class=' ant-tabs-tab']")
	public WebElement contact;

	@FindBy(xpath = "//*[text()='Select Title']/..")
	public WebElement selectTitle;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	public WebElement MiddleName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement LastName;

	@FindBy(xpath = "//input[@placeholder='Call Name']")
	public WebElement CallName;

	@FindBy(xpath = "//input[@placeholder='Phone']")
	public WebElement Phone;

	@FindBy(xpath = "//input[@placeholder='Mobile']")
	public WebElement Mobile;

	@FindBy(xpath = "//input[@placeholder='Fax #']")
	public WebElement FaxNumber;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement Email;

	@FindBy(xpath = "//div[@id='tab-3']")
	public WebElement tax;

	@FindBy(xpath = "//*[text()='Select GST Mechanism']/..")
	public WebElement GstMech;

	@FindBy(xpath = "//input[@placeholder='Enter GSTIN']")
	public WebElement GstNum;

	@FindBy(xpath = "(//div[@col-id='taxIdentificationNumber'])[2]")
	public WebElement taxNumber;

	@FindBy(xpath = "//input[@placeholder='Enter PAN']")
	public WebElement PanNum;

	@FindBy(xpath = "//label[text()='Located in SEZ']//parent::div//following-sibling::div/div/div/div/span/label/span/input")
	public WebElement checkBox1;

	@FindBy(xpath = "//div[@id='tab-4']")
	public WebElement logo;

	@FindBy(xpath = "//button[@class='ant-btn']")
	public WebElement uploadButton;

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement saveNew;

	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	public WebElement saveNew1;

	@FindBy(xpath = "//li[starts-with(text(),'Total')]")
	public WebElement totalSupplierCount;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters supplier name']")
	public WebElement searchbox1;

	@FindBy(xpath = "//div[@aria-rowindex='2']//button[1]")
	public WebElement update_first_supplier;

	@FindBy(xpath = "//li[@class='ant-dropdown-menu-item']")
	public WebElement editSupplier;

	@FindBy(xpath = "//a[contains(text(),'Glory Rubber (P) Ltd')]")
	public WebElement labelName;

	@FindBy(xpath = "//*[text()='Select Industry']/..")
	public WebElement selectIndustryDrop;

	@FindBy(xpath = "//*[text()='modal.ImportSupplier.supplierType.placeholde']")
	public WebElement selectSuppTypeDrop;

	@FindBy(xpath = "//*[text()='Select Supplier Source']")
	public WebElement selectSuppSourceDrop;

	@FindBy(xpath = "//*[text()='Select Payment Term']")
	public WebElement selectPaymenteDrop;

	@FindBy(xpath = "//li[text()='Import Supplier']")
	public WebElement newSupplierDropdown;

	@FindBy(xpath = "//span[text()='Next']//parent::button")
	public WebElement NextbtnNew;

	@FindBy(xpath = "//*[@title='Delete Supplier']")
	public WebElement deleteSupp;

	@FindBy(xpath = "//*[text()='Delete Supplier']")
	public WebElement deleteSupplier;

	@FindBy(xpath = "(//a[@class=\"company-name\"])[1]")
	public WebElement createdSuppName;

	@FindBy(xpath = "//span[text()='Done']/parent::button")
	public WebElement NextbtnNew2;

	@FindBy(xpath = "//*[text()='No Rows To Show']")
	public WebElement noRowsToShow;

	@FindBy(xpath = "(//input[@type='file'])[2]")
	public WebElement chooseFileNew;

	@FindBy(xpath = "//span[@class='ant-modal-close-x']")
	public WebElement close1;

	@FindBy(xpath = "//a[@class='company-name'][1]")
	public WebElement labelFirstSupplierName;

	public SupplierDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	//////////////////////////// Creating Supplier
	//////////////////////////// //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created supplier.
	 */

	public void createSupplier() throws Exception {
		Utility.wait_N_click(purchaseButton);
		System.out.println(1);
		Utility.click(supplierButton);
		Utility.JS_Scrolldown(totalSupplierCount);
		System.out.println(2);
		String totalSuppCount = totalSupplierCount.getText();
		System.out.println(3);
		Utility.click(newSupplier);
		System.out.println(4);
		Utility.ExcelReadAndWrite(2, 2);
		Utility.enterText(supplierName, Utility.excelRead(2, 2, "SupplierDetails"));
		System.out.println(5);
		Utility.click(paymentTerm);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 3, "SupplierDetails") + "']")).click();
		System.out.println(6);
		Utility.click(supplierType);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 4, "SupplierDetails") + "']")).click();
		System.out.println(7);
		Utility.enterText(companyWebsite, Utility.excelRead(2, 5, "SupplierDetails"));
		System.out.println(8);
		Utility.click(supplierSource);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 6, "SupplierDetails") + "']")).click();
		System.out.println(9);
		Utility.click(industry);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 8, "SupplierDetails") + "']")).click();
		System.out.println(10);
		// Utility.click(relationship);
		// driver.findElement(By.xpath("//td[@title='" + Utility.excelRead(2, 47,
		// "SupplierDetails") + "']")).click();

		Utility.enterText(streetname1, Utility.excelRead(2, 9, "SupplierDetails"));
		Utility.enterText(city1, Utility.excelRead(2, 10, "SupplierDetails"));
		Utility.JS_Scrolldown(scrollDown);
		// Utility.click(country1); //autopopulated

		// driver.findElement(By.xpath("//*[text()='Aruba']/..")).click();
		// Utility.enterText(stateName, "Empire State");

		Utility.click(sameAsBillingAddress1);
		Utility.click(contact);

		Utility.click(selectTitle);

		Utility.click(Title);

		Utility.enterText(FirstName, Utility.excelRead(2, 36, "SupplierDetails"));

		Utility.enterText(MiddleName, Utility.excelRead(2, 37, "SupplierDetails"));

		Utility.enterText(LastName, Utility.excelRead(2, 38, "SupplierDetails"));

		// Utility.enterText(CallName, Utility.excelRead(2, 39, "SupplierDetails"));
		// field not available

		Utility.enterText(Phone, Utility.excelRead(2, 40, "SupplierDetails"));

		Utility.enterText(Mobile, Utility.excelRead(2, 41, "SupplierDetails"));

		Utility.enterText(FaxNumber, Utility.excelRead(2, 42, "SupplierDetails"));

		Utility.enterText(Email, Utility.excelRead(2, 43, "SupplierDetails"));

		Utility.click(tax);

		Utility.click(GstMech);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 44, "SupplierDetails") + "']")).click();

		// Utility.enterText(GstNum, Utility.excelRead(2, 45, "SupplierDetails"));
		// //field not present

		// Utility.enterText(taxNumber, Utility.excelRead(2, 45, "SupplierDetails"));
		// Utility.enterText(PanNum, Utility.excelRead(2, 46, "SupplierDetails")); //
		// field not present

		// Utility.click(checkBox1);
		checkBox1.sendKeys(Keys.ENTER);
		Utility.click(logo);
		Utility.click(uploadButton);
		Utility.uploadFile("Logo");

		// Utility.wait_N_click(save); // field not on UI
		// Utility.wait_N_click(save1); // field not on UI
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit'][text()='Submit']")).click();
		driver.findElement(By.xpath("//span[@role='img'][@class='anticon anticon-close']")).click();
		Utility.enterText(searchbox, suppliername);

		WebElement actSuppName = driver
				.findElement(By.xpath("//*[text()='" + Utility.excelRead(2, 2, "SupplierDetails") + "']"));
		String supp = actSuppName.getText();

		if (supp.equals(suppliername)) { //// verifying created supplier.
			et.log(LogStatus.PASS, "New Supplier is Created ", et.addScreenCapture(pass("New Supplier is Created")));

		} else {
			et.log(LogStatus.FAIL, "New Supplier is not Created ",
					et.addScreenCapture(fail("New Supplier is not Created")));

		}

		String totalSuppCountCurrent = totalSupplierCount.getText();

		try {
			if (totalSuppCount.equals(totalSuppCountCurrent)) { //// verifying count.

				et.log(LogStatus.FAIL, "New Supplier is not Created and count not increased",
						et.addScreenCapture(fail("New Supplier is not Created and count not increased")));
			} else {

				et.log(LogStatus.PASS, "New Supplier Created and count got increased",
						et.addScreenCapture(pass("New Supplier Created and count got increased")));
			}
		} catch (Exception ex) {

		}
	}

	//////////////////////////// Upload Supplier
	//////////////////////////// //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly Uploaded supplier.
	 */

	public void uploadSupplier() throws Exception {
		Utility.wait_N_click(purchaseButton);
		Utility.click(supplierButton);
		Utility.JS_Scrolldown(totalSupplierCount);

		String totalSuppCount = totalSupplierCount.getText();
		System.out.println(totalSuppCount);

		Utility.mouseHover(uploadDownArrow);
		Utility.mouseHover(importButton);
		Utility.click(importButton);
		Utility.click(selectIndustryDrop);
		System.out.println(1);
		driver.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 33, "SupplierDetails") + "']/..")).click();
		System.out.println(2);
		// Utility.click(selectSuppTypeDrop);
		driver.findElement(By.xpath("(//input[@role='combobox'])[3]")).sendKeys(Keys.ENTER);
		System.out.println(3);
		driver.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 34, "SupplierDetails") + "']/..")).click();
		System.out.println(4);
		// Utility.click(selectSuppSourceDrop);
		driver.findElement(By.xpath("(//input[@role='combobox'])[4]")).sendKeys(Keys.ENTER);
		System.out.println(5);
		driver.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 35, "SupplierDetails") + "']/..")).click();
		System.out.println(6);
		// Utility.click(selectPaymenteDrop);
		driver.findElement(By.xpath("(//input[@role='combobox'])[5]")).sendKeys(Keys.ENTER);
		;
		System.out.println(7);
		// driver.findElement(By.xpath("(//div[@name='" + Utility.excelRead(7, 36,
		// "SupplierDetails") + "']/..)[2]")).click();
		driver.findElement(By.xpath("//div[@name='Cash on Delivery']")).click();
		// Utility.JSClick(NextbtnNew);
		Thread.sleep(8000);
		Utility.wait_N_click(driver.findElement(By.xpath("//span[text()='Next']/parent::button")));
		// Utility.JSClick(driver.findElement(By.xpath("//span[text()='Next']/parent::button")));
		System.out.println(8);
		// Utility.click(driver.findElement(By.xpath("//input[@accept='.xlsx, .xls,
		// .csv']")));
		// chooseFileNew.sendKeys(Keys.ENTER);
		Utility.wait_N_clikable(driver.findElement(By.xpath("//input[@accept='.xlsx, .xls, .csv']")));
		Utility.JSClick(driver.findElement(By.xpath("//input[@accept='.xlsx, .xls, .csv']")));
		Utility.uploadFile("ImportSuppliers1");
		Utility.click(NextbtnNew2);
		Utility.ActionClick(close1);
		Utility.enterText(searchbox, importsuppliername);

		if (noRowsToShow.isDisplayed()) {

			et.log(LogStatus.FAIL, "New Supplier is not Uploaded ",
					et.addScreenCapture(fail("New Supplier is not Uploaded")));

		} else if (transactionCompany.isDisplayed()) {

			et.log(LogStatus.PASS, "New Supplier is  Uploaded ",
					et.addScreenCapture(pass("New Supplier is  Uploaded")));
		} else {

			et.log(LogStatus.FAIL, "New Supplier is not Uploaded ",
					et.addScreenCapture(fail("New Supplier is not Uploaded")));

		}

		String totalSuppCountCurrent = totalSupplierCount.getText();

		Thread.sleep(1000);
		try {
			if (totalSuppCount.equals(totalSuppCountCurrent)) { //// verifying count.

				et.log(LogStatus.FAIL, "New Supplier is not Uploaded and count not increased",
						et.addScreenCapture(fail("New Supplier is not Uploaded and count not increased")));
			} else {

				et.log(LogStatus.PASS, "New Supplier Uploaded and count got increased",
						et.addScreenCapture(pass("New Supplier Uploaded and count got increased")));
			}
		} catch (Exception ex) {

		}
	}

	//////////////////////////// Update supplier
	//////////////////////////// //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify updated information of supplier.
	 */

	public void updateSupplier() throws Exception {

		Utility.wait_N_click(purchaseButton);
		Utility.click(supplierButton);
		Utility.click(actionButton3);
		Utility.click(edit_supp_option);
		String newname = "Glory Table (P) Ltd";
		Utility.Clear(supplierName, newname);
		Utility.JS_Scrolldown(save);
		Utility.click(save);
		Utility.click(save1);

		Utility.enterText(searchbox, newname);
		WebElement updatedSupp = driver.findElement(By.xpath("//*[text()='Glory Table (P) Ltd']"));

		if (updatedSupp.isDisplayed()) {
			et.log(LogStatus.PASS, "Matching customer is displayed and information updated",
					et.addScreenCapture(pass("Matching customer is displayed and information updated")));
		} else {
			et.log(LogStatus.FAIL, "Matching customer is not displayed",
					et.addScreenCapture(fail("Matching customer is not displayed")));
		}
	}

	//////////////////////////// creating Supplier Negative Scenario
	//////////////////////////// //////////////////////////////////////////

	public void createSupplierNegative() throws InterruptedException, IOException {
		/***
		 * @author: Sumiran
		 * @implNote: To Verify error message while saving without mandatory fields.
		 */

		Utility.wait_N_click(purchaseButton);
		Utility.click(supplierButton);

		Utility.click(newSupplier);
		Utility.ExcelReadAndWrite(2, 2);

		Utility.JS_Scrolldown(save);
		Utility.click(save);
		Utility.JS_Scrolldown(supplierName);
		try {
			WebElement errorText = driver.findElement(By.xpath("//span[@class='text-red']"));

			if (errorText.isDisplayed()) {

				et.log(LogStatus.PASS, "error message is displaying",
						et.addScreenCapture(pass("error message is displaying")));
			} else {

				et.log(LogStatus.FAIL, "error message is not displaying",
						et.addScreenCapture(fail("error message is not displaying")));
			}
		} catch (Exception e) {
		}
	}

	//////////////////////////// Delete Supplier without Transaction
	//////////////////////////// //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify error message while deleting supplier with and without
	 *            any transaction.
	 */

	public void deleteSupplier() throws Exception {

		Utility.wait_N_click(purchaseButton);
		System.out.println(1);
		Utility.click(supplierButton);
		System.out.println(2);
		Utility.click(newSupplier);
		System.out.println(3);
		Utility.ExcelReadAndWrite(2, 2);
		System.out.println(4);
		Utility.enterText(supplierName, suppDelete);
		System.out.println(5);
		Utility.click(save);
		System.out.println(6);
		Utility.click(save1);
		System.out.println(7);
		Utility.wait(searchbox);
		Utility.enterText(searchbox, suppDelete);
		System.out.println(8);
		Utility.wait(actionButton);
		Utility.click(actionButton);
		System.out.println(9);
		//Utility.wait_N_clikable(driver.findElement(By.xpath("//button[@class='ant-btn action-btn small ant-dropdown-trigger']")));
		Utility.wait_N_click(deleteSupplier);
		System.out.println(10);
		Utility.wait_N_click(submitbtn);
		System.out.println(11);
		try {
			if (errorMessage.isDisplayed()) {

				et.log(LogStatus.PASS, " Message Shown and supplier without transaction is deleted ",
						et.addScreenCapture(pass("Message Shown and supplier without transaction is deleted")));
			} else {

				et.log(LogStatus.PASS, "Message is not Shown and supplier without transaction is not  deleted",
						et.addScreenCapture(
								pass("Message is not Shown and supplier without transaction is not  deleted")));
			}
		} catch (Exception e) {
		}
		// Utility.click(driver.findElement(By.xpath("(//a[text()='Delete DEMO'])")));
		Utility.Clear(searchbox, suppDeleteTransaction);
		System.out.println(12);
		//Utility.click(actionButton);
		Utility.wait(driver.findElement(By.xpath("//input[@type='checkbox']")));
		Utility.click(driver.findElement(By.xpath("//input[@type='checkbox']")));
		if (!driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()) {
			Utility.click(driver.findElement(By.xpath("//input[@type='checkbox']")));
		}
		System.out.println(13);
		Utility.wait_N_click(deleteSupp);
		System.out.println(14);
		Utility.wait_N_click(submitbtn);
		System.out.println(15);
		try {
			if (errorMsgTran.isDisplayed()) {

				et.log(LogStatus.PASS, " Message Shown and supplier with transaction is not deleted ",
						et.addScreenCapture(pass("Message Shown and supplier with transaction is not deleted")));
			} else {

				et.log(LogStatus.PASS, "Message is not Shown ", et.addScreenCapture(pass("Message is not Shown")));
			}
		} catch (Exception e) {
		}

	}

	//////////////////////////// All transactions Verification
	//////////////////////////// //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify Transaction tables,full screen and pdf downloads.
	 */

	public void TransactionAllSupp() throws Exception {
		Utility.wait_N_click(purchaseButton);
		Utility.click(supplierButton);
		Utility.enterText(searchbox, suppDetails);
		//Utility.click(transactionCompany);
		Utility.click(driver.findElement(By.xpath("//div[text()='Brand Junction']")));

		if (allTransactionTable.isDisplayed()) {

			et.log(LogStatus.PASS, "Table content is displayed",
					et.addScreenCapture(pass("Table content is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Table content is not displayed",
					et.addScreenCapture(fail("Table content is not displayed")));
		}

		//Utility.wait_N_click(transactionAction);
		Utility.click(driver.findElement(By.xpath("//div[@class='cursor-pointer'])[1]")));
		try {
			if (Utility.IsDisplayed(deleteTransaction)) {

				et.log(LogStatus.PASS, "Action button content is displayed",
						et.addScreenCapture(pass("Action button content is displayed")));

			} else {
				et.log(LogStatus.FAIL, "Action button content is not displayed",
						et.addScreenCapture(fail("Action button content is not displayed")));
			}
		} catch (NullPointerException e) {
			et.log(LogStatus.FAIL, "Action button content is not displayed",
					et.addScreenCapture(fail("Action button content is not displayed")));
		}

		catch (NoSuchElementException e) {
			et.log(LogStatus.FAIL, "Action button content is not displayed",
					et.addScreenCapture(fail("Action button content is not displayed")));
		}

		Utility.wait_N_click(trasactionClick);
		Thread.sleep(2000);

		if (bottomButtonsFullScreen.isDisplayed()) {

			et.log(LogStatus.PASS, "full screen is opened", et.addScreenCapture(pass("full screen is opened")));
		} else {
			et.log(LogStatus.FAIL, "full screen is not opened",
					et.addScreenCapture(fail("Table content is not displayed")));
		}

		Utility.wait_N_click(downloadTransaction);
		Thread.sleep(7000);

		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);
		String str = getLatestFile.getName();
		String fileName = str.replaceAll("[$~]", "");

		ArrayList<String> xlfilenames = new ArrayList<>();

		xlfilenames.add("Purchase Invoice.pdf");
		xlfilenames.add("Purchase Invoice (1).pdf");
		xlfilenames.add("Purchase Invoice (2).pdf");
		xlfilenames.add("Purchase Invoice (3).pdf");
		xlfilenames.add("Purchase Invoice (4).pdf");
		xlfilenames.add("Purchase Invoice (5).pdf");
		xlfilenames.add("Purchase Invoice (6).pdf");
		xlfilenames.add("Purchase Invoice (7).pdf"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Purchase Invoice (8).pdf");
		xlfilenames.add("Purchase Invoice (9).pdf");
		xlfilenames.add("Purchase Invoice (10).pdf");

		if (xlfilenames.contains(fileName)) {
			et.log(LogStatus.PASS, "PDF file is downloaded", et.addScreenCapture(pass("PDF file is downloaded")));

		} else {
			et.log(LogStatus.FAIL, "PDF file is not downloaded",
					et.addScreenCapture(fail("PDF file is not downloaded")));

		}
	}

	//////////////////////////// Purchase Order transactions Verification
	//////////////////////////// //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify Transaction tables,full screen and pdf downloads in
	 *            sales order transaction.
	 */

	public void TransactionPurchaseOrderSupp() throws Exception {
		Utility.wait_N_click(purchaseButton);
		Utility.click(supplierButton);
		Utility.enterText(searchbox, suppDetails);
		//Utility.click(transactionCompany);
		Utility.click(driver.findElement(By.xpath("//div[text()='Brand Junction']")));
		Utility.wait_N_click(transactionPurchaseOrder);
		Utility.JS_ScrollDown();
		if (purchaseTransactionTable.isDisplayed()) {

			et.log(LogStatus.PASS, "Table content is displayed",
					et.addScreenCapture(pass("Table content is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Table content is not displayed",
					et.addScreenCapture(fail("Table content is not displayed")));
		}

		Thread.sleep(2000);

		//Utility.wait_N_click(transactionAction1);
		Utility.click(driver.findElement(By.xpath("(//div[@class='cursor-pointer'])[1]")));
		try {
			if (Utility.IsDisplayed(deleteTransaction1)) {

				et.log(LogStatus.PASS, "Action button content is displayed",
						et.addScreenCapture(pass("Action button content is displayed")));

			} else {
				et.log(LogStatus.FAIL, "Action button content is not displayed",
						et.addScreenCapture(fail("Action button content is not displayed")));
			}
		} catch (NullPointerException e) {
			et.log(LogStatus.FAIL, "Action button content is not displayed",
					et.addScreenCapture(fail("Action button content is not displayed")));
		}

		catch (NoSuchElementException e) {
			et.log(LogStatus.FAIL, "Action button content is not displayed",
					et.addScreenCapture(fail("Action button content is not displayed")));
		}

		Utility.wait_N_click(trasactionClickPurchaseOrder);
		Thread.sleep(2000);

		if (bottomButtonsFullScreen.isDisplayed()) {

			et.log(LogStatus.PASS, "full screen is opened", et.addScreenCapture(pass("full screen is opened")));
		} else {
			et.log(LogStatus.FAIL, "full screen is not opened",
					et.addScreenCapture(fail("Table content is not displayed")));
		}

		Utility.wait_N_click(downloadTransaction);
		Thread.sleep(7000);

		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);
		String str = getLatestFile.getName();
		String fileName = str.replaceAll("[$~]", "");

		ArrayList<String> xlfilenames = new ArrayList<>();

		xlfilenames.add("Purchase Order.pdf");
		xlfilenames.add("Purchase Order (1).pdf");
		xlfilenames.add("Purchase Order (2).pdf");
		xlfilenames.add("Purchase Order (3).pdf");
		xlfilenames.add("Purchase Order (4).pdf");
		xlfilenames.add("Purchase Order (5).pdf");
		xlfilenames.add("Purchase Order (6).pdf");
		xlfilenames.add("Purchase Order (7).pdf"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Purchase Order (8).pdf");
		xlfilenames.add("Purchase Order (9).pdf");
		xlfilenames.add("Purchase Order (10).pdf");

		if (xlfilenames.contains(fileName)) {

			et.log(LogStatus.PASS, "PDF file is downloaded", et.addScreenCapture(pass("PDF file is downloaded")));

		} else {
			et.log(LogStatus.FAIL, "PDF file is not downloaded",
					et.addScreenCapture(fail("PDF file is not downloaded")));

		}

	}

	//////////////////////////// Purchase Invoice transactions Verification
	//////////////////////////// //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify Transaction tables,full screen and pdf downloads in
	 *            purchase invoice transaction.
	 */

	public void TransactionPurchaseInvoiceSupp() throws Exception {
		Utility.wait_N_click(purchaseButton);
		Utility.click(supplierButton);
		Utility.enterText(searchbox, suppDetails);
		//Utility.click(transactionCompany);
		Utility.retryingClick(driver.findElement(By.xpath("//div[text()='Brand Junction']")));
		Utility.wait_N_click(transactionPurchaseInvoice);
		Utility.JS_ScrollDown();
		if (purchaseInvoiceTransactionTable.isDisplayed()) {

			et.log(LogStatus.PASS, "Table content is displayed",
					et.addScreenCapture(pass("Table content is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Table content is not displayed",
					et.addScreenCapture(fail("Table content is not displayed")));
		}


		//Utility.wait_N_click(transactionAction2);
		Utility.click(driver.findElement(By.xpath("(//*[contains(text(),'INV-216')])[1]")));
		try {
			if (Utility.IsDisplayed(deleteTransaction1)) {

				et.log(LogStatus.PASS, "Action button content is displayed",
						et.addScreenCapture(pass("Action button content is displayed")));

			} else {
				et.log(LogStatus.FAIL, "Action button content is not displayed",
						et.addScreenCapture(fail("Action button content is not displayed")));
			}
		} catch (NullPointerException e) {
			et.log(LogStatus.FAIL, "Action button content is not displayed",
					et.addScreenCapture(fail("Action button content is not displayed")));
		}

		catch (NoSuchElementException e) {
			et.log(LogStatus.FAIL, "Action button content is not displayed",
					et.addScreenCapture(fail("Action button content is not displayed")));
		}

		Utility.wait_N_click(trasactionClickPurchaseInvoice);

		if (bottomButtonsFullScreen.isDisplayed()) {

			et.log(LogStatus.PASS, "full screen is opened", et.addScreenCapture(pass("full screen is opened")));
		} else {
			et.log(LogStatus.FAIL, "full screen is not opened",
					et.addScreenCapture(fail("Table content is not displayed")));
		}

		Utility.wait_N_click(downloadTransaction);

		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);
		String str = getLatestFile.getName();
		String fileName = str.replaceAll("[$~]", "");

		ArrayList<String> xlfilenames = new ArrayList<>();

		xlfilenames.add("Purchase Invoice.pdf");
		xlfilenames.add("Purchase Invoice (1).pdf");
		xlfilenames.add("Purchase Invoice (2).pdf");
		xlfilenames.add("Purchase Invoice (3).pdf");
		xlfilenames.add("Purchase Invoice (4).pdf");
		xlfilenames.add("Purchase Invoice (5).pdf");
		xlfilenames.add("Purchase Invoice (6).pdf");
		xlfilenames.add("Purchase Invoice (7).pdf"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Purchase Invoice (8).pdf");
		xlfilenames.add("Purchase Invoice (9).pdf");
		xlfilenames.add("Purchase Invoice (10).pdf");

		if (xlfilenames.contains(fileName)) {

			et.log(LogStatus.PASS, "PDF file is downloaded", et.addScreenCapture(pass("PDF file is downloaded")));

		} else {
			et.log(LogStatus.FAIL, "PDF file is not downloaded",
					et.addScreenCapture(fail("PDF file is not downloaded")));

		}

	}

	/////////////////////////// Payment transactions Verification
	/////////////////////////// //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify Transaction tables,full screen and pdf downloads in
	 *            Payment transaction.
	 */

	public void TransactionPaymentSupp() throws Exception {
		Utility.wait_N_click(purchaseButton);
		Utility.click(supplierButton);
		Utility.enterText(searchbox, suppDetails);
		//Utility.click(transactionCompany);
		Utility.click(driver.findElement(By.xpath("//div[text()='Brand Junction']")));
		Utility.wait_N_click(transactionPayment);
		Utility.JS_ScrollDown();
		if (tablePaymentNoData.isDisplayed()) {

			et.log(LogStatus.FAIL, "Table content, action button are not displayed",
					et.addScreenCapture(fail("Table content, action button are not displayed")));
		} else {
			et.log(LogStatus.PASS, "Table content is displayed",
					et.addScreenCapture(pass("Table content is displayed")));
		}

	}
}
