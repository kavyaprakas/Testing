import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;


public class NewTest03 {
  WebDriver driver;


 
 
  @Test
  public void TestCase1() throws InterruptedException {
	  
	  
	  WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		
//  System.out.println("Smoke");
 String url="https://www.godaddy.com/en-in";
 driver.get(url);
 driver.manage().window().maximize();
 Thread.sleep(7000);
 String gtitle=driver.getTitle();
 String gurl=driver.getCurrentUrl();
 String title="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
 Assert.assertEquals(gtitle,title);
 Assert.assertEquals(gurl, url);
 Thread.sleep(7000);
 driver.quit();
 System.out.println("t1");
  }
 
 
 
 
  @Test
  public void TestCase2() throws InterruptedException {
	  
	  
	  
	  WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
//  System.out.println("Regression");
 String url="https://www.godaddy.com/en-in";
 driver.get(url);
 driver.manage().window().maximize();
 Thread.sleep(7000);
 driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
 Thread.sleep(7000);
 driver.quit();
 System.out.println("t2");
  }
 
 
 
  @Test
  public void TestCase3() throws InterruptedException  {
	  
	  
	  
	  WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
//  System.out.println("Smoke");
 String url="https://www.godaddy.com/en-in";
 driver.get(url);
 driver.manage().window().maximize();
 Thread.sleep(7000);
 driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
 String gtitle=driver.getTitle();
 String atitle="GoDaddy Domain Search - Buy and Register Available Domain Names";
 Assert.assertEquals(atitle, gtitle);
 Thread.sleep(7000);
 WebElement search=driver.findElement(By.xpath("/html/body/main/section[1]/section/section/div/div/section/div/div[1]/div/div/div[2]/div/div"));
 WebElement btn=driver.findElement(By.xpath("/html/body/main/section[1]/section/section/div/div/section/div/div[1]/div/div/div[2]/button"));
 boolean btr=btn.isEnabled();
 boolean searchr=search.isEnabled();
 Assert.assertEquals(btr,searchr);
 driver.quit();
 System.out.println("t3");
  }
 
 
 
  
  }