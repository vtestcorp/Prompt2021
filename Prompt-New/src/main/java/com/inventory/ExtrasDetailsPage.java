package com.inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class ExtrasDetailsPage extends Base {

	String category = "Demo Category";

	@FindBy(xpath = "(//*[text()='Inventory'])[1]")
	public WebElement inventoryTab;

	@FindBy(xpath = "(//*[text()='Extras'])[1]")
	public WebElement extrasTab;

	@FindBy(xpath = "(//*[text()='Category'])[1]")
	public WebElement categoryTab;

	@FindBy(xpath = "(//*[text()='Manufactures'])[1]")
	public WebElement manufacturerTab;

	@FindBy(xpath = "(//*[text()='Brands'])[1]")
	public WebElement brandsTab;
	
	@FindBy(xpath = "(//*[text()='UOM'])[1]")
	public WebElement uomTab;

	@FindBy(xpath = "//*[text()='Product Categories']")
	public WebElement categoryTable;

	@FindBy(xpath = "//*[text()='Product Manufacturer']")
	public WebElement manufacturerTable;

	@FindBy(xpath = "//*[text()='Product Brands']")
	public WebElement brandsTable;
	
	@FindBy(xpath = "(//*[text()='UOM'])[2]")
	public WebElement uomTable;

	@FindBy(xpath = "//*[text()='Category can not be deleted because there are product assigned to it']")
	public WebElement deleteErrorMessage;

	@FindBy(xpath = "(//*[@class=\"fa fa-remove\"]/.)[6]")
	public WebElement deleteIcon;

	@FindBy(xpath = "//*[text()='New Category']")
	public WebElement newCategory;

	@FindBy(xpath = "//*[text()='New Manufacturer']")
	public WebElement newManufacturer;

	@FindBy(xpath = "//*[text()='New brand']")
	public WebElement newBrand;
	
	@FindBy(xpath = "//*[text()='New UOM']")
	public WebElement newUOM;

	@FindBy(xpath = "//*[@type=\"text\"]")
	public WebElement categoryText;

	@FindBy(xpath = "//*[@class=\"ant-input add-new-input-text\"]")
	public WebElement categoryText1;

	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement submitButton;

	@FindBy(xpath = "//*[@class=\"ant-btn ant-btn-primary\"]")
	public WebElement submitButtonPoduct;

	@FindBy(xpath = "(//*[@class=\"ant-btn ant-btn-primary\"])[2]")
	public WebElement submitButtonPoduct1;

	@FindBy(xpath = "(//*[text()='Submit'])[2]")
	public WebElement submitButton1;

	@FindBy(xpath = "(//*[@col-id=\"categoryName\"])[2]")
	public WebElement categoryCreated;

	@FindBy(xpath = "(//*[@col-id=\"manufacturerName\"])[2]")
	public WebElement manufacturerCreated;

	@FindBy(xpath = "(//*[@col-id=\"brandName\"])[2]")
	public WebElement brandCreated;
	
	@FindBy(xpath = "(//*[@col-id=\"uomName\"])[2]")
	public WebElement uomCreated;

	@FindBy(xpath = "(//*[@class=\"fa fa-remove\"])[1]")
	public WebElement deleteCategory;

	@FindBy(xpath = "(//*[@class=\"fa fa-remove\"])[5]")
	public WebElement deleteCategoryLast;

	@FindBy(xpath = "//*[text()='Date Created']")
	public WebElement clickRandom;
	
	@FindBy(xpath = "//*[text()='Brand Description']")
	public WebElement clickRandom1;

	
	
	@FindBy(xpath = "(//div[@class='add-new'])[1]")
	public WebElement addNewCategory;

	@FindBy(xpath = "//*[text()='Products']/..")
	public WebElement productTab;

	@FindBy(xpath = "//*[text()='New Product']")
	public WebElement newProcuctButton;

	@FindBy(xpath = "//input[@placeholder=\"Product Name\"]")
	public WebElement productName;

	@FindBy(xpath = "(//div[@class=\"ant-col ant-col-14\"])[3]")
	public WebElement categoryDrop;

	@FindBy(xpath = "//*[@class=\"ag-center-cols-container\"]")
	public WebElement categoryList;

	@FindBy(xpath = "(//*[@col-id=\"categoryName\"])[3]")
	public WebElement updateCategoryName;

	@FindBy(xpath = "(//*[@col-id=\"brandName\"])[2]")
	public WebElement updateBrandName;
	
	@FindBy(xpath = "(//*[@col-id=\"uomName\"])[2]")
	public WebElement updateUOMName;

	@FindBy(xpath = "(//*[@col-id=\"manufacturerName\"])[2]")
	public WebElement updateManufacturerName;

	@FindBy(xpath = "(//textarea[@class=\"editable-cell-textarea\"])[1]")
	public WebElement updateCategoryText;

	@FindBy(xpath = "(//*[@class=\"fa fa-edit\"])[2]")
	public WebElement updateCategoryEdit;

	@FindBy(xpath = "(//*[@class=\"fa fa-edit\"])[1]")
	public WebElement updateEdit;

	@FindBy(xpath = "//*[@class=\"fa fa-save\"]")
	public WebElement updateCategorySave;

	public ExtrasDetailsPage() {
		PageFactory.initElements(driver, this);
	}

//////////////////// Category Creation Verification ///////////////////////////

	public void CategoryVerification() throws Exception {

		Utility.click(inventoryTab);
		Utility.click(extrasTab);
		Utility.click(categoryTab);

		if (categoryTable.isDisplayed()) {
			et.log(LogStatus.PASS, "category details are displayed",
					et.addScreenCapture(pass("category details are displayed")));

		} else {

			et.log(LogStatus.FAIL, "category details are not displayed",
					et.addScreenCapture(fail("category details are not displayed")));
		}

		Utility.click(newCategory);
		Utility.enterText(categoryText, "Steel");
		Utility.click(submitButton);
		Utility.click(submitButton);

		if (categoryCreated.getText().equals("Steel")) {

			et.log(LogStatus.PASS, "New category is created", et.addScreenCapture(pass("New category is created")));

		} else {

			et.log(LogStatus.FAIL, "New category is not created",
					et.addScreenCapture(fail("New category is not created")));
		}

		Utility.click(deleteCategory);
		Utility.click(submitButton);
		Utility.click(submitButton);

		try {
			Utility.click(clickRandom);

		} catch (ElementClickInterceptedException e) {

			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));

			if (!categoryCreated.getText().equals("Steel")) {

				et.log(LogStatus.PASS, "category is Deleted ", et.addScreenCapture(pass("category is Deleted ")));

			} else {

				et.log(LogStatus.FAIL, "category is not Deleted ",
						et.addScreenCapture(fail("category is not Deleted ")));
			}

		}
	}

