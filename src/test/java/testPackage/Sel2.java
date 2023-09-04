package testPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sel2 
{
	@Test
	public void execute()
	{
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	System.out.println("Opened Google Home Page");
	driver.quit();
	//Dimension d=new Dimension(400,900);
	//driver.manage().window().setSize(d);
	}


}
