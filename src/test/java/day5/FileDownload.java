package day5;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
	
	@Test
	
	public void fileDownload() {
		
		ChromeOptions opt=new ChromeOptions();  //FIRST WE HAVE TO GIVE THE PATH ON THAT WE HAVE TO DO OPEARTIONS
		
		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "C:/Java-Mahesh/");

		opt.setExperimentalOption("prefs", prefs);
		
	
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://the-internet.herokuapp.com/download");
	
	driver.findElement(By.xpath("//a[contains(text(),'Hello World.docx')]")).click();
	
	
	
	
	
	
	
	
	
	
	}
	

}
