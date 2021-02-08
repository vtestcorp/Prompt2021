package com.sales;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class SalesInvoiceDetailsPage extends Base {

	@SuppressWarnings("unused")
	private static final int j = 0;
/////////////////////Sales Quote////////////////////////////////////////

	CustomerDetailsPage customerpage;
	String customerPO = Utility.excelRead(7, 1, "CustomerDetails");
	String rfqNum = Utility.excelRead(7, 1, "CustomerDetails");
	String refNum = Utility.excelReadInt(7, 2, "CustomerDetails");
	String descp = Utility.excelRead(7, 8, "CustomerDetails");
	String expense = Utility.excelReadInt(7, 10, "CustomerDetails");

	String Quantity = Utility.excelRead(7, 3, "CustomerDetails");
	String HSN = Utility.excelRead(7, 4, "CustomerDetails");
	String Rate = Utility.excelRead(7, 5, "CustomerDetails");
	String SpclDiscnt = Utility.excelRead(7, 6, "CustomerDetails");
	String discnt = Utility.excelRead(7, 7, "CustomerDetails");
	String taxselect = Utility.excelRead(7, 41, "CustomerDetails");
	String taxselect1 = Utility.excelRead(8, 41, "CustomerDetails");

	String Quantity1 = Utility.excelRead(8, 3, "CustomerDetails");
	String HSN1 = Utility.excelRead(8, 4, "CustomerDetails");
	String Rate1 = Utility.excelRead(8, 5, "CustomerDetails");
	String SpclDiscnt1 = Utility.excelRead(8, 6, "CustomerDetails");
	String discnt1 = Utility.excelRead(8, 7, "CustomerDetails");
	String remarks = Utility.excelRead(7, 9, "CustomerDetails");
	String customerremarks = Utility.excelRead(7, 11, "CustomerDetails");
	String footer = Utility.excelRead(7, 12, "CustomerDetails");
	String StreetName = Utility.excelRead(7, 13, "CustomerDetails");
// String footer = Utility.excelRead(7, 12, "CustomerDetails");
	String paymentterm = Utility.excelRead(7, 33, "CustomerDetails");
	String description = Utility.excelRead(7, 22, "CustomerDetails");

	String expectedURLCreditMemo = "http://52.2.53.43/admin/credit-memo-list";
	String expectedURLSalesQuote = "http://52.2.53.43/admin/sq-list";
	String expectedURLSalesInvoice = "http://52.2.53.43/admin/sales-invoice-list";
	String expectedURLOrder = "http://52.2.53.43/admin/so-list";

/////////// expected elements text///////////

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
	public WebElement subTotalExpctd;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[2]")
	public WebElement discountExpctd;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[3]")
	public WebElement taxExpctd1;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[4]")
	public WebElement taxExpctd2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[5]")
	public WebElement totalAmountExpctd;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[7]")
	public WebElement totalAmountExpctdIGST;

	@FindBy(xpath = "(//div[@col-id=\"amount_1\"])[3]")
	public WebElement amountExpctd1;

	@FindBy(xpath = "(//div[@col-id=\"amount_1\"])[2]")
	public WebElement amountExpctd2;

	@FindBy(xpath = "(//div[@class=\"billing-address\"])[1]")
	public WebElement billingAddActual;

////////////////// calculation ///////////////////////

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[8]")
	public WebElement totalAmountCalculation;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[4]")
	public WebElement subTotalCalculation;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[5]")
	public WebElement discountCalculation;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[6]")
	public WebElement tax1Calculation;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[7]")
	public WebElement tax2Calculation;

//////////////elements for actual////////////

////// 1st product//////

	@FindBy(xpath = "(//tbody//tr//td)[2]")
	public WebElement customerPOInvActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[1]")
	public WebElement rfqNumActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[2]")
	public WebElement refNumActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[4]")
	public WebElement paymentTermActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[3]")
	public WebElement priorityActual;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[2]")
	public WebElement productActual1;

	@FindBy(xpath = "/html/body//div[3]/table/tbody/tr[1]/td[4]")
	public WebElement descrpActual;

	@FindBy(xpath = "/html/body//div[3]/table/tbody/tr[2]/td[4]")
	public WebElement descrpActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[3]")
	public WebElement quantityActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[4]")
	public WebElement uomActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[7]")
	public WebElement rateActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[8]")
	public WebElement HsnActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[11]")
	public WebElement totalamountActual1;

//////2nd product//////

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[2]")
	public WebElement productActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[3]")
	public WebElement quantityActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[4]")
	public WebElement uomActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[7]")
	public WebElement rateActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[8]")
	public WebElement HsnActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[11]")
	public WebElement totalamountActual2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[1]")
	public WebElement subtotalActual;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[2]")
	public WebElement discountActual;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[3]")
	public WebElement taxActual1;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[4]")
	public WebElement taxActual2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[5]")
	public WebElement grandtotalActual;

	@FindBy(xpath = "//*[@class=\"fa fa-plus\"]/..")
	public WebElement addButton;

	@FindBy(xpath = "//a[contains(text(),'Sales Quote')]")
	public WebElement salesQuoteLink;

	@FindBy(xpath = "//a[contains(text(),'Sales Order')]")
	public WebElement salesOrderLink;

	@FindBy(xpath = "//a[contains(text(),'Sales Invoice')]")
	public WebElement salesInvoiceLink;

	@FindBy(xpath = "//a[contains(text(),'Credit Memo')]")
	public WebElement creditMemoLink;

	@FindBy(xpath = "//*[contains(text(),'Select Customer')]/..")
	public WebElement selectCustomerDropdown;

	@FindBy(xpath = "(//div[@class=\"ant-select-item-option-content\"])[1]")
	public WebElement selectDropdownOption;

	@FindBy(xpath = "(//div[@class=\"ant-select-item-option-content\"])[2]")
	public WebElement selectDropdownOption2;

	@FindBy(xpath = "//*[@id=\"root\"]//div[2]/div[2]//div[1]/div[2]//span/div[2]/div[2]/div/div/div/div[4]/div/..")
	public WebElement dropdownList;

	@FindBy(xpath = "(//div[@col-id=\"customerRfq\"])[2]")
	public WebElement customerRFQ;

	@FindBy(xpath = "//div[@class='ag-react-container']//textarea")
	public WebElement customerRFQ1;

	@FindBy(xpath = "(//div[@col-id=\"ref\"])[2]")
	public WebElement refNumber;

	@FindBy(xpath = "//div//textarea[@class=\"editable-cell-textarea\"]")
	public WebElement refNumber1;

	@FindBy(xpath = "(//div[@col-id=\"priority\"])[2]")
	public WebElement priorityDropdown;

	@FindBy(xpath = "(//*[@class=\"ant-select-tree-switcher ant-select-tree-switcher_close\"])[3]")
	public WebElement productArrow;

	@FindBy(xpath = "//*[text()='blue | 20 Inches | Plastic']")
	public WebElement producVariant;
	
	@FindBy (xpath = "//span[contains(text(),'4.50-10 RIB HD 8PR | TT | F&R')]")
	public WebElement productVariant1;

	@FindBy(xpath = "//div[@name=\"Medium\"]")
	public WebElement prioritySelect;

	@FindBy(xpath = "(//div[@col-id='project'])[2]")
	public WebElement projectDropdown;

	@FindBy(xpath = "//div[@name=\"SM Tech\"]")
	public WebElement projectSelect;
	
	@FindBy (xpath = "//span[normalize-space()='Peaks Integration']")
	public WebElement projectSelect1;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[2]")
	public WebElement billingAddressDrop;

	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[3]")
	public WebElement productDropdown;

	@FindBy(xpath = "//*[text()='waxxe']/..")
	public WebElement productSelect;

	@FindBy(xpath = "(//div[@col-id='qty_1'])[3]")
	public WebElement quantity;

	@FindBy(xpath = "(//div[@col-id='uom_1'])[3]")
	public WebElement Uom;

	@FindBy(xpath = "//*[text()='Dozen']/..")
	public WebElement UomSelect;

	@FindBy(xpath = "(//div[@col-id='hsnCode_1'])[3]")
	public WebElement Hsn;

	@FindBy(xpath = "(//div[@col-id='hsnCode_1'])[2]")
	public WebElement Hsn1;

	@FindBy(xpath = "(//div[@col-id='rate_1'])[3]")
	public WebElement rate;

	@FindBy(xpath = "(//div[@col-id='specialDiscount_1'])[3]")
	public WebElement specialDiscount;

	@FindBy(xpath = "(//div[@col-id='discount_1'])[3]")
	public WebElement discount;

	@FindBy(xpath = "(//div[@col-id='taxApplied_1'])[3]")
	public WebElement tax;

	@FindBy(xpath = "//*[text()=\"6\"]/..")
	public WebElement taxSelect;

	@FindBy(xpath = "//*[text()='Add Line']")
	public WebElement addLine;

	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[2]")
	public WebElement productDropdown1;

	@FindBy(xpath = "//*[text()='gghhhh']/..")
	public WebElement productSelect1;

	@FindBy(xpath = "(//div[@col-id=\"description_1\"])[2]")
	public WebElement description1;

	@FindBy(xpath = "(//div[@col-id=\"qty_1\"])[2]")
	public WebElement quantity1;

	@FindBy(xpath = "(//div[@col-id=\"uom_1\"])[2]")
	public WebElement Uom1;

	@FindBy(xpath = "(//div[@col-id='uomId_1'])[2]")
	public WebElement uomClick;

	@FindBy(xpath = "//*[text()='Dozen']/..")
	public WebElement UomSelect1;

	@FindBy(xpath = "(//*[text()='Dozen']/..)[2]")
	public WebElement UomSelectSalesOrder1;

	@FindBy(xpath = "(//div[@col-id=\"rate_1\"])[2]")
	public WebElement rate1;

	@FindBy(xpath = "(//div[@col-id=\"specialDiscount_1\"])[2]")
	public WebElement specialDiscount1;

	@FindBy(xpath = "(//div[@col-id=\"discount_1\"])[2]")
	public WebElement discount1;

	@FindBy(xpath = "(//div[@col-id=\"taxApplied_1\"])[2]")
	public WebElement tax1;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"2.5\"]")
	public WebElement taxSelect1;

	@FindBy(xpath = "//button[@class=\"ant-btn\"]")
	public WebElement uploadCustRFQ;

	@FindBy(xpath = "//div//button[contains(text(),'Save')]")
	public WebElement saveButton;

	@FindBy(xpath = "//*[text()='Please select Customer, Product, Quantity and Rate']")
	public WebElement errorSaveMessage;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitButton;

	@FindBy(xpath = "//div//textarea[@placeholder='Will not be visible to the customer. For internal purpose only.']")
	public WebElement internalRemarks;

	@FindBy(xpath = "(//textarea[@class='description-textarea'])[2]")
	public WebElement custRemarksQuote;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-17\"])[2]")
	public WebElement custRemarksQuoteActual;

	@FindBy(xpath = "//*[@class=\"close-icon\"]/.")
	public WebElement crossButton;

	@FindBy(xpath = "(//*[@class=\"header-option menu-option-wrapper\"])[1]")
	public WebElement mainMenuOption;

	@FindBy(xpath = "//*[text()='Sales']")
	public WebElement salesButton;

	@FindBy(xpath = "//*[text()='Customers']/..")
	public WebElement CustomersMenuBtn;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters customer name']")
	public WebElement searchbox;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-14 pl10\"])[1]")
	public WebElement soNumberExpected;

	@FindBy(xpath = "(//a[@class=\"company-name\"])[1]")
	public WebElement transactionCompany;

	@FindBy(xpath = "//div[@role=\"tab\"][text()='Sales Order']")
	public WebElement transactionSalesOrder;

	@FindBy(xpath = "(//*[@id=\"root\"]//table/tbody/tr[1]/td[2]/div/a)[2]")
	public WebElement trasactionClickSalesOrder;

	@FindBy(xpath = "(//textarea[@class='description-textarea'])[2]")
	public WebElement custRemarksInvoice;

	@FindBy(xpath = "//*[text()='Sub Total']")
	public WebElement scrollDownElement;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-6'])[2]")
	public WebElement custRemarksInvoiceActual;

	@FindBy(xpath = "(//textarea[@class='description-textarea'])[2]")
	public WebElement custRemarksMemo;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-6'])[2]")
	public WebElement custRemarksMemoActual;

	@FindBy(xpath = "	//textarea[@class='add-footer-textarea']")
	public WebElement footerActual;

	@FindBy(xpath = "(//div[@class='ant-select-selection__rendered'])[3]")
	public WebElement relationAddress;

	@FindBy(xpath = "(//div[@class='add-new'])[2]")
	public WebElement relationAddressAddNew;

	@FindBy(xpath = "//input[@id='New_address_component_isDefault']")
	public WebElement defaultCheckBox;

	@FindBy(xpath = "//input[@placeholder='Name to identify this address e.g. Main etc']")
	public WebElement addressName;

	@FindBy(xpath = "//input[@placeholder='Street Address']")
	public WebElement streetAddress;

	@FindBy(xpath = "(//div[@class='ant-select-selection__rendered'])[4]")
	public WebElement countryDrop;

	@FindBy(xpath = "(//div[@class='ant-select-selection__rendered'])[5]")
	public WebElement stateDrop;

	@FindBy(xpath = "//div//ul[@role=\"listbox\"]//li[@name=\"Maharashtra \"]")
	public WebElement stateSelect;

	@FindBy(xpath = "//input[@placeholder='City']")
	public WebElement cityName;

	@FindBy(xpath = "//input[@id='New_address_component_zipCode']")
	public WebElement zipCode;

	@FindBy(xpath = "(//div//button[@class='ant-btn ant-btn-primary'])[2]")
	public WebElement createButton;

	@FindBy(xpath = "(//div//button[@class='ant-btn ant-btn-primary'])[3]")
	public WebElement saveButAddNew;

	@FindBy(xpath = "(//div//ul[@role='listbox'])[2]")
	public WebElement listBoxRelation;

	@FindBy(xpath = "//*[@id=\"ddb42880-82d2-41df-9887-3c2eb0a96b4b\"]/ul/li[6]/i")
	public WebElement deleteIcon;

	@FindBy(xpath = "(//li[@name=\"221B Market Street\"])[2]")
	public WebElement dropDelete;

	@FindBy(xpath = "(//span[@class='ant-form-item-children'])[4]")
	public WebElement defaultCheckSelect;

