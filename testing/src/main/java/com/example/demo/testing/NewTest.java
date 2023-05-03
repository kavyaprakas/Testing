package com.example.demo.testing;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void add(int num1,int num2, int exp) {
	  int actual=num1+num2;
	  Assert.assertEquals(exp, actual);
  }
  public void sub(int num1,int num2, int exp) {
	  int actual=num1-num2;
	  Assert.assertEquals(exp, actual);
  }
  public void mul(int num1,int num2, int exp) {
	  int actual=num1*num2;
	  Assert.assertEquals(exp, actual);
  }
  public void div(int num1,int num2, int exp) {
	  int actual=num1/num2;
	  Assert.assertEquals(exp, actual);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {1,2,3},
      new Object[] {2,3,5},
      new Object[] {4,2,2},
      new Object[] {2,2,4},
      new Object[] {16,4,4}
    };
  }
}
