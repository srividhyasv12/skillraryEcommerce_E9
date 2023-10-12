package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		
		
		
		WebDriver driver = new EdgeDriver();
		
		
		Thread.sleep(3000);

		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		//ADDRESS OF EMAIL TEXT FIELD USING XPATH BY ATTRIBUTES
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("SRIVIDHYARAJESHKUMAR");
		
		//ADDRESS OF PASSWORD TEXT FIELD USING XPATH CONTAINS attribute
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("sanju");
		
		//ADDRESS OF FORGETTEN PASSWORD  USING XPATH BY TEXT
				driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//ADDRESS OF FORGETTEN PASSWORD  USING XPATH BY TEXT
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
	}

}
