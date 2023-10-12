package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//project object model but this is page object model



public class FacebookLoginPage {
//************declaration****************
	
//adress of email text field
	@FindBy(id="email")
	private WebElement emailTF;
	
//address of password text field
	@FindBy(name="pass")
	private WebElement passwordTF;
	
	//address of login button
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
//*********initialization*****************
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


//**************utilization****************
//gettermethods
	public WebElement getEmailTF() {
		return emailTF;
	}


	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

//*************bussiness libraries****************
public void emailTextfield(String data) {
	emailTF.sendKeys(data);
}

public void passwordtextfield(String data) {
	passwordTF.sendKeys(data);
}
public void loginButton() {
	loginBtn.click();
}


	
}	
	
	

