package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\atif.khan\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		driver.findElement(By.id("email")).sendKeys("atifrnkhan@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ghjk");
		driver.findElement(By.className("commit")).click();
	}

}
