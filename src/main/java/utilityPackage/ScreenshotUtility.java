package utilityPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	WebDriver driver;
	public ScreenshotUtility(WebDriver driver) {
		
		this.driver = driver;
	}

	public void takeScreenshot() throws IOException 
	{
		
		TakesScreenshot scr = (TakesScreenshot)driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyMMdd_HHmmSS").format(new Date());
		File destination = new File("C:\\Users\\c\\eclipse-workspace\\Intoduction\\src\\Introduction\\frameworkPOM\\src\\main\\java\\screenshots\\"+timestamp+".png");
		FileUtils.copyFile(source, destination);
		
	}
	
	

}
