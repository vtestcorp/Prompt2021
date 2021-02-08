package com.sales;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class SalesQuoteAddNewDeleteDetailsPage extends Base {

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

	String Quantity1 = Utility.excelRead(8, 3, "CustomerDetails");
	String HSN1 = Utility.excelRead(8, 4, "CustomerDetails");
	String Rate1 = Utility.excelRead(8, 5, "CustomerDetails");
	String SpclDiscnt1 = Utility.excelRead(8, 6, "CustomerDetails");
	String discnt1 = Utility.excelRead(8, 7, "CustomerDetails");
	String remarks = Utility.excelRead(7, 9, "CustomerDetails");
	String customerremarks = Utility.excelRead(7, 11, "CustomerDetails");
	String footer = Utility.excelRead(7, 12, "CustomerDetails");
	String address = Utility.excelRead(7, 14, "CustomerDetails");

	String StreetName = Utility.excelRead(2, 9, "CustomerDetails");
	String defaultaddress = Utility.excelRead(7, 42, "CustomerDetails");
	String uomexcel = Utility.excelRead(7, 16, "CustomerDetails");
	String taxrateexcel = Utility.excelReadInt(7, 17, "CustomerDetails");
	String taxnameexcel = Utility.excelRead(7, 19, "CustomerDetails");
	String paymentterm = Utility.excelRead(7, 20, "CustomerDetails");
	String paymenttermdays = Utility.excelReadInt(7, 21, "CustomerDetails");
	String paymenttermdescrp = Utility.excelRead(7, 22, "CustomerDetails");
	String addcustname = Utility.excelRead(7, 43, "CustomerDetails");
	String addrelationaddres = Utility.excelRead(7, 44, "CustomerDetails");

	@FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
	public WebElement addButton;

	@FindBy(xpath = "//a[contains(text(),'Sales Quote')]")
	public WebElement salesQuoteLink;

	@FindBy(xpath = "//a[contains(text(),'Sales Order')]")
	public WebElement salesOrderLink;

	@FindBy(xpath = "//*[contains(text(),'Select Customer')]/..")
	public WebElement selectCustomerDropdown;

	@FindBy(xpath = "(//div[@class=\"ant-select-item-option-content\"])[1]")
	public WebElement selectDropdownOption;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[3]")
	public WebElement relationAddress;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[2]")
	public WebElement relationAddressCredit;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[4]")
	public WebElement relationAddressInv;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[5]")
	public WebElement relationAddressOrder;

	@FindBy(xpath = "//*[@id=\"root\"]//span/div[2]//div[4]/div/div/div[1]")
	public WebElement relationDropSelect;

	@FindBy(xpath = "(//div[@class='add-new'])[2]")
	public WebElement relationAddressAddNew;

	@FindBy(xpath = "//input[@id='New_address_component_isDefault']")
	public WebElement defaultCheckBox;

	@FindBy(xpath = "//input[@placeholder='Name to identify this address e.g. Main etc']")
	public WebElement addressName;

	@FindBy(xpath = "//input[@placeholder='Street Address']")
	public WebElement streetAddress;

	@FindBy(xpath = "(//input[@class=\"ant-select-selection-search-input\"])[3]")
	public WebElement countryDrop;

	@FindBy(xpath = "(//*[@class=\"ant-select-selection-search-input\"])[7]")
	public WebElement stateDrop;

	@FindBy(xpath = "(//*[@class=\"ant-select-selection-search-input\"])[8]")
	public WebElement stateDropInv;

	@FindBy(xpath = "(//*[@class=\"ant-select-selection-search-input\"])[9]")
	public WebElement stateDropOrder;

	@FindBy(xpath = "//div//ul[@role=\"listbox\"]//li[@name=\"Maharashtra \"]")
	public WebElement stateSelect;

	@FindBy(xpath = "//*[@placeholder='City']/.")
	public WebElement cityName;

	@FindBy(xpath = "//*[@placeholder=\"Zip/Postal Code\"]/.")
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

	@FindBy(xpath = "//*[text()='Default Address']")
	public WebElement defaultCheckSelect;

	@FindBy(xpath = "(//*[@col-id=\"billingAddress\"])[2]")
	public WebElement bilingAddress;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[4]")
	public WebElement bilingAddressCredit;

	@FindBy(xpath = "(//div[@class='ant-select-selection__rendered'])[3]")
	public WebElement bilingAddressCreditMemo;

	@FindBy(xpath = "(//div[@class='add-new'])")
	public WebElement bilingAddressCreditMemoAddNew;

	@FindBy(xpath = "(//div[@class='add-new'])[2]")
	public WebElement bilingAddressAddNew;

	@FindBy(xpath = "(//div[@col-id=\"shippingAddress\"])[2]")
	public WebElement shippingAddress;

	@FindBy(xpath = "(//div[@class='add-new'])[2]")
	public WebElement shippingAddressAddNew;

	@FindBy(xpath = "//*[@class=\"ant-select-dropdown ant-select-dropdown-placement-bottomLeft \"]")
	public WebElement listBoxBill;

	@FindBy(xpath = "//*[@class=\"ant-select-dropdown ant-tree-select-dropdown ant-select-dropdown-placement-bottomLeft \"]")
	public WebElement listProduct;

	@FindBy(xpath = "(//*[@class=\"ant-select-dropdown ant-select-dropdown-placement-bottomLeft \"]//i[@class=\"fa fa-trash\"])[1]")
	public WebElement taxDeleteIcon;

	@FindBy(xpath = "(//div[@col-id=\"uom_1\"])[2]")
	public WebElement uomDrop;

	@FindBy(xpath = "(//div[@class=\"add-new\"])[2]")
	public WebElement uomDropAddNew;

	@FindBy(xpath = "(//div[@class=\"add-new\"])[2]")
	public WebElement taxDropAddNew;

	@FindBy(xpath = "//input[@type=\"text\"]")
	public WebElement enterUOM;

	@FindBy(xpath = "//input[@placeholder=\"Tax Name\"]")
	public WebElement enterTax;

	@FindBy(xpath = "//input[@placeholder=\"Tax Rate\"]")
	public WebElement enterTaxRate;

	@FindBy(xpath = "(//div[@role=\"combobox\"])[4]")
	public WebElement taxType;

	@FindBy(xpath = "//input[@placeholder=\"Tax Rate\"]")
	public WebElement taxRate;

	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary'])[3]")
	public WebElement submitUOM;

	@FindBy(xpath = "(//button[@class='ant-btn ant-btn-primary'])[2]")
	public WebElement submitUOM1;

	@FindBy(xpath = "(//div//ul[@role='listbox'])[2]")
	public WebElement listBoxUOM;

	@FindBy(xpath = "//div[@id=\"ef7ac340-39cc-47b0-e9e9-e7d7498b65ea\"]")
	public WebElement listBoxUOM1;

	@FindBy(xpath = "(//li[@role='option']//span[@class=\" custom-dropdown-option\" and  text()=\"Counts2\"]//i[@class='fa fa-trash'])")
	public WebElement deleteIconUOM;

	@FindBy(xpath = "((//div//ul//li[@role='option'])//span[@class=' custom-dropdown-option' and text()=\"Counts2\"])")
	public WebElement delEle;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitDeleteUOM;

	@FindBy(xpath = "(//div[@col-id=\"qty\"])[1]")
	public WebElement clickUom;

	@FindBy(xpath = "	(//div[@col-id=\"taxApplied_1\"])[2]")
	public WebElement taxDrop;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement createTax;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement submitTax;

	@FindBy(xpath = "(//div//ul[@role='listbox'])[2]")
	public WebElement taxBoxList;

	@FindBy(xpath = "((//div//ul//li[@role='option'])//span[@class=' custom-dropdown-option' and text()=\"21\"])")
	public WebElement deleTax;

	@FindBy(xpath = "(//li[@role='option']//span[@class=\" custom-dropdown-option\" and  text()=\"21\"]//i[@class='fa fa-trash'])")
	public WebElement deleteIconTax;

	@FindBy(xpath = "(//button[@type='submit'])")
	public WebElement subdeleTax;

	@FindBy(xpath = "(//button[@type='submit'])")
	public WebElement subdelePay;

	@FindBy(xpath = "//li[@name=\"221B Temple Street\"]//i[@class='fa fa-trash']")
	public WebElement deleteIconRelation;

	@FindBy(xpath = "(//div[@class='title'])[1]")
	public WebElement clickother;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitRelationDelete;

	@FindBy(xpath = "//div//ul[@role='listbox']")
	public WebElement listboxcustomer;

	@FindBy(xpath = "(//*[@class=\"fa fa-trash\"])[1]")
	public WebElement deleteIconCustomer;

	@FindBy(xpath = "//li[@name='IBM Tech']")
	public WebElement deleteCustomer;

	@FindBy(xpath = "(//div[@col-id=\"rate_1\"])[1]")
	public WebElement clickRandom;

	@FindBy(xpath = "//li[@name=\\\"221B Mobile Street\\\"]")
	public WebElement deleteBill;

	@FindBy(xpath = "//li[@name=\\\"221B Mobile Street\\\"]//i[@class=\\\"fa fa-trash\\\"]")
	public WebElement deleteIconBill;

	@FindBy(xpath = "(//li[@role='option']//span[@class=\" custom-dropdown-option\" and text()=\"mobile street\"])[1]")
	public WebElement deleteShipp;

	@FindBy(xpath = "(//li[@role='option']//span[@class=\" custom-dropdown-option\" and text()=\"mobile street\"])[1]//i[@class=\"fa fa-trash\"]")
	public WebElement deleteIconShipp;

	@FindBy(xpath = "(//li[@role='option']//span[@class=\" custom-dropdown-option\" and text()=\"LOP\"])[1]")
	public WebElement deletePaymentTerm;

	@FindBy(xpath = "(//li[@role='option']//span[@class=\" custom-dropdown-option\" and text()=\"LOP\"])[1]//i[@class=\"fa fa-trash\"]")
	public WebElement deleteIconPayTerm;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitDeleteShipp;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitDeleteBill;

	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[2]")
	public WebElement productDrop;

	@FindBy(xpath = "//div//ul[@class='ant-cascader-menu']")
	public WebElement productListBox;

	@FindBy(xpath = "(//div//ul[@role='listbox'])[2]")
	public WebElement listBoxShipp;

	@FindBy(xpath = "(//div[@col-id=\"paymentTerms\"])[2]")
	public WebElement paymentDrop;

	@FindBy(xpath = "(//div[@class=\"add-new\"])[2]")
	public WebElement paymentDropAddNew;

	@FindBy(xpath = "(//div//ul[@role=\"listbox\"])[2]")
	public WebElement listBoxPayment;

	@FindBy(xpath = "(//input[@type=\"text\"])[1]")
	public WebElement termName;

	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	public WebElement paymentDays;

	@FindBy(xpath = "(//input[@type=\"text\"])[3]")
	public WebElement paymentDescrptn;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement subPayTerm;

	@FindBy(xpath = "//*[text()='Create']")
	public WebElement create;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[7]")
	public WebElement expenseDrop;

	@FindBy(xpath = "(//ul[@role=\"listbox\"])[2]")
	public WebElement listBoxExpensee;

/////////////////////Sales Invoice ////////////////////////////////////////

	@FindBy(xpath = "//a[contains(text(),'Sales Invoice')]")
	public WebElement salesInvoiceLink;

	@FindBy(xpath = "//div[@comp-id='21']")
	public WebElement customerPOInvoice;

	@FindBy(xpath = "//div[@comp-id='26']")
	public WebElement placeOFSupplyInvoice;

	@FindBy(xpath = "//div[@comp-id='25']")
	public WebElement paymentTerms;

	@FindBy(xpath = "//div//textarea[@class='editable-cell-textarea']")
	public WebElement customerPOInvoice1;

	@FindBy(xpath = "//div[@comp-id='22']")
	public WebElement refNumberInvoice;

	@FindBy(xpath = "//div[@comp-id='22']//div[@class='ag-react-container']//textarea")
	public WebElement refNumberInvoice1;

	@FindBy(xpath = "//div[@comp-id='50']")
	public WebElement productDropdownInvoice;

	@FindBy(xpath = "//ul//li[contains(text(),'waxxe')]")
	public WebElement productSelectInvoice;

	@FindBy(xpath = "//div[@comp-id='52']")
	public WebElement quantityInvoice;

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

	@FindBy(xpath = "//div[@comp-id='70']")
	public WebElement productDropdownInvoice1;

	@FindBy(xpath = "//ul//li[contains(text(),'gghhhh')]")
	public WebElement productSelectInvoice1;

	@FindBy(xpath = "//div[@comp-id='72']")
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

	@FindBy(xpath = "//div[@class='invoice-details-container']//label[1]//span[1]//input[1]")
	public WebElement discountCheckBox;

	@FindBy(xpath = "//label[2]//span[1]//input[1]")
	public WebElement expenseCheckBox;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[1]")
	public WebElement discountEntry;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[3]")
	public WebElement expenseEntry;

	@FindBy(xpath = "(//div[@role='combobox'])[6]")
	public WebElement expenseDropdown;

	@FindBy(xpath = "//li//span[contains(text(),'Lobour Expense')]")
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

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[4]")
	public WebElement uomInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[5]")
	public WebElement rateInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[6]")
	public WebElement HsnInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[9]")
	public WebElement amountInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[2]")
	public WebElement prdctInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[3]")
	public WebElement qntInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[4]")
	public WebElement uomInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[5]")
	public WebElement rateInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[6]")
	public WebElement HsnInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[9]")
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

	@FindBy(xpath = "(//div[@class='modal-table-container'])/table/thead")
	public WebElement header;

	@FindBy(xpath = "(//tbody//tr)[1]")
	public WebElement productList1;

	@FindBy(xpath = "(//tbody//tr)[2]")
	public WebElement productList2;

	@FindBy(xpath = "//div[@class='add-new']")
	public WebElement addNew;

	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	public WebElement companyName;

	@FindBy(xpath = "//*[text()='Select Payment Term']/..")
	public WebElement paymentTerm;

	@FindBy(xpath = "//li[@name='Cash on Delivery']")
	public WebElement paymentTermSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//unewnamel[@id='select2-results-70']")
	public WebElement paymentTermSearchClick;

	@FindBy(xpath = "//*[text()='Select Customer Type']/..")
	public WebElement customerType;

	@FindBy(xpath = "//input[@id='s2id_autogen72_search']")
	public WebElement customerTypeSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-72']")
	public WebElement customerTypeSearchClick;

	@FindBy(xpath = "//input[@placeholder='Enter Website Url']")
	public WebElement companyWebsite;

	@FindBy(xpath = "//*[text()='Select Customer Source']/..")
	public WebElement customerSource;

	@FindBy(xpath = "//input[@id='s2id_autogen74_search']")
	public WebElement customerSourceSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-74']")
	public WebElement customerSourceSearchClick;

	@FindBy(xpath = "//*[text()='Select Company Rating']/..")
	public WebElement rateYourCompany;

	@FindBy(xpath = "//input[@id='s2id_autogen76_search']")
	public WebElement rateYourCompanySearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-76']")
	public WebElement rateYourCompanySearchClick;

	@FindBy(xpath = "//*[text()='Select Industry']/..")
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

	@FindBy(xpath = "(//*[@placeholder=\"State/Province/Region\"])[1]")
	public WebElement state;

	@FindBy(xpath = "(//a[@class='select2-choice'])[4]")
	public WebElement stateName;

	@FindBy(xpath = "(//input[@class='select2-input'][@role='combobox'])[11]")
	public WebElement stateNameSearch;

	@FindBy(xpath = "//div[@class='select2-result-label']")
	public WebElement stateNameSearchClick;

	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
	public WebElement zipcode;

	@FindBy(xpath = "(//*[text()='Select Country'])/..")
	public WebElement country;

	@FindBy(xpath = "//span[text()='Shipping address same as billing']/parent::label")
	public WebElement sameAsBillingAddress;

	@FindBy(xpath = "//div[@class=\"billing-address-information\"]")
	public WebElement scrollDown;

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

	@FindBy(xpath = "//a[contains(text(),'Credit Memo')]")
	public WebElement creditMemoLink;

	@FindBy(xpath = "(//input[@class=\"ant-select-selection-search-input\"])[2]")
	public WebElement inputCustDrop;

	@FindBy(xpath = "(//input[@class=\"ant-select-selection-search-input\"])[3]")
	public WebElement inputCustDropInv;

	@FindBy(xpath = "(//input[@class=\"ant-select-selection-search-input\"])[3]")
	public WebElement inputRelationAdddressDrop;

	@FindBy(xpath = "(//input[@class=\"ant-select-selection-search-input\"])[2]")
	public WebElement inputRelationAdddressCredit;

	@FindBy(xpath = "(//input[@class=\"ant-select-selection-search-input\"])[4]")
	public WebElement inputRelationAdddressDropInv;

	@FindBy(xpath = "(//input[@class=\"ant-select-selection-search-input\"])[5]")
	public WebElement inputRelationAdddressDropOrder;

	@FindBy(xpath = "//div[@col-id=\"billingAddress\"]//input[@class=\"ant-select-selection-search-input\"]")
	public WebElement textAreaBilling;

	@FindBy(xpath = "(//input[@class=\"ant-select-selection-search-input\"])[4]")
	public WebElement textAreaBillingCredit;

	@FindBy(xpath = "//div[@col-id=\"shippingAddress\"]//input[@class=\"ant-select-selection-search-input\"]")
	public WebElement textAreaShipping;

	@FindBy(xpath = "//div[@col-id=\"uom_1\"]//input[@class=\"ant-select-selection-search-input\"]")
	public WebElement textAreaUom;

	@FindBy(xpath = "//div[@col-id=\"taxApplied_1\"]//input[@class=\"ant-select-selection-search-input\"]")
	public WebElement textAreaTax;

	@FindBy(xpath = "//div[@col-id=\"paymentTerms\"]//input[@class=\"ant-select-selection-search-input\"]")
	public WebElement textAreaPayment;

	@FindBy(xpath = "(//*[text()='No record(s) found']/.)[1]")
	public WebElement noRecordsFound;

	@FindBy(xpath = "//*[@id=\"root\"]//div[2]/div/div/div[2]//div[1]//span//div[2]//div[4]/div/div")
	public WebElement RelationList;

	public SalesQuoteAddNewDeleteDetailsPage() {
		PageFactory.initElements(driver, this);
	}

////////////////////////////////Sales Quote ADD NEW and DELETE /////////////////////////////////////////////////////////	

////////////////////////// Customer Add New and Delete ////////////////////////// //////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created and deleted customer via customer dropdown
	 *            in sales quote.
	 */

	public void salesQuoteAddNewCustomer() throws Exception {

//// Add new

		Thread.sleep(4000);
		Utility.click(addButton);
		Utility.wait_N_click(salesQuoteLink);
		Thread.sleep(3000);
		Utility.click(selectCustomerDropdown);

		Utility.wait_N_click(addNew);

		Utility.implicitwait();
		try {
			companyName.isDisplayed();

			et.log(LogStatus.PASS, "Pop-Up Opened successfuly", et.addScreenCapture(pass("Pop-Up Opened successfuly")));

		} catch (NoSuchElementException ew) {

			et.log(LogStatus.FAIL, "Pop-Up Opening failed", et.addScreenCapture(fail("Pop-Up Opening failed")));
		}

		Utility.enterText(companyName, addcustname);
		Utility.wait_N_click(paymentTerm);
		Utility.implicitwait();
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 3, "CustomerDetails") + "']")).click();
		Utility.JS_Scrolldown(scrollDown);
		Utility.enterText(streetName, Utility.excelRead(2, 9, "CustomerDetails"));
		Utility.enterText(city, Utility.excelRead(2, 10, "CustomerDetails"));
		Utility.implicitwait();
		Utility.enterText(state, Utility.excelRead(2, 11, "CustomerDetails"));
		Utility.click(sameAsBillingAddress);
		Utility.implicitwait();
		Utility.click(save);
		Utility.implicitwait();
		Utility.click(save1);
		Utility.implicitwait();

		Utility.click(selectCustomerDropdown);
		Utility.implicitwait();
		inputCustDrop.sendKeys(addcustname);
		Utility.implicitwait();
		String listbox2 = listBoxBill.getText();
		System.out.println();

		if (listbox2.contains(addcustname)) {

			et.log(LogStatus.PASS, "Customer created successfuly",
					et.addScreenCapture(pass(" Customer created successfuly")));

		} else {

			et.log(LogStatus.FAIL, "Customer creation failed", et.addScreenCapture(fail("Customer creation failed")));

		}

