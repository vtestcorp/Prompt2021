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

public class BalanceSheetDeatailsPage extends Base {

	@FindBy(xpath = "(//*[text()='Finance'])[1]")
	public WebElement financeTab;

	@FindBy(xpath = "(//*[text()='Balance Sheet'])[1]")
	public WebElement balanceSheetTab;

	@FindBy(xpath = "//*[text()='EQUITY AND LIABILITIES']")
	public WebElement header1;

	@FindBy(xpath = "//*[text()='ASSETS']")
	public WebElement header2;

	public BalanceSheetDeatailsPage() {
		PageFactory.initElements(driver, this);
	}

//////////////////// Balance Sheet Verification ///////////////////////////

	@SuppressWarnings("unused")
	public void BalanceSheetVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(balanceSheetTab);
		Utility.implicitwait();

		List<WebElement> rows = driver.findElements(By.xpath("//td[3]//a"));
		List<WebElement> numbers = driver.findElements(By.xpath("//tr/td[4]"));

		if ((rows.size() > 0) && (header1.isDisplayed()) && (header2.isDisplayed())) {

			et.log(LogStatus.PASS, "All Blue number links and headers are present",
					et.addScreenCapture(pass("All Blue number links and headers are present")));

		} else {

			et.log(LogStatus.FAIL, "All Blue number links and headers are not present",
					et.addScreenCapture(fail("All Blue number links and headers are not present")));
		}

//		 driver.findElement(By.xpath("//td[3]//a[1]")).click();  
//			Utility.implicitwait();
//		 driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M563.8 512')]")).click();

		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
//
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

////////////////////Balance Sheet Addition Verification ///////////////////////////

	public void BalanceSheetAdditionVerification() throws Exception {

		Utility.implicitwait();
		Utility.click(financeTab);
		Utility.click(balanceSheetTab);
		Utility.implicitwait();

		List<WebElement> numbers = driver.findElements(By.xpath("//tr/td[4]"));
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double sum = 0;

		for (int i = 4; i < 7; i++) {
			String text = numbers.get(i).getText();
			double d1 = Double.parseDouble(text);
			System.out.println(d1);
			sum1 = sum1 + d1;
		}

		for (int j = 9; j < 13; j++) {
			String text1 = numbers.get(j).getText();
			double d2 = Double.parseDouble(text1);
			System.out.println(d2);
			sum2 = sum2 + d2;
		}

		for (int k = 15; k < 19; k++) {
			String text2 = numbers.get(k).getText();
			double d3 = Double.parseDouble(text2);
			System.out.println(d3);
			sum3 = sum3 + d3;
		}
		sum = sum1 + sum2 + sum3;
		String str = String.valueOf(sum);
		BigDecimal bg = new BigDecimal(str);

		System.out.println(bg);
		WebElement total1 = driver.findElement(By.xpath("//tr[20]/td[4]")); // tr[20]/td[4]
		String totalexp = total1.getText().replaceAll("[^0-9.]", "");
		BigDecimal tg = new BigDecimal(totalexp);

		if (tg.equals(bg)) {
			et.log(LogStatus.PASS, "Total of amount in EQUITY AND LIABILITIES is correct",
					et.addScreenCapture(pass("Total of amount in EQUITY AND LIABILITIES is correct")));

		} else {

			et.log(LogStatus.FAIL, "Total of amount in EQUITY AND LIABILITIES is not correct",
					et.addScreenCapture(fail("Total of amount in EQUITY AND LIABILITIES is not correct")));
		}

		System.out.println();
		for (int i = 23; i < 28; i++) {
			String text11 = numbers.get(i).getText();
			System.out.println(text11);
			double d1 = Double.parseDouble(text11);
			sum1 = sum1 + d1;

		}

		for (int j = 29; j < 35; j++) {
			String text22 = numbers.get(j).getText();
			System.out.println(text22);
			double d2 = Double.parseDouble(text22);
			sum2 = sum2 + d2;

		}
		sum1 = sum1 + sum2;
		String str1 = String.valueOf(sum1);
		BigDecimal bg1 = new BigDecimal(str1);
		System.out.println(bg1);

		WebElement total2 = driver.findElement(By.xpath("//tr[36]/td[4]")); // tr[20]/td[4]
		String totalexp1 = total2.getText().replaceAll("[^0-9.]", "");
		BigDecimal tg1 = new BigDecimal(totalexp1);

		if (tg1.equals(bg1)) {
			et.log(LogStatus.PASS, "Total of amount in ASSETS is correct",
					et.addScreenCapture(pass("Total of amount in ASSETS is correct")));

		} else {

			et.log(LogStatus.FAIL, "Total of amount in ASSETS is not correct",
					et.addScreenCapture(fail("Total of amount in ASSETS is not correct")));
		}
	}

}