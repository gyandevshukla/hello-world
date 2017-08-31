package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gyandev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm?cat=G");
		driver.manage().window().maximize();
		////*[@id="topGainers"]
		WebElement topgainer=driver.findElement(By.xpath("html/body/div[2]/div[3]/div[2]/div/div[3]/div[2]/div/div[2]/table"));
		/*List<WebElement> gainerrc=topgainer.findElements(By.xpath("tbody/tr/th"));
		System.out.println(gainerrc.size());
		int i;
		for(i=1;i<=gainerrc.size();i++){
        System.out.println(topgainer.findElement(By.xpath("tbody/tr[1]/th["+i+"]")).getText());
	
		}*/
		String tt=driver.findElement(By.xpath("html/body/div[2]/div[3]/div[2]/div/div[3]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(tt);
	}

}
