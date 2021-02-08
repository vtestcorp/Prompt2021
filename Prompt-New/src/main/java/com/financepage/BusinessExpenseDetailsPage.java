package com.financepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class BusinessExpenseDetailsPage extends Base {

	@FindBy(xpath = "//*[text()='Business Expense']")
	public WebElement businessExpenseTab;

	@FindBy(xpath = "//*[text()='New Business Expense']")
	public WebElement newBusinessExpenseButton;

	@FindBy(xpath = "(//*[@col-id=\"expenseType\"])[2]")
	public WebElement expenseType;

	@FindBy(xpath = "(//*[@col-id=\"description\"])[2]")
	public WebElement descrption;

	@FindBy(xpath = "(//textarea)[1]")
	public WebElement textAreaDescription;

	@FindBy(xpath = "(//*[@col-id=\"expenseAmount\"])[2]")
	public WebElement expenseAmount;

	@FindBy(xpath = "//*[@placeholder=\"Remarks\"]")
	public WebElement remarks;

	@FindBy(xpath = "//button[text()='Save']")
	public WebElement saveButton;

	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement submitButton;

	@FindBy(xpath = "(//*[text()='Finance'])[1]")
	public WebElement financeTab;

	@FindBy(xpath = "//*[@class=\"ant-input-number-input\"]")
	public WebElement textAmount;

	@FindBy(xpath = "//*[@class=\"ant-picker\"]")
	public WebElement dateActual;
	
	@FindBy(xpath = "//*[@class=\"ant-pagination-total-text\"]")
	public WebElement actCount;
	
	

	public BusinessExpenseDetailsPage() {
		PageFactory.initElements(driver, this);
	}

//////////////////// Create Business Expense Verification ///////////////////////////

	public void BusinessExpenseVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(businessExpenseTab);
		Utility.implicitwait();
		Utility.click(newBusinessExpenseButton);
		Utility.implicitwait();
		String date = dateActual.getText();
		System.out.println(date);
		Utility.click(expenseType);
		Utility.click(expenseType);
		driver.findElement(By.xpath("//div[@name='Travel Expense']")).click();
		Utility.click(descrption);
		Utility.enterText(textAreaDescription, "No need to describe");
		Utility.click(remarks);
		Utility.click(expenseAmount);
		Utility.enterText(textAmount, "1200");
		String amount = "1200";
		System.out.println(amount);
		Utility.enterText(remarks, "No need to make Remarks");
		Utility.click(saveButton);
		Utility.implicitwait();
		Utility.click(submitButton);
		Utility.implicitwait();
		
		System.out.println(actCount.getText());
		if (!actCount.getText().contains("0")) {

			et.log(LogStatus.PASS, "New Expense is created", et.addScreenCapture(pass("New Expense is created")));

		} else {

			et.log(LogStatus.FAIL, "New Expense is not created",
					et.addScreenCapture(fail("New Expense is not created")));
		}

	}

}
