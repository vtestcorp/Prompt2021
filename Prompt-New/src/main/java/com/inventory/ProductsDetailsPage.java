package com.inventory;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class ProductsDetailsPage extends Base {

	SoftAssert softassert = new SoftAssert();

	boolean producttext;
	boolean errortext;
	String attribute1 = Utility.excelRead(2, 11, "InventoryDetails");
	String attribute2 = Utility.excelRead(2, 13, "InventoryDetails");
	String attribute3 = Utility.excelRead(2, 15, "InventoryDetails");
	String purchaseprice = Utility.excelReadInt(2, 17, "InventoryDetails");
	String wholesaleprice = Utility.excelReadInt(2, 18, "InventoryDetails");
	String retailprice = Utility.excelReadInt(2, 19, "InventoryDetails");
	String currentstock = Utility.excelReadInt(2, 20, "InventoryDetails");
	String uom = Utility.excelRead(2, 21, "InventoryDetails");
	String skunumber = Utility.excelRead(2, 22, "InventoryDetails");
	String searchXlProduct = Utility.excelRead(0, 1, "ImportProductDetails");
	String categoryexpected = Utility.excelRead(1, 5, "InventoryDetails");
	String productexpected = Utility.excelRead(2, 3, "InventoryDetails");
	String uomstring = Utility.excelRead(1, 21, "InventoryDetails");
	String manufactexpected = Utility.excelRead(2, 8, "InventoryDetails");
	String brandexpected = Utility.excelRead(2, 6, "InventoryDetails");
	String warehousename = Utility.excelRead(7, 1, "InventoryDetails");

	// double purchaseprice1 = Utility.excelReadInt(2, 16, "InventoryDetails");

	@FindBy(xpath = "//li//i[@class='fa fa-plus']")
	public WebElement addButton;

	@FindBy(xpath = "//div[contains(text(),'Inventory Item')]")
	public WebElement inventoryLink;

	@FindBy(xpath = "//span[@class=\"text-red\"]")
	public WebElement errorMessage;

	@FindBy(xpath = "//*[@class=\"ant-btn ant-btn-primary\"]")
	public WebElement submitButton;

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitButton1;

	@FindBy(xpath = "//input[@placeholder='Product Name']")
	public WebElement productName;

	@FindBy(xpath = "//textarea[@placeholder='Product Description']")
	public WebElement productDescription;
	
	@FindBy (xpath = "//span[text()='Description']/parent::div/following-sibling::div")
	public WebElement productDesc;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search']/input)[2]")
	public WebElement categoryDrop;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search']/input)[3]")
	public WebElement brandDrop;

	@FindBy(xpath = "//input[@placeholder='Enter Part #']")
	public WebElement partNumber;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search']/input)[4]")
	public WebElement manufactDrop;
	
	@FindBy (xpath = "//input[@id='rc_select_2']")
	public WebElement manufacturerDrop;

	@FindBy(xpath = "//input[@placeholder='Customer Stock #']")
	public WebElement stockNumber;

	@FindBy(xpath = "//div[@id='tab-2']")
	public WebElement productDetailsTab;

	@FindBy(xpath = "(//span[@class='ant-switch-inner'])[2]")
	public WebElement variantSelectSwitch;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search']/input)[5]")
	public WebElement attributeDrop1;

	@FindBy(xpath = "//input[@id='rc_select_5']")
	public WebElement attributeDrop2;

	@FindBy(xpath = "//input[@id='rc_select_6']")
	public WebElement attributeDrop3;

	@FindBy(xpath = "(//input[@placeholder='Enter attribute value'])[1]")
	public WebElement attributeValue1;

	@FindBy(xpath = "(//input[@placeholder='Enter attribute value'])[2]")
	public WebElement attributeValue2;

	@FindBy(xpath = "(//input[@placeholder='Enter attribute value'])[3]")
	public WebElement attributeValue3;

	@FindBy(xpath = "(//input[@placeholder='Enter Purchased Price'])")
	public WebElement purchasePrice;

	@FindBy(xpath = "(//input[@placeholder=\"Enter Wholesale Price\"])")
	public WebElement wholesalePrice;

	@FindBy(xpath = "(//input[@placeholder=\"Enter Retail Price\"])")
	public WebElement retailPrice;

	@FindBy(xpath = "(//input[@placeholder=\"Enter Current Stock\"])")
	public WebElement currentStock;

	@FindBy(xpath = "//span[@class='ant-select-selection-search']/input[@id='rc_select_8']")
	public WebElement uomDrop;

	@FindBy(xpath = "(//button[@class=\"ant-btn ant-btn-primary\"])[1]")
	public WebElement addToVariantButton;

	@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-default\"]")
	public WebElement resetButton;

	@FindBy(xpath = "(//div[@role='row'])[5]")
	public WebElement actualAttributes;

	@FindBy(xpath = "(//input[@placeholder=\"Enter SKU\"])[2]")
	public WebElement skuNumber;

	@FindBy(xpath = "(//button[@role=\"switch\"])[1]")
	public WebElement skuSwtich;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[2]/div[3]/div[4]/div/div/div/div[1]/div/div[3]/div[2]/div/div/div/div[4]/div/div/div[1]")
	public WebElement actualAttribute1;

	@FindBy(xpath = "//*[text()='Inventory']")
	public WebElement inventoryTab;

	@FindBy(xpath = "//*[text()='Products']/..")
	public WebElement productTab;

	@FindBy(xpath = "//span[@class=\"dropdown active ant-dropdown-trigger\"]")
	public WebElement newProductArrow;

	@FindBy(xpath = "//li[@class=\"ant-dropdown-menu-item\"]")
	public WebElement importProducts;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search']/input)[2]")
	public WebElement categDropImport;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search']/input)[3]")
	public WebElement manufactureDropImport;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search']/input)[4]")
	public WebElement brndDropImport;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search']/input)[5]")
	public WebElement warhseDropImport;

	@FindBy(xpath = "(//span[@class='ant-select-selection-search']/input)[6]")
	public WebElement attributeDropImport;

	@FindBy(xpath = "(//div[@role=\"combobox\"])[2]")
	public WebElement categasDrop;

	@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary\"]")
	public WebElement nextImport;

	@FindBy(xpath = "(//input[@type='file'])[2]")
	public WebElement uploadButtonImport;

	@FindBy(xpath = "//button[@class=\"ant-btn ant-btn-primary\"]")
	public WebElement doneButtonImport;

	@FindBy(xpath = "//input[@placeholder=\"Enter 3 characters product name\"]")
	public WebElement searchBox;

	@FindBy(xpath = "(//div[@class=\"ag-react-container\"])[2]")
	public WebElement actualProductName;

	@FindBy(xpath = "//li[starts-with(text(),'Total')]")
	public WebElement totalProductCountNew;

	@FindBy(xpath = "//li[starts-with(text(),'Total')]")
	public WebElement totalProductCountPrev;

	@FindBy(xpath = "(//*[@col-id='sku_1'])[2]")
	public WebElement skuNumberCheck;

	@FindBy(xpath = "//div[@class=\"action-dropdown-btn\"]")
	public WebElement newProcuctButton;

	@FindBy(xpath = "//input[@placeholder=\"Enter SKU\"]")
	public WebElement enterSKU;

	@FindBy(xpath = "(//*[@col-id=\"0\"])[2]")
	public WebElement exptectdVariant1;

	@FindBy(xpath = "(//*[@col-id=\"0\"])[3]") //// variants
	public WebElement exptectdVariant2;

	@FindBy(xpath = "(//*[@col-id=\"0\"])[2]")
	public WebElement exptectdVariant3;

	@FindBy(xpath = "(//*[@col-id=\"currentStock\"])[2]")
	public WebElement exptectdCurrentStock1;

	@FindBy(xpath = "(//*[@col-id=\"currentStock\"])[3]") //// current stocks
	public WebElement exptectdCurrentStock2;

	@FindBy(xpath = "(//*[@col-id=\"currentStock\"])[2]")
	public WebElement exptectdCurrentStock3;

	@FindBy(xpath = "(//tr//td)[1]")
	public WebElement actualProduct;

	@FindBy(xpath = "(//td)[11]")
	public WebElement actualVariant1;

	@FindBy(xpath = "(//td)[18]")
	public WebElement actualVariant2; ///// actual variants

	@FindBy(xpath = "(//td)[44]")
	public WebElement actualVariant3;

	@FindBy(xpath = "(//td)[12]")
	public WebElement actualCurrentStock1;

	@FindBy(xpath = "(//td)[19]")
	public WebElement actualCurrentStock2; ///// actual current stocks

	@FindBy(xpath = "(//td)[44]")
	public WebElement actualCurrentStock3;

	@FindBy(xpath = "(//td)[4]")
	public WebElement actualCurrentStockSum;

	@FindBy(xpath = "(//td)[3]")
	public WebElement actualCategory;

	@FindBy(xpath = "(//div[@col-id=\"variants\"])[2]")
	public WebElement variantClick;

	@FindBy(xpath = "(//div[@row-index=\"0\"])[5]")
	public WebElement expectedrow1st;

	@FindBy(xpath = "(//div[@row-index=\"1\"])[5]")
	public WebElement expectedrow2nd;

	@FindBy(xpath = "//div[@role=\"tab\"][text()='Finance']")
	public WebElement financeTab;

	@FindBy(xpath = "//div[@class=\"ant-select-selection__placeholder\"][text()='Select a HSN Code']")
	public WebElement hsnDrop;

	@FindBy(xpath = "//div[@role=\"tab\"][text()='Image']")
	public WebElement imageTab;

	@FindBy(xpath = "//*[text()='Upload']")
	public WebElement uploadButton;

	@FindBy(xpath = "//div[@role=\"tab\"][text()='Product Information']")
	public WebElement productInfomationTab;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-14\"])[1]")
	public WebElement proNameact;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-14\"])[2]")
	public WebElement proCategoryact;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-14\"])[4]")
	public WebElement proManufactact;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-14\"])[5]")
	public WebElement proBrandact;

	@FindBy(xpath = "(//input[@type=\"checkbox\"][@class=\"ant-checkbox-input\"])[2]")
	public WebElement checkBox;

	@FindBy(xpath = "//button[@class=\"action-btn\"]//i[@class=\"fa fa-file-excel-o\"]")
	public WebElement excelButton;

	@FindBy(xpath = "//button[@class=\"action-btn\"]//i[@class=\"fa fa-file-pdf-o\"]")
	public WebElement pdfButton;

	@FindBy(xpath = "(//*[text()='Warehouse']/..)[1]")
	public WebElement warehouseTab;

	@FindBy(xpath = "//*[text()='My Warehouse']/..")
	public WebElement mywarehouseTab;

	@FindBy(xpath = "//button[text()='New Warehouse']")
	public WebElement newwarehouseButton;

	@FindBy(xpath = "//*[@placeholder=\"Warehouse Name\"]")
	public WebElement warehouseNametext;

	@FindBy(xpath = "//*[@placeholder=\"Street Address\"]")
	public WebElement streetAddressText;

	@FindBy(xpath = "//*[@placeholder=\"City\"]")
	public WebElement cityText;

	@FindBy(xpath = "//*[@placeholder=\"State\"]")
	public WebElement stateText;

	@FindBy(xpath = "//button[text()='Create Warehouse']")
	public WebElement createWarehouseButton;

	@FindBy(xpath = "//div[@class=\"ant-select-selector\"]")
	public WebElement warehouseCountryDrop;

	@FindBy(xpath = "//div[@name='India']")
	public WebElement warehouseCountrySelect;

	@FindBy(xpath = "(//*[@placeholder=\"Street Address (contd.)\"])[2]")
	public WebElement zipText;

	@FindBy(xpath = "//div[text()='Warehouse Name is required.']")
	public WebElement errorWarehouse;

	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitWarehouse;

	public ProductsDetailsPage() {
		PageFactory.initElements(driver, this);
	}