///// Delete

		Thread.sleep(1000);
		Utility.click(clickRandom);
		Utility.click(selectCustomerDropdown);
		Utility.implicitwait();
		inputCustDrop.sendKeys(addcustname);
		Utility.implicitwait();
		Utility.mouseHover(driver.findElement(By.xpath("(//div[@name='" + addcustname + "'])[1]")));

		Utility.click(driver.findElement(By.xpath("(//div[@name='" + addcustname + "'])[1]//i")));
		Thread.sleep(2000);
		Utility.click(clickRandom);
		Thread.sleep(4000);
		Utility.click(selectCustomerDropdown);
		inputCustDrop.sendKeys(addcustname);
		Utility.implicitwait();

		String listbox3 = listBoxBill.getText();

		if (listbox3.contains("No record(s) found")) {

			System.out.println("Customer is  deleted successfuly");
			et.log(LogStatus.PASS, "Customer is  deleted successfuly",
					et.addScreenCapture(pass("Customer is deleted successfuly")));

		} else {

			System.out.println("Customeris not  deleted successfuly");
			et.log(LogStatus.FAIL, "Customer is not deleted successfuly",
					et.addScreenCapture(fail("Customer is not  deleted successfuly")));
		}
	}

////////////////////////// Relationship address Add New and Delete
////////////////////////// //////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify creation and deletion of address using Add New and
	 *            delete feature on dropdown.
	 */

	public void salesQuoteAddNewDelRelation() throws Exception {

///// without setting default//////
		Thread.sleep(4000);
		Utility.wait_N_click(addButton);
		Thread.sleep(1000);
		Utility.click(salesQuoteLink);
		Utility.implicitwait();
		Utility.click(selectCustomerDropdown);
		Utility.implicitwait();
		Utility.click(selectDropdownOption);

		Utility.wait_N_click(relationAddress);

		Utility.wait_N_click(relationAddressAddNew);
		Utility.implicitwait();

		try {
			streetAddress.isDisplayed();

			et.log(LogStatus.PASS, "Pop-Up Opened successfuly", et.addScreenCapture(pass("Pop-Up Opened successfuly")));

		} catch (NoSuchElementException ew) {

			et.log(LogStatus.FAIL, "Pop-Up Opening failed", et.addScreenCapture(fail("Pop-Up Opening failed")));
		}

		Utility.enterText(streetAddress, StreetName);
		Utility.implicitwait();
		Utility.enterText(cityName, Utility.excelRead(2, 10, "CustomerDetails"));
		Utility.click(stateDrop);
		driver.findElement(By.xpath("//div[@name='Goa']")).click();
		Utility.enterText(zipCode, Utility.excelReadInt(2, 12, "CustomerDetails"));
		Utility.wait_N_click(createButton);
		Thread.sleep(1000);
		Utility.wait_N_click(saveButAddNew);
		Thread.sleep(3000);

		Utility.wait_N_click(relationAddress);
		inputRelationAdddressDrop.sendKeys(StreetName);
		Thread.sleep(2000);

		Utility.implicitwait();
		String listbox2 = listBoxBill.getText();
		System.out.println();

		if (listbox2.contains(StreetName)) {

			System.out.println("relationship Billing address created successfuly");
			et.log(LogStatus.PASS, "rela tionshipBilling address created successfuly",
					et.addScreenCapture(pass("relationship Billing address created successfuly")));

		} else {

			System.out.println("relationship Billing address creation failed");
			et.log(LogStatus.FAIL, "relationship Billing address creation failed",
					et.addScreenCapture(fail("relationship Billing address creation failed")));
		}

///// with setting default//////

		Utility.implicitwait();
		Utility.click(clickRandom);

		Utility.wait_N_click(relationAddress);
		Utility.wait_N_click(relationAddressAddNew);
		Utility.implicitwait();
		Utility.wait_N_click(defaultCheckSelect);
		Utility.enterText(streetAddress, defaultaddress);
		Utility.implicitwait();
		Utility.enterText(cityName, Utility.excelRead(2, 10, "CustomerDetails"));
		Utility.enterText(zipCode, Utility.excelReadInt(2, 12, "CustomerDetails"));
		Utility.wait_N_click(createButton);
		Thread.sleep(1000);
		Utility.wait_N_click(saveButAddNew);

		Thread.sleep(2000);

		Utility.implicitwait();
		System.out.println(relationAddress.getText());
		String defaultName = relationAddress.getText();

		if (defaultName.equalsIgnoreCase(defaultaddress)) {

			System.out.println("Default relationship  Billing address created successfully");
			et.log(LogStatus.PASS, "Default relationship Billing address created successfully",
					et.addScreenCapture(pass("Default relationship Billing address created successfully")));

		} else {

			System.out.println("Default relationship  address creation failed");
			et.log(LogStatus.FAIL, "Default relationship Billing address creation failed",
					et.addScreenCapture(fail(" Default relationship Billing address creation failed")));
		}

/////// DELETE /////////////

		Utility.implicitwait();
		Utility.click(clickRandom);
		Utility.wait_N_click(relationAddress);
		inputRelationAdddressDrop.sendKeys(StreetName);
		Utility.implicitwait();
		Utility.mouseHover(driver.findElement(By.xpath("(//div[@name='" + StreetName + "'])[1]")));
		Utility.wait_N_click(driver.findElement(By.xpath("(//div[@name='" + StreetName + "'])[1]//i")));
		Utility.implicitwait();
		Utility.wait_N_click(submitDeleteBill);
		Thread.sleep(2000);
		Utility.click(relationAddress);
		Utility.implicitwait();
		inputRelationAdddressDrop.sendKeys(StreetName);
		Utility.implicitwait();

		String listbox3 = listBoxBill.getText();

		if (listbox3.contains("No record(s) found")) {

			System.out.println("Relation Address is  deleted successfuly");
			et.log(LogStatus.PASS, "Relation Address is  deleted successfuly",
					et.addScreenCapture(pass("Relation Address is deleted successfuly")));

		} else {

			System.out.println("Relation Address is not  deleted successfuly");
			et.log(LogStatus.FAIL, "Relation Address is not deleted successfuly",
					et.addScreenCapture(fail("Relation Address is not  deleted successfuly")));
		}
	}

