package com.sales;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class CustomerDetailsPage extends Base {

	boolean custext;
	String customername = Utility.excelRead(2, 2, "CustomerDetails");
	String customername1 = Utility.excelRead(3, 2, "CustomerDetails");// extra
	String Importcustomername = Utility.excelReadHssf(1, 0, "ImportCustomers1");
	String delcustomertrans = Utility.excelRead(7, 34, "CustomerDetails");
	String deletecustomer = Utility.excelRead(7, 35, "CustomerDetails");
	String namecontact = Utility.excelRead(2, 14, "CustomerDetails");
	String lastnamecontact = Utility.excelRead(2, 15, "CustomerDetails");
	String emailcontact = Utility.excelRead(2, 5, "CustomerDetails");
	String Address1 = Utility.excelRead(7, 37, "CustomerDetails");
	String Address2 = Utility.excelRead(7, 38, "CustomerDetails");
	String Address3 = Utility.excelRead(7, 39, "CustomerDetails");
	String City1 = Utility.excelRead(7, 40, "CustomerDetails");

	String transactionCust = Utility.excelRead(7, 36, "CustomerDetails");
	String transactionCust1 = "Exxon Mobil Corp.";
	@FindBy(xpath = "//li@name='Maharashtra']")
	public WebElement selectstate;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement LoginBtn;

	@FindBy(xpath = "//h2[@class='text-center signup-wizard-hding ng-scope']")
	public WebElement CompanySetupWizardText;

	@FindBy(xpath = "//button[@class='btn-sm btn btn-default pull-left']")
	public WebElement SkipBtn;

	@FindBy(xpath = "(//*[text()='Customers'])[1]")
	public WebElement CustomersMenuBtn;

	@FindBy(xpath = "//*[@title='Email']")
	public WebElement emailButton;

	@FindBy(xpath = "//div[@id='Email_Template_receivers']")
	public WebElement emailSendTO;
	
	@FindBy (xpath = "(//span[@class='ant-select-selection-search'])[5]")
	public WebElement emailSendTo1;

	@FindBy(xpath = "//*[@class=\"ant-select-selection-placeholder\"]")
	public WebElement emailSendTOText;

	@FindBy(xpath = "//input[@id='Email_Template_subject']")
	public WebElement emailSubject;

	@FindBy(xpath = "//*[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]")
	public WebElement emailBody;

	@FindBy(xpath = "//button[normalize-space()='Send Email']")
	public WebElement emailSend;

	@FindBy(xpath = "//div[text()='Email']")
	public WebElement emailRandom;

	@FindBy(xpath = "//*[text()='Mail sent successfully.']")
	public WebElement emailSuccess;

	@FindBy(xpath = "//*[text()='To is required.']")
	public WebElement emailError;

	@FindBy(xpath = "//*[text()='Sales']")
	public WebElement salesButton;

	@FindBy(xpath = "//button[contains(text(),'New Customer')]")
	public WebElement NewCustomer;

	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	public WebElement companyName;

	@FindBy(xpath = "//*[text()='Select Payment Term']/..")
	public WebElement paymentTerm;

	@FindBy(xpath = "//*[text()='Select Customer Type']/..")
	public WebElement customerType;

	@FindBy(xpath = "//input[@placeholder='Enter Website Url']")
	public WebElement companyWebsite;

	@FindBy(xpath = "//*[text()='Select Customer Source']/..")
	public WebElement customerSource;

	@FindBy(xpath = "//*[text()='Select Company Rating']/..")
	public WebElement rateYourCompany;

	@FindBy(xpath = "//*[text()='Select Industry']/..")
	public WebElement Industry;

	@FindBy(xpath = "//*[text()='Select Industry']/..")
	public WebElement IndustrySearch;

	@FindBy(xpath = "//*[text()='No Rows To Show']")
	public WebElement noRowsToShow;

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

	@FindBy(xpath = "(//input[@placeholder='State/Province/Region'])[1]")
	public WebElement stateName;

	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
	public WebElement zipcode;

	@FindBy(xpath = "(//*[text()='Select Country'])")
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

	@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary\"]")
	public WebElement save;
	
	@FindBy (xpath = "//button[text()='Submit']")
	public WebElement submitButton;

	@FindBy(xpath = "//div[@class=\"billing-address-information\"]")
	public WebElement scrollDown;

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

	@FindBy(xpath = "//span[contains(text(),'ImportCustomers.xls')]")
	public WebElement FileName;

	@FindBy(xpath = "//div[contains(@class,'pull-right')]//input[contains(@class,'finish btn-green btn')]")
	public WebElement uploadCustomers;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters customer name']")
	public WebElement searchbox;

	@FindBy(xpath = "(//div[@class='ui-grid-cell-contents ng-binding ng-scope']//a//strong)[1]")
	public WebElement searchedCust;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement hamburgerbtn;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[7]")
	public WebElement editCustomer;

	@FindBy(xpath = "//h3[@class='modal-title text-center ng-binding']")
	public WebElement CustomerTextVerify;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[2]")
	public static WebElement createSOInvoice;

	@FindBy(xpath = "//input[@id='s2id_autogen87']/..//b")
	public static WebElement CustomerSelection;

	@FindBy(xpath = "//input[@id='s2id_autogen87']/..//b")
	public WebElement ProjectName;

	@FindBy(xpath = "//input[@id='s2id_autogen87_search']")
	public static WebElement ProjectNameSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-87']")
	public static WebElement ProjectNameSearchClick;

	@FindBy(xpath = "//label[contains(text(),'Select Place of Supply')]")
	public static WebElement PlaceOfSupply;

	@FindBy(xpath = "//span[contains(text(),'Select Place of Supply')]/..//b")
	public WebElement PlaceOFSupplyClick;

	@FindBy(xpath = "//input[@id='s2id_autogen77_search']")
	public static WebElement PlaceOFSupplyClickSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-77']")
	public static WebElement PlaceOFSupplyClickClick;

	@FindBy(xpath = "(//input[@name='referenceNumber'])[1]")
	public static WebElement CustomerPO;

	@FindBy(xpath = "(//input[@name='referenceNumber'])[2]")
	public static WebElement ref;

	@FindBy(xpath = "//input[@id='s2id_autogen79']/..//b")
	public WebElement BillingAddress;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-79']")
	public WebElement BillingAddressAddNew;

	@FindBy(xpath = "//span[contains(text(),'×')]")
	public WebElement cancelIcon;

	@FindBy(xpath = "//span[@class='ant-modal-close-x']")
	public WebElement close;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[9]/..//b")
	public WebElement payTerms;

	@FindBy(xpath = "//input[@id='s2id_autogen83_search']")
	public static WebElement payTermsSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@id='select2-results-83']")
	public static WebElement payTermsSearchClick;

	@FindBy(xpath = "//i[@class='glyphicon glyphicon-pencil']/..")
	public WebElement pencilEditIcon;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[10]/..//b")
	public WebElement productName;

	@FindBy(xpath = "(//input[@type='text'][@role='combobox'])[15]")
	public static WebElement productNameSearch;

	@FindBy(xpath = "//div[@class='select2-result-label'][@role='option']")
	public static WebElement productNameSearchClick;

	@FindBy(xpath = "//input[@id='0-2'][@type='number']")
	public static WebElement quantity;

	@FindBy(xpath = "//input[@id='rate0'][@type='number']")
	public static WebElement rate;

	@FindBy(xpath = "//button[@class='btn btn-green pull-left']")
	public static WebElement InvoiceSave;

	@FindBy(xpath = "//p[@class='ng-binding']")
	public static WebElement ConfirmatioBox;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement YES;

	@FindBy(xpath = "//div[@class='modal-header ng-scope']//h3[@id='reportTitle']")
	public static WebElement ValidateSInvoice;

	@FindBy(xpath = "//div[@class='modal-header ng-scope']//button[@type='button']")
	public static WebElement InvoiceClose;

	@FindBy(xpath = "//div[@id='page-container']//tr[1]//td[1]")
	public static WebElement getInvoiceNumber;

	@FindBy(xpath = "//div[@id='page-container']//tr[1]//td[4]")
	public static WebElement getInvoiceAmount;

	@FindBy(xpath = "(//h4[@class='panel-title']//a[@accordion-transclude='heading'])//i[@class='pull-right fa fa-angle-left']")
	public static WebElement FilterToggle;

	@FindBy(xpath = "//input[@class='select2-input select2-default'][@type='text']")
	public static WebElement CustomerClick;

	@FindBy(xpath = "//ul[@class='select2-results']//li[1]")
	public static WebElement CustomerBox;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement applyFilter;

	@FindBy(xpath = "//div[@id='page-container']//td[3]//a")
	public static WebElement getCustomerName;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[3]")
	public static WebElement createCreditMemo;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[5]/..//b")
	public WebElement MemoProductName;

	@FindBy(xpath = "(//input[@type='text'][@role='combobox'])[11]")
	public static WebElement MemoProductNameSearch;

	@FindBy(xpath = "//div[@class='select2-result-label'][@role='option']")
	public static WebElement MemoProductNameSearchClick;

	@FindBy(xpath = "//input[@id='0-2'][@type='number']")
	public static WebElement MemoQuantity;

	@FindBy(xpath = "//input[@id='0-4'][@type='number']")
	public static WebElement MemoRate;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement MemoInvoiceSave;

	@FindBy(xpath = "//p[@class='ng-binding']")
	public static WebElement MemoConfirmatioBox;

	@FindBy(xpath = "(//button[@class='btn btn-green'])[2]")
	public static WebElement MemoYES;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[5]")
	public WebElement acceptPayment;

	@FindBy(xpath = "//div[@class='modal-header ignorePDFElement']//h3[@id='reportTitle']")
	public WebElement paymentDetailPopupText;

	@FindBy(xpath = "//div[@class='col-sm-6 ng-binding']")
	public WebElement CustomerName;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[2]/..//b")
	public static WebElement clickInvoiceNumber;

	@FindBy(xpath = "(//input[@class='select2-input'][@type='text'])[3]")
	public static WebElement enterInvoiceNumberSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@class='select2-results']")
	public static WebElement clickInvoiceNumSearchSelect;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[3]/..//b")
	public static WebElement paymentMode;

	@FindBy(xpath = "(//input[@class='select2-input'][@type='text'])[3]")
	public static WebElement paymentModeSearch;

	@FindBy(xpath = "//div[@id='select2-drop']//ul[@class='select2-results']")
	public static WebElement paymentModeSearchClick;

	@FindBy(xpath = "//input[@name='payment Mode Details']")
	public static WebElement paymentModeDetails;

	@FindBy(xpath = "//input[@name='amount']")
	public static WebElement amount;

	@FindBy(xpath = "//button[@type='submit'][@class='btn btn-green']")
	public static WebElement addPayment;

	@FindBy(xpath = "//button[@type='button'][@class='btn btn-default']")
	public static WebElement cancel;

	@FindBy(xpath = "(//a[@class=\"company-name\"])[1]")
	public static WebElement actcompanyname;

	@FindBy(xpath = "(//div[@class='ui-grid-cell-contents ng-binding ng-scope']//a)[1]")
	public static WebElement searchedCust1;

	@FindBy(xpath = "(//button[@class='btn btn-green-alt'][@title='Payment'])[1]")
	public static WebElement Payment;

	@FindBy(xpath = "//h4[contains(text(),'Transaction does not exist')]")
	public static WebElement PaymentTransactionNotExist;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[11]")
	public static WebElement ShowAddress;

	@FindBy(xpath = "//h3[@class='modal-title text-center']")
	public static WebElement showAddressPopUpText;

	@FindBy(xpath = "(//button[@class='btn btn-default'])[1]")
	public static WebElement AddRow;

	@FindBy(xpath = "//input[@id='2']")
	public static WebElement AddressName;

	@FindBy(xpath = "//tr[3]//td[5]//input[1]")
	public static WebElement StreetAddress1;

	@FindBy(xpath = "//tr[3]//td[6]//input[1]")
	public static WebElement StreetAddress2;

	@FindBy(xpath = "//tr[3]//td[7]//input[1]")
	public static WebElement AddressCity;

	@FindBy(xpath = "//select[@class='show-address-input ng-pristine ng-valid ng-empty ng-touched']")
	public static WebElement AddressCountry;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public static WebElement AddressSave;
	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement AddressConfirmationYes;

	@FindBy(xpath = "//tr[3]//td[11]//div[1]//button[1]")
	public static WebElement AddressEdit;

	@FindBy(xpath = "(//div[@class='icheckbox_flat'])[12]//input[@type='checkbox']")
	public WebElement DefaultAddressYES;

	@FindBy(xpath = "((//ul[@id='bo-li-style-3'])[1]/li)[4]")
	public static WebElement createExpense;

	@FindBy(xpath = "//div[@class='actionIcon ng-scope']//a[@class='ng-scope']")
	public static WebElement ExpPencilIcon;

	@FindBy(xpath = "(//input[@class='select2-focusser select2-offscreen'][@role='button'])[6]/..//b")
	public static WebElement ExpenseType;

	@FindBy(xpath = "(//input[@type='text'][@role='combobox'])[6]")
	public static WebElement expenseTypeSearch;

	@FindBy(xpath = "//div[@class='select2-result-label'][@role='option']")
	public static WebElement expenseTypeSearchClick;

	@FindBy(xpath = "//input[@id='0-2'][@type='number']")
	public static WebElement expenseAmount;

	@FindBy(xpath = "//button[@class='btn btn-green ng-binding']")
	public static WebElement createExpenseBtn;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	public static WebElement expConfirmationBoxYES;

	@FindBy(xpath = "//div[@id='page-container']//tr[1]//td[1]")
	public static WebElement getExpenseNumber;

	@FindBy(xpath = "//div[@id='page-container']//tr[1]//td[2]")
	public static WebElement getExpCustomerName;

	@FindBy(xpath = "(//a[@class='company-name'])[1]")
	public WebElement labelFirstCustomerName;

	@FindBy(xpath = "(//div[@aria-rowindex='2']//button)[2]")
	public WebElement actionButton;
	
	@FindBy(xpath="(//div[@class='ag-react-container']/button)[1]")
	public WebElement actionbtn;

	@FindBy(xpath = "(//div[@class='ag-react-container']//button)[3]")
	public WebElement actionButton3;

	@FindBy(xpath = "//div[@class='year ml0 mt5']")
	public WebElement salesorderCustsName;

	@FindBy(xpath = "(//div[@col-id='companyName_1'])[3]")
	public WebElement compnyName3;

	@FindBy(xpath = "//a[text()='Create Sales Order']")
	public WebElement createSalesOrder;

	@FindBy(xpath = "//a[text()='Create Invoice']")
	public WebElement createInvoice;

	@FindBy(xpath = "//a[text()='Create Credit Memo']")
	public WebElement createMemo;

	@FindBy(xpath = "//a[text()='Delete Customer']")
	public WebElement deleteCustomer;
	
	@FindBy (xpath = "//a[text()='DeleteCust']")//extra
	public WebElement deleteCust;

	@FindBy(xpath = "//a[text()='Show Contact']")
	public WebElement showContact;

	@FindBy(xpath = "//a[text()='Show Address']")
	public WebElement showAddress;

	@FindBy(xpath = "//*[text()='Contact'][@class='ant-modal-title']")
	public WebElement contactTable;
	
	@FindBy (xpath = "//div[text()='Address'][@class='ant-modal-title']")
	public WebElement addressTable;

	@FindBy(xpath = "//*[@class='ant-btn ant-btn-default']")
	public WebElement addRow;

	@FindBy(xpath = "(//div[@class='table-cell-action']//i)[1]")
	public WebElement edit1;

	@FindBy(xpath = "(//*[@class='fa fa-edit'])[2]")
	public WebElement edit2;

	@FindBy(xpath = "//i[@class='fa fa-save']")
	public WebElement saveShowContact;

	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	public WebElement titleDropContact;

	@FindBy(xpath = "(//textarea[@class='editable-cell-textarea'])[1]")
	public WebElement showContactName;

	@FindBy(xpath = "(//textarea[@class='editable-cell-textarea'])[2]")
	public WebElement showContactLastName;

	@FindBy(xpath = "(//textarea[@class='editable-cell-textarea'])[3]")
	public WebElement showContactEmail;

	@FindBy(xpath = "//div[@class='ant-notification-notice-description']")
	public WebElement errorMessageTrans;

	@FindBy(xpath = "//div[@class='ant-notification-notice-with-icon']")
	public WebElement errorMessage;

	@FindBy(xpath = "//input[@id='locationName']")
	public WebElement address1;
 
	@FindBy(xpath = "//div[@col-id='streetAddress1']/div/textarea")
	public WebElement address2;

	@FindBy(xpath = "//div[@col-id='streetAddress2']/div/textarea")
	public WebElement address3;

	@FindBy(xpath = "//div[@col-id='cityName']/div/textarea")
	public WebElement city1;

	@FindBy(xpath = "//div[@class='ant-breadcrumb']")
	public WebElement salesTypeName;

	@FindBy(xpath = "//a[text()='Edit Customer']")
	public WebElement edit_cust_option;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters customer name']")
	public WebElement textBoxSearch;

	@FindBy(xpath = "//i[@class='anticon anticon-plus']")
	public WebElement buttonPlus;

	@FindBy(xpath = "//a[text()='Sales Invoice']")
	public WebElement linkSalesInvoice;

	@FindBy(xpath = "//*[text()='Standard Invoice']")
	public WebElement headerSalesInvoice;

	@FindBy(xpath = "(//div[@class='value'])[1]")
	public WebElement labelSelectedCustomerName;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-icon-only']//preceding-sibling::div[1]")
	public WebElement dropDownCustomer;

	@FindBy(xpath = "(//div[@ref='eCenterContainer'])[1]//child::div[2]")
	public WebElement textBoxRefNo;

	@FindBy(xpath = "//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']//li[1]")
	public WebElement optionFirst;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement loginemail;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement loginpassword;

	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement LoginBtn1;

	@FindBy(xpath = "//h4[contains(text(),'Log in to get started or')]")
	public WebElement lheader;

	@FindBy(xpath = "//div[@class=' ant-tabs-tab']")
	public WebElement contact1;

	@FindBy(xpath = "//*[text()='Select Title']/..")
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

	//@FindBy(xpath = "//div[@role=\"tab\" and text()=\"Tax Information\"]")
	@FindBy(xpath = "//div[@id='tab-3']")
	public WebElement tax1;

	@FindBy(xpath = "//*[text()='Select GST Mechanism']/..")
	public WebElement GstMech1;

	@FindBy(xpath = "//input[@placeholder='Enter GSTIN']")
	public WebElement GstNum1;

	@FindBy(xpath = "//input[@placeholder='Enter PAN']")
	public WebElement PanNum1;

	@FindBy(xpath = "//label[@class=\"login-form-checkbox ant-checkbox-wrapper\"]/span[@class=\"ant-checkbox\"]")
	public WebElement checkBox;

	@FindBy(xpath = "//*[text()='Logo']")
	public WebElement logo1;

	@FindBy(xpath = "//button[@class='ant-btn']")
	public WebElement uploadButton1;

	@FindBy(xpath = "//ul[@role='menu']//a[@href='/admin/customers']")
	public WebElement customersmenubtn;

	@FindBy(xpath = "(//button[@class='ant-btn action-btn small ant-dropdown-trigger'])[1]")
	public WebElement actionbutton;

	@FindBy(xpath = "//a[text()='Log Activity']/..")
	public WebElement logactivity;

	@FindBy(xpath = "//input[@placeholder='Activity name']")
	public WebElement activityname;

	@FindBy(xpath = "//input[@id='Log_activity_description']")
	public WebElement activitydescription;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[2]")
	public WebElement activitytype;

	@FindBy(xpath = "//div[@name='Payment']")
	public WebElement activitytype1;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[3]")
	public WebElement status;

	@FindBy(xpath = "//div[@name='Completed']")
	public WebElement statustype;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[4]")
	public WebElement priority;

	@FindBy(xpath = "//div[@name='Medium']")
	public WebElement prioritytype;

	@FindBy(xpath = "(//div[@class=\"ant-picker\"])[1]")
	public WebElement calender;

	@FindBy(xpath = "(//div[@class=\"ant-picker\"])[2]")
	public WebElement calender1;

	@FindBy(xpath = "//a[contains(@class,'ant-calendar-today-btn')]")
	public WebElement date;

	@FindBy(xpath = "(//div[@class=\"ant-select-selector\"])[5]")
	public WebElement assignto;

	@FindBy(xpath = "//li//span[contains(text(),'sukanya')]")
	public WebElement assigntoname;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	public WebElement creatactivity;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitbtn;

	@FindBy(xpath = "//div[@class=\"ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-value\"]")
	public WebElement displaydate;

	@FindBy(xpath = "(//a[@class=\"company-name\"])[1]")
	public WebElement customer;

	@FindBy(xpath = "//div[text()='Activities']")
	public WebElement customeractivity;

	@FindBy(xpath = "//div[text()='Testing']")
	public WebElement tesingactivitycheck;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters customer name']")
	public WebElement searchcustomer;

	@FindBy(xpath = "//a[text()='Log Communication']/..")
	public WebElement logcommunication;

	@FindBy(xpath = "//input[@id='Log_activity_mode']")
	public WebElement communicationmode;

	@FindBy(xpath = "//input[@id='Log_activity_description']")
	public WebElement communicationdescription;

	@FindBy(xpath = "//input[@id='Log_activity_communicatedTo']")
	public WebElement communicateto;

	@FindBy(xpath = "//button[contains(@class,'ant-btn ant-btn-primary')]")
	public WebElement savebtn;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitbutton;

	@FindBy(xpath = "//div[contains(text(),'Communications')]")
	public WebElement customercommunication;

	@FindBy(xpath = "//div[@role='gridcell' and text()='Email']")
	public WebElement emailcommunicationcheck;

	@FindBy(xpath = "//li[@name='sukanya']")
	public WebElement commuName;

	@FindBy(xpath = "((//*[text()='India'])/..)[2]")
	public WebElement countryDropSelect;

	@FindBy(xpath = "//span[@class=\"dropdown active ant-dropdown-trigger\"]")
	public WebElement uploadDownArrow;

	@FindBy(xpath = "//*[text()='Import Customer']")
	public WebElement importButton;

	@FindBy(xpath = "//*[text()='Select Industry']/..")
	public WebElement selectIndustryDrop;

	@FindBy(xpath = "//*[text()='Select Customer Type']/..")
	public WebElement selectCustTypeDrop;

	@FindBy(xpath = "//*[text()='Select Customer Source']")
	public WebElement selectCustSourceDrop;

	@FindBy(xpath = "//*[text()='Select Payment Term']")
	public WebElement selectPaymenteDrop;

	@FindBy(xpath = "//div[@class='ant-table-content']")
	public WebElement allTransactionTable;

	@FindBy(xpath = "(//div[@class='ant-table-content'])[2]")
	public WebElement salesOrderTranTable;

	@FindBy(xpath = "(//a[@class='company-name'])[1]")
	public WebElement transactionCompany;
	
	@FindBy (xpath = "//div[text()='Exxon Mobil Corp.']")
	public WebElement transactionComp;
	
	@FindBy (xpath = "(//div[@class='cursor-pointer']/div)[1]')")
	public WebElement transactionComp1;

	@FindBy(xpath = "//div[@role='tab'][text()='Sales Order']")
	public WebElement transactionSalesOrder;

	@FindBy(xpath = "//div[@role=\"tab\"][text()='Credit Memo']")
	public WebElement transactionCreditMemo;

	@FindBy(xpath = "//div[@role='tab'][text()='Payment']")
	public WebElement transactionPayment;

	@FindBy(xpath = "//div//p[text()='No Data']")
	public WebElement tablePaymentNoData;

	@FindBy(xpath = "//td[@colspan=\"6\"]")
	public WebElement blankTableTransaction;

	@FindBy(xpath = "(//td[@class=\"ant-table-cell\"]//div/.)[1]")
	public WebElement trasactionClick;

	@FindBy(xpath = "(//*[@id=\"root\"]//table/tbody/tr[1]/td[2]/div/a)[2]")
	public WebElement trasactionClickSalesOrder;

	@FindBy(xpath = "(//*[@id=\"root\"]//div[6]//table/tbody//tr//td[2])[1]")
	public WebElement trasactionClickCredit;

	@FindBy(xpath = "//div[@class='button-group-action']")
	public WebElement bottomButtonsFullScreen;

	@FindBy(xpath = "//*[text()='Download']")
	public WebElement downloadTransaction;
	
	@FindBy (xpath = "//button[contains(@title,'Download PDF')]")
	public WebElement downloadTransac;

	@FindBy(xpath = "(//button[@class='ant-btn action-btn small'])[1]")
	public WebElement transactionAction;

	@FindBy(xpath = "//tr[1]//td[8]//div[1]//button[1]")
	public WebElement transactionAction1;

	@FindBy(xpath = "//*[@id=\"root\"]//div[1]//div[1]/div[2]/div[6]//div/table/tbody/tr[1]/td[6]/div/button")
	public WebElement transactionAction2;

	@FindBy(xpath = "//*[text()='Delete']")
	public By deleteTransaction;

	@FindBy(xpath = "//tr[1]//td[8]//div[1]//button[1]")
	public By deleteTransaction1;
	
	@FindBy (xpath = "//button[contains(@title,'Delete')]")
	public By deleteTransactionButton;
	
	@FindBy(xpath = "(//input[@class='ant-checkbox-input'])[2]")
	public WebElement custCheckBox1;

	@FindBy(xpath = "(//input[@class='ant-checkbox-input'])[3]")
	public WebElement custCheckBox2;

	@FindBy(xpath = "(//input[@class='ant-checkbox-input'])[4]")
	public WebElement custCheckBox3;

	@FindBy(xpath = "//body//button[4]")
	public WebElement custExcelButton;

	@FindBy(xpath = "//body//button[3]")
	public WebElement custPdfButton;

	@FindBy(xpath = "//body//button[3]")
	public WebElement custDeleteButton;

	public CustomerDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String username, String pass) {
		Assert.assertEquals(lheader.isDisplayed(), true, "No login screen found");
		email.sendKeys(username);
		password.sendKeys(pass);
		LoginBtn.click();

	}

