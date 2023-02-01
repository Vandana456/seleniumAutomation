
package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//In this selenium code,pass value to input text field and send the values.
//steps to perform in form.


public class Formfillup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.set up the property of chrome driver to pass value to form input box through chrome web browser.
		System.setProperty("webdriver.chrome.driver","/Users/jipodj/Downloads/chromedriver");
		
		//2.initialize the webdriver object through chrome driver class.
		  WebDriver browserObject = new ChromeDriver();
		  
		  //3.Open form page of http://www.training.qaonlinetraining.com/testPage.php
		browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		// sending text to the input box in the web form--------------
		//4.locate Name section using name locator and send values using send keys.
		browserObject.findElement(By.name("name")).sendKeys("vandana");
		
		//5. Locate email section using name locator and send values using sendkeys.
		browserObject.findElement(By.name("email")).sendKeys ("vandana@yahoo.com");
		
		//6.locate the website section usingname locator and send values using send keys.
		browserObject.findElement(By.name("website")).sendKeys ("abc.com");
		
		//7.locate comment section using name locator and send values using sendkeys.
		browserObject.findElement(By.name("comment")).sendKeys("its successful");
		
		// 8. Locate the submit button and perform click
		browserObject.findElement(By.name("submit")).click();
		
		
	}

}
