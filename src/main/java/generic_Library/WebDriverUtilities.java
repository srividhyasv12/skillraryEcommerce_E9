package generic_Library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
//1.HAndle DropDown
	public void dropDown(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
				
	}
	//2.\Handling Mouseovering
	public void mouseOvering(WebDriver driver,WebElement ele) {
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();;
		
	}
	//3.Handling right click
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a =new Actions(driver);
		a.contextClick(ele).perform();
}
	//4.HAndling double click
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a =new Actions(driver);
		a.doubleClick(ele).perform();
}
	//5.Handling Drag and Drop
	public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2) {
		Actions a =new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();;
	}
     //6.handling Frame	
	public void frames(WebDriver driver, String value) {
		driver.switchTo().frame(value);
	}
	
	//7.HAndling Default Content
	public void frames(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	//8.Handling Scrolling
	public void scrolling(WebDriver driver,int x,int y) {
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(" + x +","+ y +")");
	}
	
	//9.Handling Scrolling
	public void Scrolling (WebDriver driver,WebElement ele){
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);
	}
	//10.Handling Pop_ups
	public void popup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	//11.handling child browser
	public void childBrowser(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child){
			driver.switchTo().window(b);
		}
		
	}
	//public void childBrowser(WebDriver driver) { Set<String> child = driver.getWindowHandles(); for (String b : child) { driver.switchTo().window(b); } } 
	
	
	
}



