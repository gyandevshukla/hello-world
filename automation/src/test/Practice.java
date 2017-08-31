package test;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Practice {
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
	@Test
	public static void testAuto() {
		selectDriver("chrome");		
		launchApp("http://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[2]/li[2]/a")).click();
		//driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[2]/li[2]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[1]/li[3]/ul/li[2]/a")).click();
		WebElement table=driver.findElement(By.xpath("//*[@id='task-table']/tbody"));
		//List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> column = table.findElements(By.tagName("td"));
		List<String> value = new ArrayList<String>();

		for (int j=0; j<column.size(); j++){
			//System.out.println(column.get(j).getText());
			value.add(column.get(j).getText());
		}
		if (value.contains("Mike Trout")){
			System.out.println("Value found");
		}
		else{
			System.out.println("Not Found");
		}
	}
	
	@AfterTest
	public static void diverClose(){
		driver.close();
	}

}
