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

public class Grid3 
{
	@Test
	public void gridTest() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setBrowserName("firefox");
		//capability.setPlatform(Platform.WINDOWS);
		capability.setPlatform(Platform.LINUX);
		ChromeOptions options = new ChromeOptions();
		options.merge(capability);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		driver.get("https://www.wikipedia.org/");		
		driver.quit();
	}

}
