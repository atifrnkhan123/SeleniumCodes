package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class endTOend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\atif.khan\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='11'])[1]")).click();
	
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

		System.out.println("its Disable");
//mmmmmm//
		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.cssSelector("#ctl00$mainContent$btn_FindFlights")).click();
		
		
		
	}

}
