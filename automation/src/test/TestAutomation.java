package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Workbook;
public class TestAutomation {
	private final static Logger logger = Logger.getLogger(TestAutomation.class);
	public static void main(String[] args) throws IOException {

		try{	
			BasicConfigurator.configure();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gyandev\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			/** login fb **/
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
			
			/** selecting from drop down**/
			WebElement month=driver.findElement(By.id("month"));
			Select se=new Select(month);
			se.selectByIndex(1);
			
			/**take screenshot for test; it throws IOException**/
			File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrfile, new File("D:\\image.png"));
		}
		catch (Exception e) {
			logger.info(e);
		}
	}

}
