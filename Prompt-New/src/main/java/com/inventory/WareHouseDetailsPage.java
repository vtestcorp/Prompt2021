package com.inventory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class WareHouseDetailsPage extends Base {

	String warehousename = Utility.excelRead(7, 1, "InventoryDetails");

	@FindBy(xpath = "(//*[text()='Inventory'])[1]")
	public WebElement inventoryTab;

	@FindBy(xpath = "(//*[text()='Warehouse']/..)[1]")
	public WebElement warehouseTab;

	@FindBy(xpath = "//*[text()='My Warehouse']/..")
	public WebElement mywarehouseTab;

	@FindBy(xpath = "//*[text()='Stock Summary']/..")
	public WebElement stockSummaryTab;

	@FindBy(xpath = "//*[text()='Stock Adjustment']/..")
	public WebElement stockAdjustmentTab;

	@FindBy(xpath = "//*[text()='Aged Stock']/..")
	public WebElement agedStockTab;

	@FindBy(xpath = "//*[text()='Product Price']/..")
	public WebElement productPriceTab;

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

	@FindBy(xpath = "//div[@class='ant-select-selector']")
	public WebElement warehouseCountryDrop;

	@FindBy(xpath = "//div[@name='India']")
	public WebElement warehouseCountrySelect;

	@FindBy(xpath = "(//*[@placeholder=\"Street Address (contd.)\"])[2]")
	public WebElement zipText;

	@FindBy(xpath = "//div[text()='Warehouse Name is required.']")
	public WebElement errorWarehouse;

	@FindBy(xpath = "//*[text()='Submit']/.")
	public WebElement submitWarehouse;

	@FindBy(xpath = "(//*[@col-id=\"totalItem\"])[2]")
	public WebElement totalItemWarehouse;

	@FindBy(xpath = "(//*[@class=\"fa fa-trash\"])[1]")
	public WebElement deleteWareHouseItems;

	@FindBy(xpath = "//div[@class=\"ant-notification-notice-description\"]")
	public WebElement errorMessageDeleteItems;

	@FindBy(xpath = "//*[text()='Deleted successfully.']")
	public WebElement errorMessageDelete;

	@FindBy(xpath = "(//*[@col-id='warehouseName'])[2]")
	public WebElement firstWareHouseName;

	@FindBy(xpath = "(//*[@class='fa fa-edit'])[1]")
	public WebElement firstEditPencil;

	@FindBy(xpath = "//*[@class='ag-center-cols-clipper']")
	public WebElement wareHouseTable;

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[1]")
	public WebElement wareHouseDropstock;

	@FindBy(xpath = "//*[@class='ant-table-thead']")
	public WebElement stockSummaryTableHead;

	@FindBy(xpath = "//input[@placeholder='Enter 3 characters product name']")
	public WebElement searchStockSummary;

	@FindBy(xpath = "//button[@type=\"button\"]")
	public WebElement productAddButton;

	@FindBy(xpath = "//*[@id=\"root\"]//div[2]//table/tbody/tr[2]/td[1]/div")
	public WebElement variantTab;

	@FindBy(xpath = "(//*[@class=\"fa fa-edit\"])[1]")
	public WebElement stockAdjustEdit;

	@FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]")
	public WebElement stockAdjustData;

	@FindBy(xpath = "//*[@class=\"page-title\"][text()='Aged Products']")
	public WebElement agedProductPage;

	@FindBy(xpath = "//input[@id=\"currentStock\"]")
	public WebElement currentStockEdit;

	@FindBy(xpath = "//input[@id=\"qtyOnPO\"]")
	public WebElement qtyPOEdit;

	@FindBy(xpath = "//input[@id=\"salesCommitted\"]")
	public WebElement qtySOEdit;

	@FindBy(xpath = "(//*[@class=\"fa fa-save\"])[1]")
	public WebElement stockAdjustSave;

	@FindBy(xpath = "//*[@id=\"root\"]//div[2]//div/table/tbody/tr[3]/td[4]")
	public WebElement currentStock;

	@FindBy(xpath = "//*[@id=\"root\"]//div[2]//div/table/tbody/tr[3]/td[5]")
	public WebElement qtySO;

	@FindBy(xpath = "//*[@id=\"root\"]//div[2]//div/table/tbody/tr[3]/td[7]")
	public WebElement qtyPO;

	public WareHouseDetailsPage() {
		PageFactory.initElements(driver, this);
	}

