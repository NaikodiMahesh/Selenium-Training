package day5;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.DrbgParameters.Capability;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserStackTest {
	
	
WebDriver driver;
	

	@Parameters({"os","osVersion","browser","browserVersion"})
	@BeforeMethod
	public void setup(String os,String osVersion,String browser,String browserVersion) {
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		capabilities.setCapability("os", os);
		
		capabilities.setCapability("osVersion", osVersion);
		
		capabilities.setCapability("browser", browser);
		
		capabilities.setCapability("browserVersion", browserVersion);
		
		
		
		
//		DesiredCapabilities capabilities2=new DesiredCapabilities();
//		
//		
//		capabilities2.setCapability("osVersion", "16");
//		
//		capabilities2.setCapability("deviceName", "iPhone 14");
		
		
		URL url=null;
		try {
			url=new URL("https://naikodimahesh_0ienAW:nEXGh6XYkEk3uy3qMqCM@hub-cloud.browserstack.com/wd/hub");
		}catch(MalformedURLException e) {
			e.printStackTrace();
			
		}
		
		driver=new RemoteWebDriver(url, capabilities);
		//driver=new RemoteWebDriver(url,capabilities2);
		
		
		
	}
	
	@AfterMethod
	public void tearnow() {
		driver.quit();
		System.out.println("runnning after method");
	}
	
	@Test
	public void gridTest() {
		
		driver.get("https://ineuron-courses.vercel.app/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("courses"));
		
	}

}
