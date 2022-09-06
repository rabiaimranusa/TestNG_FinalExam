package test;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.Page_TN;

import util.BrowserFactory;

public class Test_TN2 {
	WebDriver driver;
	 
	  @Test
	  public void landOnPage() {
	  
	  driver = BrowserFactory.init();
	  
	  Page_TN objpage_TN = PageFactory.initElements(driver,page.Page_TN.class);
	  objpage_TN.addCategoryInputElement();
	  objpage_TN.clickAddCategoryButton();
	  String bodytext = driver.findElement(By.tagName("body")).getText();
	  String [] arr=bodytext.split(":");
	  String expected=arr[0].trim();
	  Assert.assertEquals(expected, "The category you want to add already exists", "not found");
	 
}
	  
	  
	  
}