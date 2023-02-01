package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver because we will perform Dropdown testing through chrome web browser.
				System.setProperty("webdriver.chrome.driver", "/Users/jipodj/Downloads/ChromeDriver/");
				
				// 2. Initialize Webdriver object through ChromeDriver class.
		        	WebDriver browserObject = new ChromeDriver();
				// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
			        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
			        //4.
			        Select countrySelect =new Select(browserObject.findElement(By.name("country")));
			        
			       //5.
			        countrySelect.selectByVisibleText("USA");
			        
			        //6.
			        
			        Select skillSelect = new Select(browserObject.findElement(By.name("skill")));
			        //using skillSelect to select menu options -- Programming
			       
			        //7.
			        skillSelect.selectByVisibleText("Programming");
			     
			       //8.
			        skillSelect.selectByVisibleText("Database");
			        System.out.println("selectByVisibleText(\"Database");
			        
			        // 9. Locate the send button and perform click
			        browserObject.findElement(By.name("submit")).click();
			        
			        
			        System.out.println("Form Fill-up Succesfull");
				
			} 
			        
				
	}

	


