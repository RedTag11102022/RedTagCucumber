package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {

		switch (browserName) {
		case "chrome":
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--diable-notifications");
			op.addArguments("--incognito");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(op);
			break;
		case "firefox":
			FirefoxOptions op1=new FirefoxOptions();
			op1.addArguments("--diable-notifications");
			op1.addArguments("--incognito");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(op1);
			break;
		case "edge":
			EdgeOptions op2=new EdgeOptions();
			op2.setCapability("--diable-notifications", true);
			op2.setCapability("--incognito",true);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(op2);
			break;
		default:
			System.err.println("Invalid Browser Name");
			break;
		}
		return driver;
	}

	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static String getTitle() {
		return driver.getTitle();

	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	// minimize is not possible it is selenium 3
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void implicitlyWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void clear(WebElement e) {
		e.clear();
	}

	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static WebElement findElement(String locator, String locatorValue) {
		WebElement element = null;
		if (locator.equals("id")) {
			driver.findElement(By.id(locatorValue));
		} else if (locator.equals("xpath")) {
			driver.findElement(By.xpath(locatorValue));
		} else if (locator.equals("tagName")) {
			driver.findElement(By.tagName(locatorValue));
		} else if (locator.equals("name")) {
			driver.findElement(By.name(locatorValue));
		} else if (locator.equals("className")) {
			driver.findElement(By.className(locatorValue));
		} else if (locator.equals("linkText")) {
			driver.findElement(By.linkText(locatorValue));
		} else if (locator.equals("partialLinkText")) {
			driver.findElement(By.partialLinkText(locatorValue));
		} else {
			throw new NoSuchElementException(locatorValue);
		}
		// ask for cssselector
		return element;
	}

	public static List<WebElement> findElements(String locator, String locatorValue) {
		List<WebElement> element = new LinkedList<>();
		if (locator.equals("id")) {
			driver.findElements(By.id(locatorValue));
		} else if (locator.equals("xpath")) {
			driver.findElements(By.xpath(locatorValue));
		} else if (locator.equals("tagName")) {
			driver.findElements(By.tagName(locatorValue));
		} else if (locator.equals("name")) {
			driver.findElements(By.name(locatorValue));
		} else if (locator.equals("className")) {
			driver.findElements(By.className(locatorValue));
		} else if (locator.equals("linkText")) {
			driver.findElements(By.linkText(locatorValue));
		} else if (locator.equals("partialLinkText")) {
			driver.findElements(By.partialLinkText(locatorValue));
		} else {
			throw new NoSuchElementException(locatorValue);
		}
		return element;

	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void actionClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}

	public static void actionDragAndDrop(WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}

	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public static void deselectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void deselectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void deselectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static List<WebElement> getAllSelectedOption(WebElement element) {
		Select s = new Select(element);
		return s.getAllSelectedOptions();

	}

	public static WebElement getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		return s.getFirstSelectedOption();
	}

	public static List<WebElement> getOption(WebElement element, String text) {
		Select s = new Select(element);
		return s.getAllSelectedOptions();
	}

	public static String getAttribute(WebElement e, String attValue) {
		String atAttribute = "";
		if (attValue.equals("value")) {
			atAttribute = e.getAttribute("value");

		} else if (attValue.equals("innerText")) {
			atAttribute = e.getAttribute("innerText");

		}
		return atAttribute;
	}

	public static void submit(WebElement e) {
		e.submit();

	}

	public static String getText(WebElement e) {
		return e.getText();

	}

	public static boolean isMultiple(WebElement element) {
		Select s = new Select(element);
		return s.isMultiple();

	}

	public static boolean isEnabled(WebElement e) {
		return e.isEnabled();

	}

	public static boolean isSelected(WebElement e) {
		return e.isSelected();

	}

	public static boolean isDisplayed(WebElement e) {
		return e.isDisplayed();

	}

	public static void takesScreenshotDriver(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir") + "\\src\\test\\resouces\\ScreenShots\\" + name + ".png");
		FileUtils.copyFile(src, des);

	}

	public static void takesScreenshotElement(WebElement element, String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) element;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir") + "\\src\\test\\resouces\\ScreenShots\\" + name + ".png");
		FileUtils.copyFile(src, des);

	}

	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void jsSendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].sendKeys(value)", element);
	}

	public static void jsSetAttribute(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value',text)", element);
	}

	public static String jsGetAttribute(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object atElement = js.executeScript("return arguments[0].getAttribute('value')", element);
		return ((String) atElement);

	}

	public static void jsScrollDown(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void jsScrollUp(WebElement element, String text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// write for robot class
	public static void robotCopyAndPaste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void alertGetText() {
		driver.switchTo().alert().getText();
	}

	public static void alertSendKeys(String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	public static Sheet getSheet(String name, String sheetName) throws IOException {
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resouces\\ScreenShots\\" + name + ".xlxs");
		FileInputStream ip = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(ip);

		return w.getSheet(sheetName);
	}

	public static void setSheet(String name, String sheetName, int rowNo, int cellNo, WebElement e)
			throws IOException, InterruptedException {
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resouces\\ScreenShots\\" + name + ".xlxs");
		FileInputStream ip = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(ip);
		Sheet s = w.getSheet(sheetName);
		s.getRow(rowNo).createCell(cellNo).setCellValue(jsGetAttribute(e));
		FileOutputStream op = new FileOutputStream(loc);
		w.write(op);

	}

	public static boolean waitUrl(long sec, String particularURL) {

		WebDriverWait wt = new WebDriverWait(driver, sec);
		return wt.until(ExpectedConditions.urlContains(particularURL));
	}

	public static void alertIsPresent(long sec, String value) {

		WebDriverWait wt = new WebDriverWait(driver, sec);
		Alert until = wt.until(ExpectedConditions.alertIsPresent());
		if (value.equals("accept")) {
			until.accept();
		} else if (value.equals("dismiss")) {
			until.dismiss();
		} else if (value.equals("getText")) {
			until.getText();
		} else {
			until.sendKeys(value);
		}
	}

	public static WebElement elementToBeClickable(long sec, WebElement e) {

		WebDriverWait wt = new WebDriverWait(driver, sec);
		return wt.until(ExpectedConditions.elementToBeClickable(e));

	}

	public static void frameToBeAvailableAndSwitchToIt(long sec, WebElement e) {

		WebDriverWait wt = new WebDriverWait(driver, sec);
		wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(e));
	}

	public static WebElement visibilityOfElement(long sec, WebElement e) {

		WebDriverWait wt = new WebDriverWait(driver, sec);
		return wt.until(ExpectedConditions.visibilityOf(e));
	}

	public static void autoSuggestion(WebElement e, String value, WebElement e1) {
		e.click();
		e.sendKeys(value);
		e1.click();
	}
}