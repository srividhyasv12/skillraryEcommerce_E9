package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicit_wait {
public static void main(String[] args) {
	

	//managing drivers
	WebDriverManager.edgedriver().setup();
	
	
	
	WebDriver driver = new EdgeDriver();
	
			
			//maximize the browser
			driver.manage().window().maximize();
			
			//***********//implicitwait*************//only for find element and find elements
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			//***************explicitwait*****************///
			WebDriverWait wait = new WebDriverWait(driver,20);
		
			
			
			//entering the url
			driver.get("https://www.facebook.com/");
		
					driver.findElement(By.id("email")).sendKeys("SRIVIDHYARAJESHKUMAR");
					WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
			wait.until(ExpectedConditions.elementToBeClickable(login));
			login.click();
}
}

