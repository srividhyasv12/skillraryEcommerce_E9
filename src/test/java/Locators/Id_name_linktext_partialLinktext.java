package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_name_linktext_partialLinktext {
	public static void main(String[] args) throws Throwable {
		
		//driver related statement
		WebDriverManager.edgedriver().setup();
		
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//wait
		Thread.sleep(3000);

		//MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
		//it open the applications
		driver.get("https://www.facebook.com/");
		
		//wait
				Thread.sleep(3000);
				//address of email text field
				driver.findElement(By.id("email")).sendKeys("srividhyasanju");
				//address of password textfield
				driver.findElement(By.name("pass")).sendKeys("rajesh");
				//address of login button
				//driver.findElement(By.name("login")).click();
				//click create apage
				//driver.findElement(By.linkText("Create a Page")).click();
				//driver.findElement(By.partialLinkText(" for a celebrity, brand or business.")).click();
	//driver.findElement(By.partialLinkText("Forgotten password?")).click();
	driver.findElement(By.tagName(""))
	
	
	
	
	
	
	}

}