/////////////////////Sales Invoice ////////////////////////////////////////

	@FindBy(xpath = "(//div[@col-id=\"customerPO\"])[2]")
	public WebElement customerPOInvoice;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[2]")
	public WebElement expenseInvDropdown;

	@FindBy(xpath = "//div//textarea[@class='editable-cell-textarea']")
	public WebElement customerPOInvoice1;

	@FindBy(xpath = "//div[@comp-id='22']")
	public WebElement refNumberInvoice;

	@FindBy(xpath = "//div[@comp-id='22']//div[@class='ag-react-container']//textarea")
	public WebElement refNumberInvoice1;

	@FindBy(xpath = "(//div[@col-id=\"qty_2\"])[3]")
	public WebElement quantityInvoice;

	@FindBy(xpath = "(//div[@col-id=\"description_1\"])[3]")
	public WebElement descrp;

	@FindBy(xpath = "(//div[@col-id=\"description_1\"])[2]")
	public WebElement descrp1;

	@FindBy(xpath = "//div[@class='ag-large-textarea']//textarea")
	public WebElement DescriptionText;
	
	@FindBy (xpath = "(//div[@col-id='description_1'])[2]")
	public WebElement DescriptionTxt;

	@FindBy(xpath = "//div[@comp-id='53']")
	public WebElement UomInvoice;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelectInvoice;

	@FindBy(xpath = "//div[@comp-id='54']")
	public WebElement HsnInvoice;

	@FindBy(xpath = "//div[@comp-id='65']")
	public WebElement rateInvoice;

	@FindBy(xpath = "//div[@comp-id='66']")
	public WebElement specialDiscountInvoice;

	@FindBy(xpath = "//div[@comp-id='67']")
	public WebElement discountInvoice;

	@FindBy(xpath = "//div[@comp-id='68']")
	public WebElement taxInvoice;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"6\"]")
	public WebElement taxSelectInvoice;