////////////////////////// Billing Address Add New and Delete
////////////////////////// ////////////////////////// //////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify creation and deletion of address using Add New and
	 *            delete feature on dropdown.
	 */

	public void salesQuoteAddNewDelBilling() throws Exception {

/// without setting default//////
		Thread.sleep(4000);
		Utility.wait_N_click(addButton);
		Thread.sleep(1000);
		Utility.click(salesQuoteLink);
		Utility.implicitwait();
		Utility.click(selectCustomerDropdown);
		Utility.click(selectDropdownOption);

		Utility.implicitwait();
		Utility.wait_N_click(bilingAddress);
		Utility.wait_N_click(bilingAddress);
		Utility.wait_N_click(bilingAddressAddNew);

		Utility.implicitwait();

		try {
			streetAddress.isDisplayed();

			et.log(LogStatus.PASS, "Pop-Up Opened successfuly", et.addScreenCapture(pass("Pop-Up Opened successfuly")));

		} catch (NoSuchElementException ew) {

			et.log(LogStatus.FAIL, "Pop-Up Opening failed", et.addScreenCapture(fail("Pop-Up Opening failed")));
		}

		Utility.enterText(streetAddress, StreetName);
		Utility.implicitwait();
		Utility.enterText(cityName, Utility.excelRead(2, 10, "CustomerDetails"));
		Utility.click(stateDrop);
		driver.findElement(By.xpath("//div[@name='Goa']")).click();
		Utility.enterText(zipCode, Utility.excelReadInt(2, 12, "CustomerDetails"));
		Utility.wait_N_click(createButton);
		Thread.sleep(1000);
		Utility.wait_N_click(saveButAddNew);
		Thread.sleep(3000);

		Utility.click(bilingAddress);
		Utility.click(bilingAddress);
		Utility.implicitwait();
		textAreaBilling.sendKeys(StreetName);
		Utility.implicitwait();

		String listbox2 = listBoxBill.getText();
		System.out.println();

		if (listbox2.contains(StreetName)) {

			System.out.println("Billing address created successfuly");
			et.log(LogStatus.PASS, "Billing address created successfuly",
					et.addScreenCapture(pass("Billing address created successfuly")));

		} else {

			System.out.println("Billing address creation failed");
			et.log(LogStatus.FAIL, "Billing address creation failed",
					et.addScreenCapture(fail("Billing address creation failed")));
		}

///// with setting default//////
		Thread.sleep(2000);
		Utility.wait_N_click(clickRandom);

		Utility.wait_N_click(bilingAddress);
		Utility.wait_N_click(bilingAddress);
		Utility.wait_N_click(bilingAddressAddNew);
		Utility.implicitwait();
		Utility.wait_N_click(defaultCheckSelect);
		Utility.enterText(streetAddress, defaultaddress);
		Utility.implicitwait();
		Utility.enterText(cityName, Utility.excelRead(2, 10, "CustomerDetails"));

		Utility.enterText(zipCode, Utility.excelReadInt(2, 12, "CustomerDetails"));
		Utility.wait_N_click(createButton);
		Thread.sleep(1000);
		Utility.wait_N_click(saveButAddNew);

		Thread.sleep(2000);

		System.out.println(bilingAddress.getText());
		String defaultName = bilingAddress.getText();

		if (defaultName.equalsIgnoreCase(defaultaddress)) {

			System.out.println("Default Billing address created successfully");
			et.log(LogStatus.PASS, "Default Billing address created successfully",
					et.addScreenCapture(pass("Default Billing address created successfully")));

		} else {

			System.out.println("Default Billing address creation failed");
			et.log(LogStatus.FAIL, "DefaultBilling address creation failed",
					et.addScreenCapture(fail(" DefaultBilling address creation failed")));
		}

/////// DELETE /////////////

		Utility.implicitwait();

		Utility.wait_N_click(bilingAddress);
		Utility.wait_N_click(bilingAddress);
		Utility.implicitwait();
		textAreaBilling.sendKeys(StreetName);
		Utility.mouseHover(driver.findElement(By.xpath("(//div[@name='" + StreetName + "'])[1]")));

		Utility.wait_N_click(driver.findElement(By.xpath("(//div[@name='" + StreetName + "'])[1]//i")));
		Utility.implicitwait();
		Utility.wait_N_click(submitDeleteBill);
		Thread.sleep(2000);
		Utility.click(bilingAddress);
		Utility.implicitwait();
		textAreaBilling.sendKeys(StreetName);
		Utility.implicitwait();

		String listbox3 = listBoxBill.getText();

		if (listbox3.contains("No record(s) found")) {

			System.out.println("Billing Address is  deleted successfuly");
			et.log(LogStatus.PASS, "Billing Address is  deleted successfuly",
					et.addScreenCapture(pass("Billing Address is deleted successfuly")));

		} else {

			System.out.println("Billing Address is not  deleted successfuly");
			et.log(LogStatus.FAIL, "Billing Address is not deleted successfuly",
					et.addScreenCapture(fail("Billing Address is not  deleted successfuly")));
		}
	}

