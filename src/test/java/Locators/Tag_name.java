package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tag_name {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//driver related statement
				WebDriverManager.edgedriver().setup();
				
				
				//opens the empty browser
				WebDriver driver = new EdgeDriver();
				
				//wait
				Thread.sleep(3000);

				//MAXIMIZE THE WINDOW
				driver.manage().window().maximize();
				
				//write a prgm fetch all the links in the webpage ????????
				///??/////
				//it open the applications
				//driver.get("https://www.facebook.com/");
				driver.get("https://www.amazon.ae/");
				List<WebElement>allLinks = driver.findElements(By.tagName("a"));
				System.out.println(allLinks.size());
for(WebElement b:allLinks) {
	System.out.println(b.getText());
}
	}

}