/////////////////////////////////////////////////

	@FindBy(xpath = "//div[@comp-id='70']")
	public WebElement productDropdownInvoice1;

	@FindBy(xpath = "//ul//li[contains(text(),'gghhhh')]")
	public WebElement productSelectInvoice1;

	@FindBy(xpath = "(//div[@col-id=\"qty_2\"])[2]")
	public WebElement quantityInvoice1;

	@FindBy(xpath = "//div[@comp-id='73']")
	public WebElement UomInvoice1;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelectInvoice1;

	@FindBy(xpath = "//div[@comp-id='74']")
	public WebElement HsnInvoice1;

	@FindBy(xpath = "//div[@comp-id='75']")
	public WebElement rateInvoice1;

	@FindBy(xpath = "(//div[@role=\"gridcell\"])[13]")
	public WebElement specialDiscountInvoice1;

	@FindBy(xpath = "(//div[@role=\"gridcell\"])[14]")
	public WebElement discountInvoice1;

	@FindBy(xpath = "//div[@comp-id='78']")
	public WebElement taxInvoice1;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"2.5\"]")
	public WebElement taxSelectInvoice1;

	@FindBy(xpath = "	//button[contains(text(),'Add Line')]")
	public WebElement addLineInvoice;

	@FindBy(xpath = "(//*[@class=\"ant-checkbox-input\"]/..)[2]")
	public WebElement discountCheckBox;

	@FindBy(xpath = "(//*[@class=\"ant-checkbox-input\"]/..)[3]")
	public WebElement expenseCheckBox;

	@FindBy(xpath = "(//*[@class=\"ant-checkbox-input\"]/..)[1]")
	public WebElement discountCheckBoxSalesOrder;

	@FindBy(xpath = "(//*[@class=\"ant-checkbox-input\"]/..)[2]")
	public WebElement expenseCheckBoxSalesOrder;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[1]")
	public WebElement discountEntry;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[3]")
	public WebElement expenseEntry;

	@FindBy(xpath = "(//div[@role='combobox'])[6]")
	public WebElement expenseDropdown;

	@FindBy(xpath = "//*[text()='Lobour Expense']/..")
	public WebElement expenseSelect;

	@FindBy(xpath = "//textarea[@placeholder='Will not be visible to the customer. For internal purpose only.']")
	public WebElement remarksInvoice;

	@FindBy(xpath = "//div[@comp-id='55']")
	public WebElement amountExpctdInvoice1;

	@FindBy(xpath = "//div[@comp-id='79']")
	public WebElement amountExpctdInvoice2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[4]")
	public WebElement subTotaExpctdInvoice;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[5]")
	public WebElement discountExpctdInvoice;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[6]")
	public WebElement taxExpctdInvoice1;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[7]")
	public WebElement taxExpctdInvoice2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[8]")
	public WebElement grandExpctdInvoice;

	@FindBy(xpath = "//div//button[contains(text(),'Save')]")
	public WebElement saveButtoninvoice;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitButtonInvoice;

///////////// elements for actual////////////