////////////////////////// UOM Add New and Delete //////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify creation and deletion of UOM using Add New and delete
	 *            feature on dropdown.
	 */

	public void salesQuoteAddNewDelUOM() throws Exception {

/// Add New UOM ////
		Thread.sleep(3000);
		Utility.wait_N_click(addButton);
		Utility.click(salesQuoteLink);
		Utility.implicitwait();
		Utility.wait_N_click(selectCustomerDropdown);
		Utility.implicitwait();
		Utility.wait_N_click(selectDropdownOption);
		Utility.wait_N_click(uomDrop);
		Utility.wait_N_click(uomDrop);
		Utility.implicitwait();
		Utility.wait_N_click(uomDropAddNew);
		Utility.implicitwait();

		try {
			enterUOM.isDisplayed();

			et.log(LogStatus.PASS, "Pop-Up Opened successfuly", et.addScreenCapture(pass("Pop-Up Opened successfuly")));

		} catch (NoSuchElementException ew) {

			et.log(LogStatus.FAIL, "Pop-Up Opening failed", et.addScreenCapture(fail("Pop-Up Opening failed")));

		}

		enterUOM.sendKeys(uomexcel);
		Utility.wait_N_click(submitUOM);
		Utility.wait_N_click(submitUOM1);
		Thread.sleep(3000);
		Utility.click(uomDrop);
		Utility.click(uomDrop);

		textAreaUom.sendKeys(uomexcel);
		Utility.implicitwait();
		String listbox2 = listBoxBill.getText();
		if (listbox2.contains(StreetName)) {

			System.out.println("UOM is created  successfuly");
			et.log(LogStatus.PASS, "UOMs is created  successfuly",
					et.addScreenCapture(pass("UOM is created  successfuly")));

		} else {

			System.out.println("UOM is not created successfuly");
			et.log(LogStatus.FAIL, "UOM is not created  successfuly",
					et.addScreenCapture(fail("UOM is not created  successfuly")));
		}

/////// Delete UOM ///////

		Utility.click(clickRandom);
		Utility.wait_N_click(uomDrop);
		Utility.click(uomDrop);
		textAreaUom.sendKeys(uomexcel);
		Utility.implicitwait();
		Utility.mouseHover(driver.findElement(By.xpath("(//div[@name='" + uomexcel + "'])[1]")));
		Utility.wait_N_click(driver.findElement(By.xpath("(//div[@name='" + uomexcel + "'])[1]//i")));

		Utility.implicitwait();
		Utility.wait_N_click(submitDeleteUOM);
		Thread.sleep(2000);
		try {
			Utility.click(clickRandom);
		} catch (ElementClickInterceptedException e) {
			et.log(LogStatus.FAIL, "Not able to click on UOM Dropdown as confirmation window doesnt disappears",
					et.addScreenCapture(
							pass("Not able to click on UOM Dropdown as confirmation window doesnt disappears")));

		}
		Utility.wait_N_click(uomDrop);
		Utility.click(uomDrop);
		textAreaUom.sendKeys(uomexcel);
		Utility.implicitwait();
		String listbox3 = listBoxBill.getText();

		if (listbox3.contains("No record(s) found")) {

			System.out.println("UOM is  deleted successfuly");
			et.log(LogStatus.PASS, "UOM is  deleted successfuly",
					et.addScreenCapture(pass("UOM is deleted successfuly")));

		} else {

			System.out.println("UOM is not  deleted successfuly");
			et.log(LogStatus.FAIL, "UOM is not deleted successfuly",
					et.addScreenCapture(fail("UOM is not  deleted successfuly")));
		}
	}

