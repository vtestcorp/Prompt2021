package com.sales;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class RFQDetailsPage extends Base{
	
	
	
	String description1 = Utility.excelRead(7, 22, "SupplierDetails");
	String internalremarks = Utility.excelRead(7, 9, "SupplierDetails");
	String supplierreamrks = Utility.excelRead(7, 11, "SupplierDetails");
	String footer = Utility.excelRead(7, 12, "SupplierDetails");
	String reqstdate = Utility.excelRead(7, 27, "SupplierDetails");
	String expirydate = Utility.excelRead(7, 26, "SupplierDetails");
	String reason = Utility.excelRead(7, 28, "SupplierDetails");
	String ref = Utility.excelReadInt(7, 28, "SupplierDetails");

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
	String expense = Utility.excelReadInt(7, 10, "CustomerDetails");
	String addidiscount = Utility.excelReadInt(7, 32, "SupplierDetails");
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
//	///////// Description /////////////
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
//	///////// Quantity /////////////
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

	@FindBy(xpath = "(//div[@role=\"combobox\"])[5]")
	public WebElement projctDrop;

	@FindBy(xpath = "(//div[@role=\"combobox\"])[4]")
	public WebElement projctDrop1;

	@FindBy(xpath = "(//div[@col-id=\"placeOfSupply\"])[2]")
	public WebElement placeofSupply;

	@FindBy(xpath = "//div//ul[@role=\"listbox\"]//li[@name=\"Maharashtra \"]")
	public WebElement placeofSupplySelect;

	@FindBy(xpath = "(//div[@col-id=\"ref\"])[2]")
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

	@FindBy(xpath = "(//textarea[@class=\"description-textarea\"])[1]")
	public WebElement internalRemarks;

	@FindBy(xpath = "(//textarea[@class=\"description-textarea\"])[2]")
	public WebElement supplierRemarks;

	@FindBy(xpath = "(//textarea[@class=\"add-footer-textarea\"])")
	public WebElement footerText;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-16\"])[1]")
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

	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[3]")
	public WebElement Product1;

	@FindBy(xpath = "//*[@title=\"waxxe\"]/..")
	public WebElement ProductSelect1;
	///////// always keep index "2" for last number product and then so on.
	@FindBy(xpath = "(//div[@col-id=\"product_1\"])[2]") ///////// if 2 products are there then keep index 2 for second
														///////// product
	public WebElement Product2;
	///////// if 4 products are there then keep index 2 for forth product and so on.
	@FindBy(xpath = "//*[@title=\"gghhhh\"]/..")
	public WebElement ProductSelect2;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitButton;

	@FindBy(xpath = "//div//button[contains(text(),'Save')]")
	public WebElement saveButton;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ant-btn ant-btn-primary\"]")
	public WebElement saveButton1;

///////////// Description /////////////

	@FindBy(xpath = "(//div[@col-id=\"description\"])[3]")
	public WebElement Description1;

	@FindBy(xpath = "//div[@class='ag-large-textarea']//textarea")
	public WebElement DescriptionText1;

	@FindBy(xpath = "(//div[@col-id=\"description\"])[2]")
	public WebElement Description2;

	@FindBy(xpath = "//div[@class='ag-large-textarea']//textarea")
	public WebElement DescriptionText2;
//
/////////// Quantity /////////////

	@FindBy(xpath = "(//div[@col-id=\"uom_1\"])[1]")
	public WebElement clickOther;

	@FindBy(xpath = "(//div[@col-id=\"qty_2\"])[3]")
	public WebElement Quantity1;

	@FindBy(xpath = "(//div[@col-id=\"qty_2\"])[2]")
	public WebElement Quantity2;

/////////// UOM /////////////

	@FindBy(xpath = "(//div[@col-id=\"uom_1\"])[3]")
	public WebElement UOM1;

	@FindBy(xpath = "//div[@name='Dozen']/..")
	public WebElement UomSelect1;

	@FindBy(xpath = "(//div[@col-id=\"uom_1\"])[2]")
	public WebElement UOM2;

	@FindBy(xpath = "//div[@name='Dozen']/..")
	public WebElement UomSelect2;

////////////// HSN /////////////

	@FindBy(xpath = "(//div[@col-id=\"hsnCode_1\"])[3]")
	public WebElement Hsn1;

	@FindBy(xpath = "(//div[@col-id=\"hsnCode_1\"])[2]")
	public WebElement Hsn2;

///////// Rate ////////////////

	@FindBy(xpath = "(//div[@col-id=\"rate_1\"])[3]")
	public WebElement rate1;

	@FindBy(xpath = "(//div[@col-id=\"rate_1\"])[2]")
	public WebElement rate2;

///////// Special Discount ////////////////

	@FindBy(xpath = "(//div[@col-id=\"specialDiscount_1\"])[3]")
	public WebElement SpclDscnt1;

	@FindBy(xpath = "(//div[@col-id=\"specialDiscount_1\"])[2]")
	public WebElement SpclDscnt2;

