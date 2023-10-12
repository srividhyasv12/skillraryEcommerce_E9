package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
//Declaration
	
	//address of gear webelement
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
   //address of skillrary demoapp
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	 //address of search text field
		@FindBy(xpath="//input[@name='q']")
		private WebElement searchtf;
		
		//address of search icon 
		@FindBy(xpath="//input[@value='go']")
		private WebElement searchicon;
		
		//address of cookies
				@FindBy(xpath="//a[@class='close_cookies']")
				private WebElement cookies;
				
				//INITIALIZATION
public  SkillraryHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
//Utiliztion
public void gearsButton() {
	gearsbtn.click();
}
public void skillraraydemoappWebElement() {
	skillrarydemoapp.click();
	
}	
public void searchTextField() {
	searchtf.click();	
}	

public void searchiconWebElement() {
	searchicon.click();	
}	
public void coockiesIcon() {
	cookies.click();	
}	











}
