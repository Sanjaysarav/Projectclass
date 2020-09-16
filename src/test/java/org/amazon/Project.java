package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main (String[]args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Agni\\driv\\chromedriver.exe" );
	
		
	WebDriver driver=new ChromeDriver ();
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement (By.id("twotabsearchtextbox"));
	search.sendKeys("iphone11",Keys.ENTER);
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
