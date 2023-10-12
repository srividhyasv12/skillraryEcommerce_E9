package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Preceeding_siblings {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
WebDriverManager.edgedriver().setup();
		
		
		
		WebDriver driver = new EdgeDriver();
		
		
		Thread.sleep(3000);

		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
driver.findElement(By.xpath("//a[text()='New Releases']/preceding-sibling::a[@data-csa-c-content-id='nav_cs_gb']")).click();
	}

}
