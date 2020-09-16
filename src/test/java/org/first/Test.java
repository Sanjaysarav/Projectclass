package org.first;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends Libglobal {
	
	
	public static void main (String[]args) throws IOException, AWTException {
		
		WebDriver d= getDriver ();
		
		loadUrl ("http://adactinhotelapp.com/index.php");	
	
	pageUrl();
	
	pageTitle();
	
	maxWindow();
	
	
	WebElement txtun = d.findElement(By.id("username"));
	Type(txtun,"sarav261993");
	
	
 WebElement txtpass = d.findElement(By.id("password"));
 Type(txtpass, "@ada1234");
 
 WebElement txtlog = d.findElement(By.id("login"));
 
btnclick(txtlog);
 
 
 WebElement loca = d.findElement(By.id("location"));
 SelectText(loca,5);
	
	WebElement Hotel = d.findElement(By.id("hotels"));
	SelectText(Hotel,3);
	
	
	WebElement room = d.findElement(By.id("room_type"));
	SelectText(room,4);
	
	WebElement nor = d.findElement(By.id("room_nos"));
	SelectText(nor,4);
	
	WebElement datein = d.findElement(By.id("datepick_in"));
	Type(datein,"06/10/2020");
	
	WebElement dateout = d.findElement(By.id("datepick_out"));
	Type(dateout,"07/10/2020");
	

	WebElement adults = d.findElement(By.id("adult_room"));
	SelectText (adults,4);
	
	WebElement child = d.findElement(By.id("child_room"));
	SelectText(child,3);
	
	WebElement search = d.findElement(By.id("Submit"));
	btnclick(search);
	
		WebElement radio = d.findElement(By.id("radiobutton_0"));
		btnclick(radio);
		
		WebElement cont = d.findElement(By.id("continue"));
		btnclick(cont);
		
		WebElement fn = d.findElement(By.id("first_name"));
		Type(fn,"Sanjay");
		
		WebElement ln = d.findElement(By.id("last_name"));
		Type(ln,"sarav");
		
		
		WebElement Badd = d.findElement(By.id("address"));
		Type(Badd, "chennai-46");
		
		WebElement ccn = d.findElement(By.id("cc_num"));
		Type(ccn,"1234567890098765");
		
		
		WebElement cct = d.findElement(By.id("cc_type"));
		SelectText(cct,3);
		
		WebElement expm = d.findElement(By.id("cc_exp_month"));
		SelectText(expm,2);
		
		WebElement expy = d.findElement(By.id("cc_exp_year"));
		SelectText(expy, 7);
		
		WebElement cvv = d.findElement(By.id("cc_cvv"));
		Type(cvv,"265");
		
		WebElement cnfrm = d.findElement(By.id("book_now"));
		btnclick(cnfrm);
		
		
		
		//driver.quit();
		
	}
	

}
