package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoSkillrarypage {
//declaration
	//address of course webelement
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursebtn;
	
	//address ofselect drop down
	@FindBy(name="addresstype")
	private WebElement searchDd;
	
	//address  of feedback web element
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedbackbtn;
	
	
	
	//INITIALIZATION
public demoSkillrarypage(WebDriver driver) {
PageFactory.initElements(driver, this);
}	
//utilization
public WebElement getCoursebtn() {
	return coursebtn;
}
public WebElement getsearchDd() {
	return searchDd;
}
public void feedbackButton() {
	feedbackbtn.click();
}
	




	}



	