//////////////////// Inventory Negative validation ///////////////////////////

	public void InventoryNegative() throws Exception {

		Utility.implicitwait();
		Utility.click(addButton);
		Utility.click(inventoryLink);
		Utility.wait_N_click(submitButton);
		if (errorMessage.isDisplayed()) {

			et.log(LogStatus.PASS, "error message is shown", et.addScreenCapture(pass("error message is shown")));
		} else {

			et.log(LogStatus.PASS, "error message is not shown",
					et.addScreenCapture(pass("error message is not shown")));
		}
	}

//////////////////// Variant Attribute Validation ///////////////////////////

	@SuppressWarnings("unlikely-arg-type")
	public void VariantAttributeValidation() throws Exception {

		Utility.click(addButton);
		System.out.println(1);
		Utility.click(inventoryLink);
		System.out.println(2);
		//Utility.enterText(productName, Utility.excelRead(2, 3, "InventoryDetails"));
		Utility.enterText(productName, "XBOX Microsoft");
		System.out.println(3);
		///////// unable to enter text for the product description element
		//Utility.enterText(productDescription, Utility.excelRead(2, 4, "InventoryDetails"));
		//productName.sendKeys(Keys.TAB);
		//Utility.enterText(productDesc,"Gaming");
		System.out.println(4);
		Utility.click(categoryDrop);
		System.out.println(5);
		//driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 5, "InventoryDetails") + "']")).click();
		driver.findElement(By.xpath("//span[@class=' custom-dropdown-option'][text()='electronics']")).click();
		System.out.println(6);
		Thread.sleep(1000);
		Utility.click(brandDrop);
		System.out.println(7);
		//driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 6, "InventoryDetails") + "']")).click();
		driver.findElement(By.xpath("//span[text()='Red Chif'][@class=' custom-dropdown-option']")).click();
		System.out.println(8);
		//Utility.enterText(partNumber, Utility.excelRead(2, 7, "InventoryDetails"));
		Utility.enterText(partNumber,"XYZ123");
		System.out.println(9);
		//partNumber.sendKeys(Keys.TAB);
		manufacturerDrop.sendKeys(Keys.ENTER);
		System.out.println(10);
		//driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 8, "InventoryDetails") + "']")).click();
		driver.findElement(By.xpath("//span[text()='Leyan Global Pvt. Ltd.'][@class=' custom-dropdown-option']")).click();
		Thread.sleep(2000);
		System.out.println(11);
		Utility.click(skuSwtich);
		System.out.println(12);
		Utility.enterText(stockNumber, Utility.excelRead(2, 10, "InventoryDetails"));
		
		System.out.println(13);
		Utility.click(productDetailsTab); ///// switch to product details tab
		System.out.println(14);
		Thread.sleep(2000);
		Utility.scrollToElement_N_click(variantSelectSwitch); 
		System.out.println(15);
		//Utility.JSClick(attributeDrop1);
		//Utility.JSClick(attributeDrop1);
		System.out.println(16);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 11, "InventoryDetails") + "']")).click();
		attributeDrop1.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@name='Colour']")).click();
		//Utility.enterText(attributeValue1, Utility.excelRead(2, 12, "InventoryDetails"));
		Utility.enterText(attributeValue1, "Red");
		System.out.println(17);
		//Utility.click(attributeDrop2);
		attributeDrop2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//li[@name='" + Utility.excelRead(2, 13, "InventoryDetails") + "'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class=' custom-dropdown-option'][text()='Size'])[2]")).click();
		System.out.println(18);
		//Utility.enterText(attributeValue2, Utility.excelRead(2, 13, "InventoryDetails"));
		Utility.enterText(attributeValue2, "10 Inches");
		System.out.println(19);
		//Utility.click(attributeDrop3);
		attributeDrop3.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//li[@name='" + Utility.excelRead(2, 15, "InventoryDetails") + "'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class=' custom-dropdown-option'][text()='Material'])[3]")).click();
		System.out.println(20);
		//Utility.enterText(attributeValue3, Utility.excelRead(2, 15, "InventoryDetails"));
		Utility.enterText(attributeValue3, "Ceramic");
		System.out.println(21);
		
		Utility.enterText(purchasePrice, Utility.excelReadInt(2, 17, "InventoryDetails"));
		Utility.enterText(wholesalePrice, Utility.excelReadInt(2, 18, "InventoryDetails"));
		Utility.enterText(retailPrice, Utility.excelReadInt(2, 19, "InventoryDetails"));
		//Utility.enterText(currentStock, Utility.excelReadInt(2, 20, "InventoryDetails"));
		Utility.enterText(currentStock, "801");
		System.out.println(22);
		uomDrop.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 21, "InventoryDetails") + "']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Dozen']")).click();
		Utility.enterText(skuNumber, Utility.excelReadInt(2, 22, "InventoryDetails"));
		Utility.wait_N_click(addToVariantButton);

		Thread.sleep(1000);
		System.out.println("expected: ");

		System.out.println("current stock: " + currentstock);
		System.out.println(uom);
		System.out.println(skunumber);
		System.out.println(attribute1);
		System.out.println(attribute2);
		System.out.println(attribute3);
		System.out.println("wholesale price: " + wholesaleprice);
		System.out.println("purchase price: " + purchaseprice);
		System.out.println("retail price: " + retailprice);

		java.util.List<String> expectedResult = new ArrayList<String>();

		expectedResult.add(currentstock);
		expectedResult.add(uom);
		expectedResult.add(skunumber);
		expectedResult.add(attribute1);
		expectedResult.add(attribute2);
		expectedResult.add(attribute3);
		expectedResult.add(wholesaleprice);
		expectedResult.add(purchaseprice);
		expectedResult.add(retailprice);
		System.out.println();

		Utility.JS_Scrolldown(submitButton);
		System.out.println("attributes:");
		System.out.println();
		String ss = actualAttributes.getText();
		System.out.println(ss);

		if (Arrays.asList(expectedResult).contains(ss)) {
			System.out.println("equal");
			et.log(LogStatus.PASS, "Same amount/elements are reflecting at bottom",
					et.addScreenCapture(pass("Same amount/elements are reflecting at bottom")));

		} else {
			System.out.println("no equal");
			et.log(LogStatus.FAIL, "Same amount/elements are not reflecting at bottom",
					et.addScreenCapture(pass("Same amount/elements are not reflecting at bottom")));
		}
	}

