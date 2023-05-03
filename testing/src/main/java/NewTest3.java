import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewTest3 {
	WebDriver driver;
	@Parameters(value="browsers")
	@BeforeTest
  
  public void browserSelection(String browser)
  {
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-orginis=*");
			driver=new ChromeDriver(co);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
		}
  }
	@Test
	public void TC_001(){
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
}
