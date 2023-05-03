import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;



public class NewTest05 {
WebDriver driver;
//directory where output is to be printed
ExtentSparkReporter spark = new ExtentSparkReporter("extentreport.html");
ExtentReports extent = new ExtentReports();
static ExtentTest test;


String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
@BeforeTest
public void before() {
	extent.attachReporter(spark);
WebDriverManager.edgedriver().setup();
 driver = new EdgeDriver();
 driver.get(url);
 driver.manage().window().maximize();

}
  @Test
  public void D9E5() throws InterruptedException{
 Thread.sleep(5000);
 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Suvitha",Keys.ENTER);
 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("12345",Keys.ENTER);
 String msg=driver.getCurrentUrl();
 Assert.assertEquals(msg, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
 Thread.sleep(5000);
 test=extent.createTest("TC_001","passed");
 test.log(Status.PASS,"TC_001");
 
  }

  @AfterSuite
  public void TC_003() {
	  extent.flush();
	  driver.quit();
  }
 
}