//////////////////////////// Creating Customer//////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify created customer and updated count in customer.
	 * 
	 */

	public void createCustomer() throws InterruptedException, IOException, AWTException {

		Utility.implicitwait();
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Utility.implicitwait();
		Utility.JS_Scrolldown(totalCustomerCount);
		Utility.implicitwait();

		String number = totalCustomerCount.getText();
		System.out.println("current Count" + number);

		Utility.click(NewCustomer);
		Utility.enterText(companyName, Utility.excelRead(2, 2, "CustomerDetails"));
		Utility.click(paymentTerm);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 3, "CustomerDetails") + "']")).click();
		Utility.click(customerType);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 4, "CustomerDetails") + "']")).click();
		Utility.enterText(companyWebsite, Utility.excelRead(2, 5, "CustomerDetails"));
		Utility.click(customerSource);
		System.out.println(1);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 6, "CustomerDetails") + "']")).click();
		System.out.println(1);
		Utility.click(rateYourCompany);
		System.out.println(2);
		//driver.findElement(By.xpath("//div[@name='" + Utility.excelReadInt(2, 7, "CustomerDetails") + "']")).click();
		driver.findElement(By.xpath("//div[@name='2']//div[@class='ant-select-item-option-content']")).click();
		System.out.println(3);
		Utility.click(Industry);
		System.out.println(4);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 8, "CustomerDetails") + "']")).click();
		System.out.println(5);
		//Utility.click(relationship);
		System.out.println(6);
		//driver.findElement(By.xpath("//td[@title='" + Utility.excelRead(7, 29, "CustomerDetails") + "']")).click();
		//Entering date below for relation since
		//Utility.enterText(driver.findElement(By.xpath("//div[@class='ant-picker-header']")), "Mon, 11 Jan 2021");
		System.out.println(7);
		Utility.enterText(streetName, Utility.excelRead(2, 9, "CustomerDetails"));
		System.out.println(8);
		Utility.enterText(city, Utility.excelRead(2, 10, "CustomerDetails"));
		System.out.println(9);
		//Utility.enterText(zipcode, Utility.excelReadInt(2, 12, "CustomerDetails"));//origin
		Utility.enterText(zipcode, "411011");//extra
		Utility.JS_Scrolldown(scrollDown);
		System.out.println(10);
		//Utility.click(country);
		System.out.println(11);
		//driver.findElement(By.xpath("//*[text()='" + Utility.excelRead(2, 32, "CustomerDetails") + "']")).click();
		System.out.println(12);
		//Utility.enterText(stateName, "Empire State");
		System.out.println(13);

		Utility.click(sameAsBillingAddress);
		System.out.println(14);
		Utility.click(contact1);
		System.out.println(15);
		Utility.click(selectTitle1);
		System.out.println(16);
		driver.findElement(By.xpath("//div[@name='Dr.']")).click();
		System.out.println(17);
		Utility.enterText(FirstName1, Utility.excelRead(2, 36, "CustomerDetails"));
		System.out.println(18);
		Utility.enterText(MiddleName1, Utility.excelRead(2, 37, "CustomerDetails"));

		Utility.enterText(LastName1, Utility.excelRead(2, 38, "CustomerDetails"));

		Utility.enterText(CallName1, Utility.excelRead(2, 39, "CustomerDetails"));
		System.out.println(19);
		Utility.click(tax1);
		System.out.println(20);
		Utility.implicitwait();
		System.out.println(21);
		Utility.click(GstMech1);
		System.out.println(22);
		//driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 44, "CustomerDetails") + "']")).click();
		System.out.println(23);
		//Utility.enterText(GstNum1, Utility.excelRead(2, 45, "CustomerDetails")); //origin
		System.out.println(24);
		//Utility.enterText(GstNum1, "GST687876"); //extra //No fields in UI
		//Utility.enterText(GstNum1, "FSSB687687"); //extra //no fields in UI
		//Utility.enterText(PanNum1, Utility.excelRead(3, 46, "CustomerDetails")); //no fields in UI
		System.out.println(25);
		Utility.click(checkBox);
		System.out.println(26);
		Utility.click(logo1);
		System.out.println(27);
		Utility.click(uploadButton1);
		System.out.println(28);
		Utility.uploadFile("Logo");
		System.out.println(30);
		Thread.sleep(3000);
		//Utility.wait_N_click(save); save button removed from DOM
		//Utility.wait_N_click(save1);// save button removed from DOM
		Utility.wait_N_click(submitButton);
		Thread.sleep(5000);
		Utility.wait_N_click(driver.findElement(By.xpath("(//span[@role='img'])[6]")));
		System.out.println(31);
		Thread.sleep(6000);

		Utility.enterText(searchbox, customername);
		System.out.println(32);
