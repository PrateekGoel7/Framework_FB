package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		
		this.driver = driver;
	}

	public void lauchfb() 
	{
		driver.get("https://www.facebook.com/");
	}
	
	public void dologin(String un, String pw) 
	{
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		
		email.sendKeys(un);
		pass.sendKeys(pw);
	}
	
	

}
