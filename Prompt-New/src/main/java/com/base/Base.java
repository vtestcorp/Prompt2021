package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.base.ZipClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.util.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static Properties prop;
	public static WebDriver driver;
	public static ExtentReports er;
	public static ExtentTest et;
	public static Logger log;
	public static String s1;
	public static String Report_Path = null;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement LoginBtn;

	@FindBy(xpath = "//h4[contains(text(),'Log in to get started or')]")
	public WebElement lheader;

	@FindBy(xpath = "//button[text()='Stay Signed In']")
	public WebElement staySigninButton;

	@FindBy(xpath = "//h2")
	public WebElement popup;

	@SuppressWarnings("unused")
	private List<String> fileList;
	private static final String OUTPUT_ZIP_FILE = "Report\\Zipped_Report.zip";
	private static final String SOURCE_FOLDER = "Report"; // SourceFolder path

	static String myHomePath = System.getProperty("user.home");

	// protected File downloadPath = new File(myHomePath+"/Downloads/" );
	public static final String downloadPath = myHomePath + "/Downloads";

	public Base() {
		try {

			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/resources/config.properties");
			prop.load(fis);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void driverInitilization(String Browser)

	{
		if (Browser.equals("Chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
//			chromeOptions.addArguments("--headless");
//			chromeOptions.addArguments("--disable-gpu");
//			chromeOptions.addArguments("--no-sandbox");
			//chromeOptions.addArguments("--no-sandbox");
			// chromeOptions.addArguments("--window-size=1920x1080");
			driver = new ChromeDriver(chromeOptions);

			driver.get(prop.getProperty("NewURL"));
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //origin
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS); //extra

		} else if (Browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + prop.getProperty("firefoxdriver"));
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
		} else if (Browser.equals("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + prop.getProperty("IEDriver"));
			driver = new InternetExplorerDriver();
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
		}
	}

	public static void wait(WebElement element) {
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOf(element));
	}

	public static void logger() {
		log = LogManager.getLogger(Base.class.getName());
		log.info("Info");
		log.error("Error");
		log.fatal("Fatal");
		log.debug("Debug");

	}

	public void login() {
		Assert.assertEquals(lheader.isDisplayed(), true, "No login screen found");
		email.sendKeys(Utility.excelRead(2, 0, "CustomerDetails"));
		password.sendKeys(Utility.excelRead(2, 1, "CustomerDetails"));
		LoginBtn.click();

	}

	public static void create_ext_report(String reportName) {
		String Report_Timestamp = "Extent_Report" + (LocalDateTime.now()).getDayOfMonth() + "_"
				+ (LocalDateTime.now()).getMonthValue() + "_" + (LocalDateTime.now()).getYear() + "_"
				+ (LocalDateTime.now()).getHour();

		Report_Path = "Report\\" + "_" + Report_Timestamp;

		er = new ExtentReports(Report_Path + "\\" + Report_Timestamp + ".html");
		File file = new File("extent-config.xml");
		er.loadConfig(file);
		er.addSystemInfo("host", "Prompt Solutions");

	}

	public static void create_extent_test(String testName)

	{
		// et = er.startTest(testName + "_@_" + Utility.Date_Time().toString());
		et = er.startTest(testName);
	}

	public static void close_ext_Report() {
		er.endTest(et);
		er.flush();

	}

	public static String pass(String testMethodName) throws IOException {
		// String title=testMethodName;
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);

		String screenshotName = "Screenshot " + (LocalDateTime.now()).getHour() + "_"
				+ (LocalDateTime.now()).getMinute();

		String dest = "Screenshots//" + screenshotName + ".png";
		File target = new File(Report_Path + "\\" + dest);
		FileUtils.copyFile(src, target);
		return dest;
	}

	public static String fail(String testMethodName) throws IOException {

		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);

		String screenshotName = "Screenshot " + (LocalDateTime.now()).getHour() + "_"
				+ (LocalDateTime.now()).getMinute();

		String dest = "Screenshots//" + screenshotName + ".png";
		File target = new File(Report_Path + "\\" + dest);
		FileUtils.copyFile(src, target);
		return dest;

//		String dest = "Screenshots\\" + testMethodName + getcurrentdateandtime() + ".png";
//		File target = new File(Report_Path + "/" + dest);
//		FileUtils.copyFile(src, target);
//		return dest;

	}

	public static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy   HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return str;
	}

	public static void addAttachment(String filename) throws MessagingException {
		DataSource source = new FileDataSource(filename);
		BodyPart messageBodyPart = new MimeBodyPart();
		Multipart multipart = new MimeMultipart();
		messageBodyPart.setDataHandler(new DataHandler(source));
		messageBodyPart.setFileName(filename);
		multipart.addBodyPart(messageBodyPart);
	}

	public static void SendMailSSLWithAttachment() throws IOException {

		// Create object of Property file
		Properties props = new Properties();

		// this will set host of server- you can change based on your requirement
		props.put("mail.smtp.host", "smtp.gmail.com");

		// set the port of socket factory
		props.put("mail.smtp.socketFactory.port", "465");

		// set socket factory
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		// set the authentication to true
		props.put("mail.smtp.auth", "true");

		// set the port of SMTP server
		props.put("mail.smtp.port", "465");

		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,

				new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication(prop.getProperty("emailIDFrom"),
								prop.getProperty("password"));

					}

				});

		try {

			// Create object of MimeMessage class
			Message message = new MimeMessage(session);

			message.setFrom(new InternetAddress(prop.getProperty("emailIDFrom")));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse((prop.getProperty("emailIDTo"))));
			message.setSubject("Test Case Reports");

			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();

			// Set the body of email
			messageBodyPart1.setText("Test Report for Tests Executed");

//4) create new MimeBodyPart object and set DataHandler object to this object
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			DataSource source1 = new FileDataSource("Report\\Zipped_Report.zip");
			messageBodyPart2.setDataHandler(new DataHandler(source1));
			messageBodyPart2.setFileName("Report\\Zipped_Report.zip");

			// 5) create Multipart object and add MimeBodyPart objects to this object
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(messageBodyPart2);

			// 6) set the multiplart object to the message object
			message.setContent(multipart);

// finally send the email
			Transport.send(message);

			System.out.println("=====Email Sent=====");

		} catch (MessagingException e) {

			throw new RuntimeException(e);

		}

	}

	@BeforeSuite
	public void createReport() {
		create_ext_report("PS " + Utility.Date_Time().toString());

	}

	@AfterSuite
	public void sendEmailReport() throws IOException, InterruptedException {

		ZipClass appZip = new ZipClass();
		appZip.generateFileList(new File(SOURCE_FOLDER));
		appZip.zipIt(OUTPUT_ZIP_FILE);
		Utility.implicitwait();
		SendMailSSLWithAttachment();

	}

	@Parameters({ "Browser" })
	@BeforeMethod
	public void setup(@Optional("Chrome") String Browser) throws URISyntaxException, IOException, InterruptedException {
		driverInitilization(Browser);

	}

	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.close();
	}

	@AfterSuite
	public void closeReport() {

		close_ext_Report();

		// Utility.closeAllOpenBrowser();

	}
}