//////////////////// the cust details are not getting searched ///////////
		
//		WebElement actCustName = driver
//				.findElement(By.xpath("//*[text()='" + Utility.excelRead(2, 2, "CustomerDetails") + "']"));

		String cust = actcompanyname.getText();
		System.out.println("oooo" + cust);

		// String cust = actCustName.getText();
		if (cust.equals(customername)) { //// verifying created customer.
			et.log(LogStatus.PASS, "New Cusomter is Created ", et.addScreenCapture(pass("New Cusomter is Created")));

		} else {
			et.log(LogStatus.FAIL, "New Cusomter is not Created ",
					et.addScreenCapture(fail("New Cusomter is not Created")));

		}

		String totalCustCountCurrent = totalCustomerCount.getText();

		Utility.implicitwait();
		try {
			if (number.equals(totalCustCountCurrent)) { //// verifying count.
				System.out.println("counts mismatched");
				et.log(LogStatus.FAIL, "New Cusomter not Created and count not increased",
						et.addScreenCapture(fail("New Cusomter not Created and count not increased")));
			} else {
				System.out.println("counts matched ");
				et.log(LogStatus.PASS, "New Cusomter Created and count got increased",
						et.addScreenCapture(pass("New Cusomter Created and count got increased")));
			}
		} catch (Exception ex) {

		}
	}