////////////////////Category Delete with Products Verification ///////////////////////////

	public void CategoryDeleteVerification() throws Exception {

		Utility.click(inventoryTab);
		Utility.click(productTab);
		Utility.click(newProcuctButton);
		Utility.enterText(productName, "Demo Product");
		Utility.wait_N_click(categoryDrop);
		Utility.click(addNewCategory);

		Utility.enterText(categoryText1, category);
		Utility.click(submitButton1);
		Utility.click(submitButton1);

		Utility.wait_N_click(categoryDrop);
		System.out.println("1");
		WebElement categ = driver.findElement(By.xpath("//div[@name='" + category + "']"));
		System.out.println("2");
		Utility.click(categ);
		Utility.click(submitButtonPoduct);
		Utility.click(submitButtonPoduct1);
		Thread.sleep(5000);

		Utility.click(extrasTab);
		Utility.click(categoryTab);
		driver.navigate().to(driver.getCurrentUrl()); /// refreshing page to load updated category
		Utility.click(deleteCategoryLast); /// make sure created category must be at last// change locator index
											/// accordingly

		Utility.click(submitButton);

		if (categoryList.getText().contains(category)) {

			et.log(LogStatus.PASS, "category is not Deleted as it includes products ",
					et.addScreenCapture(pass("category is not Deleted as it includes products")));

		} else {

			et.log(LogStatus.FAIL, "Even though there were products in it, the category is deleted ",
					et.addScreenCapture(fail("Even though there were products in it, the category is deleted")));
		}

	}

////////////////////Category Update Verification ///////////////////////////

	public void CategoryUpdateVerification() throws Exception {

		Utility.click(inventoryTab);
		Utility.click(extrasTab);
		Utility.click(categoryTab);

		Utility.click(updateCategoryEdit);
		Utility.click(updateCategoryName);
		Utility.click(updateCategoryText);
		Utility.Clear(updateCategoryText, "Updated"); // updating category name /// change string accordingly
		Utility.click(updateCategorySave);
		Utility.click(submitButton);

		if (updateCategoryName.getText().equals("Updated")) {

			et.log(LogStatus.PASS, "category is Updated successfuly ",
					et.addScreenCapture(pass("category is Updated successfuly")));

		} else {

			et.log(LogStatus.FAIL, "category is not Updated successfuly",
					et.addScreenCapture(fail("category is not Updated successfuly")));
		}

	}

