package testPackage;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Selenium_General
{
	//@Test
	public void execute()
	{
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.cssSelector("textarea[data-ved^='0ahUK']")).sendKeys("Test");
	//System.out.println("Opened Google Home Page");
	//driver.quit();
	//Dimension d=new Dimension(400,900);
	//driver.manage().window().setSize(d);
	}
	
	@Test
	public void pageLoad()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search=driver.findElement(By.cssSelector("textarea[data-ved^='0ahUK']"));
		//WebDriverWait wait = new WebDriverWait(driver,30);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));			
		wait.until(ExpectedConditions.visibilityOf(search));
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
		System.out.println("Wait complete");
	}


}
