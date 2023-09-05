package testPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid 
{
	@Test
	public void gridTest() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName("chrome");
		//capability.setPlatform(Platform.WINDOWS);
		capability.setPlatform(Platform.LINUX);
		ChromeOptions options = new ChromeOptions();
		options.merge(capability);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		driver.get("https://www.google.co.in/");
		System.out.println("Grid google home page opened");
		Thread.sleep(20000);
		driver.findElement(By.name("q")).sendKeys("Seleium grid docker");
		Thread.sleep(10000);
		driver.quit();
	}

}
