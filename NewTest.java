
package test;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest{		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver","/Users/sushmaallamraju/software/sel1/selenium-2.53.1/chromedriver");
		     driver = new ChromeDriver();    
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
