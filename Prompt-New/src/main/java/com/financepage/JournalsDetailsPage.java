package com.financepage;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class JournalsDetailsPage extends Base {

	@FindBy(xpath = "(//*[text()='Finance'])[1]")
	public WebElement financeTab;

	@FindBy(xpath = "(//*[text()='Journals'])[1]")
	public WebElement journalsTab;

	@FindBy(xpath = "//*[text()='New Journal']")
	public WebElement newJournalButton;

	@FindBy(xpath = "//*[text()='ASSETS']")
	public WebElement header2;

	@FindBy(xpath = "(//*[@col-id=\"product\"])[3]")
	public WebElement ledgerDebit;

	@FindBy(xpath = "(//*[@col-id=\"product\"])[2]")
	public WebElement ledgerCredit;

	@FindBy(xpath = "//*[text()='Add Line']")
	public WebElement addLineButton;

	@FindBy(xpath = "(//*[@col-id=\"debit\"])[3]")
	public WebElement debitAmount;

	@FindBy(xpath = "(//*[@class=\"ant-col ant-col-12\"])[3]")
	public WebElement debitAmountText;

	@FindBy(xpath = "(//*[@class=\"ant-col ant-col-12\"])[4]")
	public WebElement creditAmountText;

	@FindBy(xpath = "(//*[@col-id=\"credit\"])[2]")
	public WebElement crediAmount;

	@FindBy(xpath = "//*[@placeholder=\"Narration.\"]")
	public WebElement narrater;

	@FindBy(xpath = "//div//button[contains(text(),'Save')]")
	public WebElement saveButton;

	@FindBy(xpath = "//*[text()='Please select Customer, Product, Quantity and Rate']")
	public WebElement errorSaveMessage;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement submitButton;

	@FindBy(xpath = "//tr//td[text()='Debtors']")
	public WebElement actLedger1;

	@FindBy(xpath = "//tr//td[text()='Sales']")
	public WebElement actLedger2;

	@FindBy(xpath = "(//tr//td[text()='1600'])[1]")
	public WebElement actDebt;

	@FindBy(xpath = "(//tr//td[text()='1600'])[2]")
	public WebElement actCredt;

	@FindBy(xpath = "(//*[text()='Balance Sheet'])[1]")
	public WebElement balanceSheetTab;

	@FindBy(xpath = "(//td[3]//a)[20]")
	public WebElement cashEquivalents;

	@FindBy(xpath = "//*[name()='path' and contains(@d,'M563.8 512')]")
	public WebElement closeIcon;

	@FindBy(xpath = "(//*[text()='Profit & Loss'])[1]")
	public WebElement profitLossTab;

	@FindBy(xpath = "//*[text()='Finance Cost']")
	public WebElement clickRandom;

	@FindBy(xpath = "(//tr//td[@class=\"link-color\"])[2]")
	public WebElement otherIncomeLink;

	@FindBy(xpath = "//div[@class='ant-modal-root']//tr[3]//td[2]")
	public WebElement commision;

	@FindBy(xpath = "//div[@class='ant-modal-root']//tr[2]//td[2]")
	public WebElement cash;

	@FindBy(xpath = "//*[@class=\"ant-select-selection-search-input\"]")
	public WebElement textField;

	public JournalsDetailsPage() {
		PageFactory.initElements(driver, this);
	}

////////////////////Journal  Page Verification ///////////////////////////

	@SuppressWarnings("unused")
	public void JournalPageVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(journalsTab);
		Utility.implicitwait();
		Utility.click(newJournalButton);
		Utility.implicitwait();
		Utility.click(addLineButton);

		Utility.click(ledgerDebit);
		Utility.click(ledgerDebit);
		textField.sendKeys("Commission");
		driver.findElement(By.xpath("//div[@name='Commission']")).click();
		String select1 = "Commission";
		Utility.click(debitAmount);
		Utility.implicitwait();

		Utility.implicitwait();
		debitAmount.sendKeys("001600");

		Utility.click(ledgerCredit);
		Utility.click(ledgerCredit);
		textField.sendKeys("Cash in hand");
		driver.findElement(By.xpath("//div[@name='Cash in hand']")).click();
		String select2 = "Cash in hand";
		Utility.click(crediAmount);

		Utility.implicitwait();
		Utility.implicitwait();
		crediAmount.sendKeys("001600");
		Utility.implicitwait();

		Utility.click(narrater);
		Utility.enterText(narrater, "No need of this");

		String debt = debitAmountText.getText();
		String cret = creditAmountText.getText();

		System.out.println(debt);
		System.out.println(cret);

		Utility.click(saveButton);
		Utility.implicitwait();
		Utility.click(submitButton);
		Thread.sleep(3000);

		Utility.click(balanceSheetTab);
		Utility.implicitwait();
		Utility.implicitwait();
		Utility.click(cashEquivalents);
		Utility.implicitwait();

		String cashtext = cash.getText();

		Robot robot = new Robot(); // Robot class throws AWT Exception
		robot.keyPress(KeyEvent.VK_ESCAPE);

		Utility.click(profitLossTab);
		Utility.implicitwait();
		Utility.click(clickRandom);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		Utility.implicitwait();

		Utility.click(otherIncomeLink);

		String commisiontext = commision.getText();

		if (commisiontext.equals(debt)) {

			et.log(LogStatus.PASS, "Debit Elements are getting reflected on BS and PL sheets.",
					et.addScreenCapture(pass("Debit Elements are getting reflected on BS and PL sheets.")));

		} else {

			et.log(LogStatus.FAIL, "Debit Elements are not getting reflected on BS and PL sheets.",
					et.addScreenCapture(fail("Debit Elements are not getting reflected on BS and PL sheets.")));
		}

		if (cashtext.equals(cret)) {

			et.log(LogStatus.PASS, "Credit Elements are getting reflected on BS and PL sheets.",
					et.addScreenCapture(pass(" Credit Elements are getting reflected on BS and PL sheets.")));

		} else {

			et.log(LogStatus.FAIL, " Credit Elements are not getting reflected on BS and PL sheets.",
					et.addScreenCapture(fail("Credit Elements are not getting reflected on BS and PL sheets.")));
		}

//		List<WebElement> invoiceGenerated = driver.findElements(By.xpath("//div[@class=\"cursor-pointer\"]"));
//
//		int j = invoiceGenerated.size();
//
//		for (int i = 0; i < invoiceGenerated.size(); i++) {
//
//			invoiceGenerated.get(j - 1).click();
//
//		}
//		Thread.sleep(5000);
//		Utility.implicitwait();
//		Utility.implicitwait();
//		Utility.implicitwait();
////		WebElement actLedger1 = driver.findElement(By.xpath("//tr//td[text()='Debtors']"));
////		WebElement actLedger2 = driver.findElement(By.xpath("//tr//td[text()='Sales']"));
////		WebElement actDebt = driver.findElement(By.xpath("(//tr//td[text()='1400'])[1]"));
////		WebElement actCredt = driver.findElement(By.xpath("(//tr//td[text()='1400'])[2]"));
//
//		if (actLedger1.isDisplayed() && (actLedger2.isDisplayed()) && (actDebt.isDisplayed())
//				&& (actCredt.isDisplayed())) {
//
//			et.log(LogStatus.PASS, "All Details are present", et.addScreenCapture(pass("All Details are present")));
//
//		} else {
//
//			et.log(LogStatus.FAIL, "All Details are not present",
//					et.addScreenCapture(fail("All Details are not present")));
//		}

	}
}
