package com.example.demo.testing;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class extentreports {
	//directory where output is to be printed
	ExtentSparkReporter spark = new ExtentSparkReporter("extentreport.html");
	ExtentReports extent = new ExtentReports();
	static ExtentTest test;

  @Test
  public void f() {
	  test=extent.createTest("TC_001","sample testing for extent reports");
      test.log(Status.PASS, "TC_0091");
  }
  @BeforeTest
  public void beforeMethod() {
	  extent.attachReporter(spark);
  }
 
  
  @AfterMethod
  public void afterMethod() {
  }

  @AfterSuite
  public void afterSuite() {
extent.flush();
}}