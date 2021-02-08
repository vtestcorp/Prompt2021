package com.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.base.Base;

public class Utility extends Base {
	public static Date date;
	public static String text;
	public static String intText;
	public static JavascriptExecutor js;
	public static Actions act;
	public static Select drpCountry;

	public static String Date_Time() {
		date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
		String dateText = sdf.format(date);

		return dateText;
	}

	public static String Date() {
		date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dateText = sdf.format(date);

		return dateText;
	}

	public static void click(WebElement element) {
		wait(element);
		element.click();
		System.out.println("Clicked on element" + element );
	}

	@SuppressWarnings("deprecation")
	public static double round(double value, int numberOfDigitsAfterDecimalPoint) {
		BigDecimal bigDecimal = new BigDecimal(value);
		bigDecimal = bigDecimal.setScale(numberOfDigitsAfterDecimalPoint, BigDecimal.ROUND_HALF_UP);
		return bigDecimal.doubleValue();
	}

	public static void ActionClick(WebElement element) {
		act = new Actions(driver);
		Action seriesOfActions = act.moveToElement(element).click().build();
		seriesOfActions.perform();
	}

	public static void scrollToElement_N_click(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
	}
	public static void dragAndDropScrollbar(WebElement scrollbar, WebElement target) {
		Actions builder = new Actions(driver);
		builder.clickAndHold(scrollbar).build().perform();
		builder.moveToElement(target).build().perform();
		builder.release(target).build().perform();
	}
	public static void JSClick(WebElement element) {
		wait_N_clikable(element);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		wait_N_clikable(element);
		System.out.println("Clicked using JS on"+element);
	}
	public static void SendKeysClick(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}
	public static void handleStaleElementBeforeClick(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
		for (int i=0; i<=3; i++) {
			element.click();
			break;
		}
	}
	public static void JS_Scrolldown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void JS_ScrollUP(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void JS_ScrollUP() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}

