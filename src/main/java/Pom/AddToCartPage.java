package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
//declaration
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement Doubleclick;
	

	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	//initialization
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	//utilization
	public WebElement getDoubleClick() {
		return Doubleclick;
	}
	
	public void addtocart() {
		addtocart.click();
	}
	
}
