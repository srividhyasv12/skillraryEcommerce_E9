package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal_frame {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
				driver.manage().window().maximize();
				

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
//entering the url
				driver.get("https://www.snapdeal.com/");
				//address of sign in
				WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
				//create object for action class(present inside the interaction)
				Actions a =new Actions(driver);
				a.moveToElement(signin).perform();
				Thread.sleep(3000);//enyter in the developer tool to free screen choose--->console --->enter-->setTimeout(function() {debugger;}, 9000); 
				driver.findElement(By.xpath("//span[text()='Register']")).click();
				Thread.sleep(3000);
				//handling frame
				driver.switchTo().frame("loginIframe");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("vidhu");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='close-pop']")).click();
				driver.switchTo().defaultContent();
				driver.findElement(By.id("//input[@id='inputValEnter']")).sendKeys("mobiles");
	}

}


