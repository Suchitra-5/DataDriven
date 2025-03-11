import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonAutomate {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	//driver.findElement(By.id("captchacharacters")).sendKeys("BCNTTA");
  driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
  Thread.sleep(4000);
  driver.findElement(By.xpath("//a[@data-menu-id='5']")).click();
  Thread.sleep(20000);

  driver.findElement(By.xpath("//*[contains(text(),'Accessories & Supplies']")).click();

 
	}
}