//////1st product//////
	@FindBy(xpath = "(//tbody)[1]//tr//td[1]")
	public WebElement placeofSuppInvActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[2]")
	public WebElement custmePOInvActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[3]")
	public WebElement refInvActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[4]")
	public WebElement paymntInvActual;
///////////////////

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[2]")
	public WebElement prdctInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[5]")
	public WebElement quantInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[6]")
	public WebElement uomInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[9]")
	public WebElement rateInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[10]")
	public WebElement HsnInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[13]")
	public WebElement amountInvActual1;

//////2nd product//////

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[2]")
	public WebElement prdctInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[5]")
	public WebElement quantInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[6]")
	public WebElement uomInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[9]")
	public WebElement rateInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[10]")
	public WebElement HsnInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[13]")
	public WebElement amountInvActual2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[1]")
	public WebElement subtotalInvActual;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[2]")
	public WebElement discountInvActual;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[3]")
	public WebElement taxInvActual1;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[4]")
	public WebElement taxInvActual2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-10'])[5]")
	public WebElement grandInvtotalActual;

/////////////////////Credit Memo ////////////////////////////////////////

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	public WebElement saveButtonMemo;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitButtonMemo;

/// product 1//////
	@FindBy(xpath = "//div[@comp-id='23']")
	public WebElement productDropdownMemo;

	@FindBy(xpath = "//ul//li[contains(text(),'waxxe')]")
	public WebElement productSelectMemo;

	@FindBy(xpath = "//div[@comp-id='25']")
	public WebElement quantityMemo;

	@FindBy(xpath = "//div[@comp-id='26']")
	public WebElement UomMemo;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelectMemo;

	@FindBy(xpath = "//div[@comp-id='38']")
	public WebElement HsnMemo;

	@FindBy(xpath = "//div[@comp-id='27']")
	public WebElement rateMemo;

	@FindBy(xpath = "//div[@comp-id='39']")
	public WebElement specialDiscountMemo;

	@FindBy(xpath = "//div[@comp-id='40']")
	public WebElement discountMemo;

	@FindBy(xpath = "//div[@comp-id='41']")
	public WebElement taxMemo;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"6\"]")
	public WebElement taxSelectMemo;

//// product 2///////

	@FindBy(xpath = "//div[@comp-id='43']")
	public WebElement productDropdownMemo1;

	@FindBy(xpath = "//ul//li[contains(text(),'gghhhh')]")
	public WebElement productSelectMemo1;

	@FindBy(xpath = "//div[@comp-id='45']")
	public WebElement quantityMemo1;

	@FindBy(xpath = "//div[@comp-id='46']")
	public WebElement UomMemo1;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement UomSelectMemo1;

	@FindBy(xpath = "//div[@comp-id='48']")
	public WebElement HsnMemo1;

	@FindBy(xpath = "//div[@comp-id='47']")
	public WebElement rateMemo1;

	@FindBy(xpath = "//div[@comp-id='49']")
	public WebElement specialDiscountMemo1;

	@FindBy(xpath = "//div[@comp-id='50']")
	public WebElement discountMemo1;

	@FindBy(xpath = "//div[@comp-id='51']")
	public WebElement taxMemo1;

	@FindBy(xpath = "//li//span[@class=' custom-dropdown-option'and text()=\"2.5\"]")
	public WebElement taxSelectMemo1;

	@FindBy(xpath = "(//textarea[@class='description-textarea'])[1]")
	public WebElement remarksMemo;

	@FindBy(xpath = "//div[@comp-id='28']")
	public WebElement amount1ExpctdMemo;

	@FindBy(xpath = "//div[@comp-id='52']")
	public WebElement amount2ExpctdMemo;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
	public WebElement subTotalExpctdMemo;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
	public WebElement discountExpctdMemo;

//@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
//public WebElement subTotalExpctdMemo;
//
//@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[1]")
//public WebElement subTotalExpctdMemo;

	@FindBy(xpath = "(//div[@class='modal-table-container'])/table/thead")
	public WebElement header;

	@FindBy(xpath = "(//tbody//tr)[1]")
	public WebElement productList1;

	@FindBy(xpath = "(//tbody//tr)[2]")
	public WebElement productList2;

