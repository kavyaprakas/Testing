package com.example.demo.Day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task53 {
	public static void main(String[] arg)
	{
		WebDriverManager .edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).sendKeys("401",Keys.ENTER);
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).sendKeys("402",Keys.ENTER);
	}

}
