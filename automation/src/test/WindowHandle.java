package test;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gyandev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/** login fb **/
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='privacy-link']")).click();//data policy page
		Thread.sleep(6000);
       ArrayList<String> a= new ArrayList<String>(driver.getWindowHandles());
       System.out.println(a.size());
       driver.switchTo().window(a.get(0)).findElement(By.id("email")).sendKeys("gyandev");
       Thread.sleep(6000);
       WebDriver driver1=driver.switchTo().window((String) a.get(1)); 
       driver1.findElement(By.id("pass")).sendKeys("shukla");
       driver.switchTo().window(a.get(0)).findElement(By.id("pass")).sendKeys("shukla");
	}

}