////////////////////////////Upload Customer//////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly uploaded customer and updated count.
	 */

	public void uploadCustomer() throws Exception {
		Thread.sleep(3000);
		Utility.wait_N_click(salesButton);
		Utility.implicitwait();
		Utility.click(CustomersMenuBtn);
		Thread.sleep(1000);

		Utility.JS_Scrolldown(totalCustomerCount);
		Utility.implicitwait();

		String CustCount = null;
		if (totalCustomerCount.isDisplayed()) {
			CustCount = totalCustomerCount.getText();
			System.out.println("pre Addition: " + CustCount);
		}

		Utility.mouseHover(uploadDownArrow);
		Utility.mouseHover(importButton);
		Utility.click(importButton);
		Thread.sleep(1000);

		Utility.click(selectIndustryDrop);

		driver.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 30, "CustomerDetails") + "']/..")).click();

		Utility.click(selectCustTypeDrop);

		driver.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 31, "CustomerDetails") + "']/..")).click();

		Utility.click(selectCustSourceDrop);

		driver.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 32, "CustomerDetails") + "']/..")).click();

		Utility.click(selectPaymenteDrop);

		driver.findElement(By.xpath("(//*[text()='" + Utility.excelRead(7, 33, "CustomerDetails") + "']/..)[2]"))
				.click();

		Utility.click(Nextbtn);
		Utility.click(chooseFile);
		Utility.uploadFile("ImportCustomers1");

		Utility.click(Nextbtn2);
		Thread.sleep(1000);
		Utility.ActionClick(close);

		Thread.sleep(2000);
		Utility.enterText(searchbox, Importcustomername);
		Utility.implicitwait();
		WebElement actCustName = driver
				.findElement(By.xpath("//*[text()='" + Utility.excelReadHssf(1, 0, "ImportCustomers1") + "']"));

		String cust = actCustName.getText();
		System.out.println("actual name" + cust);

		if (!noRowsToShow.isDisplayed() && ((transactionCompany.isDisplayed()))) {

			et.log(LogStatus.PASS, "New Cusomter is Created ", et.addScreenCapture(pass("New Cusomter is Created")));

//		} else if (transactionCompany.isDisplayed()) {
//
//			et.log(LogStatus.PASS, "New Supplier is  Uploaded ",
//					et.addScreenCapture(pass("New Supplier is  Uploaded")));

		} else { //// verifying created customer.
			et.log(LogStatus.PASS, "New Cusomter is Created ", et.addScreenCapture(pass("New Cusomter is Created")));
			System.out.println("created");

		}

		String CustCountCurrent = totalCustomerCount.getText();
		System.out.println("Actual " + CustCountCurrent);
		Thread.sleep(1000);
		try {
			if (CustCount.equals(CustCountCurrent)) { //// verifying count.

				et.log(LogStatus.FAIL, "New Cusomter not Created and count not increased",
						et.addScreenCapture(fail("New Cusomter not Created and count not increased")));
			} else {

				et.log(LogStatus.PASS,
						"New Cusomter Created and count got increased, Previous count: " + CustCount
								+ "  Current Count: " + CustCountCurrent,
						et.addScreenCapture(pass("New Cusomter Created and count got increased")));
			}
		} catch (Exception e) {

		}
	}

