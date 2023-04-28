package com.example.demo.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag {
	public static void main(String[]arg)
	{
		WebDriverManager .edgedriver().setup();
		WebDriver driver=new EdgeDriver();
	    driver.get("https://demoqa.com/droppable/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  
	    Actions act= new Actions(driver);
	    WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    act.dragAndDrop(drag, drop).build().perform();
	    driver.quit();
	    
}
}
