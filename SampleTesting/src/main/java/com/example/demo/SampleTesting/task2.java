package com.example.demo.SampleTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {
	public static void main(String[]arg) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
        driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Kavya");
        driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("deepukavya27@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Kavya");
        driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("deepukavya27@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("best wishes");
        driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("2");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	}

}
