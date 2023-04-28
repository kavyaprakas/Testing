package com.example.demo.SampleTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("kavya");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("P");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("deepukavya27@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Zarah@1018");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
    
    }
}