	public static void JS_ScrollDown() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
	}

	public static void enterText(WebElement element, String text) {
		
		element.clear();
		element.sendKeys(text);
	}
	public static void enterTextJS(WebElement element, String text) {
		 
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].value='"+text+"';", element);
	}
	public static void enterTextExt(WebElement element, String text) {
		element.clear();
		element.sendKeys(text, Keys.ENTER);
	}
	public static void enterwithClear(WebElement element, String text) throws InterruptedException {
		element.clear();
		Thread.sleep(2000);
		element.sendKeys(text);

	}
	public static void enterTextUsingRobot(String keys) throws AWTException {
		Robot robot = new Robot();
		for (char c : keys.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
			if (KeyEvent.CHAR_UNDEFINED == keyCode) {
				throw new RuntimeException("Key code not found for character '" + c + "'");
			}
			robot.keyPress(keyCode);
			robot.delay(100);
			robot.keyRelease(keyCode);
			robot.delay(100);
		}
	}

	public static void Clear(WebElement element, String text) throws InterruptedException {

		element.sendKeys(Keys.CONTROL + "a");
		element.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		element.sendKeys(text);
	}

	public static String getURL() {
		String currentURL = driver.getCurrentUrl();

		return currentURL;
	}

	public static void implicitwait() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	public static void wait(WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, 3000);
		wt.until(ExpectedConditions.visibilityOf(element));
	}

	public static void wait_N_clikable(WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void mouseHover(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

	public static void selectByText(WebElement ele, String text) {
		Select dpdwn = new Select(ele);
		dpdwn.selectByVisibleText(text);
	}

	public static void selectByValue(WebElement ele, String value) {
		Select dpdwn = new Select(ele);
		dpdwn.selectByValue(value);
	}

	public static void selectByIndex(WebElement ele, String index) {
		Select dpdwn = new Select(ele);
		dpdwn.selectByValue(index);
	}

	public static void wait_N_click(WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOf(element));
		element.click();
		System.out.println("waiting for the element to be clickable before clicking the element");
	}
	
	public static boolean retryingClick(WebElement element) {
		    boolean result = false;
		    int attempts = 0;
		    while(attempts < 5) {
		        try {
		            Utility.click(element);
		            result = true;
		            break;
		        } catch(StaleElementReferenceException e) {
		        	System.out.println("caught stale element reference");
		        	
		        }
		        attempts++;
		    }
		    return result;
		}
	

	public static boolean IsDisplayed(By locator) {
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return true;

	}

	public static void closeCurrentBrowser() {
		driver.close();
	}

	public static void closeAllOpenBrowser() {
		driver.quit();
	}

	public static void selectDropdownValue(WebElement ele, String CountryName) {
		drpCountry = new Select(ele);
		drpCountry.selectByVisibleText(CountryName);
	}

	@SuppressWarnings("resource")
	public static String excelRead(int row, int cell, String File) {
		try {
			File src = new File(prop.getProperty(File));

			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);
			text = sh1.getRow(row).getCell(cell).getStringCellValue();
			System.out.println(text);
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return text;
	}

	@SuppressWarnings("resource")
	public static String excelReadHssf(int row, int cell, String File) {
		try {
			File src = new File(prop.getProperty(File));
			FileInputStream fis = new FileInputStream(src);
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sh1 = wb.getSheetAt(0);
			text = sh1.getRow(row).getCell(cell).getStringCellValue();
			System.out.println(text);
			fis.close();
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
		return text;
	}

	@SuppressWarnings("resource")
	public static String excelReadInt(int row, int cell, String File) {
		try {
			File src = new File(prop.getProperty(File));
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);
			
			double x = (double) sh1.getRow(row).getCell(cell).getNumericCellValue();
			//double x1=Double.parseDouble(sh1.getRow(row).getCell(cell).getStringCellValue());
			
			DecimalFormat format = new DecimalFormat("0.##");
			intText = format.format(x);
			// intText = String.valueOf(x);
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return intText;
	}
	@SuppressWarnings("resource")
	public static String excelReadIntExtra(int row, int cell, String File) {
		try {
			File src = new File(prop.getProperty(File));
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);
			XSSFRow row1=sh1.getRow(row);
			Cell cell1=row1.getCell(cell);
			double x=0;
			String s=null;
			if (cell1.getCellType().NUMERIC != null) {
			x = (sh1.getRow(row).getCell(cell).getNumericCellValue());
			} else if ((cell1.getCellType().STRING != null)){
			s=sh1.getRow(row).getCell(cell).getStringCellValue();
			}
			
			//double x1=Double.parseDouble(sh1.getRow(row).getCell(cell).getStringCellValue());
			
			DecimalFormat format = new DecimalFormat("0.##");
			if (x!=0) {
				intText = format.format(x);
				// intText = String.valueOf(x);
				} else if (s!=null) {
					intText = format.format(s);
				}
			// intText = String.valueOf(x);
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return intText;
	}
	@SuppressWarnings("resource")
	public static String excelReadExtra(int row, int cell, String File) {
		try {
			File src = new File(prop.getProperty(File));
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);
			XSSFRow row1=sh1.getRow(row);
			Cell cell1=row1.getCell(cell);
			double x=0;
			String s=null;
			if (cell1.getCellType().NUMERIC != null) {
			x = (sh1.getRow(row).getCell(cell).getNumericCellValue());
			} else if ((cell1.getCellType().STRING != null)){
			s=sh1.getRow(row).getCell(cell).getStringCellValue();
			}
			//double x1=Double.parseDouble(sh1.getRow(row).getCell(cell).getStringCellValue());
			
			DecimalFormat format = new DecimalFormat("0.##");
			if (x!=0) {
			text = format.format(x);
			// intText = String.valueOf(x);
			} else if (s!=null) {
				text = format.format(s);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return text;
	}
//	Extra Method 
//	public Object[][] ReadInputExcelFile(String filepath) throws IOException {
//		System.out.println("Inside InputExcelFile");
//		FileInputStream fis = new FileInputStream(filepath);
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		int rows = sheet.getLastRowNum();
//		int cols = sheet.getRow(0).getLastCellNum();
//		Object obj = new Object[rows][cols-1];
//		for (int i =1; i<=rows; i++) {
//			Row row = sheet.getRow(i);
//			int column = row.getLastCellNum();
//			for (int j = 1; j<column; j++)
//			{
//				Cell cell = row.getCell(j);
//				//System.out.println(cell.getCellType());
//				switch(cell.getCellType()) {
//				case Cell.CELL_TYPE_BLANK:
//					obj[i-1][j-1]="";
//					break;
//				case Cell.CELL_TYPE_BOOLEAN:
//					obj[i-1][j-1]=cell.getBooleanCellValue();
//					break;
//				case Cell.CELL_TYPE_ERROR:
//					obj[i-1][j-1]="";
//					break;
//				case Cell.CELL_TYPE_NUMERIC:
//					obj[i-1][j-1]=cell.getNumericCellValue();
//					break;
//				case Cell.CELL_TYPE_STRING:
//					obj[i-1][j-1]=cell.getStringCellValue();
//					//System.out.println("Get String cell type");
//					break;
//				}
//			}
//		}
//		workbook.close();
//		return obj;
//		}

	@SuppressWarnings("resource")
	public static void ExcelReadAndWrite(int row, int cell) {
		try {
			File src = new File(prop.getProperty("CustomerDetails"));
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			String datetext = dateFormat.format(date);
			String q = sh1.getRow(row).getCell(cell).getStringCellValue().substring(0, 6);
			String s1 = q + datetext;
			fis.close();
			File src1 = new File(prop.getProperty("CustomerDetails"));
			FileInputStream fis1 = new FileInputStream(src1);
			XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
			XSSFSheet sh12 = wb1.getSheetAt(0);
			sh12.getRow(row).createCell(cell).setCellValue(s1);
			FileOutputStream fout = new FileOutputStream(new File(prop.getProperty("CustomerDetails")));
			wb1.write(fout);
			fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("resource")
	public static void ExcelWrite(int row, int cell, String text) {
		try {
			File src1 = new File(prop.getProperty("CustomerDetails"));
			FileInputStream fis1 = new FileInputStream(src1);
			XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
			XSSFSheet sh12 = wb1.getSheetAt(0);
			sh12.getRow(row).createCell(cell).setCellValue(text);
			FileOutputStream fout = new FileOutputStream(new File(prop.getProperty("CustomerDetails")));
			wb1.write(fout);
			fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String updatecompname(String oldName) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String datetext = dateFormat.format(date);

		String q = oldName.substring(0, 6);
		String s1 = q + datetext;
		return s1;
	}

	public static String updatesuppName(String oldName) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String datetext = dateFormat.format(date);

		String q = oldName.substring(0, 6);
		String s1 = q + datetext;
		return s1;
	}

	public static void uploadFile(String configFilePath) throws InterruptedException, AWTException {

		Thread.sleep(2000);
		File file = new File(prop.getProperty(configFilePath));
		StringSelection strSelection = new StringSelection(file.getAbsolutePath());
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(strSelection, null);
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void ScrollDownKey() throws AWTException, InterruptedException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void ScrollUpKey() throws AWTException, InterruptedException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);

	}

	public static void stringToDouble(String name) {

		Double price = 5.1212;
		DecimalFormat format = new DecimalFormat("0.##");
		String ss = format.format(price);
		System.out.println(ss);

	}

	public boolean isFileDownloaded(String downloadPath, String fileName) {
		boolean flag = false;
		File dir = new File("downloadPath");
		File[] dir_contents = dir.listFiles();

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().equals(fileName))
				return flag = true;
		}

		return flag;
	}

	public boolean isFileDownloaded_Ext(String dirPath, String ext) {
		boolean flag = false;
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			flag = false;
		}

		for (int i = 1; i < files.length; i++) {
			if (files[i].getName().contains(ext)) {
				flag = true;
			}
		}
		return flag;
	}

	public static File getLatestFilefromDir(String downloadPath) {

		File dir = new File(downloadPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;

	}

	public static String zipFiles(String zipFile, String srcDir) {
		try {

			File srcFile = new File(srcDir);
			File[] files = srcFile.listFiles();
			FileOutputStream fos = new FileOutputStream(zipFile);

			ZipOutputStream zos = new ZipOutputStream(fos);

			for (int i = 0; i < files.length; i++) {

				// create byte buffer
				byte[] buffer = new byte[1024];

				FileInputStream fis = new FileInputStream(files[i]);

				zos.putNextEntry(new ZipEntry(files[i].getName()));

				int length;

				while ((length = fis.read(buffer)) > 0) {
					zos.write(buffer, 0, length);
				}

				zos.closeEntry();

				// close the InputStream
				fis.close();

			}
			zos.close();
		}
		//
		catch (Exception e) {
			return e.getMessage();

		}
		System.out.println(zipFile);
		return srcDir;

	}

}