/////////////////////////// manufacturer verifications ////////////////////////////////////////////////////////		

//////////////////// Manufacturer Creation Verification ///////////////////////////

	public void ManufacturerVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(extrasTab);
		Utility.implicitwait();
		Utility.click(manufacturerTab);
		Utility.implicitwait();

		if (manufacturerTable.isDisplayed()) {
			et.log(LogStatus.PASS, "Manufacturer details are displayed",
					et.addScreenCapture(pass("Manufacturer details are displayed")));

		} else {

			et.log(LogStatus.FAIL, "Manufacturer details are not displayed",
					et.addScreenCapture(fail("Manufacturer details are not displayed")));
		}

		Utility.implicitwait();
		Utility.click(newManufacturer);
		Utility.enterText(categoryText, "New Manufacturer1");
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.click(submitButton);
		Utility.implicitwait();

		if (manufacturerCreated.getText().equals("New Manufacturer1")) {

			et.log(LogStatus.PASS, "New manufacturer is created",
					et.addScreenCapture(pass("New manufacturer is created")));

		} else {

			et.log(LogStatus.FAIL, "New manufacturer is not created",
					et.addScreenCapture(fail("New manufacturer is not created")));
		}

		Utility.click(updateEdit);
		Utility.click(updateManufacturerName);
		Utility.implicitwait();
		Utility.click(updateCategoryText);
		Utility.Clear(updateCategoryText, "Updated"); // updating category name /// change string accordingly
		Utility.click(updateCategorySave);
		Utility.implicitwait();
		Utility.click(submitButton);
		try {
			Utility.click(clickRandom);

		} catch (ElementClickInterceptedException e) {

			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));

			if (manufacturerCreated.getText().equals("Updated")) {

				et.log(LogStatus.PASS, "Manufacturer is Updated successfuly ",
						et.addScreenCapture(pass("Manufacturer is Updated successfuly")));

			} else {

				et.log(LogStatus.FAIL, "Manufacturer is not Updated successfuly",
						et.addScreenCapture(fail("Manufacturer is not Updated successfuly")));
			}

		}
	}

/////////////////// Manufacturer delete Verification ///////////////////////////

	public void ManufacturerDeleteVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(extrasTab);
		Utility.implicitwait();
		Utility.click(manufacturerTab);
		Utility.implicitwait();

		Utility.click(deleteCategory);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.click(submitButton);

		try {
			Utility.click(clickRandom);

		} catch (ElementClickInterceptedException ex) {

			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));

			if (!manufacturerCreated.getText().equals("New Manufacturer1")) {

				et.log(LogStatus.PASS, "manufacturer is Deleted ",
						et.addScreenCapture(pass("manufacturer is Deleted ")));

			} else {

				et.log(LogStatus.FAIL, "manufacturer is not Deleted ",
						et.addScreenCapture(fail("manufacturer is not Deleted ")));
			}

		}
	}