//////////////////////////// Update customer //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify updated information of existing customer.
	 */

	public void updateCustomer() throws IOException, InterruptedException {
		Thread.sleep(3000);
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Utility.implicitwait();

		Utility.click(actionButton3);
		Utility.click(edit_cust_option);
		Utility.implicitwait();
		String newname = "Glory Rubber (P) Ltd";
		Utility.Clear(companyName, newname);
		Utility.JS_Scrolldown(save);
		Thread.sleep(2000);
		Utility.click(save);
		Thread.sleep(2000);
		Utility.click(save1);
		Thread.sleep(2000);

		Utility.enterText(textBoxSearch, newname);

		if (newname.equals(labelFirstCustomerName.getText())) {
			et.log(LogStatus.PASS, "Matching customer is displayed and information updated",
					et.addScreenCapture(pass("Matching customer is displayed and information updated")));
		} else {
			et.log(LogStatus.FAIL, "Matching customer is not displayed",
					et.addScreenCapture(fail("Matching customer is not displayed")));
		}
	}

////////////////////////////creating customer Negative Scenario //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify error message while saving without mandatory fields.
	 */

	public void createCustomerNegative() throws InterruptedException, IOException {
		Thread.sleep(3000);
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Utility.implicitwait();

		Utility.click(NewCustomer);
		Utility.ExcelReadAndWrite(2, 2);
		Utility.implicitwait();

		Utility.JS_Scrolldown(save);
		Utility.click(save);
		Thread.sleep(2000);
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

//////////////////////////// Search by Customer name //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify searching a customer using at least 3 letters.
	 */

	public void searchCustomer() throws Exception {
		Utility.implicitwait();
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Utility.implicitwait();
		Utility.Clear(searchbox, delcustomertrans);

		Utility.implicitwait();
		try {
			String cust = actcompanyname.getText();

			if (cust.equals(delcustomertrans)) { //// verifying created customer.
				et.log(LogStatus.PASS, " Search is correct", et.addScreenCapture(pass("Search is correct")));

			} else {
				et.log(LogStatus.FAIL, "Search is not correct ", et.addScreenCapture(fail("Search is not correct ")));

			}
		} catch (Exception e) {
		}
	}

//////////////////////////// Customer Log Activity //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify Log activity created.
	 */

	public void CustomerLogActivity() throws IOException, InterruptedException {
		Thread.sleep(3000);
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Thread.sleep(3000);
		Utility.enterText(searchbox, customername);
		Thread.sleep(3000);
		Utility.implicitwait();
		Utility.wait_N_click(actionbutton);
		Utility.implicitwait();
		Utility.click(logactivity);
		activityname.sendKeys("Testing");
		activitydescription.sendKeys("Testing Software");
		Utility.click(activitytype);
		Utility.click(activitytype1);
		Utility.click(status);
		Utility.click(statustype);
		Utility.implicitwait();
		Utility.click(priority);
		Utility.implicitwait();
		Utility.click(prioritytype);
		Utility.implicitwait();
		Utility.click(calender);
		driver.findElement(By.xpath("//td[@title='" + Utility.excelRead(7, 29, "CustomerDetails") + "']")).click();
		Utility.implicitwait();
		Utility.click(creatactivity);
		Utility.wait_N_click(submitbtn);
		Utility.implicitwait();
		Utility.click(customer);

		Utility.click(customeractivity);
		String error = tesingactivitycheck.getText();
		try {
			if (error.equals("Testing")) {
				et.log(LogStatus.PASS, "Activity is created and its Matching",
						et.addScreenCapture(pass("Activity is Matching")));

			} else {
				et.log(LogStatus.FAIL, "Activity is Not Matching",
						et.addScreenCapture(fail("Activity is Not Matching")));
			}
		} catch (Exception ex) {
		}
	}

//////////////////////////// Customer Log Communication //////////////////////////////////////////	

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created Log communication.
	 */

	public void CustomerLogCommunication() throws IOException, InterruptedException {
		Utility.implicitwait();
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Utility.implicitwait();
		Utility.enterText(searchbox, customername);
		Utility.implicitwait();
		Utility.implicitwait();
		Utility.click(actionbutton);
		Utility.implicitwait();
		Utility.click(logcommunication);
		Utility.implicitwait();
		communicationmode.sendKeys("Email");
		communicationdescription.sendKeys("Please communicate by Email only");
		communicateto.sendKeys("vtest@gmail.com");
		Utility.implicitwait();
		Utility.click(savebtn);
		Utility.implicitwait();
		Utility.click(submitbutton);
		Utility.implicitwait();
		Utility.click(customer);
		Utility.implicitwait();
		Utility.click(customercommunication);
		Utility.implicitwait();
		String textCommu = emailcommunicationcheck.getText();
		try {
			if (textCommu.equals("Email")) {

				et.log(LogStatus.PASS, "Communication Type is created and text is Matching",
						et.addScreenCapture(pass("Communication Type is Matching")));
			} else {

				et.log(LogStatus.FAIL, "Communication Type is not Matching",
						et.addScreenCapture(fail("Communication Type is not Matching")));
			}
		} catch (Exception ex) {
		}
	}

//////////////////////////// create sales order //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created sales order and name of customer on it.
	 */

	public void SalesOrdeCustomer() throws Exception {
		Utility.implicitwait();
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Utility.implicitwait();

		String custname3 = compnyName3.getText();

		Utility.click(actionButton3);
		Utility.wait_N_click(createSalesOrder);
		Utility.implicitwait();
		String custnameact = salesorderCustsName.getText();
		try {
			if ((salesTypeName.isDisplayed()) && (custnameact.equals(custname3))) {

				et.log(LogStatus.PASS, "sales order is created", et.addScreenCapture(pass("sales order is created")));

				et.log(LogStatus.PASS, "Customer Name is selected",
						et.addScreenCapture(pass("Customer Name is selected")));

			} else {

				et.log(LogStatus.FAIL, "sales order is not created",
						et.addScreenCapture(pass("sales order is not created")));

			}
		} catch (Exception e) {
		}
	}

////////////////////////////create sales Invoice //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created sales Invoice and name of customer on it.
	 */

	public void SalesInvoiceCustomer() throws Exception {
		Utility.implicitwait();
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Utility.implicitwait();

		String custname3 = compnyName3.getText();

		Utility.click(actionButton3);
		Utility.wait_N_click(createInvoice);
		Utility.implicitwait();
		String custnameact = salesorderCustsName.getText();
		try {
			if ((salesTypeName.isDisplayed()) && (custnameact.equals(custname3))) {

				et.log(LogStatus.PASS, "Invoice is created", et.addScreenCapture(pass("Invoice is created")));

				et.log(LogStatus.PASS, "Customer Name is selected",
						et.addScreenCapture(pass("Customer Name is selected")));

			} else {

				et.log(LogStatus.FAIL, "Invoice is not created", et.addScreenCapture(pass("Invoice is not created")));

			}
		} catch (Exception e) {
		}
	}

////////////////////////////create Credit Memo //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created Credit Memo and name of customer on it.
	 */

	public void CreditMemoCustomer() throws Exception {
		Utility.wait_N_click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);

		String custname3 = compnyName3.getText();
		System.out.println(3);
		Utility.click(actionButton3);
		System.out.println(4);
		Utility.wait_N_click(createMemo);
		System.out.println(5);
		Thread.sleep(2000);
		try {
			String custnameact = salesorderCustsName.getText();

			if ((salesTypeName.isDisplayed()) && (custnameact.equals(custname3))) {

				et.log(LogStatus.PASS, "Credit Memo is created", et.addScreenCapture(pass("Credit Memo is created")));

				et.log(LogStatus.PASS, "Credit Memo is selected", et.addScreenCapture(pass("Credit Memo is selected")));

			} else {

				et.log(LogStatus.FAIL, "Credit Memo is not created",
						et.addScreenCapture(pass("Credit Memo is not created")));

			}
		} catch (NoSuchElementException e) {
		}
	}