//////////////////// Import Product Validation ///////////////////////////

	@SuppressWarnings("unused")
	public void ImportProductValidation() throws Exception {

		Utility.click(inventoryTab);
		Utility.click(productTab);
		Thread.sleep(3000);
		Utility.wait_N_click(newProductArrow);
		Utility.scrollToElement_N_click(importProducts);
		Thread.sleep(3000);

		//Utility.click(categDropImport);
		categDropImport.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 32, "InventoryDetails") + "']")).click();

		//Utility.click(manufactureDropImport);
		manufactureDropImport.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 33, "InventoryDetails") + "']")).click();
		driver.findElement(By.xpath("//div[@name='Leyan Global Pvt. Ltd.']")).click();
		//Utility.click(brndDropImport);
		brndDropImport.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 34, "InventoryDetails") + "']")).click();
		driver.findElement(By.xpath("//div[@name='Red Chif']")).click();
		//Utility.click(warhseDropImport);
		warhseDropImport.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 35, "InventoryDetails") + "']")).click();

		attributeDropImport.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 36, "InventoryDetails") + "']")).click();

		Utility.click(nextImport);

		//uploadButtonImport.sendKeys(Keys.ENTER);
		Utility.JSClick(uploadButtonImport);
		Utility.uploadFile("ImportProductDetails");

		Utility.wait_N_click(doneButtonImport);
		Thread.sleep(3000);
		Utility.enterText(searchBox, Utility.excelReadHssf(1, 0, "ImportProductDetails"));
		String aa = actualProductName.getText();

		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[text()='" + Utility.excelRead(1, 0, "ImportProductDetails") + "']"));
			producttext = true;
		} catch (Exception e) {
			producttext = false;
		}
		Thread.sleep(1000);
		try {
			Assert.assertEquals(producttext, true, "product is not created");

			System.out.println("Search matched");
			et.log(LogStatus.PASS, "New created product name found",
					et.addScreenCapture(pass("New created product name found")));
		} catch (Exception ex) {
			et.log(LogStatus.FAIL, "New created product name not found",
					et.addScreenCapture(fail("New created product name not found")));
			System.out.println("search mismatched ");
		}
		String totalProductCountCurrent = totalProductCountNew.getText();
		System.out.println("Actual" + totalProductCountCurrent);
		Thread.sleep(1000);
		try {
			// Assert.assertNotEquals(totalProductCount, totalProductCountCurrent);
			System.out.println("count matched");
			et.log(LogStatus.PASS, "New Product Created and count got increased",
					et.addScreenCapture(pass("New Product is Created and count got increased")));
		} catch (Exception ex) {
			System.out.println("count mismatched ");
			et.log(LogStatus.FAIL, "Produt Count hasn't increased",
					et.addScreenCapture(fail("Product Count hasn't increased")));
		}
	}

