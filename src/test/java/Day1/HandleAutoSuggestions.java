package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAutoSuggestions {

	
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("Mahesh");
		Assert.assertTrue(true);
		Thread.sleep(5000);
		List<WebElement> allElements=driver.findElements(By.xpath("//div[@role='option']"));
		
		for(WebElement e:allElements) {
			
			String str=e.getTagName();
			System.out.println(str);
			if(str.contains("Naikodi")) {
				e.click();
				break;
			}
		
		}
		
		
		
		
		
		
		
		

	}

}
