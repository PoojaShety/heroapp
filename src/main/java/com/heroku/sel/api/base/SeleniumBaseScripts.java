package com.heroku.sel.api.base;

import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.heroku.api.base.Browser;
import com.heroku.api.base.Element;

public class SeleniumBaseScripts implements Browser, Element {

	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	int i=1;
	//@Override
	public void click(WebElement ele) {
		String text="";
		try {
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = ele.getText();
			ele.click();
			//reportStep("The Element "+text+" clicked", "pass"); 
		} catch (StaleElementReferenceException e) {
			//reportStep("The Element "+text+" could not be clicked", "fail");
			throw new RuntimeException();
		} 
	}
	//@Override
	public void selectDropDownUsingText(WebElement ele, String value) {

		new Select(ele)
		.selectByVisibleText(value);
	}

	//@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		new Select(ele)
		.selectByIndex(index);
	}

	//@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		new Select(ele)
		.selectByValue(value);
	}

	//@Override
	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"./chromedriver/chromedriver.exe");
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			//reportStep("The Browser Could not be Launched. Hence Failed", "fail");
			throw new RuntimeException();
		} finally {
//			takeSnap();
		}

	}

	//@Override
	public WebElement locateElement(String locatorType, String value) {
		try {
			//String lowerlocate = locatorType.toLowerCase();
			switch(locatorType.toLowerCase()) {
			case "id": return driver.findElementById(value);
			case "name": return driver.findElementByName(value);
			case "class": return driver.findElementByClassName(value);
			case "link": return driver.findElementByLinkText(value);
			case "xpath": return driver.findElementByXPath(value);
			}
		} catch (NoSuchElementException e) {
			//reportStep("The Element with locator:"+locatorType+" Not Found with value: "+value, "fail");
			throw new RuntimeException();
		}catch (Exception e) {
			//reportStep("The Element with locator:"+locatorType+" Not Found with value: "+value, "fail");
		}
		return null;
	}
	
	public void assertTextcheck(WebElement ele, String expectedText) {
		try {
			wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			Assert.assertEquals(expectedText,ele.getText(),"Image is broken"); 
				System.out.println("The expected text contains the actual "+expectedText);
		} catch (WebDriverException e) {
		} 
	}
	
	public void assertBrokenImages(WebElement imgElement) {
		try {
			int invalidImageCount = 0;
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(imgElement.getAttribute("src"));
			HttpResponse response = client.execute(request);
			// verifying response code he HttpStatus should be 200 if not,
			// increment as invalid images count
			if (response.getStatusLine().getStatusCode() != 200) {
				invalidImageCount++;
			}
			Assert.assertTrue(invalidImageCount>0);
			//System.out.println("Total no. of invalid images are "	+ invalidImageCount);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		// TODO Auto-generated method stub
		driver.close();
	}

	
	
}
