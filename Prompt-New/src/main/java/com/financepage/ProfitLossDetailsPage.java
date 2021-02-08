package com.financepage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.relevantcodes.extentreports.LogStatus;
import com.util.Utility;

public class ProfitLossDetailsPage extends Base {

	@FindBy(xpath = "(//*[text()='Finance'])[1]")
	public WebElement financeTab;

	@FindBy(xpath = "(//*[text()='Profit & Loss'])[1]")
	public WebElement profitLossTab;

	@FindBy(xpath = "//*[text()='CONTINUING OPERATIONS']")
	public WebElement header1;

	@FindBy(xpath = "//*[text()='ASSETS']")
	public WebElement header2;

	public ProfitLossDetailsPage() {
		PageFactory.initElements(driver, this);
	}

//////////////////// Profit and Loss Page Verification ///////////////////////////

	@SuppressWarnings("unused")
	public void ProfitLossVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(profitLossTab);
		Utility.implicitwait();

		List<WebElement> rows = driver.findElements(By.xpath("//tr//td[@class=\"link-color\"]"));
		List<WebElement> numbers = driver.findElements(By.xpath("//tr/td[4]"));

		if ((rows.size() > 0) && (header1.isDisplayed())) {

			et.log(LogStatus.PASS, "All Blue number links and headers are present",
					et.addScreenCapture(pass("All Blue number links and headers are present")));

		} else {

			et.log(LogStatus.FAIL, "All Blue number links and headers are not present",
					et.addScreenCapture(fail("All Blue number links and headers are not present")));
		}

		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		for (int i = 0; i < rows.size(); i++) {

			rows.get(i).click();

			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()) {
				subWindowHandler = iterator.next();

				if (driver.switchTo().window(subWindowHandler) != null) {// switch to popup window

					System.out.println("Popup Opened");

					et.log(LogStatus.PASS, "All Detailed Popups are opened after clicking on all blue number links",
							et.addScreenCapture(
									pass("All Detailed Popups are opened after clicking on all blue number links")));

					Utility.implicitwait();
					driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M563.8 512')]")).click();
					driver.switchTo().window(parentWindowHandler); // switch back to parent window

				} else {
					et.log(LogStatus.FAIL, "All Popups are not opened:" + rows.get(i),
							et.addScreenCapture(fail("All Popups are not opened")));
				}
			}
		}

	}

}
