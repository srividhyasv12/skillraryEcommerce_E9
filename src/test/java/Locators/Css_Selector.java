package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector {
public static void main(String[] args) throws Throwable {
	//driver related statement
	WebDriverManager.edgedriver().setup();
	
	
	//opens the empty browser
	WebDriver driver = new EdgeDriver();
	
	//wait
	Thread.sleep(3000);

	//MAXIMIZE THE WINDOW
	driver.manage().window().maximize();
	
	//driver.get("https://www.facebook.com/");
	driver.get("https://www.facebook.com/");
	
	//------TAGNAME[ATTRIBUTE='VALUE']
	
	//css selector
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sanjay");
	

	
	
	
	
	
}
}
