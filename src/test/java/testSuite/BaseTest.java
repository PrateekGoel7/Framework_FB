package testSuite;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPageObject;
import reuseableComponents.ResuseableAbstractMethods;
import utilityPackage.ExcelUtility;

public class BaseTest extends ReuseableTestComponents{

	@Test(enabled= false)
	public void tc01() throws IOException 
	{
		lauchAndlogin();
	}	
	
	@Test(dataProvider= "excelData")
	public void tc02(String username, String password) 
	{
		System.out.println(username+" "+password);
	}
	
	
	@DataProvider(name= "excelData")
	public Object[][] getexceldata() throws IOException 
	{
		String filepath = "C:\\Users\\c\\OneDrive\\Desktop\\Selenium\\myexcel.xlsx";
		String sheetname = "mysheet";
		
		ExcelUtility eu = new ExcelUtility();
		return eu.readexceldata(filepath, sheetname);
	
	}
	
}
