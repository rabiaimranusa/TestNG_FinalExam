package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Page_TN;

import util.BrowserFactory;

public class Test_TN {
	WebDriver driver;
	 
	  @Test
	  public void landOnPage() {
	  
	  driver = BrowserFactory.init();
	  
	  Page_TN objpage_TN = PageFactory.initElements(driver,page.Page_TN.class);
	  objpage_TN.addCategoryInputElement();
	  objpage_TN.clickAddCategoryButton();
	
}
	  
	  
	  
}