//////////////////// Duplicate SKU Validation ///////////////////////////

	public void DuplicateSKUValidation() throws Exception {

		Utility.click(inventoryTab);
		Utility.click(productTab);
		Thread.sleep(3000);
		String numbercheck = skuNumberCheck.getText();
		Utility.click(newProcuctButton);
		Utility.enterText(productName, Utility.excelRead(2, 3, "InventoryDetails"));
		//Utility.enterText(productDescription, Utility.excelRead(2, 4, "InventoryDetails"));
		//Utility.click(categoryDrop);
		categoryDrop.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 5, "InventoryDetails") + "']")).click();
		Thread.sleep(1000);
		//Utility.click(brandDrop);
		brandDrop.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 6, "InventoryDetails") + "']")).click();
		driver.findElement(By.xpath("//div[@name='Red Chif']")).click();
		Utility.enterText(partNumber, Utility.excelRead(2, 7, "InventoryDetails"));
		//Utility.click(manufactDrop);
		manufactDrop.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 8, "InventoryDetails") + "']")).click();
		driver.findElement(By.xpath("//div[@name='Leyan Global Pvt. Ltd.']")).click();
		Thread.sleep(2000);
		Utility.click(skuSwtich);
		Utility.enterText(enterSKU, numbercheck);
		Utility.click(submitButton);
		Utility.wait_N_click(submitButton1);
		Thread.sleep(2000);

		try {
			errortext=driver.findElement(By.xpath("//*[text()='Error Message']")).isDisplayed();
			Assert.assertEquals(errortext, true, "product with duplicate SKU is not created");
			System.out.println("product with duplicate SKU is not created");
			et.log(LogStatus.PASS, "product with duplicate SKU is not created",
					et.addScreenCapture(pass("product with duplicate SKU is not created")));
		} catch (Exception e) {
			errortext = false;
			System.out.println(e);
			et.log(LogStatus.FAIL, "product with duplicate SKU is created",
					et.addScreenCapture(fail("product with duplicate SKU is created")));
			System.out.println("product with duplicate SKU is created");

		}
	}