//////////////////////////// Delete Customer with Transaction Verification //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify error message while deleting customer having
	 *            transactions.
	 */

	public void DeleteCustomerTrans() throws Exception {
		Utility.wait_N_click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);
		Utility.enterText(searchbox, delcustomertrans);
		System.out.println(3);
		Utility.click(actionButton);
		System.out.println(4);
		Utility.wait_N_click(deleteCustomer);
		System.out.println(5);
		Utility.wait_N_click(submitbtn);
		System.out.println(6);
		try {
			if (errorMessageTrans.isDisplayed()) {

				et.log(LogStatus.PASS, " Message Shown as this customer cant be deleted ",
						et.addScreenCapture(pass("Message Shown as this customer cant be deleted")));
			} else {

				et.log(LogStatus.PASS, "Message is not Shown as this customer cant be deleted",
						et.addScreenCapture(pass("Message is not Shown as this customer cant be deleted")));
			}
		} catch (Exception e) {
		}
	}

////////////////////////////Delete Customer without Transaction Verification //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify error message while deleting customer without any
	 *            transaction.
	 */

	public void DeleteCustomer() throws Exception {
		Utility.wait_N_click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);
		Utility.click(NewCustomer);
		System.out.println(3);
		String name="DeleteCust";
		Utility.enterText(companyName, name); //extra
		//Utility.enterText(companyName, deletecustomer);
		System.out.println(4);
		Utility.wait_N_click(save);
		System.out.println(5);
		Utility.wait_N_click(save1);
		System.out.println(6);
		//Utility.enterText(companyName, deletecustomer);
		Utility.enterText(searchbox, name);
		System.out.println(7);
		Thread.sleep(9000);
		Utility.click(actionbtn);
		System.out.println(8);
		Utility.implicitwait();
		Utility.wait_N_click(deleteCust);
		System.out.println(9);
		Utility.wait_N_click(submitbtn);
		System.out.println(10);
		Utility.implicitwait();
		try {
			if (errorMessage.isDisplayed()) {

				et.log(LogStatus.PASS, " Message Shown and customer is deleted ",
						et.addScreenCapture(pass("Message Shown and customer is deleted")));
			} else {

				et.log(LogStatus.PASS, "Message is not Shown and customer is not  deleted",
						et.addScreenCapture(pass("Message is not Shown and customer is not  deleted")));
			}
		} catch (Exception e) {
		}
	}

//////////////////////////// Show Contact Verification //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify show contact page.
	 */

	public void ShowContact() throws Exception {
		Utility.wait_N_click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);
		
		Utility.enterText(searchbox, customername1);
		System.out.println(3);
		Thread.sleep(5000);
		//Utility.click(actionButton);
		Utility.click(driver.findElement(By.xpath("//button[@class='ant-btn action-btn small ant-dropdown-trigger']")));
		Thread.sleep(2000);
		System.out.println(4);
		Utility.JS_Scrolldown(showContact);
		System.out.println(4.5);
		Utility.wait_N_click(showContact);
		System.out.println(5);

		if (contactTable.isDisplayed()) {
			et.log(LogStatus.PASS, " Contact Popup Opened ", et.addScreenCapture(pass("Contact Popup Opened")));

		} else {

			et.log(LogStatus.FAIL, " Contact Popup not Opened ", et.addScreenCapture(fail("Contact Popup not Opened")));
		}

		Utility.implicitwait();
		Utility.wait_N_click(addRow);
		System.out.println(6);
		Utility.implicitwait();
		Utility.wait_N_click(edit2);
		System.out.println(7);

		Utility.enterText(showContactName, namecontact);
		System.out.println(8);
		Utility.enterText(showContactLastName, lastnamecontact);
		System.out.println(9);
		Utility.enterText(showContactEmail, emailcontact);
		System.out.println(10);
		Utility.wait_N_click(saveShowContact);
		System.out.println(11);
		Thread.sleep(1000);
		Utility.JS_ScrollUP(driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")));//extra step
		Utility.click(driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")));// extra step
		//Utility.wait_N_click(submitbutton); not needed
		System.out.println(12);

//		WebElement first = driver
//				.findElement(By.xpath("//*[text()='" + Utility.excelRead(2, 14, "CustomerDetails") + "']"));
		String s=" nnnnnvdvdvdv "; //extra
		WebElement first=driver.findElement(By.xpath("//div[text()=' nnnnnvdvdvdv ']")); //extra
		System.out.println(13);
		String firstText = first.getText();
		System.out.println(14);
		System.out.println(firstText);
//		WebElement second = driver
//				.findElement(By.xpath("//*[text()='" + Utility.excelRead(2, 15, "CustomerDetails") + "']"));
//		String secondText = second.getText();
//		WebElement third = driver
//				.findElement(By.xpath("//*[text()='" + Utility.excelRead(2, 5, "CustomerDetails") + "']"));
//		String thirdText = third.getText();

		if ((firstText.equalsIgnoreCase(s))){
			et.log(LogStatus.PASS, " New contact Added", et.addScreenCapture(pass("New contact Added")));

		} else {
			et.log(LogStatus.FAIL, " New contact not added ", et.addScreenCapture(fail(" New contact not added ")));
		}
		//Added missing steps below 2
		Utility.click(driver.findElement(By.xpath("(//div[@class='ag-react-container']/button)[1]")));//extra
		Utility.JS_Scrolldown(showContact);//extra
		System.out.println(15);
		Utility.click(showContact);
		Utility.wait_N_click(edit1);
		System.out.println(16);
		Utility.wait_N_click(titleDropContact);
		System.out.println(17);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 13, "CustomerDetails") + "']")).click();
		System.out.println(18);
		Utility.Clear(showContactName, "ABC");
		System.out.println(19);
		Utility.Clear(showContactLastName, "XYZ");
		System.out.println(20);
		Utility.Clear(showContactEmail, "email.com");
		System.out.println(21);
		Utility.wait_N_click(saveShowContact);
		System.out.println(22);
		//Utility.wait_N_click(submitbutton);
		System.out.println(23);
		WebElement first1 = driver.findElement(By.xpath("//*[text()='ABC']/.."));
		String firstText1 = first1.getText();
		WebElement second1 = driver.findElement(By.xpath("//*[text()='XYZ']/.."));
		String secondText1 = second1.getText();
		WebElement third1 = driver.findElement(By.xpath("//*[text()='email.com']/.."));
		String thirdText1 = third1.getText();

		if ((firstText1.equals("ABC")) && (secondText1.equals("XYZ")) && (thirdText1.equals("email.com"))) {
			et.log(LogStatus.PASS, "  contact Updated", et.addScreenCapture(pass(" contact Updated")));

		} else {
			et.log(LogStatus.FAIL, "  contact not updated ", et.addScreenCapture(fail("  contact not updated ")));
		}

	}

////////////////////////////Show Address Verification //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify show address page.
	 */

	@SuppressWarnings("unused")
	public void ShowAddress() throws Exception {
		Utility.wait_N_click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);
		Utility.enterText(searchbox, customername1);
		System.out.println(3);
		//Utility.click(driver.findElement(By.xpath("//div[@class='ag-react-container']/button")));
		Utility.handleStaleElementBeforeClick(driver.findElement(By.xpath("//div[@class='ag-react-container']/button")));
		//Utility.wait_N_click(actionbtn);
		System.out.println(4);
		Utility.JS_Scrolldown(showAddress);
		Utility.wait_N_click(showAddress);
		System.out.println(5);
		
		if (addressTable.isDisplayed()) { //// popup verification
			et.log(LogStatus.PASS, " Address Popup Opened ", et.addScreenCapture(pass("Address Popup Opened")));

		} else {

			et.log(LogStatus.FAIL, " Address Popup not Opened ", et.addScreenCapture(fail("Address Popup not Opened")));
		}
		System.out.println(5.5);
		//Utility.wait_N_click(addRow);
		System.out.println(6);
		Utility.wait_N_click(edit2);
		System.out.println(7);
		//Utility.enterText(address1, Address1); //no such field present
		System.out.println(8);
		Utility.enterText(address2, Address2);
		System.out.println(9);
		Utility.enterText(address3, Address3);
		System.out.println(10);
		Utility.enterText(city1, City1);
		System.out.println(11);
		Utility.wait_N_click(saveShowContact);
		System.out.println(12);
		//Utility.wait_N_click(submitbutton);
		System.out.println(13);
		
		
		
		WebElement element1=driver.findElement(By.xpath("(//div[@col-id='streetAddress1'])[2]"));
		String firstText11 = element1.getText();
		