///////// Discount ////////////////

	@FindBy(xpath = "(//div[@col-id=\"discount_1\"])[3]")
	public WebElement discount1;

	@FindBy(xpath = "(//div[@col-id=\"discount_1\"])[2]")
	public WebElement discount2;

///////// TAX ////////////////

	@FindBy(xpath = "(//div[@col-id=\"taxApplied_1\"])[3]")
	public WebElement tax1;

	@FindBy(xpath = "(//div[@col-id=\"taxApplied_1\"])[2]")
	public WebElement tax2;

////////// check boxes //////////////

	@FindBy(xpath = "(//*[@class=\"ant-checkbox-input\"]/..)[2]")
	public WebElement discountCheckBox;

	@FindBy(xpath = "//div[@col-id=\"uom_1\"]")
	public WebElement randomClick;

	@FindBy(xpath = "(//*[@class=\"ant-checkbox-input\"]/..)[3]")
	public WebElement expenseCheckBox;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[1]")
	public WebElement discountEntry;

	@FindBy(xpath = "//*[text()='Sub Total']")
	public WebElement scrollDownElement;

	@FindBy(xpath = "(//div[@col-id=\"amount_1\"])[3]")
	public WebElement amountExpctd1;

	@FindBy(xpath = "(//div[@col-id=\"amount_1\"])[2]")
	public WebElement amountExpctd2;

	@FindBy(xpath = "(//input[@placeholder='0.00'])[3]")
	public WebElement expenseEntry;

	@FindBy(xpath = "(//div[@role='combobox'])[6]")
	public WebElement expenseDropdown;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[7]")
	public WebElement expenseInvDropdown;

	@FindBy(xpath = "//*[@name='Lobour Expense']/..")
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

//////////////////calculation ///////////////////////

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

	public RFQDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	//////////////////////// RFQ creation and verification ////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created RFQ elements.
	 */

	public void rfqCreate() throws Exception {

		Thread.sleep(4000);
		Utility.click(addButton);
		Utility.click(rfqLink);
		Thread.sleep(3000);

		Utility.implicitwait();
		Utility.click(selectCustomerDropdown);
		Utility.implicitwait();
		Utility.click(selectDropdownOption);

		Utility.click(rfqdepartment);
		Utility.click(rfqdepartment);
		Utility.click(rfqdepartmentSelect);
		Utility.implicitwait();
		Utility.wait_N_click(rfqprojectDrop);
		Utility.click(rfqprojectDrop);
		Utility.click(rfqprojectSelect);
		Utility.implicitwait();
		Utility.wait_N_click(rfqpriorityDrop);
		Utility.click(rfqpriorityDrop);
		Utility.click(rfqprioritySelect);
		Utility.implicitwait();
		Utility.click(addLine);

		Utility.click(rfqProduct1);
		Utility.click(rfqProduct1);
		Utility.click(rfqProductSelect1);
		Utility.click(rfqDescription1);
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.moveToElement(rfqDescriptionText1).build().perform();
		rfqDescriptionText1.sendKeys(description1);
		Utility.implicitwait();
		Utility.click(rfqQuantity1);
		rfqQuantity1.sendKeys(quantity1);
		Thread.sleep(1000);
		Utility.wait_N_click(rfqUOM1);
		Utility.wait_N_click(rfqUOM1);
		Utility.click(rfqUomSelect1);

		Utility.click(rfqProduct2);
		Utility.click(rfqProduct2);
		Utility.click(rfqProductSelect2);
		Utility.click(rfqDescription2);
		Thread.sleep(1000);
		Utility.mouseHover(rfqDescriptionText2);
		rfqDescriptionText2.sendKeys(description1);
		Utility.implicitwait();
		Utility.click(rfqQuantity2);
		rfqQuantity2.sendKeys(quantity2);
		Thread.sleep(1000);
		Utility.wait_N_click(rfqUOM2);
		Utility.wait_N_click(rfqUOM2);
		Utility.click(rfqUomSelect2);

		Utility.JS_Scrolldown(saveRfq);
		rfqinternalRemarks.sendKeys(internalremarks);
		rfqSupplierRemarks.sendKeys(supplierreamrks);
		rfqFooter.sendKeys(footer);
		Utility.wait_N_click(saveRfq);
		Utility.wait_N_click(submitRfq);

		if (saveRfq.isDisplayed()) {

			System.out.println("RFQ is not created successfuly");
			et.log(LogStatus.FAIL, "RFQ is not created successfuly",
					et.addScreenCapture(fail("RFQ is not created successfuly")));

		} else {

			System.out.println("RFQ is  created successfuly");
			et.log(LogStatus.PASS, "RFQ is  created successfuly",
					et.addScreenCapture(pass("RFQ is  created successfuly")));
		}
	}

	
	
	
	
	
	

}