//////////////////// Variant PopUP Validation ///////////////////////////

	@SuppressWarnings("unused")
	public void VariantPopUPValidation() throws Exception {

		Utility.click(inventoryTab);
		Utility.click(productTab);
		Thread.sleep(3000);
		Utility.click(newProcuctButton);
		Utility.enterText(productName, Utility.excelRead(1, 3, "InventoryDetails"));
		//Utility.click(categoryDrop);
		categoryDrop.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 5, "InventoryDetails") + "']")).click();
		Utility.click(productDetailsTab); ///// switch to product details tab
		Thread.sleep(2000);
		Utility.scrollToElement_N_click(variantSelectSwitch);

		//Utility.click(attributeDrop1); ///// Adding variant 1
		attributeDrop1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 11, "InventoryDetails") + "']")).click();
		driver.findElement(By.xpath("//div[@name='Colour']")).click();
		Utility.enterText(attributeValue1, Utility.excelRead(1, 12, "InventoryDetails"));
		Utility.enterText(purchasePrice, Utility.excelReadInt(1, 17, "InventoryDetails"));
		Utility.enterText(wholesalePrice, Utility.excelReadInt(1, 18, "InventoryDetails"));
		Utility.enterText(retailPrice, Utility.excelReadInt(1, 19, "InventoryDetails"));
		Utility.enterText(currentStock, Utility.excelReadInt(1, 20, "InventoryDetails"));
		Utility.click(uomDrop);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(1, 21, "InventoryDetails") + "']")).click();
		Utility.wait_N_click(addToVariantButton);