////////////////////Brands Creation Verification ///////////////////////////

	public void BrandsVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(extrasTab);
		Utility.implicitwait();
		Utility.click(brandsTab);
		Utility.implicitwait();

		if (brandsTable.isDisplayed()) {
			et.log(LogStatus.PASS, "Brand details are displayed",
					et.addScreenCapture(pass("Brand details are displayed")));

		} else {

			et.log(LogStatus.FAIL, "Brand details are not displayed",
					et.addScreenCapture(fail("Brand details are not displayed")));
		}

		Utility.implicitwait();
		Utility.click(newBrand);
		Utility.enterText(categoryText, "New Brand1");
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.click(submitButton);
		Utility.implicitwait();

		if (brandCreated.getText().equals("New Brand1")) {

			et.log(LogStatus.PASS, "New Brand is created", et.addScreenCapture(pass("New Brand is created")));

		} else {

			et.log(LogStatus.FAIL, "New Brand is not created", et.addScreenCapture(fail("New Brand is not created")));
		}

		Utility.click(updateEdit);
		Utility.click(updateBrandName);
		Utility.implicitwait();
		Utility.click(updateCategoryText);
		Utility.Clear(updateCategoryText, "Updated"); // updating category name /// change string accordingly
		Utility.click(updateCategorySave);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.implicitwait();

		if(submitButton.isDisplayed()){
			
			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));
		}else {

	

			if (brandCreated.getText().equals("Updated")) {

				et.log(LogStatus.PASS, "Brand is Updated successfuly ",
						et.addScreenCapture(pass("Brand is Updated successfuly")));

			} else {

				et.log(LogStatus.FAIL, "Brand is not Updated successfuly",
						et.addScreenCapture(fail("Brand is not Updated successfuly")));
			}

		}
	}

	/////////////////// Brands Delete Verification ///////////////////////////

	public void BrandsDeleteVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(extrasTab);
		Utility.implicitwait();
		Utility.click(brandsTab);
		Utility.implicitwait();

		Utility.click(deleteCategory);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.implicitwait();
		
			if(submitButton.isDisplayed()){
			
			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));
		}else {

			if (!brandCreated.getText().equals("Updated")) {

				et.log(LogStatus.PASS, "Brand is Deleted ", et.addScreenCapture(pass("Brand is Deleted ")));

			} else {

				et.log(LogStatus.FAIL, "Brand is not Deleted ", et.addScreenCapture(fail("Brand is not Deleted ")));
			}

		}
	}

	
	
	
//////////////////// UOM Creation Verification ///////////////////////////

public void UOMVerification() throws Exception {

	Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(extrasTab);
		Utility.implicitwait();
		Utility.click(uomTab);
		Utility.implicitwait();
		
		if (uomTable.isDisplayed()) {
		et.log(LogStatus.PASS, "UOM details are displayed",
			et.addScreenCapture(pass("UOM details are displayed")));
		
		} else {
		
		et.log(LogStatus.FAIL, "UOM details are not displayed",
			et.addScreenCapture(fail("UOM details are not displayed")));
		}
		
		Utility.implicitwait();
		Utility.click(newUOM);
		Utility.enterText(categoryText, "New UOM1");
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.click(submitButton);
		Utility.implicitwait();
		
		if (uomCreated.getText().equals("New UOM1")) {
		
		et.log(LogStatus.PASS, "New UOM is created", et.addScreenCapture(pass("New UOM is created")));
		
		} else {
		
		et.log(LogStatus.FAIL, "New UOM is not created", et.addScreenCapture(fail("New UOM is not created")));
		}
		
		Utility.click(updateEdit);
		Utility.click(updateUOMName);
		Utility.implicitwait();
		Utility.click(updateCategoryText);
		Utility.Clear(updateCategoryText, "Updated"); // updating category name /// change string accordingly
		Utility.click(updateCategorySave);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.click(submitButton);
		
	
		
		try {
			submitButton.isDisplayed();
			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));
			
		
		} catch (Exception e) {
		

		
		if (uomCreated.getText().equals("Updated")) {
		
		et.log(LogStatus.PASS, "UOM is Updated successfuly ",
				et.addScreenCapture(pass("UOM is Updated successfuly")));
		
		} else {
		
		et.log(LogStatus.FAIL, "UOM is not Updated successfuly",
				et.addScreenCapture(fail("UOM is not Updated successfuly")));
		}
		
		}
		}
		

		/////////////////// UOM Delete Verification ///////////////////////////
		
		public void UOMDeleteVerification() throws Exception {
		
			Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(extrasTab);
		Utility.implicitwait();
		Utility.click(uomTab);
		Utility.implicitwait();
		
		WebElement two = driver.findElement(By.name("2"));
		 two.click();
		
		Utility.click(deleteCategory);
		Utility.implicitwait();
		Utility.click(submitButton);
	
		
		try {
			submitButton.isDisplayed();
			et.log(LogStatus.FAIL, "confirmation window doesnt disappears",
					et.addScreenCapture(pass("Not able to verify as confirmation window doesnt disappears")));
			
		
		} catch (Exception e) {
		
		
		if (!brandCreated.getText().equals("New Brand1")) {
		
		et.log(LogStatus.PASS, "UOM is Deleted ", et.addScreenCapture(pass("UOM is Deleted ")));
		
		} else {
		
		et.log(LogStatus.FAIL, "UOM is not Deleted ", et.addScreenCapture(fail("UOM is not Deleted ")));
		}
		
		}
		}
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