////////////////////Create warehouse ///////////////////////////

	public void CreateWareHouse() throws Exception {

		Thread.sleep(4000);
		Utility.click(inventoryTab);
		System.out.println(1);
		Utility.click(warehouseTab);
		System.out.println(2);
		Utility.click(mywarehouseTab);
		System.out.println(3);
		Thread.sleep(2000);
		Utility.click(newwarehouseButton);
		System.out.println(4);
		Thread.sleep(2000);
		Utility.enterText(warehouseNametext, Utility.excelRead(7, 1, "InventoryDetails"));
		System.out.println(5);
		Utility.enterText(streetAddressText, Utility.excelRead(7, 2, "InventoryDetails"));
		System.out.println(6);
		Utility.enterText(cityText, Utility.excelRead(7, 3, "InventoryDetails"));
		System.out.println(7);
//Utility.click(warehouseCountryDrop);
//Utility.click(warehouseCountrySelect);
		System.out.println(425256);
		//Utility.enterText(zipText, Utility.excelReadInt(7, 6, "InventoryDetails"));
		Utility.enterText(zipText, "425256");
		System.out.println(8);
		Utility.click(createWarehouseButton);
		System.out.println(9);
		Thread.sleep(1000);
		Utility.wait_N_click(submitWarehouse);
		System.out.println(10);
		Thread.sleep(3000);

		WebElement actWare = driver
				.findElement(By.xpath("//*[text()='" + Utility.excelRead(7, 1, "InventoryDetails") + "']"));

		String actwarehouse = actWare.getText();
		if (warehousename.equals(actwarehouse)) {

			et.log(LogStatus.PASS, "New warehouse is created", et.addScreenCapture(pass("New warehouse is created")));
		} else {

			System.out.println("not equal");
			et.log(LogStatus.FAIL, "New warehouse is not created",
					et.addScreenCapture(fail("New warehouse is not created")));
		}
	}

////////////////////Create warehouse negative validation ///////////////////////////

	public void CreateWareHouseNegative() throws Exception {

		Thread.sleep(4000);
		Utility.click(inventoryTab);
		Utility.click(warehouseTab);
		Utility.click(mywarehouseTab);
		Thread.sleep(2000);
		Utility.click(newwarehouseButton);
		Thread.sleep(2000);
		Utility.click(createWarehouseButton);

		if (errorWarehouse.isDisplayed()) {

			et.log(LogStatus.PASS, "Warehouse name not enterned and Proper error message is displayed",
					et.addScreenCapture(pass("Warehouse name not enterned and Proper error message is displayed")));
		} else {

			System.out.println("not equal");
			et.log(LogStatus.FAIL, "Proper error message is not displayed",
					et.addScreenCapture(fail("Proper error message is not displayed")));
		}
	}

///////////////////////// Delete WareHouse with items  /////////////////////////////

	public void DeleteWareHouseItems() throws Exception {

		Thread.sleep(4000);
		Utility.click(inventoryTab);
		Utility.click(warehouseTab);
		Utility.click(mywarehouseTab);
		Utility.implicitwait();

		String number = totalItemWarehouse.getText();
		int num = Integer.parseInt(number);

		if (num > 0) {

			Utility.click(deleteWareHouseItems);
			Utility.implicitwait();
			Utility.click(submitWarehouse);

			if (errorMessageDeleteItems.isDisplayed()) {

				et.log(LogStatus.PASS,
						"Proper error message is displayed and wareshouse with items in it is not deleted",
						et.addScreenCapture(pass(
								"Proper error message is displayed and wareshouse  with items in it is not deleted")));

			} else {

				et.log(LogStatus.FAIL,
						"Proper error message is not displayed and wareshouse with items in it is deleted",
						et.addScreenCapture(fail(
								"Proper error message is not displayed and wareshouse with items in it is  deleted")));
			}
		} else {

			et.log(LogStatus.FAIL, "Warehouse doesnt contain any items",
					et.addScreenCapture(fail("Warehouse doesnt contain any items")));

		}
	}

