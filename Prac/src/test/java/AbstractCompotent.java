import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractCompotent{

	WebDriver driver;
	public AbstractCompotent(WebDriver driver) {
		super();
	this.driver	=driver;
	
	}	
		public void waitForElementToAppear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	

	
		}
		public void waitForElementToDisapper(WebElement ele) {
		
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.invisibilityOf(ele));
	}  
}