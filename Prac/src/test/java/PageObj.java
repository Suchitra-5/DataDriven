import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObj extends AbstractCompotent {
	public WebDriver driver;
	
	
	public PageObj(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="userEmail")
		WebElement usermail;
	
	@FindBy(id="userPassword")
	WebElement 	psswrd;
	
	@FindBy(id="login")
	WebElement submit;
	
	//driver.findElement(By.id("userEmail")).sendKeys("suchitra.kotal@gmail.com ");
//	driver.findElement(By.id("userPassword")).sendKeys("Goodmorning@22");
	//driver.findElement(By.id("login")).click();	
	
	
	public void loginApplication(String usernme,String pwd )
	{
		usermail.sendKeys(usernme);
		psswrd.sendKeys(pwd);
		submit.click();
	}
	

		
	



	public void goTo() {
		// TODO Auto-generated method stub
		driver.get("https://rahulshettyacademy.com/client");
	}
}
	
	

	
	