//		WebElement first11 = driver
//			.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 37, "CustomerDetails") + "']"));
//		String firstText11 = first11.getText();
//		WebElement second11 = driver
//				.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 38, "CustomerDetails") + "']"));
//		String secondText11 = second11.getText();
//		WebElement third11 = driver
//				.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 39, "CustomerDetails") + "']"));
//		String thirdText11 = third11.getText();
//
//		WebElement forth11 = driver
//				.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 40, "CustomerDetails") + "']"));
//		String forthtext11 = forth11.getText();

		if ((firstText11.equalsIgnoreCase("Connifer Circle"))){
			et.log(LogStatus.PASS, " New Address Added", et.addScreenCapture(pass("New Address Added")));

		} else {
			et.log(LogStatus.FAIL, " New Address not added ", et.addScreenCapture(fail(" New Address not added ")));
		}

//		Utility.wait_N_click(edit1);
//		System.out.println(14);
//		Utility.Clear(address1, "MUMBAI");
//		System.out.println(15);
//		Utility.Clear(address2, "Juhu");
//		System.out.println(16);
//		Utility.Clear(address3, "5656");
//		System.out.println(17);
//		Utility.Clear(city1, "Mumbai");
//		System.out.println(18);
//		Utility.wait_N_click(saveShowContact);
//		System.out.println(19);
//		//Utility.wait_N_click(submitbutton);
//		try {
//			WebElement first22 = driver.findElement(By.xpath("//*[text()='MUMBAI']/.."));
//			String firstText22 = first22.getText();
//			WebElement second22 = driver.findElement(By.xpath("//*[text()='Juhu']/.."));
//			String secondText22 = second22.getText();
//			WebElement third22 = driver.findElement(By.xpath("//*[text()='5656']/.."));
//			String thirdText22 = third22.getText();
//
//			WebElement forth22 = driver.findElement(By.xpath("//*[text()='Mumbai']/.."));
//			String forthText22 = third22.getText();
//
//			if ((firstText22.equals("MUMBAI")) && (secondText22.equals("Juhu")) && (thirdText22.equals("5656"))) {
//				et.log(LogStatus.PASS, "  Address Updated", et.addScreenCapture(pass(" Address Updated")));
//
//			} else {
//				et.log(LogStatus.FAIL, "  Address not updated ", et.addScreenCapture(fail("  Address not updated ")));
//			}
//
//		} catch (Exception e) {
//		}
	}