///////////////////////// Delete WareHouse without items  /////////////////////////////

	public void DeleteWareHouse() throws Exception {

		Thread.sleep(4000);
		Utility.click(inventoryTab);
		Utility.click(warehouseTab);
		Utility.click(mywarehouseTab);
		Utility.click(newwarehouseButton);
		Utility.enterText(warehouseNametext, "NEW");
		Utility.click(createWarehouseButton);
		Utility.wait_N_click(submitWarehouse);
		Thread.sleep(3000);

		Utility.click(deleteWareHouseItems);
		Utility.click(submitWarehouse);
		List<WebElement> warehouseNames=driver.findElements(By.xpath("(//span[@class='ag-cell-value'])"));
		for (int i=0; i<warehouseNames.size(); i++) {
			String s=warehouseNames.get(i).getText();
			System.out.println(s);
			if (s.equalsIgnoreCase("NEW")) {
				et.log(LogStatus.PASS, "Proper error message is displayed and wareshouse is deleted",
						et.addScreenCapture(pass("Proper error message is displayed and wareshouse is deleted")));
			} else {

				et.log(LogStatus.FAIL, "Proper error message is not displayed and wareshouse is not deleted",
						et.addScreenCapture(fail("Proper error message is not displayed and wareshouse is not deleted")));
			}
		}
	}
///////////////////////// Update WareHouse  /////////////////////////////

	public void UpdateWareHouse() throws Exception {

		Utility.click(inventoryTab);
		System.out.println(1);
		Utility.click(warehouseTab);
		System.out.println(2);
		Utility.click(mywarehouseTab);
		System.out.println(3);
		String firstname = firstWareHouseName.getText();
		System.out.println(firstname);
		Utility.click(firstEditPencil);
		System.out.println(4);
		if (warehouseNametext.getText().equals(firstname)) {

			et.log(LogStatus.PASS, "Pop up opened with data loaded",
					et.addScreenCapture(pass("Pop up opened with data loaded")));

		} else {

			et.log(LogStatus.FAIL, "Pop up opened with no data loaded",
					et.addScreenCapture(fail("Pop up opened with no data loaded")));
		}

		Utility.enterText(warehouseNametext, "Updated Name");
		System.out.println(5);
		Utility.click(createWarehouseButton);
		System.out.println(6);
		Utility.wait_N_click(submitWarehouse);
		System.out.println(7);
		//WebElement abc = driver.findElement(By.xpath("//*[text()='" + firstname + "']"));
		System.out.println(8);
		String firstname1 = firstWareHouseName.getText();
		//&& (!abc.isDisplayed())
		if ((firstname1.equals("Updated Name"))) {

			et.log(LogStatus.PASS, "Ware House Name Updated", et.addScreenCapture(pass("Ware House Name Updated")));

		} else {

			et.log(LogStatus.FAIL, "Ware House Name not Updated",
					et.addScreenCapture(fail("Ware House Name not Updated")));
		}
	}

