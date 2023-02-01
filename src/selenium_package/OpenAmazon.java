package selenium_package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "/Users/jipodj/Downloads/chromedriver");
		//initialize the webdriver object through chrome driver class

		WebDriver browserObject = new ChromeDriver();

		WebDriver browseObject = null;
		//Open the http://www.google.com/ link using get method.
		browserObject.get("http://www.amazon.com/");
		browseObject.close();
	}

}

