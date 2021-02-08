package com.purchase;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class PurchaseInvoiceDetailsPage extends Base {

	String description1 = Utility.excelRead(7, 22, "SupplierDetails");
	String description2 = "Already Done";
	String internalremarks = Utility.excelRead(7, 9, "SupplierDetails");
	String supplierreamrks = Utility.excelRead(7, 11, "SupplierDetails");
	String footer = Utility.excelRead(7, 12, "SupplierDetails");
	String reqstdate = Utility.excelRead(7, 27, "SupplierDetails");
	String expirydate = Utility.excelRead(7, 26, "SupplierDetails");
	String reason = Utility.excelRead(7, 28, "SupplierDetails");

	// Reading Int
	String ref = Utility.excelRead(7, 28, "SupplierDetails");
	String quantity1 = Utility.excelRead(7, 3, "SupplierDetails");
	String HSN1 = Utility.excelRead(7, 4, "SupplierDetails");
	String Rate1 = Utility.excelRead(7, 5, "SupplierDetails");
	String SpclDiscnt1 = Utility.excelRead(7, 6, "SupplierDetails");
	String discnt1 = Utility.excelRead(7, 7, "SupplierDetails");
	String taxNumber1 = Utility.excelRead(7, 31, "SupplierDetails");
	String quantity2 = Utility.excelRead(8, 3, "SupplierDetails");
	String HSN2 = Utility.excelRead(8, 4, "SupplierDetails");
	String Rate2 = Utility.excelRead(8, 5, "SupplierDetails");
	String SpclDiscnt2 = Utility.excelRead(8, 6, "SupplierDetails");
	String discnt2 = Utility.excelRead(8, 7, "SupplierDetails");

	// Reading Int
	String expense = Utility.excelRead(7, 10, "CustomerDetails");
	String addidiscount = Utility.excelRead(7, 32, "SupplierDetails");

	String taxNumber2 = Utility.excelRead(8, 31, "SupplierDetails");
	String department = Utility.excelRead(7, 23, "SupplierDetails");

	String priority = "Medium";
	String taxselect1 = Utility.excelRead(7, 38, "SupplierDetails");
	String taxselect2 = Utility.excelRead(8, 38, "SupplierDetails");
	////////////// RFQ ///////////////

	@FindBy(xpath = "//li//i[@class='fa fa-plus']")
	public WebElement addButton;

	@FindBy(xpath = "//a[contains(text(),'RFQ')]")
	public WebElement rfqLink;

	@FindBy(xpath = "//*[text()='Select Customer']/..")
	public WebElement selectCustomerDropdown;

	@FindBy(xpath = "(//div[@class=\"ant-select-item-option-content\"])[1]")
	public WebElement selectDropdownOption;

	@FindBy(xpath = "(//div[@class='ant-select-selection__rendered'])[2]")
	public WebElement relationAddress;

	@FindBy(xpath = "(//div[@class='ant-select-selection__rendered'])[3]")
	public WebElement supplierDropDown;

	@FindBy(xpath = "(//div[@col-id=\"department\"])[2]")
	public WebElement rfqdepartment;

	@FindBy(xpath = "//div[@name='Finance']")
	public WebElement rfqdepartmentSelect;

	@FindBy(xpath = "(//div[@col-id=\"project\"])[2]")
	public WebElement rfqprojectDrop;

	@FindBy(xpath = "//div[@name='SM Tech']")
	public WebElement rfqprojectSelect;

	@FindBy(xpath = "(//div[@col-id=\"priority\"])[2]")
	public WebElement rfqpriorityDrop;

	@FindBy(xpath = "//li[@role=\"option\"]//span[@class=\" custom-dropdown-option\" and text()='Medium']")
	public WebElement rfqprioritySelect;

	@FindBy(xpath = "//button[contains(text(),'Add Line')]")
	public WebElement addLine;

	@FindBy(xpath = "(//textarea[@class=\"description-textarea\"])[1]")
	public WebElement rfqinternalRemarks;

	@FindBy(xpath = "(//textarea[@class=\"description-textarea\"])[2]")
	public WebElement rfqSupplierRemarks;

	@FindBy(xpath = "//textarea[@class=\"add-footer-textarea\"]")
	public WebElement rfqFooter;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ant-btn ant-btn-primary\"]")
	public WebElement saveRfq;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement submitRfq;

	@FindBy(xpath = "//div[@class='ag-center-cols-container']")
	public WebElement productListExpctd;

	// div[@class=\"ag-center-cols-container\"]

	///////// Products /////////////

	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[3]")
	public WebElement rfqProduct1;

	@FindBy(xpath = "//*[text()='waxxe']/..")
	public WebElement rfqProductSelect1;

	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[2]")
	public WebElement rfqProduct2;

	@FindBy(xpath = "//*[text()='gghhhh']/..")
	public WebElement rfqProductSelect2;

	///////// Description /////////////

	@FindBy(xpath = "(//div[@col-id=\"description\"])[3]")
	public WebElement rfqDescription1;

	@FindBy(xpath = "//div[@class='ag-large-textarea']//textarea")
	public WebElement rfqDescriptionText1;

	@FindBy(xpath = "(//div[@col-id=\"description\"])[2]")
	public WebElement rfqDescription2;

	@FindBy(xpath = "//div[@class='ag-large-textarea']//textarea")
	public WebElement rfqDescriptionText2;

	///////// Quantity /////////////

	@FindBy(xpath = "(//div[@col-id=\"qty\"])[3]")
	public WebElement rfqQuantity1;

	@FindBy(xpath = "(//div[@col-id=\"qty\"])[2]")
	public WebElement rfqQuantity2;

	///////// UOM /////////////

	@FindBy(xpath = "(//div[@col-id=\"uom\"])[3]")
	public WebElement rfqUOM1;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement rfqUomSelect1;

	@FindBy(xpath = "(//div[@col-id=\"uom\"])[2]")
	public WebElement rfqUOM2;

	@FindBy(xpath = "//li//span[contains(text(),'Dozen')]")
	public WebElement rfqUomSelect2;

	@FindBy(xpath = "//div[@comp-id='17']")
	public WebElement customerRFQ;

	@FindBy(xpath = "//div[@class='ag-react-container']//textarea")
	public WebElement customerRFQ1;

	@FindBy(xpath = "//input[@placeholder='Enter PAN']")
	public WebElement PanNum1;

	@FindBy(xpath = "//span[@class='ant-form-item-children']//span[@class='ant-checkbox']")
	public WebElement checkBox;

	@FindBy(xpath = "//div[@role='tab' and text()=\"Logo\"]	")
	public WebElement logo1;

	@FindBy(xpath = "(//span[@role='button'])[2]")
	public WebElement uploadButton1;

	///////////// Purchase Request /////////////////

	@FindBy(xpath = "//a[contains(text(),'Purchase Request')]")
	public WebElement purchaseRequestLink;

	@FindBy(xpath = "//*[text()='Select Department']/..")
	public WebElement purRequestdepartment;

	@FindBy(xpath = "//*[text()='Select Owner']/..")
	public WebElement purRequestOwner;

	@FindBy(xpath = "(//input[@placeholder=\"Select date\"])[1]")
	public WebElement purReqDate;

	@FindBy(xpath = "(//input[@placeholder=\"Select date\"])[2]")
	public WebElement purReqExpiryDate;

	@FindBy(xpath = "//td[@title=\"March 19, 2020\"]")
	public WebElement dateSelect;

	@FindBy(xpath = "//input[@placeholder=\"Enter Reason\"]/.")
	public WebElement enterReason;

	@FindBy(xpath = "//*[text()='Select Priority']/..")
	public WebElement purRequestpriorityDrop;

	@FindBy(xpath = "//div[@name='Medium']")
	public WebElement purRequestprioritySelect;

	@FindBy(xpath = "//button[contains(text(),'Add Line')]")
	public WebElement addLinePurReq;

	@FindBy(xpath = "(//textarea[@class=\"description-textarea\"])[1]")
	public WebElement purReqinternalRemarks;

	@FindBy(xpath = "//textarea[@class=\"add-footer-textarea\"]")
	public WebElement purReqFooter;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ant-btn ant-btn-primary\"]")
	public WebElement savePurReq;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement submitPurReq;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-8\"])[1]")
	public WebElement purReqreqList1expctd;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-8\"])[3]")
	public WebElement purReqreqList2expctd;

	@FindBy(xpath = "//tbody")
	public WebElement purReqproductListActual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-14\"])[1]")
	public WebElement purReqRequesterExpctd;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[1]")
	public WebElement purReqDepartExpctd;

	@FindBy(xpath = "//input[@placeholder=\"enter reason\"]")
	public WebElement purReqReasonExpctd;

	@FindBy(xpath = "(//div[@role=\"combobox\"])[3]")
	public WebElement purReqPriorityExpctd;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-8 info\"])[1]")
	public WebElement purReqRequesterActual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-8 info\"])[2]")
	public WebElement purReqDepartmentActual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-14 info\"])[5]")
	public WebElement purReqPriorityActual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-16 info\"])[1]")
	public WebElement purReqReasonActual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-16 info\"])[2]")
	public WebElement purReqRemarksActual;

	///////// Products /////////////

	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[3]")
	public WebElement purReqProduct1;

	@FindBy(xpath = "//*[text()=\"waxxe\"]/..")
	public WebElement purReqProductSelect1;

	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[2]")
	public WebElement purReqProduct2;

	@FindBy(xpath = "//*[text()=\"gghhhh\"]/..")
	public WebElement purReqProductSelect2;
	//
	// ///////// Description /////////////
	//
	@FindBy(xpath = "(//div[@col-id=\"description_1\"])[3]")
	public WebElement purReqDescription1;

	@FindBy(xpath = "//div[@class='ag-large-textarea']//textarea")
	public WebElement purReqDescriptionText1;

	@FindBy(xpath = "(//div[@col-id=\"description_1\"])[2]")
	public WebElement purReqDescription2;

	@FindBy(xpath = "//div[@class='ag-large-textarea']//textarea")
	public WebElement purReqDescriptionText2;
	//
	// ///////// Quantity /////////////
	//
	@FindBy(xpath = "(//div[@col-id=\"qty_1\"])[3]")
	public WebElement purReqQuantity1;

	@FindBy(xpath = "(//div[@col-id=\"qty_1\"])[2]")
	public WebElement purReqQuantity2;

	///////// UOM /////////////

	@FindBy(xpath = "(//div[@col-id=\"uom_1\"])[3]")
	public WebElement purReqUOM1;

	@FindBy(xpath = "//*[text()='Dozen']/..")
	public WebElement purReqUomSelect1;

	@FindBy(xpath = "(//div[@col-id=\"uom_1\"])[2]")
	public WebElement purReqUOM2;

	@FindBy(xpath = "//*[text()='Dozen']/..")
	public WebElement purReqUomSelect2;

	///////////// Purchase Order and Purchase Invoice/////////////////

	////// expected//////

	@FindBy(xpath = "//a[contains(text(),'Purchase Order')]")
	public WebElement purchaseOrderLink;

	@FindBy(xpath = "//a[contains(text(),'Purchase Invoice')]")
	public WebElement purchaseInvoiceLink;

	@FindBy(xpath = "//*[contains(text(),'Select Supplier')]/..")
	public WebElement suppiler;

	@FindBy(xpath = "(//div[@role=\"combobox\"])[3]")
	public WebElement relationDrop;

	@FindBy(xpath = "(//div[@class='ant-select-selector']/span/input)[5]")
	public WebElement contactDrop;

	@FindBy(xpath = "//div[@name='Sartaj']")
	public WebElement selectContactDrop;

	@FindBy(xpath = "//div[@name='Moharram Chowk']")
	public WebElement selectBillTotDrop;

	@FindBy(xpath = "(//div[@class='ant-select-selector']/span/input)[6]")
	public WebElement billToDrop;

	@FindBy(xpath = "(//div[@role=\"combobox\"])[5]")
	public WebElement projctDrop;

	@FindBy(xpath = "(//div[@role=\"combobox\"])[4]")
	public WebElement projctDrop1;

	@FindBy(xpath = "(//div[@col-id='placeOfSupply'])[2]")
	public WebElement placeofSupply;

	@FindBy(xpath = "//span[normalize-space()='Gujarat']")
	public WebElement placeofSupplySelect;

	@FindBy(xpath = "(//div[@col-id='reference'])[2]")
	public WebElement Ref;

	@FindBy(xpath = "//textarea[@class='editable-cell-textarea']")
	public WebElement refText;

	@FindBy(xpath = "(//div[@col-id=\"ShippingAddress\"])[2]")
	public WebElement ShippDrop;

	@FindBy(xpath = "//div//ul[@role=\"listbox\"]//li[@name=\"221B Mobile Street\"]")
	public WebElement ShippSelect;

	@FindBy(xpath = "(//div[@col-id=\"paymentTerms\"])[2]")
	public WebElement PayemntDrop;

	@FindBy(xpath = "(//div[@class=\"ag-full-width-container\"])[1]")
	public WebElement header1;

	@FindBy(xpath = "//div[@class=\"product-amount-details\"]")
	public WebElement header2;

	@FindBy(xpath = "//div[text()='Enter internal remarks']")
	public WebElement internalRemarks;

	@FindBy(xpath = "//div[text()='Enter supplier remarks']")
	public WebElement supplierRemarks;

	@FindBy(xpath = "//div[text()='Add Footer Here']")
	public WebElement footerText;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-16'])[1]")
	public WebElement supplierName;

	@FindBy(xpath = "(//div[@col-id=\"amount\"])[3]")
	public WebElement amount1;

	@FindBy(xpath = "(//div[@col-id=\"amount\"])[2]")
	public WebElement amount2;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[1]")
	public WebElement subTotalExpectd;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[2]")
	public WebElement discountExpectd;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[3]")
	public WebElement gst1Expectd;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[4]")
	public WebElement gst2Expectd;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[5]")
	public WebElement totalAmountExpectd;

	////// Actual /////////

	@FindBy(xpath = "(//div[@class=\"title\"])[9]")
	public WebElement supplierActual;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div/div[4]")
	public WebElement projectActual;

	@FindBy(xpath = "(//td)[1]")
	public WebElement refActual;

	@FindBy(xpath = "(//td)[2]")
	public WebElement placeofSupplyActual;

	@FindBy(xpath = "(//td)[3]")
	public WebElement shippingActual;

	@FindBy(xpath = "(//td)[4]")
	public WebElement paymentActual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-10\"])[1]")
	public WebElement subTotalActual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-10\"])[2]")
	public WebElement discountActual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-10\"])[3]")
	public WebElement gst1Actual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-10\"])[4]")
	public WebElement gst2Actual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-10\"])[5]")
	public WebElement grandTotalActual;

	@FindBy(xpath = "(//div[@class=\"info\"])[4]")
	public WebElement internalRemarkActual;

	@FindBy(xpath = "(//div[@class=\"info\"])[4]")
	public WebElement internalRemarinvkActual;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-20\"])[1]")
	public WebElement internalRemarkActual1;

	@FindBy(xpath = "(//div[@class=\"info\"])[5]")
	public WebElement suppRemarkActual;

	//// products actual //////

	////// 1st product ////////

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[2]")
	public WebElement prodctActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[3]")
	public WebElement descriptnActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[4]")
	public WebElement quantityActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[5]")
	public WebElement uomActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[7]")
	public WebElement spclDiscountActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[8]")
	public WebElement rateActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[9]")
	public WebElement hsnActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[10]")
	public WebElement discountActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[12]")
	public WebElement amountActual1;

	////// 2nd product//////

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[2]")
	public WebElement prodctActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[3]")
	public WebElement descriptnActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[4]")
	public WebElement quantityActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[5]")
	public WebElement uomActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[7]")
	public WebElement spclDiscountActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[8]")
	public WebElement rateActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[9]")
	public WebElement hsnActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[10]")
	public WebElement discountActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[12]")
	public WebElement amountActual2;

	/////////// Products /////////////

	@FindBy(xpath = "(//div[@col-id='product_1'])[3]")
	public WebElement Product1;

	@FindBy(xpath = "//span[contains(text(),'Milaze')]")
	public WebElement ProductSelect1;

	@FindBy(xpath = "//span[contains(text(),'80/100-18')]")
	public WebElement ProductSubCategory;
	///////// always keep index "2" for last number product and then so on.
	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[2]") ///////// if 2 products are there then keep index 2 for second
															///////// product
	public WebElement Product2;
	///////// if 4 products are there then keep index 2 for forth product and so on.
	@FindBy(xpath = "//span[contains(text(),'ANMOL')]")
	public WebElement ProductSelect2;

	@FindBy(xpath = "//span[contains(text(),'4.50-10 RIB HD 8PR | TT | F&R')]")
	public WebElement ProductSubCategory1;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitButton;

	@FindBy(xpath = "//div//button[contains(text(),'Save')]")
	public WebElement saveButton;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement saveButton1;

	///////////// Description /////////////

	@FindBy(xpath = "(//div[@col-id='description_1'])[3]")
	public WebElement Description1;

	@FindBy(xpath = "//div[@class='ag-large-textarea']//textarea")
	public WebElement DescriptionText1;

	@FindBy(xpath = "(//div[@col-id='description_1'])[2]")
	public WebElement Description2;

	@FindBy(xpath = "//div[@class='ag-large-textarea']//textarea")
	public WebElement DescriptionText2;
	//
	/////////// Quantity /////////////

	@FindBy(xpath = "(//div[@col-id='uomId_1'])[1]")
	public WebElement clickOther;

	@FindBy(xpath = "(//div[@col-id='quantity_1'])[3]")
	public WebElement Quantity1;

	@FindBy(xpath = "(//div[@col-id='quantity_1'])[2]")
	public WebElement Quantity2;

	/////////// UOM /////////////

	@FindBy(xpath = "(//div[@col-id='uomId_1'])[3]")
	public WebElement UOM1;

	@FindBy(xpath = "//div[@name='Dozen']/..")
	public WebElement UomSelect1;

	@FindBy(xpath = "(//div[@col-id='uomId_1'])[2]")
	public WebElement UOM2;

	@FindBy(xpath = "//div[@name='Dozen']/..")
	public WebElement UomSelect2;

	////////////// HSN /////////////

	@FindBy(xpath = "(//div[@col-id='hsn_1'])[3]")
	public WebElement Hsn1;

	@FindBy(xpath = "(//div[@col-id='hsn_1'])[2]")
	public WebElement Hsn2;

	///////// Rate ////////////////

	@FindBy(xpath = "(//div[@col-id=\"rate_1\"])[3]")
	public WebElement rate1;

	@FindBy(xpath = "(//div[@col-id=\"rate_1\"])[2]")
	public WebElement rate2;

	///////// Special Discount ////////////////

	@FindBy(xpath = "(//div[@col-id='specialDiscount_1'])[3]")
	public WebElement SpclDscnt1;

	@FindBy(xpath = "(//div[@col-id='specialDiscount_1'])[2]")
	public WebElement SpclDscnt2;

	///////// Discount ////////////////

	@FindBy(xpath = "(//div[@col-id='discount_1'])[3]")
	public WebElement discount1;

	@FindBy(xpath = "(//div[@col-id='discount_1'])[2]")
	public WebElement discount2;

	///////// TAX ////////////////

	@FindBy(xpath = "(//div[@col-id='tax_1'])[3]")
	public WebElement tax1;

	@FindBy(xpath = "(//div[@col-id='tax_1'])[2]")
	public WebElement tax2;

	////////// check boxes //////////////

	@FindBy(xpath = "//span[text()='Discount']")
	public WebElement discountCheckBox;

	@FindBy(xpath = "//div[@col-id='uomId_1']")
	public WebElement randomClick;

	@FindBy(xpath = "//span[text()='Expense']")
	public WebElement expenseCheckBox;

	@FindBy(xpath = "(//input[@type='number'])[1]")
	public WebElement discountEntry;

	@FindBy(xpath = "//*[text()='Sub Total']")
	public WebElement scrollDownElement;

	@FindBy(xpath = "(//div[@col-id=\"amount_1\"])[3]")
	public WebElement amountExpctd1;

	@FindBy(xpath = "(//div[@col-id=\"amount_1\"])[2]")
	public WebElement amountExpctd2;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[3]")
	public WebElement expenseEntry;

	@FindBy(xpath = "//div[text()='Expense']//parent::div//following::input")
	public WebElement expenseDropdown;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[7]")
	public WebElement expenseInvDropdown;

	@FindBy(xpath = "//span[normalize-space()='Lobour Expense']")
	public WebElement expenseSelect;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-10\"])[3]")
	public WebElement grandTotalInvActual;

	//////// calculation ///////////

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[4]")
	public WebElement subTotalExpectdCal;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[5]")
	public WebElement discountExpectdCal;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[6]")
	public WebElement gst1ExpectdCal;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[7]")
	public WebElement gst2ExpectdCal;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-15\"])[8]")
	public WebElement totalAmountExpectdCal;

	@FindBy(xpath = "(//span[@class=\"title\"])[3]")
	public WebElement summarytax1Text;

	@FindBy(xpath = "(//span[@class=\"title\"])[4]")
	public WebElement summarytax2Text;

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
	//// products actual Invoice //////

	////// 1st product ////////

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[4]")
	public WebElement uomInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[6]")
	public WebElement spclDiscountInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[7]")
	public WebElement rateInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[8]")
	public WebElement hsnInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[8]")
	public WebElement discountInvActual1;

	@FindBy(xpath = "(//tbody)[2]//tr[1]//td[11]")
	public WebElement amountInvActual1;

	////// 2nd product//////

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[4]")
	public WebElement uomInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[6]")
	public WebElement spclDiscountInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[7]")
	public WebElement rateInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[8]")
	public WebElement hsnInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[8]")
	public WebElement discountInvActual2;

	@FindBy(xpath = "(//tbody)[2]//tr[2]//td[11]")
	public WebElement amountInvActual2;

	@FindBy(xpath = "(//div[@class='ant-col ant-col-15'])[5]")
	public WebElement discountAfterAdded;

	@FindBy(xpath = "(//div[text()='Purchase Invoice'])[2]")
	public WebElement purchaseInvoiceTitle;

	public PurchaseInvoiceDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	/////////////////////// Purchase Invoice Create /////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created sales order parameters.
	 */

	public void purchaseInvoiceCreate() throws Exception {

		Utility.click(addButton);
		Utility.click(purchaseInvoiceLink);
		Utility.click(suppiler);
		// System.out.println(Utility.excelRead(2, 2, "SupplierDetails"+"first
		// sysout"));//extra
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 2, "SupplierDetails") + "']")).click();
		System.out.println(1);
		// Utility.JSClick(relationDrop); origin comment
		// Utility.JSClick(contactDrop);
		// contactDrop.sendKeys(Keys.ENTER);
		// Utility.click(selectContactDrop);
		System.out.println(2);
		// driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 9,
		// "SupplierDetails") + "']")).click(); extra
		System.out.println(3);
		System.out.println(4);
		// Utility.wait_N_click(projctDrop1);
		// Utility.wait_N_click(billToDrop);
		// billToDrop.sendKeys();
		System.out.println(5);
		// System.out.println(Utility.excelRead(7, 29, "SupplierDetails"+"first
		// sysout"));//extra
		// driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(7, 29,
		// "SupplierDetails") + "']")).click();
		// Utility.JSClick(selectBillTotDrop);
		System.out.println(6);
		System.out.println(7);
		Utility.wait_N_click(placeofSupply);
		System.out.println(8);
		Utility.click(placeofSupply);
		System.out.println(9);
		Utility.scrollToElement_N_click(placeofSupplySelect);
		// Utility.wait_N_click(placeofSupplySelect);
		System.out.println(10);
		Utility.wait_N_click(Ref);
		System.out.println(11);
		Thread.sleep(1000);
		Utility.enterText(refText, Utility.excelRead(7, 2, "SupplierDetails"));
		System.out.println(12);
		// Utility.click(ShippDrop);
		// Utility.click(ShippDrop); /////Element is not clickable__ hidden attribute
		// could have been implemented.
		// Utility.click(ShippSelect);
		Utility.wait_N_click(PayemntDrop);
		System.out.println(13);
		Utility.click(PayemntDrop);
		System.out.println(14);
		// driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(7, 20,
		// "SupplierDetails") + "']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Cash on Delivery']")).click();
		System.out.println(15);
		// Utility.JS_Scrolldown(addLine);
		System.out.println(16);
		// Utility.click(addLine);
		addLine.sendKeys(Keys.ENTER);
		System.out.println(17);
		Utility.click(Product1);
		System.out.println(18);
		Utility.click(Product1);
		System.out.println(19);
		Utility.click(ProductSelect1);
		Utility.click(ProductSubCategory);
		Thread.sleep(6000L);
		// Description1.sendKeys(Keys.ENTER);
		Utility.JSClick(Description1);
		Utility.enterTextUsingRobot("Already Done");
		System.out.println(20);
		Utility.click(clickOther);
		System.out.println(21);
		// Utility.click(Quantity1);
		System.out.println(22);
		Utility.JSClick(Quantity1);
		Utility.enterTextUsingRobot(quantity1);
		Utility.wait_N_click(UOM1);
		Utility.wait_N_click(UOM1);
		Utility.click(UomSelect1);
		Hsn1.sendKeys(HSN1);
		rate1.sendKeys(Rate1);
		// SpclDscnt1.sendKeys(SpclDiscnt1);
		discount1.sendKeys(discnt1);
		Utility.wait_N_click(tax1);
		Utility.click(tax1);
		// driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(7, 31,
		// "SupplierDetails") + "']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='CGST (6.00%)']")).click();
		Thread.sleep(2000);
		Utility.click(Product2);
		Utility.click(Product2);
		Utility.click(ProductSelect2);
		Utility.click(ProductSubCategory1);
		Utility.JSClick(Description2);
		Thread.sleep(1000);
		// Utility.mouseHover(DescriptionText2);
		// Description2.sendKeys(description1);
		Utility.JSClick(Description2);
		Utility.enterTextUsingRobot(description1);
		Utility.click(clickOther);
		Utility.JSClick(Quantity2);
		Utility.enterTextUsingRobot(quantity2);
		Thread.sleep(1000);
		Utility.wait_N_click(UOM2);
		Utility.wait_N_click(UOM2);
		Utility.click(UomSelect2);
		Hsn2.sendKeys(HSN2);
		rate2.sendKeys(Rate2);
		Thread.sleep(1000);
		// SpclDscnt2.sendKeys(SpclDiscnt2);
		Thread.sleep(1000);
		// discount2.sendKeys(discnt2);
		Thread.sleep(1000);
		Utility.wait_N_click(tax2);
		Utility.click(tax2);
		// driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(8, 31,
		// "SupplierDetails") + "']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='CGST (2.00%)']")).click();
		internalRemarks.sendKeys(internalremarks);
		Thread.sleep(1000);
		supplierRemarks.sendKeys(supplierreamrks);
		footerText.sendKeys(footer);

		Utility.click(saveButton1);
		Utility.click(submitButton);
		Thread.sleep(3000);
		if (purchaseInvoiceTitle.isDisplayed()) {
			System.out.println("Purchase invoice created successfully");
		} else {
			System.out.println("Purchase invoice is not created successfully");
		}
	}
	/////////////// Purchase Invoice Calculation ////////////////

	@SuppressWarnings("unused")
	public void purchaseInvoiceCalculation() throws Exception {

		Thread.sleep(4000);
		Utility.click(addButton);
		System.out.println(1);
		Thread.sleep(1000);
		Utility.click(purchaseInvoiceLink);
		System.out.println(2);
		Thread.sleep(3000);
		Utility.click(suppiler);
		System.out.println(3);
		Utility.click(selectDropdownOption);
		System.out.println(4);
		Utility.JS_Scrolldown(addLine);
		addLine.sendKeys(Keys.ENTER);
		System.out.println(5);
		// Utility.click(addLine);
		System.out.println(6);
		// Utility.wait_N_click(discountCheckBox);
		Utility.JSClick(discountCheckBox);
		System.out.println(7);
		// Utility.wait_N_click(expenseCheckBox);
		Utility.JSClick(expenseCheckBox);
		System.out.println(8);
		Utility.JS_ScrollUP(randomClick);
		System.out.println(9);
		Utility.wait_N_click(Product1);
		System.out.println(10);
		Utility.click(Product1);
		System.out.println(11);
		Utility.click(ProductSelect1);
		Utility.click(ProductSubCategory);
		System.out.println(12);
		Utility.JSClick(Quantity1);
		Utility.enterTextUsingRobot(quantity1);
		System.out.println(13);
		Thread.sleep(1000);
		Utility.wait_N_click(UOM1);
		System.out.println(14);
		Utility.click(UOM1);
		System.out.println(15);
		Utility.click(UomSelect1);
		System.out.println(16);
		rate1.sendKeys(Rate1);
		System.out.println(17);
		Utility.click(SpclDscnt1);
		Utility.enterTextUsingRobot(SpclDiscnt1);
		Utility.wait_N_click(tax1);
		Utility.click(tax1);
		//driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(7, 38, "SupplierDetails") + "']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='CGST (6.00%)']")).click();
		Utility.JSClick(discount1);
		Utility.enterTextUsingRobot(discnt1);

		Utility.wait_N_click(Product2);
		Utility.click(Product2);
		Utility.click(ProductSelect2);
		Utility.click(ProductSubCategory1);
		Quantity2.sendKeys(quantity2);
		Thread.sleep(1000);
		Utility.wait_N_click(UOM2);
		Utility.click(UOM2);

		Utility.click(UomSelect2);

		rate2.sendKeys(Rate2);
		SpclDscnt2.sendKeys(SpclDiscnt2);
		Utility.click(tax2);
		Utility.click(tax2);
		//driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(8, 38, "SupplierDetails") + "']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='CGST (2.50%)']")).click();
		Utility.wait_N_click(discount2);
		discount2.sendKeys(discnt2);
		Utility.JS_Scrolldown(scrollDownElement);
		Utility.JSClick(discountEntry);
		Utility.enterTextUsingRobot(SpclDiscnt1);

		expenseDropdown.sendKeys(Keys.ENTER);
		//Utility.click(expenseDropdown);
		Utility.click(expenseSelect);
		expenseEntry.sendKeys(expense);
		Utility.click(scrollDownElement);

		String tax11 = taxselect1.replaceAll("[^0-9.]", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1");
		String Tax22 = taxselect2.replaceAll("[^0-9.]", "").replaceFirst("\\.0*$|(\\.\\d*?)0+$", "$1");

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
		double d1 = Double.parseDouble(SpclDiscnt1);
		double d2 = Double.parseDouble(SpclDiscnt2);
		double d3 = Double.parseDouble(Rate1);
		double d4 = Double.parseDouble(Rate2);
		double d5 = Double.parseDouble(quantity1); // converting all element data into double
		double d6 = Double.parseDouble(quantity2);
		double d7 = Double.parseDouble(discnt1);
		double d8 = Double.parseDouble(discnt2);
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
