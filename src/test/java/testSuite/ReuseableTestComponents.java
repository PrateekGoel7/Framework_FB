package testSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPageObject;

public class ReuseableTestComponents {
	
	WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\c\\eclipse-workspace\\Intoduction\\src\\Introduction\\frameworkPOM\\src\\main\\java\\resources\\global_data.properties");
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) 
		{
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
	public void lauchAndlogin() throws IOException 
	{
		initializeDriver();
		
		LoginPageObject lp = new LoginPageObject(driver);
		lp.lauchfb();
		lp.dologin("Vibhu@gmail.com", "Admin@123");
	}
	

}