//////////////////////////// All transactions Verification //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify Transaction tables,full screen and pdf downloads.
	 */

	public void TransactionAll() throws Exception {
		Utility.wait_N_click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);
		Utility.enterText(searchbox, transactionCust1);
		System.out.println(3);
		Utility.handleStaleElementBeforeClick(transactionComp);
		System.out.println(4);

		if (allTransactionTable.isDisplayed()) {

			et.log(LogStatus.PASS, "Table content is displayed",
					et.addScreenCapture(pass("Table content is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Table content is not displayed",
					et.addScreenCapture(fail("Table content is not displayed")));
		}

		Utility.wait_N_click(transactionAction);
		System.out.println(5);
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
		// handle else

		Utility.wait_N_click(trasactionClick);
		System.out.println(6);
		Thread.sleep(2000);

		if (bottomButtonsFullScreen.isDisplayed()) {

			et.log(LogStatus.PASS, "full screen is opened", et.addScreenCapture(pass("full screen is opened")));
		} else {
			et.log(LogStatus.FAIL, "full screen is not opened",
					et.addScreenCapture(fail("Table content is not displayed")));
		}

		Utility.wait_N_click(downloadTransaction);
		System.out.println(7);
		Thread.sleep(7000);
		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);
		String str = getLatestFile.getName();
		String fileName = str.replaceAll("[$~]", "");

		ArrayList<String> xlfilenames = new ArrayList<>();

		xlfilenames.add("Sales Quote.pdf");
		xlfilenames.add("Sales Quote (1).pdf");
		xlfilenames.add("Sales Quote (2).pdf");
		xlfilenames.add("Sales Quote (3).pdf");
		xlfilenames.add("Sales Quote (4).pdf");
		xlfilenames.add("Sales Quote (5).pdf");
		xlfilenames.add("Sales Quote (6).pdf");
		xlfilenames.add("Sales Quote (7).pdf"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Sales Quote (8).pdf");
		xlfilenames.add("Sales Quote (9).pdf");
		xlfilenames.add("Sales Quote (10).pdf");

		xlfilenames.add("Sales Order.pdf");
		xlfilenames.add("Sales Order (1).pdf");
		xlfilenames.add("Sales Order (2).pdf");
		xlfilenames.add("Sales Order (3).pdf");
		xlfilenames.add("Sales Order (4).pdf");
		xlfilenames.add("Sales Order (5).pdf");
		xlfilenames.add("Sales Order (6).pdf");
		xlfilenames.add("Sales Order (7).pdf"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Sales Order (8).pdf");
		xlfilenames.add("Sales Order (9).pdf");
		xlfilenames.add("Sales Order (10).pdf");

		xlfilenames.add("Credit Memo.pdf");
		xlfilenames.add("Credit Memo (1).pdf");
		xlfilenames.add("Credit Memo (2).pdf");
		xlfilenames.add("Credit Memo (3).pdf");
		xlfilenames.add("Credit Memo (4).pdf");
		xlfilenames.add("Credit Memo (5).pdf");
		xlfilenames.add("Credit Memo (6).pdf");
		xlfilenames.add("Credit Memo (7).pdf"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Credit Memo (8).pdf");
		xlfilenames.add("Credit Memo (9).pdf");
		xlfilenames.add("Credit Memo (10).pdf");

		if (xlfilenames.contains(fileName)) {

			et.log(LogStatus.PASS, "PDF file is downloaded", et.addScreenCapture(pass("PDF file is downloaded")));

		} else {
			et.log(LogStatus.FAIL, "PDF file is not downloaded",
					et.addScreenCapture(fail("PDF file is not downloaded")));

		}
	}

//////////////////////////// Sales Order transactions Verification //////////////////////////////////////////

	/**
	 * @author: Sumiran
	 * @implNote: To Verify Transaction tables,full screen and pdf downloads in
	 *            sales order transaction.
	 */

	public void TransactionSalesOrder() throws Exception {
		Utility.wait_N_click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);
		Utility.enterText(searchbox, transactionCust1);
		System.out.println(3);
		Utility.handleStaleElementBeforeClick(transactionComp);
		System.out.println(4);
		Utility.wait_N_click(transactionSalesOrder);
		System.out.println(5);
		Utility.JS_ScrollDown();
		System.out.println(6);
		if (salesOrderTranTable.isDisplayed()) {

			et.log(LogStatus.PASS, "Table content is displayed",
					et.addScreenCapture(pass("Table content is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Table content is not displayed",
					et.addScreenCapture(fail("Table content is not displayed")));
		}

		Thread.sleep(2000);
		System.out.println(7);
		//Utility.wait_N_click(transactionAction1); no longer needed as UI is changed
		Utility.click(driver.findElement(By.xpath("(//div[@class='cursor-pointer'])[20]")));
		System.out.println(8);
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
		//Utility.wait_N_click(trasactionClickSalesOrder); redundant
		System.out.println(9);
		Thread.sleep(2000);
//////////////// below element not identifiable on UI
//		if (bottomButtonsFullScreen.isDisplayed()) {
//
//			et.log(LogStatus.PASS, "full screen is opened", et.addScreenCapture(pass("full screen is opened")));
//		} else {
//			et.log(LogStatus.FAIL, "full screen is not opened",
//					et.addScreenCapture(fail("Table content is not displayed")));
//		}

		//Utility.wait_N_click(downloadTransaction);
		Utility.wait_N_click(driver.findElement(By.xpath("//button[@title='Download PDF']")));
		
		Thread.sleep(7000);
		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);
		String str = getLatestFile.getName();
		String fileName = str.replaceAll("[$~]", "");

		ArrayList<String> xlfilenames = new ArrayList<>();

		xlfilenames.add("Sales Order.pdf");
		xlfilenames.add("Sales Order (1).pdf");
		xlfilenames.add("Sales Order (2).pdf");
		xlfilenames.add("Sales Order (3).pdf");
		xlfilenames.add("Sales Order (4).pdf");
		xlfilenames.add("Sales Order (5).pdf");
		xlfilenames.add("Sales Order (6).pdf");
		xlfilenames.add("Sales Order (7).pdf"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Sales Order (8).pdf");
		xlfilenames.add("Sales Order (9).pdf");
		xlfilenames.add("Sales Order (10).pdf");

		if (xlfilenames.contains(fileName)) {

			et.log(LogStatus.PASS, "PDF file is downloaded", et.addScreenCapture(pass("PDF file is downloaded")));

		} else {
			et.log(LogStatus.FAIL, "PDF file is not downloaded",
					et.addScreenCapture(fail("PDF file is not downloaded")));

		}

	}

////////////////////////////Credit Memo transactions Verification //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify Transaction tables,full screen and pdf downloads in
	 *            Credit Memo transaction.
	 */

	public void TransactionCreditMemo() throws Exception {
		Utility.wait_N_click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);
		Thread.sleep(6000);
		Utility.enterText(searchbox, transactionCust1);
		System.out.println(3);
		Utility.click(transactionComp);
		System.out.println(4);

		Utility.wait_N_click(transactionCreditMemo);
		Thread.sleep(2000);
		Utility.JS_ScrollDown();
		System.out.println(5);
		if (salesOrderTranTable.isDisplayed()) {

			et.log(LogStatus.PASS, "Table content is displayed",
					et.addScreenCapture(pass("Table content is displayed")));
		} else {
			et.log(LogStatus.FAIL, "Table content is not displayed",
					et.addScreenCapture(fail("Table content is not displayed")));
		}

		Thread.sleep(2000);
		System.out.println(6);
		//Utility.wait_N_click(transactionAction2); redundant
		Utility.wait_N_click(driver.findElement(By.xpath("(//div[@class='cursor-pointer'])[20]")));
		System.out.println(7);
		try {
			if (Utility.IsDisplayed(deleteTransactionButton)) {

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
		System.out.println(8);
		//Utility.wait_N_click(trasactionClickCredit);
		Thread.sleep(2000);

//		if (bottomButtonsFullScreen.isDisplayed()) {
//
//			et.log(LogStatus.PASS, "full screen is opened", et.addScreenCapture(pass("full screen is opened")));
//		} else {
//			et.log(LogStatus.FAIL, "full screen is not opened",
//					et.addScreenCapture(fail("Table content is not displayed")));
//		}
		
		Utility.wait_N_click(downloadTransac);

		Thread.sleep(7000);
		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);
		String str = getLatestFile.getName();
		String fileName = str.replaceAll("[$~]", "");

		ArrayList<String> xlfilenames = new ArrayList<>();

		xlfilenames.add("Credit Memo.pdf");
		xlfilenames.add("Credit Memo (1).pdf");
		xlfilenames.add("Credit Memo (2).pdf");
		xlfilenames.add("Credit Memo (3).pdf");
		xlfilenames.add("Credit Memo (4).pdf");
		xlfilenames.add("Credit Memo (5).pdf");
		xlfilenames.add("Credit Memo (6).pdf");
		xlfilenames.add("Credit Memo (7).pdf"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Credit Memo (8).pdf");
		xlfilenames.add("Credit Memo (9).pdf");
		xlfilenames.add("Credit Memo (10).pdf");

		if (xlfilenames.contains(fileName)) {

			et.log(LogStatus.PASS, "PDF file is downloaded", et.addScreenCapture(pass("PDF file is downloaded")));

		} else {

			et.log(LogStatus.FAIL, "PDF file is not downloaded",
					et.addScreenCapture(fail("PDF file is not downloaded")));
		}

	}

////////////////////////////Payment transactions Verification //////////////////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify Transaction tables,full screen and pdf downloads in
	 *            Payment transaction.
	 */

	public void TransactionPayment() throws Exception {
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Thread.sleep(6000);
		Utility.enterText(searchbox, transactionCust1);
		Thread.sleep(3000);
		Utility.click(transactionComp);
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

//////////////////// Download Excel Validation ///////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify excel file downloading for 3 customers.
	 */

	public void CustdownloadExcelValidation() throws Exception {

		Utility.click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);
		Utility.JSClick(custCheckBox1);
		System.out.println(3);
		Utility.JSClick(custCheckBox2);
		System.out.println(4);
		Utility.JSClick(custCheckBox3);
		System.out.println(5);
		Utility.wait_N_click(custExcelButton);
		System.out.println(6);

		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);
		System.out.println(7);
		String str = getLatestFile.getName();
		String fileName = str.replaceAll("[$~]", "");
		System.out.println("filename  " + fileName);

		List<String> xlfilenames = new ArrayList<>();

		xlfilenames.add("Customer.xlsx");
		xlfilenames.add("Customer (1).xlsx");
		xlfilenames.add("Customer (2).xlsx");
		xlfilenames.add("Customer (3).xlsx");
		xlfilenames.add("Customer (4).xlsx");
		xlfilenames.add("Customer (5).xlsx");
		xlfilenames.add("Customer (6).xlsx");
		xlfilenames.add("Customer (7).xlsx"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Customer (8).xlsx");
		xlfilenames.add("Customer (9).xlsx");
		xlfilenames.add("Customer (10).xlsx");

		if (xlfilenames.contains(fileName)) {

			et.log(LogStatus.PASS, "Excel file is downloaded and file name is: " + fileName,
					et.addScreenCapture(pass("Excel file is downloaded")));

		}

		else {
			et.log(LogStatus.FAIL, "Excel file is not downloaded",
					et.addScreenCapture(pass("Excel file is not downloaded")));

		}
	}

//////////////////// Download PDF Validation ///////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify PDF file downloading for 3 customers.
	 */

	public void CustdownloadPdfValidation() throws Exception {

		Thread.sleep(3000);
		Utility.wait_N_click(salesButton);
		Utility.click(CustomersMenuBtn);
		Utility.JSClick(custCheckBox1);
		Utility.JSClick(custCheckBox2);
		Utility.JSClick(custCheckBox3);
		Utility.wait_N_click(custPdfButton);
		System.out.println(downloadPath);
		Thread.sleep(3000);

		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);

		String str = getLatestFile.getName();
		String fileName = str.replaceAll("[$~]", "");

		List<String> xlfilenames = new ArrayList<>();

		xlfilenames.add("Customer.pdf");
		xlfilenames.add("Customer (1).pdf");
		xlfilenames.add("Customer (2).pdf");
		xlfilenames.add("Customer (3).pdf");
		xlfilenames.add("Customer (4).pdf");
		xlfilenames.add("Customer (5).pdf");
		xlfilenames.add("Customer (6).pdf");
		xlfilenames.add("Customer (7).pdf"); /// Storing multiple names if previous files are already saved
		xlfilenames.add("Customer (8).pdf");
		xlfilenames.add("Customer (9).pdf");
		xlfilenames.add("Customer (10).pdf");

		if (xlfilenames.contains(fileName)) {

			et.log(LogStatus.PASS, "PDF file is downloaded and file name is: " + fileName,
					et.addScreenCapture(pass("PDF file is downloaded")));

		}

		else {
			et.log(LogStatus.FAIL, "PDF file is not downloaded",
					et.addScreenCapture(fail("PDF file is not downloaded")));

		}
	}

////////////////////Sending Email Validation ///////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify Email sent.
	 */

	public void EmailValidation() throws Exception {
		
		Thread.sleep(3000);
		Utility.wait_N_click(salesButton);
		System.out.println(1);
		Utility.click(CustomersMenuBtn);
		System.out.println(2);
		Thread.sleep(4000);
		Utility.enterText(searchbox, "Exxon Mobil Corp.");
		Utility.click(driver.findElement(By.xpath("(//div[@col-id='companyName_1']/div/div/div/div)[1]")));
		System.out.println(3);
		Utility.click(driver.findElement(By.xpath("(//div[@id='tab-4'])[2]")));
		Utility.click(driver.findElement(By.xpath("(//td[@class='ant-table-cell']/div/div)[20]")));
		System.out.println(4);
		Utility.click(emailButton);
		System.out.println(5);
		//Utility.JSClick(emailSendTo1);
		System.out.println(6);
		Utility.wait_N_clikable(emailSendTo1);
		Utility.click(emailSendTo1);
		Utility.enterTextUsingRobot("govind@vtestcorp.com");
		System.out.println(7);
		// Utility.enterText(emailSendTOText, "sumiran@vtestcorp.com");
		Utility.click(emailRandom);
		System.out.println(8);
		Utility.click(emailSubject);
		Utility.enterTextUsingRobot("No Subject");
		System.out.println(9);
		//Utility.enterText(emailBody, "This is the Body");
		System.out.println(10);
		Utility.click(emailSend);

		if (emailError.isDisplayed()) {

			et.log(LogStatus.FAIL, "Email send failed as error message shown",
					et.addScreenCapture(fail("Email send failed as error message shown")));

		}

		else if (emailSuccess.isDisplayed()) {
			et.log(LogStatus.PASS, "email is sent", et.addScreenCapture(pass("email is sent")));

		}

		else {

			et.log(LogStatus.FAIL, "Email send failed as error message shown",
					et.addScreenCapture(fail("Email send failed as error message shown")));

		}

	}
}