//////////// sales quote create customer /////////////////////////

	@FindBy(xpath = "//div[@class='add-new']")
	public WebElement addNew;

	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	public WebElement companyName;

	@FindBy(xpath = "(//div[@col-id=\"paymentTerms\"])[2]")
	public WebElement paymentTerm;

	@FindBy(xpath = "//li[@name='Cash on Delivery']")
	public WebElement paymentTermSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//unewnamel[@id='select2-results-70']")
	public WebElement paymentTermSearchClick;

	@FindBy(xpath = "//div[text()='Select Customer Type']")
	public WebElement customerType;

	@FindBy(xpath = "//input[@id='s2id_autogen72_search']")
	public WebElement customerTypeSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-72']")
	public WebElement customerTypeSearchClick;

	@FindBy(xpath = "//input[@placeholder='Enter Website Url']")
	public WebElement companyWebsite;

	@FindBy(xpath = "//div[text()='Select Customer Source']")
	public WebElement customerSource;

	@FindBy(xpath = "//input[@id='s2id_autogen74_search']")
	public WebElement customerSourceSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-74']")
	public WebElement customerSourceSearchClick;

	@FindBy(xpath = "//div[text()='Select Company Rating']/parent::div")
	public WebElement rateYourCompany;

	@FindBy(xpath = "//input[@id='s2id_autogen76_search']")
	public WebElement rateYourCompanySearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-76']")
	public WebElement rateYourCompanySearchClick;

	@FindBy(xpath = "//div[text()='Select Industry']")
	public WebElement Industry;

	@FindBy(xpath = "//input[@id='s2id_autogen78_search']")
	public WebElement IndustrySearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-78']")
	public WebElement IndustrySearchClick;

	@FindBy(xpath = "//input[@placeholder='Relationship Since Date']")
	public WebElement relationship;

	@FindBy(xpath = "//a[text()='Today']/parent::span")
	public WebElement relationship_date;

	@FindBy(xpath = "//input[@placeholder='Street Name']")
	public WebElement streetName;

	@FindBy(xpath = "//input[@placeholder='City']")
	public WebElement city;

	@FindBy(xpath = "//div[text()='State']/parent::div")
	public WebElement state;

	@FindBy(xpath = "(//a[@class='select2-choice'])[4]")
	public WebElement stateName;

	@FindBy(xpath = "(//input[@class='select2-input'][@role='combobox'])[11]")
	public WebElement stateNameSearch;

	@FindBy(xpath = "//div[@class='select2-result-label']")
	public WebElement stateNameSearchClick;

	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
	public WebElement zipcode;

	@FindBy(xpath = "(//div[text()='Select Country'])[1]")
	public WebElement country;

	@FindBy(xpath = "//span[text()='Shipping address same as billing']/parent::label")
	public WebElement sameAsBillingAddress;

	@FindBy(xpath = "(//div[text()='Contact'])[2]")
	public WebElement contactsubmenu;

	@FindBy(xpath = "//input[@id='s2id_autogen84']/..//b")
	public WebElement title;

	@FindBy(xpath = "//input[@id='s2id_autogen84_search']")
	public WebElement titleSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-84']")
	public WebElement titleSearchClick;

	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement firstname;

	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	public WebElement phonename;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement customerEmail;

	@FindBy(xpath = "//a[contains(text(),'Tax Information')]")
	public WebElement taxInfoSubmenu;

	@FindBy(xpath = "//input[@id='s2id_autogen86']/..//b")
	public WebElement GSTMech;

	@FindBy(xpath = "//input[@id='s2id_autogen86_search']")
	public WebElement GSTMechSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-86']")
	public WebElement GSTMechSearchClick;

	@FindBy(xpath = "//input[@name='gstNumber']")
	public WebElement GSTIN;

	@FindBy(xpath = "//input[@name='panNumber']")
	public WebElement PAN;

	@FindBy(xpath = "//a[contains(text(),'Logo')]")
	public WebElement LogoSubmenu;

	@FindBy(xpath = "//input[@id='customerLogo']/..//span[contains(text(),'Select file')]/../..//div")
	public WebElement selectLogo;

	@FindBy(xpath = "//button[contains(text(),'Capture')]")
	public static WebElement Capture;

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement save;

	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	public WebElement save1;

	@FindBy(xpath = "//div[@class='modal-body ng-scope']")
	public WebElement popupText;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public WebElement ConfirmationYES;

	@FindBy(xpath = "//li[starts-with(text(),'Total')]")
	public WebElement totalCustomerCount;

	@FindBy(xpath = "//li[text()='Import Customer']")
	public WebElement newCustomerDropdown;

	@FindBy(xpath = "//div[@id='page-container']//ul[@class='dropdown-menu']//a[1]")
	public WebElement importCustomer;

	@FindBy(xpath = "//span[text()='Next']/parent::button")
	public WebElement Nextbtn;

	@FindBy(xpath = "//span[text()='Done']/parent::button")
	public WebElement Nextbtn2;

	@FindBy(xpath = "(//input[@value='Next'])[3]")
	public WebElement Nextbtn3;

	@FindBy(xpath = "//button[contains(@class,'btn btn-green center-block')]//i")
	public WebElement downloadTemplate;

	@FindBy(xpath = "//div[@class='ant-upload ant-upload-drag']")
	public WebElement chooseFile;

	@FindBy(xpath = "//div[@class=' ant-tabs-tab']")
	public WebElement contact1;

	@FindBy(xpath = "//div[text()='Select Title']")
	public WebElement selectTitle1;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement FirstName1;

	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	public WebElement MiddleName1;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement LastName1;

	@FindBy(xpath = "//input[@placeholder='Call Name']")
	public WebElement CallName1;

	@FindBy(xpath = "//input[@placeholder='Phone']")
	public WebElement Phone1;

	@FindBy(xpath = "//input[@placeholder='Mobile']")
	public WebElement Mobile1;

	@FindBy(xpath = "//input[@placeholder='Fax Number']")
	public WebElement FaxNumber1;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement Email1;

	@FindBy(xpath = "//div[@role=\"tab\" and text()=\"Tax Information\"]")
	public WebElement tax11;

	@FindBy(xpath = "//div[contains(text(),'Select GST Mechanism')]")
	public WebElement GstMech1;

	@FindBy(xpath = "//input[@placeholder='Enter GSTIN']")
	public WebElement GstNum1;

	@FindBy(xpath = "//input[@placeholder='Enter PAN']")
	public WebElement PanNum1;

	@FindBy(xpath = "//span[@class='ant-form-item-children']//span[@class='ant-checkbox']")
	public WebElement checkBox;

	@FindBy(xpath = "//div[@role='tab' and text()=\"Logo\"]	")
	public WebElement logo1;

	@FindBy(xpath = "(//span[@role='button'])[2]")
	public WebElement uploadButton1;

	@FindBy(xpath = "//li[@name='IBM Tech']")
	public WebElement addNewSelect;

	@FindBy(xpath = "//a[@title='Remove file']")
	public WebElement removeFile;

	@FindBy(xpath = "//span[@title='customerRFQ.pdf']")
	public WebElement filename;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[5]")
	public WebElement discountAfterAdded;

/////////////sales order /////////////////////////////

	@FindBy(xpath = "(//div[@col-id=\"referenceNumber\"])[2]")
	public WebElement refSalesOrder;

	@FindBy(xpath = "(//tbody)[1]//tr//td[3]")
	public WebElement custmePOOrderActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[4]")
	public WebElement refOrderActual;

	@FindBy(xpath = "(//tbody)[1]//tr//td[7]")
	public WebElement paymntOrderActual;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[2]")
	public WebElement prdctOrdActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[4]")
	public WebElement quantOrdActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[5]")
	public WebElement uomOrdActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[8]")
	public WebElement rateOrdActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[11]")
	public WebElement amountOrdActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[2]")
	public WebElement prdctOrdActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[4]")
	public WebElement quantOrdActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[5]")
	public WebElement uomOrdActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[8]")
	public WebElement rateOrdActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[11]")
	public WebElement amountOrdActual2;

	public SalesInvoiceDetailsPage() {
		PageFactory.initElements(driver, this);
	}

