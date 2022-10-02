package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BottomLinkCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\atif.khan\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//WebElement footdriver=driver.findElement(By.id("gf-BIG"));
		//System.out.println(driver.findElements(By.tagName("a")).size());
		

	}

}
