package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/jipodj/Downloads/ChromeDriver/");

WebDriver browserObject = new ChromeDriver();

browserObject.get("http://training.qaonlinetraining.com/testPage.php");

//4. Locate the boat checkbox button using xpath and store the value in  reference created that is checkboxBoat.
	WebElement checkboxBoat = browserObject.findElement(By.xpath("//input[@value='boat']"));
	// 5. Locate the bike checkbox button using xpath and store the value in  reference created that is checkboxBike. 
   WebElement checkboxBike = browserObject.findElement(By.xpath("//input[@value='Bike']"));
 	// 6. Locate the car checkbox button using xpath and store the value in  reference created that is checkboxCar.
   WebElement checkboxCar = browserObject.findElement(By.xpath("//input[@value='car']")); // selected by-default
   // 7. Locate the horse checkbox button using xpath and store the value in  reference created that is checkboxHorse.
   WebElement checkboxHorse = browserObject.findElement(By.xpath("//input[@value='horse']"));
   // 8. Locate the submit checkbox button using xpath and store the value in  reference created that is submitButton.
   WebElement submitButton = browserObject.findElement(By.xpath("//input[@value='Send']"));
   // selecting all options except car- selected by-default .The car element is clicked by default and value .So no need to perform click on the car element
  // 9. Perform click on boat button 
   checkboxBoat.click();
   // 10. Perform click on bike button
   checkboxBike.click();
   // 11. Perform click on horse button 
   checkboxHorse.click();
   System.out.println("wait 3 seconds and submit and close");
   // 12. Perform click on send button
   submitButton.click();
	
   // 13. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
   Thread.sleep(3000);





	

	
	}

}
