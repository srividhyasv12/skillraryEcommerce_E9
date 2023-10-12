package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Related_methods {
	public static void main(String[] args) throws Throwable {
		
	
	//managing drivers
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//maximize the browser
				driver.manage().window().maximize();
				
//***********//implicitwait*************//only for find element and find elements
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
//entering the url
				driver.get("https://www.facebook.com/");
			
WebElement emailtf = driver.findElement(By.xpath("//input[@id='email']"));
emailtf.sendKeys("vidhya");
Thread.sleep(3000);
emailtf.clear();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@type='submit']")).submit();

}
}