///////////////////// Sales Invoice Create /////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created sales Invoice parameters.
	 */

	public void salesInvoiceCreate() throws Exception {

		Utility.click(addButton);
		System.out.println(1);
		Thread.sleep(1000);
		Utility.click(salesInvoiceLink);
		System.out.println(2);
		Thread.sleep(3000);
		Utility.click(selectCustomerDropdown);
		System.out.println(3);
		Utility.JSClick(selectDropdownOption);
		System.out.println(4);
		Utility.wait_N_click(customerPOInvoice);
		System.out.println(5);
		Utility.enterText(customerPOInvoice1, Utility.excelRead(7, 1, "CustomerDetails"));
		System.out.println(6);
		Utility.wait_N_click(refNumber);
		System.out.println(7);
		Utility.enterText(refNumber1, Utility.excelReadInt(7, 2, "CustomerDetails"));
		System.out.println(8);
		Utility.wait_N_click(paymentTerm);
		System.out.println(9);
		Utility.click(paymentTerm);
		System.out.println(10);
		//driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(7, 33, "CustomerDetails") + "']")).click();
		Utility.click(driver.findElement(By.xpath("//span[normalize-space()='Cash on Delivery']")));
		System.out.println(11);
		Utility.click(projectDropdown);
		System.out.println(12);
		Utility.click(projectDropdown);
		Utility.click(projectSelect1);
		System.out.println(13);

		Utility.wait_N_click(addLine);
		System.out.println(14);
		Utility.wait_N_click(productDropdown);
		System.out.println(15);
		Utility.click(productDropdown);
		System.out.println(16);
		Utility.mouseHover(productArrow);
		System.out.println(17);
		Utility.click(productArrow);
		System.out.println(18);
		Utility.mouseHover(productVariant1);
		System.out.println(19);
		Utility.click(productVariant1);
		System.out.println(20);
		//Utility.click(descrp);
		System.out.println(21);
		//Utility.click(DescriptionTxt);
		//Utility.enterText(DescriptionText, Utility.excelRead(7, 22, "CustomerDetails"));
		//Utility.wait_N_click(DescriptionTxt);
		//Utility.enterTextJS(DescriptionTxt, "Already Done");
		Utility.click(uomClick);

		quantityInvoice.sendKeys(Quantity);
		Thread.sleep(1000);
		Utility.wait_N_click(Uom);
		Utility.click(Uom);
		Utility.implicitwait();
		Utility.click(UomSelect);
		Utility.implicitwait();
		Hsn.sendKeys(HSN);
		Utility.implicitwait();
		rate.sendKeys(Rate);
		Utility.implicitwait();
		specialDiscount.sendKeys(SpclDiscnt);
		Utility.wait_N_click(tax);
		Utility.click(tax);
		Utility.implicitwait();
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(7, 41, "CustomerDetails") + "']")).click();
		Utility.wait_N_click(discount);
		discount.sendKeys(discnt);
		Utility.implicitwait();

		Utility.wait_N_click(productDropdown1);
		Utility.click(productDropdown1);
		Utility.implicitwait();
		Utility.mouseHover(productArrow);
		Utility.click(productArrow);
		Utility.mouseHover(producVariant);
		Utility.click(producVariant);
		Utility.implicitwait();

		Utility.click(descrp1);
		Utility.mouseHover(DescriptionText);
		Utility.enterText(DescriptionText, Utility.excelRead(7, 22, "CustomerDetails"));
		Utility.implicitwait();
		Utility.click(uomClick);

		quantityInvoice1.sendKeys(Quantity1);
		Utility.implicitwait();
		Utility.wait_N_click(Uom1);
		Utility.click(Uom1);
		Utility.implicitwait();
		Utility.click(UomSelect1);
		Utility.implicitwait();
		Hsn1.sendKeys(HSN);
		Utility.implicitwait();
		rate1.sendKeys(Rate1);
		specialDiscount1.sendKeys(SpclDiscnt1);
		Utility.wait_N_click(tax1);
		Utility.click(tax1);
		Utility.implicitwait();
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(8, 41, "CustomerDetails") + "']")).click();
		Utility.wait_N_click(discount1);
		discount1.sendKeys(discnt1);
		Utility.implicitwait();

		Utility.JS_Scrolldown(saveButton);
		internalRemarks.sendKeys(remarks);
		custRemarksQuote.sendKeys(customerremarks);
		footerActual.sendKeys(footer);

		Thread.sleep(2000);

		java.util.List<String> expectedResult = new ArrayList<String>();

		expectedResult.add(customerPO);
		expectedResult.add(refNum);//// adding all elements in list array
		expectedResult.add(paymentterm);

//// 1st product///
// expectedResult.add(productDropdown.getText().replaceAll("\\([^)]*\\)", ""));
//// //description is excluded due to error
		expectedResult.add(description);
		expectedResult.add(quantityInvoice.getText().split("\\.")[0]);
		expectedResult.add(Uom.getText());
		expectedResult.add(rate.getText().split("\\.")[0]);
		expectedResult.add(Hsn.getText());
		expectedResult.add(amountExpctd1.getText().replaceAll("[^0-9.]", ""));

///// 2nd product////////
// expectedResult.add(productDropdown1.getText().replaceAll("\\([^)]*\\)", ""));
		expectedResult.add(description);
		expectedResult.add(quantityInvoice1.getText().split("\\.")[0]);
		expectedResult.add(Uom1.getText());
		expectedResult.add(rate1.getText().split("\\.")[0]);
		expectedResult.add(Hsn1.getText());
		expectedResult.add(amountExpctd2.getText().replaceAll("[^0-9.]", ""));
//// common in all/////
		expectedResult.add(subTotalExpctd.getText().replaceAll("[^0-9.]", ""));
		expectedResult.add(discountExpctd.getText().replaceAll("[^0-9.]", ""));
		expectedResult.add(taxExpctd1.getText().replaceAll("[^0-9.]", ""));
		expectedResult.add(taxExpctd2.getText().replaceAll("[^0-9.]", ""));
		expectedResult.add(totalAmountExpctd.getText().replaceAll("[^0-9.]", ""));
		expectedResult.add(custRemarksQuote.getText());

