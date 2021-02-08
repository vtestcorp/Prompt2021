package com.financepage;

import java.math.BigDecimal;
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

public class TrialBalancedetailsPage extends Base {

	@FindBy(xpath = "(//*[text()='Finance'])[1]")
	public WebElement financeTab;

	@FindBy(xpath = "(//*[text()='Trial Balance'])[1]")
	public WebElement trialBalancetab;

	@FindBy(xpath = "//*[text()='Trial Balance as on ']")
	public WebElement header1;

	@FindBy(xpath = "//*[text()='ASSETS']")
	public WebElement header2;

	public TrialBalancedetailsPage() {
		PageFactory.initElements(driver, this);
	}

////////////////////Trial balance Page Verification ///////////////////////////

	@SuppressWarnings("unused")
	public void TrialBalanceVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(trialBalancetab);
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

////////////////////Trial balance Addition Verification ///////////////////////////

	public void TrialBalanceAdditionVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(trialBalancetab);
		Utility.implicitwait();

		List<WebElement> numbers = driver.findElements(By.xpath("//tr//td[3]"));
		double sum1 = 0;

		for (int i = 0; i < numbers.size() - 1; i++) {
			String text = numbers.get(i).getText();
			// System.out.println(text);
			double d1 = Double.parseDouble(text);

			sum1 = sum1 + d1;

		}

		String str = String.valueOf(sum1);
		BigDecimal bg = new BigDecimal(str);
		System.out.println(bg);
		WebElement total1 = driver.findElement(By.xpath("(//tr//td[3])[127]")); // tr[20]/td[4]
		String totalexp = total1.getText().replaceAll("[^0-9.]", "");
		BigDecimal tg = new BigDecimal(str);
		System.out.println("aaaaaaaa" + totalexp);

		if (tg.equals(bg)) {
			et.log(LogStatus.PASS, "Total of Debit amount is correct",
					et.addScreenCapture(pass("Total of Debit amount  is correct")));

		} else {

			et.log(LogStatus.FAIL, "Total of Debit amount is not correct",
					et.addScreenCapture(fail("Total of Debit amount  is not correct")));
		}

		List<WebElement> numbers1 = driver.findElements(By.xpath("//tr//td[4]"));

		double sum2 = 0;

		for (int i = 0; i < numbers1.size() - 1; i++) {
			String text1 = numbers1.get(i).getText();
			// System.out.println(text1);
			double d2 = Double.parseDouble(text1);
			sum2 = sum2 + d2;
		}
		String str1 = String.valueOf(sum2);
		BigDecimal bg1 = new BigDecimal(str1);
		System.out.println(bg1);
		WebElement total2 = driver.findElement(By.xpath("(//tr//td[4])[127]")); // tr[20]/td[4]
		String totalexp1 = total2.getText().replaceAll("[^0-9.]", "");
		BigDecimal tg1 = new BigDecimal(totalexp1);

		System.out.println("kkkkk" + totalexp1);

		if (tg1.equals(bg1)) {
			et.log(LogStatus.PASS, "Total of Credit amount is correct",
					et.addScreenCapture(pass("Total of Credit amount  is correct")));

		} else {

			et.log(LogStatus.FAIL, "Total of Credit amount is not correct",
					et.addScreenCapture(fail("Total of Credit amount  is not correct")));
		}

	}
}
