package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class UpdateDropDown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\atif.khan\\Documents\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//Website will open
	
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	//* using for regular expression when id= path is very long we take only value like SeniorCitizenDiscount and all path will take * symbol.
	////it will return false becuse first time didnt get SeniorCitizenDisscount so  that will return false.
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	
	///count the number of checkbox
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	int i=1;
	while(i<5)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
}
}