//
//		 ///// Adding variant 2
		Thread.sleep(1000);
		Utility.enterText(attributeValue1, Utility.excelRead(2, 12, "InventoryDetails"));
		Utility.enterText(purchasePrice, Utility.excelReadInt(2, 17, "InventoryDetails"));
		Utility.enterText(wholesalePrice, Utility.excelReadInt(2, 18, "InventoryDetails"));
		Utility.enterText(retailPrice, Utility.excelReadInt(2, 19, "InventoryDetails"));
		Utility.enterText(currentStock, Utility.excelReadInt(2, 20, "InventoryDetails"));
		Utility.click(uomDrop);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 21, "InventoryDetails") + "']")).click();
		Utility.wait_N_click(addToVariantButton);
		Utility.JS_Scrolldown(submitButton);

		String cstock1 = exptectdCurrentStock1.getText();
		String cstock2 = exptectdCurrentStock2.getText();

		double d1 = Double.parseDouble(cstock1);
		double d2 = Double.parseDouble(cstock2);

		double[] R1 = { d1, d2, };
		double[] R2 = new double[R1.length];
		double sum = 0;
		double sum1 = 0;

		//////// addition of all current stocks /////////

		for (double num : R1) {
			sum = sum + num;

		}

		DecimalFormat format = new DecimalFormat("0.##");
		String total = format.format(sum); ///// rounding off to 2 decimals

		System.out.println("Sum of array elements is:" + sum1);

		System.out.println("expected:");
		System.out.println(productexpected);
		System.out.println(categoryexpected);
		System.out.println(total);
		System.out.println(exptectdCurrentStock1.getText());
		System.out.println(exptectdCurrentStock2.getText());
		System.out.println();

		java.util.List<String> expectedResult = new ArrayList<String>(); //// Adding all elements text in List Array

		expectedResult.add(productexpected);
		expectedResult.add(categoryexpected);
		expectedResult.add(total);
		expectedResult.add(exptectdCurrentStock1.getText());
		expectedResult.add(exptectdCurrentStock2.getText());

		Utility.implicitwait();
		Utility.click(submitButton);
		Thread.sleep(2000);
		Utility.click(submitButton1);
		Thread.sleep(2000);
		Utility.enterText(searchBox, Utility.excelRead(2, 3, "InventoryDetails"));
		Thread.sleep(2000);

		WebElement targetElement = driver
				.findElement(By.xpath("//*[text() ='" + Utility.excelRead(2, 3, "InventoryDetails") + "']"));

		if (targetElement.isDisplayed()) {

			Utility.wait_N_click(variantClick);

			java.util.List<String> ActualResult = new ArrayList<String>(); //// Adding all elements text in List Array

			ActualResult.add(actualProduct.getText());
			ActualResult.add(actualCategory.getText());
			ActualResult.add(actualCurrentStockSum.getText());
			ActualResult.add(actualCurrentStock1.getText().replaceAll(uomstring, ""));
			ActualResult.add(actualCurrentStock2.getText().replaceAll(uomstring, ""));

			System.out.println();
			System.out.println("Actual: ");

			System.out.println(actualProduct.getText());
			System.out.println(actualCategory.getText());
			System.out.println(actualCurrentStockSum.getText());
			System.out.println(actualCurrentStock1.getText().replaceAll(uomstring, ""));
			System.out.println(actualCurrentStock2.getText().replaceAll(uomstring, ""));

			for (int i = 0; i < expectedResult.size(); i++) {
				if (ActualResult.get(i).contains(expectedResult.get(i))) {
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

			System.out.println("error");
		}

		Utility.wait(targetElement);
		Utility.implicitwait();

	}

//////////////////// Create Product and product link Validation  ///////////////////////////

	public void CreateProductValidation() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(productTab);
		Thread.sleep(3000);
		String preCount = totalProductCountPrev.getText();

		Utility.click(newProcuctButton);

		Utility.enterText(productName, Utility.excelRead(2, 3, "InventoryDetails"));
		Utility.enterText(productDescription, Utility.excelRead(2, 4, "InventoryDetails"));
		Utility.implicitwait();

		Utility.wait_N_click(categoryDrop);

		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 5, "InventoryDetails") + "']")).click();
		Utility.wait(brandDrop);

		Utility.click(brandDrop);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 6, "InventoryDetails") + "']")).click();
		Utility.enterText(partNumber, Utility.excelRead(2, 7, "InventoryDetails"));
		Utility.click(manufactDrop);
		driver.findElement(By.xpath("//div[@name='" + Utility.excelRead(2, 8, "InventoryDetails") + "']")).click();
		Thread.sleep(2000);
		Utility.enterText(stockNumber, Utility.excelRead(2, 10, "InventoryDetails"));

		Utility.implicitwait();

		Utility.click(productDetailsTab); ///// switch to product details tab
		Thread.sleep(2000);
		Utility.scrollToElement_N_click(variantSelectSwitch);

		Utility.click(attributeDrop1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 11, "InventoryDetails") + "']")).click();
		Utility.enterText(attributeValue1, Utility.excelRead(2, 12, "InventoryDetails"));

		Utility.click(attributeDrop2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@name='" + Utility.excelRead(2, 13, "InventoryDetails") + "'])[2]")).click();
		Utility.enterText(attributeValue2, Utility.excelRead(2, 13, "InventoryDetails"));

		Utility.implicitwait();

		Utility.enterText(purchasePrice, Utility.excelReadInt(2, 17, "InventoryDetails"));
		Utility.enterText(wholesalePrice, Utility.excelReadInt(2, 18, "InventoryDetails"));
		Utility.enterText(retailPrice, Utility.excelReadInt(2, 19, "InventoryDetails"));
		Utility.enterText(currentStock, Utility.excelReadInt(2, 20, "InventoryDetails"));
		Utility.click(uomDrop);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 21, "InventoryDetails") + "']")).click();
		Utility.wait_N_click(addToVariantButton);
		Thread.sleep(2000);
		Utility.wait_N_click(financeTab);
		Utility.wait_N_click(hsnDrop);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@name='" + Utility.excelRead(2, 23, "InventoryDetails") + "']")).click();

		Utility.wait_N_click(imageTab);
		Utility.wait_N_click(uploadButton);
		Utility.uploadFile("Logo");
		Thread.sleep(2000);
		Utility.implicitwait();
		Utility.click(submitButton);
		Thread.sleep(2000);
		Utility.click(submitButton1);
		Thread.sleep(3000);

		Utility.click(inventoryTab);
		Utility.click(productTab);
		Thread.sleep(3000);

		Utility.enterText(searchBox, Utility.excelRead(2, 3, "InventoryDetails")); // searching created product
		Thread.sleep(2000);

		try {
			driver.findElement(By.xpath("//a[text()='" + Utility.excelRead(2, 3, "InventoryDetails") + "']"));
			producttext = true;
		} catch (Exception e) {
			producttext = false;
		}
		Thread.sleep(1000);

		if (producttext = true) {
			System.out.println("Search matched");
			et.log(LogStatus.PASS, "New created product name found",
					et.addScreenCapture(pass("New created product name found")));
		} else {
			et.log(LogStatus.FAIL, "New created product name not found",
					et.addScreenCapture(fail("New created product name not found")));
			System.out.println("search mismatched ");
		}
		String totalProductCountCurrent = totalProductCountNew.getText();
		System.out.println("Actual" + totalProductCountCurrent);
		Thread.sleep(1000);

		if (totalProductCountCurrent != preCount) {
			System.out.println("count matched");
			et.log(LogStatus.PASS, "New Product Created and count got increased",
					et.addScreenCapture(pass("New Product is Created and count got increased")));
		} else {
			System.out.println("count mismatched ");
			et.log(LogStatus.FAIL, "Produt Count hasn't increased",
					et.addScreenCapture(fail("Product Count hasn't increased")));
		}

		driver.findElement(By.xpath("//a[text()='" + Utility.excelRead(2, 3, "InventoryDetails") + "']")).click();
		Thread.sleep(2000);
		Utility.wait_N_click(productInfomationTab);
		String proName = proNameact.getText();
		String proCateg = proCategoryact.getText();
		String proManufact = proManufactact.getText();
		String proBrand = proBrandact.getText();

		if (proName.equals(productexpected) && (proCateg.equals(categoryexpected)
				&& (proManufact.equals(manufactexpected) && (proBrand.equals(brandexpected))))) {

			System.out.println("Correct product information");
			et.log(LogStatus.PASS, "Correct product information",
					et.addScreenCapture(pass("Correct product information")));

		} else {
			System.out.println("No Correct product information");
			et.log(LogStatus.FAIL, "No Correct product information",
					et.addScreenCapture(fail("No Correct product information")));

		}

	}