///////////////////////// Stock Summary Validation  /////////////////////////////

	public void StockSummaryValidation() throws Exception {

		Utility.click(inventoryTab);
		System.out.println(1);
		Utility.click(warehouseTab);
		System.out.println(2);
		Utility.click(stockSummaryTab);
		System.out.println(3);
		//Utility.click(wareHouseDropstock);
		System.out.println(4);
		//Utility.enterTextExt(driver.findElement(By.xpath("//input[@id='rc_select_2']")), "Main");
		//Utility.JSClick(driver.findElement(By.xpath("//input[@id='rc_select_2']")));
		//Utility.wait(driver.findElement(By.xpath("//input[@id='rc_select_2']")));
		//Utility.SendKeysClick(driver.findElement(By.xpath("//input[@id='rc_select_2']")));
		//Utility.JSClick(driver.findElement(By.xpath("//div[@name='Main']")));
		System.out.println(5);
		if (stockSummaryTableHead.isDisplayed()) {
			et.log(LogStatus.PASS, "Stock Data and numbers are displayed",
					et.addScreenCapture(pass("Stock Data and numbers are displayed")));

		} else {

			et.log(LogStatus.FAIL, "Stock Data and numbers are not displayed",
					et.addScreenCapture(fail("Stock Data and numbers are not displayed")));
		}
		System.out.println(6);
		Utility.enterText(searchStockSummary, "Milaze");
		System.out.println(7);
		WebElement searchedProduct = driver.findElement(By.xpath("(//*[text()='Milaze'])[1]"));
		
		if (searchedProduct.isDisplayed()) {

			et.log(LogStatus.PASS, "searched product details displayed",
					et.addScreenCapture(pass("searched product details displayed")));

		} else {

			et.log(LogStatus.FAIL, "searched product details are not displayed",
					et.addScreenCapture(fail("searched product details are not displayed")));
		}
	}

///////////////////////// Stock Summary variant Validation  /////////////////////////////

	public void StockVariantValidation() throws Exception {

		Utility.click(inventoryTab);
		Utility.click(warehouseTab);
		Utility.click(stockSummaryTab);
		Utility.implicitwait();
		Utility.enterText(searchStockSummary, "ACE Laptop");
		Utility.click(productAddButton);
		if (variantTab.isDisplayed()) {

			et.log(LogStatus.PASS, "product variant details displayed",
					et.addScreenCapture(pass("product variant details displayed")));

		} else {

			et.log(LogStatus.FAIL, "product variant details are not displayed",
					et.addScreenCapture(fail("product variant details are not displayed")));
		}

	}

///////////////////////// Stock adjustment  Validation  /////////////////////////////

	public void StockAdjustmentValidation() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(warehouseTab);
		Utility.click(stockAdjustmentTab);
		Utility.implicitwait();
		if (stockAdjustData.isDisplayed()) {
			et.log(LogStatus.PASS, "Stock Adjustment details are displayed",
					et.addScreenCapture(pass("Stock Adjustment details are displayed")));

		} else {

			et.log(LogStatus.FAIL, "Stock Adjustment details are not displayed",
					et.addScreenCapture(fail("Stock Adjustment details are not displayed")));
		}

		Utility.click(stockAdjustEdit);
		Utility.Clear(currentStockEdit, "40");
		Utility.Clear(qtySOEdit, "10");
		Utility.Clear(qtyPOEdit, "100");
		Utility.implicitwait();
		Utility.wait_N_click(submitWarehouse);
		Utility.implicitwait();

		if ((currentStock.getText().equals("40")) && (qtySO.getText().equals("10"))
				&& (qtyPO.getText().equals("100"))) {

			et.log(LogStatus.PASS, "data is updated succesfuly",
					et.addScreenCapture(pass("data is updated succesfuly")));

		} else {

			et.log(LogStatus.FAIL, "data is not updated succesfuly",
					et.addScreenCapture(fail("data is not updated succesfuly")));
		}
	}

///////////////////////// Aged Stock Validation  /////////////////////////////

	public void AgedStockValidation() throws Exception {

		Utility.implicitwait();
		Utility.click(inventoryTab);
		Utility.click(warehouseTab);
		Utility.click(agedStockTab);
		Utility.implicitwait();

		if (agedProductPage.isDisplayed()) {
			et.log(LogStatus.PASS, "Aged Product details are displayed",
					et.addScreenCapture(pass("Aged Product details are displayed")));

		} else {

			et.log(LogStatus.FAIL, "Aged Product details are not displayed",
					et.addScreenCapture(fail("Aged Product details are not displayed")));
		}

	}

}
