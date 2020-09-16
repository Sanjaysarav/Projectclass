package org.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Libglobal {
	
	public static WebDriver driver;
	
	public static  WebDriver getDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Agni\\driv\\chromedriver.exe");
		
      driver = new ChromeDriver ();
     
		return driver;
		
	}
	
	public static void loadUrl (String url) {
		
		driver.get(url);

	}

	
	public static void pageTitle() {
		String title = driver.getTitle();		
		System.out.println(title);
	}
	
	public static void pageUrl() {
String Url = driver.getCurrentUrl();
System.out.println(Url);
	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	
	public void window  () {
	}
		
		public static String Type (WebElement element,String data) {
			element.sendKeys(data);
			return data;
		}
		
		
	public static void btnclick (WebElement element) {
		element.click();
	}
	
	
	public static void SelectText (WebElement element, Integer value) {
		
		Select s=new Select(element);
		s.selectByIndex(value);
	}
	
	
	public static void quitBrowser() {
		driver.quit();
	}

	
	public static void main(WebElement element) {
		
		String text=element.getText();
		System.out.println(text);
		
	}
	
	
	
}
