package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rukten {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\atif.khan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stg-app-service-builder.rmb-lab.jp/login-platform-admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input-text-box[@type='email']//input")).click();
		
		driver.findElement(By.xpath("//input-text-box[@type='email']//input")).sendKeys("atifrnkhan@gmail.com");
	

	}

}
