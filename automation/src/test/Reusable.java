package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class Reusable {
	public static WebDriver driver;
	public static void selectDriver(String browserName){
		if(browserName.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
		    driver=new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gyandev\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	}
	public static void launchApp(String url){
		driver.get(url);
	}
	
	/** hover and click on 1st option,refresh **/
	public static void main(String[] args) throws Exception {
		selectDriver("chrome");		
		launchApp("https://www.nseindia.com/");
		driver.manage().window().maximize();
	    WebElement ii=driver.findElement(By.xpath("html/body/div[2]/div/div[4]/ul/li[7]"));
	    WebElement ii1=driver.findElement(By.xpath("html/body/div[2]/div/div[4]/ul/li[7]/div/ul/li/ul/li"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ii).click(ii1).build().perform();
	    a.sendKeys(Keys.F5).build().perform();
	   // a.sendKeys(Keys.CONTROL+"t");
	    a.sendKeys(Keys.RETURN);
	}

}
