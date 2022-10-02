package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1intro {

	public static void main(String[] args) {
		
		//invoking  Browser
		 //Chrome -ChromeDriver ->Methods
		//Webdriver methods + class methods
		//ChromeDriver driver = new ChromeDriver(); 
		
		//chromedriver.exe -> chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\atif.khan\\Documents\\chromedriver.exe");
		
		
		//webdriver.chrome.driver->value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/home");
		System.out.println(driver.getTitle());
		
	}

}
