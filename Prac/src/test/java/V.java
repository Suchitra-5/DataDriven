import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class V {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		String[] veggies = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			System.out.println(formattedName);
			List itemsNeededList = Arrays.asList(veggies);

			if (itemsNeededList.contains(formattedName)) {

				driver.findElement(By.xpath("//h4[contains(text(),'" + formattedName
						+ "')]/following-sibling::div[@class='product-action']/button")).click();
				System.out.println(formattedName + " added");
			}

		}

	}

}
