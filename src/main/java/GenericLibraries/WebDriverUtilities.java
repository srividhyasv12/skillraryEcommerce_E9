package GenericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {
	

//1.doubleclick
	public void doubleClickprocess(WebDriver driver,WebElement ele) {
		
	
	Actions a = new Actions(driver);
	a.doubleClick(ele).perform();
}
	//2.rightclick
	public void rightclick(WebDriver driver,WebElement rclick) {
		Actions b = new Actions(driver);
		b.contextClick(rclick).perform();
	}
	//3.DragandDrop
	public void dragAndDrop(WebDriver driver,WebElement ele3,WebElement ele4) {
		Actions c= new Actions(driver);
		c.dragAndDrop(ele3, ele4).perform();
}
	//4.implicitwait
	public void implictWAit(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	//5.explicitelements to be clickable
	public void explicitWAit(WebDriver driver,WebElement ele5,int time) {
		WebDriverWait wait= new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(ele5));
	
		
	}
}//SkillraryEcommerce_E9 artifact id