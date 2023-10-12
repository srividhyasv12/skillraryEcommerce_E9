package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class downloadInvoicePage {
//declaration
	@FindBy(xpath="//input[@name='downloadInvoice']")
		private WebElement downloadInvoice;
	
	//initialization
	
	public downloadInvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void DownloadInvoiceWebElement() {
		downloadInvoice.click();
	}
	
}