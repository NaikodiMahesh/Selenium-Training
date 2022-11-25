package day5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	
	
	Actions act=new Actions(driver);
	
	act.moveToElement(driver.findElement(By.id("file-upload"))).click();
	
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C://Users//naimahes//Desktop//Fileupload.exe/");
	driver.findElement(By.id("file-submit")).click();
	
	
	}
	

}