///////////////////////////////////////////////////////////////////////////////////////

		Utility.click(saveButton);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.implicitwait();
		String currentURL = driver.getCurrentUrl();

		if (currentURL.equals("http://52.2.53.43/admin/sales-invoice")) {
/// save button verification
			et.log(LogStatus.FAIL, "Page is not navigated to next page",
					et.addScreenCapture(fail("Page is not navigated to next page")));
		}

		else {

			java.util.List<WebElement> breadCrumbList = driver.findElements(By.xpath("(//tbody)[2]"));
			for (WebElement ww : breadCrumbList) {

				if (ww.isDisplayed()) {

					System.out.println("Displayed: ");

					java.util.List<String> actualResult = new ArrayList<String>();

					actualResult.add(custmePOInvActual.getText());
					actualResult.add(refInvActual.getText());
					actualResult.add(paymntInvActual.getText());

///// 1st product///////
					actualResult.add(productActual1.getText());
					actualResult.add(descrpActual.getText());
					actualResult.add(quantInvActual1.getText());
					actualResult.add(uomInvActual1.getText());
					actualResult.add(rateInvActual1.getText());
					actualResult.add(HsnInvActual1.getText()); //// adding all elements in list array
					actualResult.add(amountInvActual1.getText());

/////// 2nd product////////
					actualResult.add(productActual2.getText().split("\\.")[0]);
					actualResult.add(descrpActual1.getText());
					actualResult.add(quantInvActual2.getText());
					actualResult.add(uomInvActual2.getText());
					actualResult.add(rateInvActual2.getText());
					actualResult.add(HsnInvActual2.getText());
					actualResult.add(amountInvActual2.getText());

////// common in all///////
					actualResult.add(subtotalActual.getText().replaceAll("[^0-9.]", ""));
					actualResult.add(discountActual.getText().replaceAll("[^0-9.]", ""));
					actualResult.add(taxActual1.getText().replaceAll("[^0-9.]", ""));
					actualResult.add(taxActual2.getText().replaceAll("[^0-9.]", ""));
					actualResult.add(grandtotalActual.getText().replaceAll("[^0-9.]", ""));
					actualResult.add(custRemarksQuoteActual.getText().replaceAll("Customer Remarks", ""));

					for (int i = 0; i < expectedResult.size(); i++) {
						if (actualResult.get(i).contains(expectedResult.get(i))) {
							System.out.println("text matching: " + expectedResult.get(i));

						} else {
							System.out.println("text is not matching: " + expectedResult.get(i));
							et.log(LogStatus.FAIL,
									"Same amount/element is not reflecting after saving the details and Element is: "
											+ expectedResult.get(i),
									et.addScreenCapture(
											fail("Same amount/element is not reflecting after saving the details")));
						}
					}

					et.log(LogStatus.PASS, "Same amount/element is reflecting after saving the details",
							et.addScreenCapture(pass("Same amount/element is reflecting after saving the details")));

				} else {
					System.out.println("not Displayed: ");
					et.log(LogStatus.FAIL, "Elements are not displayed",
							et.addScreenCapture(fail("Elements are not displayed")));

				}
			}
		}
	}

////////////////////////Sales Invoice Negative //////////////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify error message after hitting save button.
	 */

	public void SalesInvoiceNegative() throws Exception {

		Utility.click(addButton);
		Utility.implicitwait();
		Utility.click(salesInvoiceLink);
		Utility.implicitwait();
		Utility.JS_Scrolldown(saveButton);
		Utility.wait_N_click(saveButton);
		Utility.implicitwait();
		if (errorSaveMessage.isDisplayed()) {

			et.log(LogStatus.PASS, "Error Message is displayed",
					et.addScreenCapture(pass("Error Message is displayed")));
		} else {

			et.log(LogStatus.FAIL, "Error Message is not displayed",
					et.addScreenCapture(fail("Error Message is not displayed")));
		}
	}

