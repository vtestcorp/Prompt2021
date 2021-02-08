package com.conversions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class POConversionsDetailsPage extends Base {

	@FindBy(xpath = "//li//i[@class='fa fa-plus']")
	public WebElement addButton;

	@FindBy(xpath = "//a[contains(text(),'Purchase Order')]")
	public WebElement purchaseOrderLink;

	@FindBy(xpath = "//a[contains(text(),'Purchase Invoice')]")
	public WebElement purchaseInvoiceLink;

	@FindBy(xpath = "//*[contains(text(),'Select Supplier')].")
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

	@FindBy(xpath = "(//div[@col-id=\"product\"])[3]")
	public WebElement Product1;

	@FindBy(xpath = "//*[@title=\"waxxe\"]/..")
	public WebElement ProductSelect1;
	///////// always keep index "2" for last number product and then so on.
	@FindBy(xpath = "(//div[@col-id=\"product\"])[2]") ///////// if 2 products are there then keep index 2 for second
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

/////////// Quantity /////////////

	@FindBy(xpath = "(//div[@col-id=\"ShippingAddress\"])[1]")
	public WebElement clickOther;

	@FindBy(xpath = "(//div[@col-id=\"qty\"])[3]")
	public WebElement Quantity1;

	@FindBy(xpath = "(//div[@col-id=\"qty\"])[2]")
	public WebElement Quantity2;

	@FindBy(xpath = "(//div[@col-id=\"qty_3\"])[2]")
	public WebElement QuantityInvoice;

	@FindBy(xpath = "//input[@role=\"spinbutton\"]")
	public WebElement textField;

	@FindBy(xpath = "//*[@class=\"currency-converter-modal\"]")
	public WebElement currencyConversion;

/////////// UOM /////////////

	@FindBy(xpath = "(//div[@col-id=\"uom_1\"])[3]")
	public WebElement UOM1;

	@FindBy(xpath = "//div[@name='Dozen']/..")
	public WebElement UomSelect1;

	@FindBy(xpath = "(//div[@col-id=\"uom_1\"])[2]")
	public WebElement UOM2;

	@FindBy(xpath = "//div[@name='Dozen']/..")
	public WebElement UomSelect2;

	@FindBy(xpath = "//*[text()='Add Line']")
	public WebElement addLine;

	@FindBy(xpath = "//*[text()='Select Supplier']/..")
	public WebElement selectSupplierDropdown;

	@FindBy(xpath = "(//div[@class=\"ant-select-item-option-content\"])[1]")
	public WebElement selectDropdownOption;
	
	@FindBy(xpath = "//div[@name='Brand Junction']")
	public WebElement selectBrandJunction;

	@FindBy(xpath = "(//div[@col-id=\"rate\"])[3]")
	public WebElement rate1;

	@FindBy(xpath = "(//div[@col-id=\"rate\"])[2]")
	public WebElement rate2;

	@FindBy(xpath = "//*[@class=\"close-icon\"]")
	public WebElement closeIcon;

	@FindBy(xpath = "(//*[@class=\"header-option menu-option-wrapper\"])[1]")
	public WebElement mainMenuOption;

	@FindBy(xpath = "(//*[text()='Purchase'])[1]")
	public WebElement purchaseTab;

	@FindBy(xpath = "//*[text()=' Purchase Order']")
	public WebElement purchaseOrderTab;

	@FindBy(xpath = "(//*[@col-id=\"status\"])[2]")
	public WebElement status;

	@FindBy(xpath = "(//*[@col-id=\"totalPOAmount\"])[2]")
	public WebElement amount;

	@FindBy(xpath = "(//*[@col-id=\"poNumber\"])[2]")
	public WebElement poLink;

	@FindBy(xpath = "//*[text()='Recieve Goods']/..")
	public WebElement receiveGoodsButton;

	@FindBy(xpath = "(//*[@class=\"fa fa-rupee\"])[2]")
	public WebElement rupeesIcon;

	@FindBy(xpath = "(//*[@class=\"fa fa-dollar\"])[1]")
	public WebElement dollarIcon;

	@FindBy(xpath = "(//*[@type=\"delete\"])[1]")
	public WebElement secondDeleteIcon;

	@FindBy(xpath = "(//*[@col-id=\"totalQtyReceived\"])[2]")
	public WebElement qtyReceived;

	@FindBy(xpath = "//*[text()='Multi Currency PO Template']/..")
	public WebElement selectMultiCurrency;

	@FindBy(xpath = "(//*[@class=\"ant-select-selection-search-input\"])[6]")
	public WebElement selectCurrencyDrop;
	
	@FindBy(xpath = "//input[contains(@aria-activedescendant,'rc_select_8_list')]")
	public WebElement selectCurrencyDrop1;
	
	@FindBy(xpath = "//span[text()='Select Currency']")
	public WebElement selectCurrencyDrop2;
	
	@FindBy(xpath = "//div[@name='USDUnited States']")
	public WebElement selectUSD;
	
	@FindBy(xpath = "//*[@placeholder=\"0.00\"]")
	public WebElement exchangeRate;

	public POConversionsDetailsPage() {
		PageFactory.initElements(driver, this);
	}

/////////////////////// Purchase Order Verification  /////////////////////////////

	/***
	 * @author: Sumiran
	 * @implNote: To Verify newly created sales order parameters.
	 */

	@SuppressWarnings("unused")
	public void purchaseOrderVerify() throws Exception {

		Utility.implicitwait();
		Utility.click(addButton);
		Utility.implicitwait();
		Utility.click(purchaseOrderLink);
		Utility.implicitwait();
		Utility.click(selectSupplierDropdown);
		Utility.wait_N_click(selectDropdownOption);
		Utility.implicitwait();
		Utility.click(clickOther);
		Utility.ScrollDownKey();
		Utility.ScrollDownKey();
		Utility.implicitwait();
		Utility.click(addLine);

		Utility.click(Product1);
		Utility.click(Product1);
		Utility.implicitwait();
		Utility.click(ProductSelect1);
		Utility.click(Quantity1);
		Quantity1.sendKeys("0050");
		Utility.implicitwait();
		rate1.sendKeys("00200");
		Utility.implicitwait();

		Utility.click(Product2);
		Utility.click(Product2);
		Utility.implicitwait();
		Utility.click(ProductSelect2);
		Quantity2.sendKeys("0050");
		Utility.implicitwait();
		rate2.sendKeys("00300");

		Utility.click(saveButton);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.implicitwait();
		Utility.click(closeIcon);
		Utility.click(mainMenuOption);
		Utility.click(purchaseTab);
		Utility.click(purchaseOrderTab);
		Utility.implicitwait();
		Utility.implicitwait();

		String amnt = amount.getText();
		String sts = status.getText();

		if ((rupeesIcon.isDisplayed()) && (sts.equalsIgnoreCase("Open"))) {
			et.log(LogStatus.PASS, "Status is Open and Amount is in Rupees",
					et.addScreenCapture(pass("Status is Open and Amount is in Rupees")));

		} else {

			et.log(LogStatus.FAIL, "Status is not Open OR Amount is not in Rupees",
					et.addScreenCapture(fail("Status is not Open OR Amount is not in Rupees")));
		}

		Utility.click(poLink);
		Utility.implicitwait();
		Utility.click(receiveGoodsButton);
		Utility.implicitwait();
		Utility.click(clickOther);
		Utility.ScrollDownKey();
		Utility.ScrollDownKey();
		Utility.implicitwait();
		Utility.click(secondDeleteIcon);

		Utility.implicitwait();
		Utility.click(QuantityInvoice);
		Utility.implicitwait();
		Utility.Clear(textField, "0025");

		Utility.click(saveButton);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.implicitwait();
		Utility.click(closeIcon);
		Utility.click(mainMenuOption);
		Utility.click(purchaseTab);
		Utility.click(purchaseOrderTab);
		Utility.implicitwait();

		String sts1 = status.getText();
		String qty = qtyReceived.getText();

		if ((qty.contains("25/100") && (sts1.equalsIgnoreCase("Partially Fulfilled")))) {

			et.log(LogStatus.PASS, "Status is Changed to Partially fulfilled and quantity changed to 25/100", et
					.addScreenCapture(pass("Status is Changed to Partially fulfilled and quantity changed to 25/100")));

		} else {

			et.log(LogStatus.FAIL, "Status is not Changed to Partially fulfilled OR quantity is notchanged to 25/100",
					et.addScreenCapture(
							fail("Status is not Changed to Partially fulfilled OR quantity is not changed to 25/100")));
		}

	}

/////////////////////// Purchase Order Currency Verification  /////////////////////////////

	@SuppressWarnings("unused")
	public void purchaseOrderCurrencyVerify() throws Exception {

		Utility.implicitwait();
		System.out.println("Step 1");
		Utility.click(addButton);
		System.out.println("Step 2");
		Utility.implicitwait();
		System.out.println("Step 3");
		Utility.click(purchaseOrderLink);
		System.out.println("Step 4");
		Utility.implicitwait();
		System.out.println("Step 5");
		Utility.click(currencyConversion);
		System.out.println("Step 6");
		Utility.click(selectMultiCurrency);
		System.out.println("Step 7");
		Utility.implicitwait();
		System.out.println("Step 8");
		Utility.click(selectSupplierDropdown);
		System.out.println("Step 9");
		Utility.wait_N_click(selectDropdownOption);
		System.out.println("Step 10");
		Utility.implicitwait();

		Utility.click(selectCurrencyDrop2);
		System.out.println("Step 11");
		Thread.sleep(5000);
		//Utility.ActionClick(selectCurrencyDrop);
		Utility.enterTextJS(selectCurrencyDrop1, "Usd");
		//Utility.ActionClick(selectUSD);
		System.out.println("Step 12");
		driver.findElement(By.xpath("//div[@name='USDUnited States']")).click();
		System.out.println("Step 13");
		Utility.enterText(exchangeRate, "20");
		System.out.println("Step 14");
		Utility.click(clickOther);
		System.out.println("Step 15");
		Utility.ScrollDownKey();
		Utility.ScrollDownKey();
		Utility.implicitwait();
		Utility.click(addLine);

		Utility.click(Product1);
		Utility.click(Product1);
		Utility.implicitwait();
		Utility.click(ProductSelect1);
		Utility.click(Quantity1);
		Quantity1.sendKeys("0050");
		Utility.implicitwait();
		rate1.sendKeys("00200");
		Utility.implicitwait();

		Utility.click(Product2);
		Utility.click(Product2);
		Utility.implicitwait();
		Utility.click(ProductSelect2);
		Quantity2.sendKeys("0050");
		Utility.implicitwait();
		rate2.sendKeys("00300");

		Utility.click(saveButton);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.implicitwait();
		Utility.click(closeIcon);
		Utility.click(mainMenuOption);
		Utility.click(purchaseTab);
		Utility.click(purchaseOrderTab);
		Utility.implicitwait();
		Utility.implicitwait();

		String amnt = amount.getText();
		String sts = status.getText();

		if ((dollarIcon.isDisplayed()) && (sts.equalsIgnoreCase("Open"))) {
			et.log(LogStatus.PASS, "Status is Open and Amount is in Dollars",
					et.addScreenCapture(pass("Status is Open and Amount is in Dollars")));

		} else {

			et.log(LogStatus.FAIL, "Status is not Open OR Amount is not in Dollars",
					et.addScreenCapture(fail("Status is not Open OR Amount is not in Dollars")));
		}

		Utility.click(poLink);
		Utility.implicitwait();
		Utility.click(receiveGoodsButton);
		Utility.implicitwait();
		Utility.click(clickOther);
		Utility.ScrollDownKey();
		Utility.ScrollDownKey();
		Utility.implicitwait();
		Utility.click(secondDeleteIcon);

		Utility.implicitwait();
		Utility.click(QuantityInvoice);
		Utility.implicitwait();
		Utility.Clear(textField, "0025");

		Utility.click(saveButton);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.implicitwait();
		Utility.implicitwait();
		Utility.click(closeIcon);
		Utility.click(mainMenuOption);
		Utility.click(purchaseTab);
		Utility.click(purchaseOrderTab);
		Utility.implicitwait();

		String sts1 = status.getText();
		String qty = qtyReceived.getText();

		if ((qty.contains("25/100") && (sts1.equalsIgnoreCase("Partially Fulfilled")))) {

			et.log(LogStatus.PASS, "Status is Changed to Partially fulfilled and quantity changed to 25/100", et
					.addScreenCapture(pass("Status is Changed to Partially fulfilled and quantity changed to 25/100")));

		} else {

			et.log(LogStatus.FAIL, "Status is not Changed to Partially fulfilled OR quantity is notchanged to 25/100",
					et.addScreenCapture(
							fail("Status is not Changed to Partially fulfilled OR quantity is not changed to 25/100")));
		}

	}

}
