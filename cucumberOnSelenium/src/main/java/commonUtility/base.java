package commonUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class base {

	protected static WebDriver driver;

	public String readValueFromPropertiesFile(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(new File("src/main/resources/configuration/config.properties"));
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

	public void setBrowser() throws Throwable {
		
//		System.out.println("Broswer input is updated to config.properties from from pom.xml == " + readValueFromPropertiesFile("browser"));
//		if (readValueFromPropertiesFile("browser").equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver",
//					"src/main/resources/drivers/chromedriver");
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//		}
		
		System.out.println("Broswer input is from pom.xml "+ System.getProperty("browserName"));
		if (System.getProperty("browserName").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"src/main/resources/drivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}

	public void accessApplicationURL() throws Throwable {
		driver.get(readValueFromPropertiesFile("applicationURL"));
		driver.manage().window().maximize();
	}
	
	public void elementToBeClickable(By element) {
		driver.findElement(element).click();	
		System.out.println("Element is clicked");
	}
	
	public String getTextOfAnElement(By element) {
		String text = driver.findElement(element).getText();	
		System.out.println("Element contain the Value == " + text);
		return text;
	}
	
	public void switchTabs(int i) {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println("Number of Tabs involved"+ tabs.size());
	    driver.switchTo().window(tabs.get(i));
	}
	
	public String getPageSource() {
		String pageSource = driver.getPageSource();	
		System.out.println("Page Souce == " + pageSource);
		return pageSource;
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		System.out.println("Title == " + title);
		return title;
	}

}
