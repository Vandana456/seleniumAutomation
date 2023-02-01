
//In this script we are fetching all the link from webpage 
//Steps to perform 
//1. setup the property of chromedriver to fetch the webpage link through chrome web browser.
//2. Initialize Webdriver object through ChromeDriver class.
//3. Open website link https://www.itlearn360.com/.
//4. Intialize value to variable to keep count of number of links in webpage 
//5. List is applied on WebElement to collect all the <a> tag in alllinks reference
//6. Now pass the alllinks values to link reference and for loop is applied on link reference to fetch value one by one using getAttribute method.
//7. Calculate number of links and print in all.
//8. Closing the driver using close method.


package selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		// 1. setup the property of WebDriver to perform google search through chrome web browser. 
				System.setProperty("webdriver.chrome.driver","/Users/jipodj/Downloads/chromedriver");
				
				//2.initialize the webdriver object through chrome driver class.
				  WebDriver browserObject = new ChromeDriver();
				  
				// 3. Open the web page www.google.com
					browserObject.get("https://www.itlearn360.com/");
					
					int count = 0;
					
					 //5. List is applied on WebElement to collect all the <a> tag in alllinks reference
			        List<WebElement> allLinks = browserObject.findElements(By.tagName("a"));
				
				//6. Now pass the alllinks values to link reference and for loop is applied on link reference to fetch value one by one using getAttribute method.
			        for (WebElement link : allLinks) {
			          
			            System.out.println(link.getAttribute("href"));
			            count ++;
			            
			        }
				//7. Calculate number of links and print in all.
			        System.out.println("total number of links present: "+count);
				
	}

}
