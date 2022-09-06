package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page_TN {
	
	WebDriver driver;
	
	public void findElements(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[1]")WebElement ADD_CATEGORY_INPUT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @value= 'Add category']")WebElement ADD_CATEGORY_BUTTON;
	
	
	public void addCategoryInputElement() {
		ADD_CATEGORY_INPUT_ELEMENT.sendKeys("rabiatf" );
	
	}
	
	public void clickAddCategoryButton() {
		ADD_CATEGORY_BUTTON.click();
	}
	
	
}



