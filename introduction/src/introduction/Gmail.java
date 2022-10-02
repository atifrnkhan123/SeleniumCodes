package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\atif.khan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com&sacu=1&passive=1209600&hl=en&acui=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&TL=AM3QAYZQ4zgec7Z-8M3mFTYyQHCc7ykinkwjJ3Qkjo_VBNgHsKATj0xpbvN_Ypxd");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("atif.khan@sourcefuse.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Atif@5426");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//div[text()='Compose']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		driver.findElement(By.name("to")).sendKeys("yuvraj.shukla@sourcefuse.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Testing gmail automation");
		driver.findElement(By.xpath("//div[@aria-label=\"Message Body\"]")).sendKeys("Hey Meenu, Gmail automation sucessfully Done !");
		driver.findElement(By.xpath("//div[text()=\"Send\"]")).click();
		
		
		

		
		

	}

}
