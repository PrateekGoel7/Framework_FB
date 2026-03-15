package reuseableComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ResuseableAbstractMethods {
	
	WebDriver driver;
	
	public ResuseableAbstractMethods(WebDriver driver) {
		
		this.driver = driver;
	}

	public void max() 
	{
		driver.manage().window().maximize();
	}
	
	public void min() 
	{
		driver.manage().window().minimize();
	}
	
	public void impwait(int x) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(x));
	}
	
	
	

}
