package Day3;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllInOne {
	@Test

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ineuron@ineuron.ai");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ineuron");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        Actions act=new Actions(driver);
        
        WebElement src=driver.findElement(By.xpath("//span[contains(text(),'Manage')]"));
        
        act.moveToElement(src).perform();
        
        String parent=driver.getWindowHandle();
        System.out.println("parent window handle is "+parent);
        
        
        driver.findElement(By.xpath("//span[contains(text(),'Manage Categories')]")).click();
        
        Set<String> allWindowHandle=driver.getWindowHandles();
        Assert.assertTrue(true);
        
        //driver.switchTo().window(parent);
        
        for(String child:allWindowHandle)
		{
			
			if(!child.equals(parent))
			{
				
				driver.switchTo().window(child);
				driver.findElement(By.xpath("//button[contains(text(),'Add New Category ')]")).click();
				
				driver.switchTo().alert().sendKeys("JavaSelenium-1");
				driver.switchTo().alert().accept();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				//js.executeScript("alert('Party')");
					// scroll till webelement into view
				js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//td[contains(text(),'Selenium-1')]//following::button[1]")));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//td[contains(text(),'Selenium-1')]//following::button[1]")).click();
				//act.moveToElement(driver.findElement(By.xpath("//td[contains(text(),'Selenium-1')]//following::button[1]"))).click();
				//driver.switchTo().alert().accept();
				driver.findElement(By.xpath("//button[contains(text(),'Cancel')]//following::button[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
				
			}
			
		}
        
        
        
        
        
        
        
        
        //driver.switchTo().newWindow(null);
		
		
	
        //mouse over
       

	}

}
