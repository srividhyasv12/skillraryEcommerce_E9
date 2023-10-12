package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_Index {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
		
		
		
		WebDriver driver = new EdgeDriver();
		
		
		Thread.sleep(3000);

		
		driver.manage().window().maximize();
		
		
		driver.get("https://demoapp.skillrary.com/");
		
		//XPATH BY ATTRIBUTES BY USING GROUP INDEX [1]
		driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[1]")).click();
		

	}

}
