package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NameofState {
	
	
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'New user')]")).click();
		Thread.sleep(2000);
		//WebElement statedropdwon=driver.findElement(By.xpath("//select[contains(@name,'state')]"));
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("mahesh");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mahesh@gamil.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mahesh22");
		
		driver.findElement(By.xpath("//label[contains(text(),'Blockchain')]")).click();
		//driver.findElement(By.xpath());
		
		Assert.assertTrue(true);
		
		//WebElement state=driver.findElement(By.xpath("//select[contains(@name,'state')]"));
		//Select stateopt=new Select(state);
		//stateopt.getOptions().set(0, state);
		
		
		
		//Select state=new Select(statedropdown);
		

	}

}
