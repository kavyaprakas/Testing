package com.example.demo.SampleTesting; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import io.github.bonigarcia.wdm.WebDriverManager; 
public class task4 { public static void main(String[] args) throws InterruptedException 
{
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver(); 
	driver.navigate().to("https://j2store.net/free/"); 
	driver.manage().window().maximize(); String curl=driver.getCurrentUrl(); 
	if(curl.equals("https://j2store.net/free/")) { System.out.println("same url"); } 
	else { System.out.println("not same url");
	}
	}
}