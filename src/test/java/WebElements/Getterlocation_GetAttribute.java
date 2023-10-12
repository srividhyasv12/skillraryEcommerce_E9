package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getterlocation_GetAttribute {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//managing drivers
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				//maximize the browser
						driver.manage().window().maximize();
						
		//***********//implicitwait*************//only for find element and find elements
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
						
		//entering the url
						driver.get("https://www.facebook.com/");
					
		WebElement emailTF = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println(emailTF.getAttribute("placeholder"));//getattribute
		Thread.sleep(3000);
		//using get location
		Point coOrrdinates = emailTF.getLocation();
		
		//print co ordinates
		System.out.println(coOrrdinates);
		int x = coOrrdinates.getX();
		System.out.println(x);
		int y = coOrrdinates.getY();
		System.out.println(y);
	}

}
