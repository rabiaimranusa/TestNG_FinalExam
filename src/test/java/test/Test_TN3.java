package test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import page.Page_TN;

import util.BrowserFactory;

public class Test_TN3 {
	WebDriver driver;
	 
	  @Test
	  public void clickMonthDropDown() {
	  
	  driver = BrowserFactory.init();
	  
	 
	 WebElement monthlist = driver.findElement(By.name("due_month"));
	  Select sel = new Select(monthlist);
	  
	  List<WebElement> allMonth = sel.getOptions();
	  
	  for(WebElement monthName : allMonth) {
		  System.out.println(monthName.getText());
	  }
	  
}
	  
	  
}