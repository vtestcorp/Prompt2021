package com.inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class ProductPriceListDetailsPage extends Base {

	@FindBy(xpath = "(//*[text()='Inventory'])[1]")
	public WebElement inventoryTab;

	@FindBy(xpath = "//*[@class=\"page-title\"][text()='Product Price']")
	public WebElement productPricePage;

	@FindBy(xpath = "(//*[text()='Product Price']/..)[1]")
	public WebElement productPriceTab;

	@FindBy(xpath = "//*[text()=' Price List']/..")
	public WebElement priceListTab;

	@FindBy(xpath = "//*[@class=\"page-title\"][text()='Price List']")
	public WebElement priceListWindow;

	@FindBy(xpath = "//*[text()='New Price List']")
	public WebElement newPriceList;

	@FindBy(xpath = "//*[@placeholder=\"Price List Name\"]")
	public WebElement priceListText;

	@FindBy(xpath = "//*[@placeholder=\"Percentage\"]")
	public WebElement percentageText;

	@FindBy(xpath = "(//*[@class=\"fa fa-edit\"])[1]")
	public WebElement productPriceEdit;

	@FindBy(xpath = "//input[@id=\"currentStock\"]")
	public WebElement currentStockEdit;

	@FindBy(xpath = "//input[@id=\"qtyOnPO\"]")
	public WebElement qtyPOEdit;

	@FindBy(xpath = "//input[@id=\"salesCommitted\"]")
	public WebElement qtySOEdit;

	@FindBy(xpath = "(//*[@class=\"fa fa-save\"])[1]")
	public WebElement stockAdjustSave;

	@FindBy(xpath = "//*[text()='Products']/..")
	public WebElement productTab;

	@FindBy(xpath = "//span[@class=\"dropdown active ant-dropdown-trigger\"]")
	public WebElement newProductArrow;

	@FindBy(xpath = "//li[@class=\"ant-dropdown-menu-item\"]")
	public WebElement importProducts;

	@FindBy(xpath = "(//div[@role=\"combobox\"])[2]")
	public WebElement categDropImport;

	@FindBy(xpath = "//input[@placeholder=\"Product Name\"]")
	public WebElement productName;

	@FindBy(xpath = "//textarea[@placeholder=\"Product Description\"]")
	public WebElement productDescription;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-14\"])[3]")
	public WebElement categoryDrop;

	@FindBy(xpath = "//div[@class=\"action-dropdown-btn\"]")
	public WebElement newProcuctButton;

	@FindBy(xpath = "(//div[text()='Product Details'])")
	public WebElement productDetailsTab;

	@FindBy(xpath = "(//input[@placeholder=\"Enter Purchased Price\"])")
	public WebElement purchasePrice;

	@FindBy(xpath = "(//input[@placeholder=\"Enter Wholesale Price\"])")
	public WebElement wholesalePrice;

	@FindBy(xpath = "(//input[@placeholder=\"Enter Retail Price\"])")
	public WebElement retailPrice;

	@FindBy(xpath = "(//input[@placeholder=\"Enter Current Stock\"])")
	public WebElement currentStock;

	@FindBy(xpath = "//*[@class=\"ant-btn ant-btn-primary\"]")
	public WebElement submitButton;
	
	@FindBy(xpath = "//*[text()='Name is required.']")
	public WebElement errorMessage1;
	
	@FindBy(xpath = "//*[text()='Percentage is required.']")
	public WebElement errorMessage2;
	
	
	

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton1;

	@FindBy(xpath = "//*[@placeholder=\"Enter 3 characters product name\"]")
	public WebElement productSearch;

	@FindBy(xpath = "(//td//div[@class=\"price-input\"])[1]")
	public WebElement purchasePriceList;

	@FindBy(xpath = "(//td//div[@class=\"price-input\"])[2]")
	public WebElement wholesalePriceList;

	@FindBy(xpath = "(//td//div[@class=\"price-input\"])[3]")
	public WebElement retailPriceList;

	public ProductPriceListDetailsPage() {
		PageFactory.initElements(driver, this);
	}

//////////////////// Product Price Verification ///////////////////////////

	public void ProductPriceVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(productTab);
		Utility.implicitwait();

		Utility.click(newProcuctButton);

		Utility.enterText(productName, "A13");

		Utility.click(productDetailsTab);
		Utility.enterText(purchasePrice, "110");
		Utility.enterText(wholesalePrice, "100");
		Utility.enterText(retailPrice, "120");
		Utility.enterText(currentStock, "200");

		Utility.click(submitButton);
		Utility.implicitwait();
		Utility.click(submitButton1);
		Utility.implicitwait();

		Utility.click(productPriceTab);
		Utility.implicitwait();

		if (productPricePage.isDisplayed()) {
			et.log(LogStatus.PASS, "Product price details are displayed",
					et.addScreenCapture(pass("Product price details are displayed")));

		} else {

			et.log(LogStatus.FAIL, "Product price details are not displayed",
					et.addScreenCapture(fail("Product price details are not displayed")));
		}

		Utility.implicitwait();
		Utility.enterText(productSearch, "A13");
		Utility.implicitwait();
		if ((purchasePriceList.getText().equals("110")) && (wholesalePriceList.getText().equals("100"))
				&& (retailPriceList.getText().equals("120"))) {
			et.log(LogStatus.PASS, "Product price details are same",
					et.addScreenCapture(pass("Product price details are same")));

		} else {

			et.log(LogStatus.FAIL, "Product price details are not same",
					et.addScreenCapture(fail("Product price details are not same")));
		}

	}

////////////////////Price List Verification ///////////////////////////

	public void PriceListVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.implicitwait();
		Utility.click(priceListTab);
		Utility.implicitwait();
		if (priceListWindow.isDisplayed()) {
			et.log(LogStatus.PASS, "Price List details are displayed",
					et.addScreenCapture(pass("Price List details are displayed")));

		} else {

			et.log(LogStatus.FAIL, "Price List details are not displayed",
					et.addScreenCapture(fail("Price List details are not displayed")));
		}

		Utility.click(newPriceList);
		Utility.implicitwait();
		String name = "New Price";
		Utility.enterText(priceListText, name);
		Utility.enterText(percentageText, "10");
		Utility.click(submitButton);
		Utility.implicitwait();
		Utility.click(submitButton1);

		WebElement listName = driver.findElement(By.xpath("//*[text()='" + name + "']"));
		Utility.implicitwait();
		if (listName.isDisplayed()) {

			et.log(LogStatus.PASS, "New Price List is created", et.addScreenCapture(pass("New Price List is created")));

		} else {

			et.log(LogStatus.FAIL, "New Price List is not created",
					et.addScreenCapture(fail("New Price List is not created")));
		}

	}
	
	
////////////////////Price List Verification ///////////////////////////

public void PriceListVerificationNegative() throws Exception {

	Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.implicitwait();
		Utility.click(priceListTab);
		Utility.implicitwait();
		
		Utility.click(newPriceList);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.implicitwait();
		if ((errorMessage1.isDisplayed())&&(errorMessage2.isDisplayed())){

			et.log(LogStatus.PASS, "Error Message is displayed", et.addScreenCapture(pass("Error Message is displayed")));

		} else {

			et.log(LogStatus.FAIL, "Error Message is not displayed",
					et.addScreenCapture(fail("Error Message is not displayed")));
		}

}


}