////////////////////////// Tax Add New and Delete /////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify creation and deletion of UOM using Add New and delete
	 *            feature on dropdown.
	 */

	public void salesQuoteAddNewDelTax() throws Exception {

/// Add New Tax ////
		Thread.sleep(3000);
		Utility.wait_N_click(addButton);
		Utility.click(salesQuoteLink);
		Utility.implicitwait();
		Utility.wait_N_click(selectCustomerDropdown);
		Utility.implicitwait();
		Utility.wait_N_click(selectDropdownOption);

		Utility.click(clickRandom);
		Utility.ScrollDownKey();
		Utility.ScrollDownKey();
		Utility.wait_N_click(taxDrop);
		Utility.wait_N_click(taxDrop);
		Utility.implicitwait();
		Utility.wait_N_click(taxDropAddNew);
		Utility.implicitwait();

		try {
			enterTax.isDisplayed();

			et.log(LogStatus.PASS, "Pop-Up Opened successfuly", et.addScreenCapture(pass("Pop-Up Opened successfuly")));

		} catch (NoSuchElementException ew) {

			et.log(LogStatus.FAIL, "Pop-Up Opening failed", et.addScreenCapture(fail("Pop-Up Opening failed")));

		}

		enterTax.sendKeys(taxnameexcel);
		enterTaxRate.sendKeys(taxrateexcel);
		Utility.wait_N_click(createTax);
		Utility.wait_N_click(submitTax);
		Thread.sleep(3000);
		Utility.click(taxDrop);
		Utility.click(taxDrop);

		textAreaTax.sendKeys(taxnameexcel);
		Utility.implicitwait();
		String listbox2 = listBoxBill.getText();
		if (listbox2.contains(taxnameexcel)) {

			System.out.println("Tax is created  successfuly");
			et.log(LogStatus.PASS, "Tax is created  successfuly",
					et.addScreenCapture(pass("Tax is created  successfuly")));

		} else {

			System.out.println("Tax is not created successfuly");
			et.log(LogStatus.FAIL, "Tax is not created  successfuly",
					et.addScreenCapture(fail("Tax is not created  successfuly")));
		}

/////// Delete Tax ///////

		Utility.click(clickRandom);
		Utility.wait_N_click(taxDrop);
		Utility.click(taxDrop);
		textAreaTax.sendKeys(taxnameexcel);
		Utility.implicitwait();
		Utility.click(taxDeleteIcon);
		Utility.implicitwait();
		Utility.wait_N_click(submitDeleteUOM);
		Thread.sleep(3000);
		try {
			Utility.click(clickRandom);
		} catch (ElementClickInterceptedException e) {
			et.log(LogStatus.FAIL, "Not able to click on Tax Dropdown as confirmation window doesnt disappears",
					et.addScreenCapture(
							pass("Not able to click on Tax Dropdown as confirmation window doesnt disappears")));

		}
		Utility.wait_N_click(taxDrop);
		Utility.click(taxDrop);

		textAreaTax.sendKeys(taxnameexcel);
		Utility.implicitwait();
		String listbox3 = listBoxBill.getText();

		if (listbox3.contains("No record(s) found")) {

			System.out.println("Tax is  deleted successfuly");
			et.log(LogStatus.PASS, "Tax is  deleted successfuly",
					et.addScreenCapture(pass("Tax is deleted successfuly")));

		} else {

			System.out.println("Tax is not  deleted successfuly");
			et.log(LogStatus.FAIL, "Tax is not deleted successfuly",
					et.addScreenCapture(fail("Tax is not  deleted successfuly")));
		}
	}
//////////////////////////Product Add New and Delete ///////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify creation and deletion of UOM using Add New and delete
	 *            feature on dropdown.
	 */

	public void salesQuoteAddNewDelProduct() throws Exception {

		Thread.sleep(6000);
		Utility.wait_N_click(addButton);
		Thread.sleep(1000);
		Utility.click(salesQuoteLink);
		Utility.implicitwait();
		Utility.wait_N_click(selectCustomerDropdown);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 2, "CustomerDetails") + "']")).click();
		Thread.sleep(1000);
		Utility.wait_N_click(productDrop);
		String productlist = productListBox.getText();
		String add = "Add New";
		if (productlist.contains(add)) {

			System.out.println("add New present");
			et.log(LogStatus.PASS, "add New present", et.addScreenCapture(pass("add New present")));

		} else {

			System.out.println("add New not present");
			et.log(LogStatus.FAIL, "add New not present", et.addScreenCapture(fail("add New not present")));
		}

	}

}