/////////////////////// Sales Invoice Calculation /////////////////////////////////	

	@SuppressWarnings("unused")
	public void salesInvoiceCalculation() throws Exception {

		Utility.click(addButton);
		Thread.sleep(1000);
		Utility.click(salesInvoiceLink);
		Thread.sleep(3000);
		Utility.implicitwait();
		Utility.click(selectCustomerDropdown);
		Utility.implicitwait();
		Utility.click(selectDropdownOption);

		Utility.wait_N_click(customerPOInvoice);
		Utility.enterText(customerPOInvoice1, Utility.excelRead(7, 1, "CustomerDetails"));
		Utility.wait_N_click(refNumber);
		Utility.enterText(refNumber1, Utility.excelReadInt(7, 2, "CustomerDetails"));
		Utility.wait_N_click(addLineInvoice);

		Utility.JS_Scrolldown(scrollDownElement);
		;
		Utility.implicitwait();
		Utility.wait_N_click(discountCheckBox);
		Utility.wait_N_click(expenseCheckBox);
		Utility.implicitwait();
		Utility.JS_ScrollUP(uomClick);

		Utility.wait_N_click(productDropdown);
		Utility.click(productDropdown);
		Utility.implicitwait();
		Utility.click(productSelect);
		quantityInvoice.sendKeys(Quantity);
		Thread.sleep(1000);
		Utility.wait_N_click(Uom);
		Utility.click(Uom);
		Utility.implicitwait();
		Utility.click(UomSelect);
		Utility.implicitwait();
		Hsn.sendKeys(HSN);
		Utility.implicitwait();
		rate.sendKeys(Rate);
		Utility.implicitwait();
		specialDiscount.sendKeys(SpclDiscnt);
		Utility.wait_N_click(tax);
		Utility.click(tax);
		Utility.implicitwait();
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(7, 41, "CustomerDetails") + "']")).click();
		Utility.wait_N_click(discount);
		discount.sendKeys(discnt);
		Utility.implicitwait();

		Utility.wait_N_click(productDropdown1);
		Utility.click(productDropdown1);
		Utility.implicitwait();
		Utility.click(productSelect1);
		quantityInvoice1.sendKeys(Quantity1);
		Thread.sleep(1000);
		Utility.wait_N_click(Uom1);
		Utility.click(Uom1);
		Utility.implicitwait();
		Utility.click(UomSelect1);
		Utility.implicitwait();
		Hsn1.sendKeys(HSN1);
		Utility.implicitwait();
		rate1.sendKeys(Rate1);
		Utility.implicitwait();
		specialDiscount1.sendKeys(SpclDiscnt1);
		Utility.wait_N_click(tax1);
		Utility.click(tax1);
		Utility.implicitwait();
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(8, 41, "CustomerDetails") + "']")).click();
		Utility.wait_N_click(discount1);
		discount1.sendKeys(discnt1);
		Utility.implicitwait();

		Utility.JS_Scrolldown(scrollDownElement);
		;
		Utility.implicitwait();

		discountEntry.sendKeys(SpclDiscnt);
		Utility.wait_N_click(expenseInvDropdown);
		Utility.click(expenseInvDropdown);
		Utility.click(expenseSelect);
		expenseEntry.sendKeys(expense);
		Thread.sleep(1000);
		Utility.click(scrollDownElement);

		String tax11 = taxselect.replaceAll("[^0-9.]", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1");
		String Tax22 = taxselect1.replaceAll("[^0-9.]", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1");

/////////////////////// calculation part for additional discount
/////////////////////// ///////////////////////////////////

		double x = 100;
		double dissum = 0;
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		double sumAfterDiscnt = 0;
		double totalDiscount = 0;
		double DiscountFinal = 0;
		double amountAfterExpense = 0;
		double d1 = Double.parseDouble(SpclDiscnt);
		double d2 = Double.parseDouble(SpclDiscnt1);
		double d3 = Double.parseDouble(Rate);
		double d4 = Double.parseDouble(Rate1);
		double d5 = Double.parseDouble(Quantity); // converting all element data into double
		double d6 = Double.parseDouble(Quantity1);
		double d7 = Double.parseDouble(discnt);
		double d8 = Double.parseDouble(discnt1);
		double d9 = Double.parseDouble(tax11);
		double d10 = Double.parseDouble(Tax22);
		double d11 = Double.parseDouble(expense);

		double[] list1 = { d1, d2 };
		double[] list2 = { d3, d4 };
		double[] list3 = new double[list1.length];
		double[] list4 = new double[list3.length];
		double[] list5 = new double[list4.length];
		double[] q1 = { d5, d6 };
		double[] r = { d7, d8 };
		double[] r1 = new double[r.length];
		double[] r2 = new double[r1.length];
		double[] r3 = new double[r2.length];
		double[] r4 = new double[r3.length];
		double[] r5 = new double[r4.length]; // creating array for multiple element of same type
		double[] r6 = new double[r5.length];
		double[] r7 = new double[r6.length];
		double[] r8 = new double[r7.length];
		double[] r9 = new double[r8.length];
		double[] discount = new double[r.length];
		double[] t = { d9, d10 };

// Looping the list for price after special discount
		for (int i = 0; i < list1.length; i++) {
			list3[i] = x - list1[i];
			list4[i] = (list3[i] * list2[i]) / x;
		}
// Looping the list for price after discount

		for (int j = 0; j < list3.length; j++) {

			list5[j] = (list4[j] * q1[j]); // rate * quantity //1800
			r1[j] = x - r[j];
			r2[j] = (r1[j] * list5[j]) / x; // applying discount //1620
			System.out.println();
			r3[j] = r2[j] * (t[j] / x); // tax amount on 1 and 2 sum
			r4[j] = r2[j] + r3[j]; // addition of tax //1717.20
			System.out.println("calculation after adding tax " + r4[j]);// 1717.20
			sum = sum + r4[j]; //// total amount (sum of 1 and 2 )
			sum1 = sum1 + list5[j]; /// subtotal (sum of 1 and 2)
			System.out.println("Tax IGST: " + r3[j]);
			r5[j] = list5[j] - r2[j];
			sum2 = sum2 + r5[j]; /// sum of the discount on 1 and 2

			sumAfterDiscnt = sum - (sum * (d1 / x));
			discount[j] = list5[j] * (r[j] / x);
			System.out.println("Discount on this product " + discount[j]);
			totalDiscount = totalDiscount + discount[j];
			amountAfterExpense = sumAfterDiscnt + d11;
			dissum = dissum + r2[j]; /// total after applying additional discount

			r6[j] = r2[j] * (d1 / x); /// additional discount on discounted price (10% on 1620)

			r7[j] = r2[j] - r6[j]; /// price after subtracting additional discount (1458)

			r8[j] = r7[j] * (t[j] / x); /// calculating tax for additional discounted price

			System.out.println();

			DiscountFinal = totalDiscount + (dissum * (d1 / x));
		}

/////////////// verification with actual /////////////////////////

		String calDis = Double.toString(DiscountFinal);

		double[] a = new double[r4.length]; ///// looping to round off to 2 digits from decimal point(verification
		///// purpose)
		double[] y = new double[r8.length];

		for (int i = 0; i < r4.length; i++) {
			a[i] = Math.round(r4[i] * 100.0) / 100.0;
			y[i] = Math.round(r8[i] * 100.0) / 100.0;

		}

		String a1 = Arrays.toString(a);
		String b1 = Arrays.toString(y);

		String A1 = amountExpctd1.getText().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1");
		String A2 = amountExpctd2.getText().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1");
		String T1 = tax1Calculation.getText().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1").replaceAll("[^0-9.]", "");
		String T2 = tax2Calculation.getText().replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1").replaceAll("[^0-9.]", "");

		String S = subTotalCalculation.getText().replaceAll("[^0-9.]", "");
		String D = discountCalculation.getText().replaceAll("[^0-9.]", "");
		String T = totalAmountCalculation.getText().replaceAll("[^0-9.]", "");
		String D1 = discountAfterAdded.getText().replaceAll("[^0-9.]", "");

		String[] calAmount = new String[] { a1 };
		String[] actAmount = new String[] { A1, A2 };
// String[] calTax = new String[] { qq, ee };
		String[] actTax = new String[] { T1, T2 };

		String actnew = Arrays.toString(actAmount);
		String actnew1 = Arrays.toString(actTax);
// String expTax = Arrays.toString(calTax);

		String tot = String.format("%.2f", amountAfterExpense);
		String dis = String.format("%.2f", sum2);
		String sub = String.format("%.2f", sum1);
		System.out.println();

		if (actnew1.equals(b1) && actnew.equals(a1) && S.equals(sub) && D.equals(calDis) && T.equals(tot)) {

			System.out.println("Elements are matching");
			et.log(LogStatus.PASS, "calculations are correct and elements are matching with expected ones.");
			et.log(LogStatus.PASS, "Actual Sub Total : " + S + "    " + "Expected Sub Total  : " + sub);
			et.log(LogStatus.PASS, "Actual Discount : " + D + "    " + "Expected Discount : " + calDis);
			et.log(LogStatus.PASS, "Actual Taxes : " + actnew1 + "    " + "Expected Taxes : " + b1);
			et.log(LogStatus.PASS, "Actual amounts : " + actnew + "    " + "Expected Amounts : " + a1);
			et.log(LogStatus.PASS, "Actual Total amount : " + T + "    " + "Expected Total amount : " + tot);

		}

		else {

			System.out.println("Elements are not matching");
			et.log(LogStatus.FAIL, "calculations are correct and elements are not matching with expected ones.");
			et.log(LogStatus.FAIL, "Actual Sub Total : " + S + "    " + "Expected Sub Total  : " + sub);
			et.log(LogStatus.FAIL, "Actual Discount : " + D + "    " + "Expected Discount : " + calDis);
			et.log(LogStatus.FAIL, "Actual Taxes : " + actnew1 + "    " + "Expected Taxes : " + b1);
			et.log(LogStatus.FAIL, "Actual amounts : " + actnew + "    " + "Expected Amounts : " + a1);
			et.log(LogStatus.FAIL, "Actual Total amount : " + T + "    " + "Expected Total amount : " + tot);
		}
	}

}
