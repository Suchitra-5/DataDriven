
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

public class practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		{
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			Assert.assertFalse(false);
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			Thread.sleep(3000);

			driver.findElement(By.id("input[@id='ctl00_mainContent_ddl_originStation1_CTXT')")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
		}
	}//input[@id="ctl00_mainContent_ddl_originStation1_CTXT"]
}
