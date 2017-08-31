package test;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;



public class ReadAndWrite {

	public static void main(String[] args) throws Exception{
		//**taking input from excel for WebDriver**//*
		FileInputStream f=new FileInputStream("C:\\Users\\Gyandev\\Desktop\\testData\\data.xls");
		 Workbook wb=Workbook.getWorkbook(f);
		 Sheet s=wb.getSheet("Sheet1");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gyandev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get(s.getCell(0, 1).getContents());
		 driver.manage().window().maximize();
		 driver.findElement(By.id(s.getCell(0, 0).getContents())).sendKeys(s.getCell(1, 0).getContents());
		 
	    /**put some string to excel  **/
		 String a="abcd";
		 FileOutputStream fo=new FileOutputStream("C:\\Users\\Gyandev\\Desktop\\testData\\data1.xls");
		 WritableWorkbook wwb=Workbook.createWorkbook(fo);
		 WritableSheet ws=wwb.createSheet("testdata", 1);
		 Label l=new Label(0, 0, a);
		 ws.addCell(l);
		 wwb.write();
		 wwb.close();
		 
		 /**Using Notpad, reading data**/
		 FileReader fr=new FileReader("C:\\Users\\Gyandev\\Desktop\\test.txt");
		 BufferedReader br=new BufferedReader(fr);
		 String note=br.readLine();
		 String[] notSplit=note.split(" ");
		 System.out.println(notSplit[0]);
		 br.close();
	}

}