//////////////////// download Excel Validation ///////////////////////////

	public void downloadExcelValidation() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(productTab);
		Thread.sleep(3000);

		Utility.enterText(searchBox, Utility.excelRead(1, 3, "InventoryDetails")); // searching created product
		Thread.sleep(2000);
		Utility.click(checkBox);
		Utility.click(excelButton);
		Thread.sleep(2000);

		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);
		String fileName = getLatestFile.getName();

		if (fileName.equals("Product.xlsx")) {

			et.log(LogStatus.PASS, "Excel file is downloaded");

		}

		else {
			et.log(LogStatus.FAIL, "Excel file is not downloaded");

		}
	}

////////////////////download PDF Validation ///////////////////////////

	public void downloadpdfValidation() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(productTab);
		Thread.sleep(3000);

		Utility.enterText(searchBox, Utility.excelRead(1, 3, "InventoryDetails")); // searching created product
		Thread.sleep(2000);
		Utility.click(checkBox);
		Utility.click(pdfButton);
		Thread.sleep(2000);

		File getLatestFile = Utility.getLatestFilefromDir(downloadPath);
		String fileName = getLatestFile.getName();

		if (fileName.equals("Product.pdf")) {

			et.log(LogStatus.PASS, "PDF file is downloaded");

		} else {
			et.log(LogStatus.FAIL, "PDF file is not downloaded");

		}
	}

}
