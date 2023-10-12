package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Followig_Sibling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
WebDriverManager.edgedriver().setup();
		
		
		
		WebDriver driver = new EdgeDriver();
		
		
		Thread.sleep(3000);

		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
driver.findElement(By.xpath("//a[text()='Mobiles']/following-sibling::a[@data-csa-c-content-id='nav_cs_gb']")).click();
}
}//a[text()='Mobiles']/following-sibling::a[@data-csa-c-content-id='nav_cs_gb']