package com.financepage;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class OpeningBalanceDetailsPage extends Base{
	
	
	
	@FindBy(xpath = "(//*[text()='Finance'])[1]")
	public WebElement financeTab;

	@FindBy(xpath = "(//*[text()='Opening Balance'])[1]")
	public WebElement openingBaltab;
	
	@FindBy(xpath = "//*[@placeholder=\"Search\"]")
	public WebElement searchText;
	
	@FindBy(xpath = "(//*[@col-id=\"ledgerAccountName\"])[2]")
	public WebElement ledgerFirstName;
	
	@FindBy(xpath = "(//*[@col-id=\"openingBalance\"])[2]")
	public WebElement balanceAccount;
	
	@FindBy(xpath = "//*[@type=\"number\"]")
	public WebElement balanceAccountText;
	
	@FindBy(xpath = "(//*[text()='Profit & Loss'])[1]")
	public WebElement profitLossTab;
	
	@FindBy(xpath = "//*[text()='Finance Cost']")
	public WebElement clickRandom;
	
	@FindBy(xpath = "(//tr//td[@class=\"link-color\"])[2]")
	public WebElement otherIncomeLink;
	
	@FindBy(xpath = "//div[@class='ant-modal-root']//tr[3]//td[2]")
	public WebElement commision;
	
	
	
	public OpeningBalanceDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
////////////////////Opening Balance SearchPage Verification ///////////////////////////

public void OpeningBalanceVerification() throws Exception {

	Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(openingBaltab);
		Utility.implicitwait();	
		
		
		//String actsearchname = ledgerFirstName.getText();

		Utility.enterText(searchText, "Commission");
		Utility.implicitwait();
		String expsearchname = ledgerFirstName.getText();

		if ("Commission".equalsIgnoreCase(expsearchname)) {

			et.log(LogStatus.PASS, "Ledger Account is searched and searched result is correct ",
					et.addScreenCapture(pass("Ledger Account is searched and searched result is correct")));

		} else {

			et.log(LogStatus.FAIL, "Ledger Account searched result is not correct",
					et.addScreenCapture(fail("Ledger Account searched result is not correct")));
		}
	
		

		Utility.click(balanceAccount);
		Utility.implicitwait();
		Utility.Clear(balanceAccountText, "1500");
		Utility.click(ledgerFirstName);
		
		 Utility.click(profitLossTab);
			Utility.implicitwait();
			Utility.click(clickRandom);
			
			Robot robot = new Robot();  // Robot class throws AWT Exception	
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			Utility.implicitwait();

			Utility.click(otherIncomeLink);

			String commisiontext = commision.getText();

			if (commisiontext.equals("1500")) {

				et.log(LogStatus.PASS, "Debit Elements are getting reflected on BS and PL sheets.",
						et.addScreenCapture(pass("Debit Elements are getting reflected on BS and PL sheets.")));

			} else {

				et.log(LogStatus.FAIL, "Debit Elements are not getting reflected on BS and PL sheets.",
						et.addScreenCapture(
								fail("Debit Elements are not getting reflected on BS and PL sheets.")));
			}
		
		
		
		
}
	

}
