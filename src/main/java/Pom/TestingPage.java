package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	
	//declaration
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbIcon;
	
	
	//initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void fbIconWebElement() {
		fbIcon.click();
	}
	public WebElement getFbIcon() {
		return fbIcon;
	}
}
/*https://www.skillrary.com/ 
	https://demoapp.skillrary.com/ 
	https://demoapp.skillrary.com/feedback.php
		https://demoapp.skillrary.com/category.php?category=testing	
		https://demoapp.skillrary.com/product.php?product=java*/ 
		