import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderHandling {

 public static void main(String[] args) {
// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.path2usa.com/travel-companions");
//April 23
driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


}
}