package test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static final String USERNAME="gyandevshukla1";
	public static final String AUTOMATE_KEY="GG61zQkvQq7aa9dzZArp";
	public static final String URL="https://"+ USERNAME+ ":"+ AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static void main(String[] args) throws Exception{
		DesiredCapabilities caps=new DesiredCapabilities().chrome();
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "33");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "XP");
		caps.setCapability("browserstack.debug", "true");
        WebDriver driver=new RemoteWebDriver(new java.net.URL(URL), caps);
        driver.get("http://facebook.com");
        WebElement element=driver.findElement(By.id("email"));
        element.sendKeys("gyandev.shukla");
	}
}
