package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_ancestors {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
WebDriverManager.edgedriver().setup();
		
		
		
		WebDriver driver = new EdgeDriver();
		
		
		Thread.sleep(3000);

		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/s?k=samsung+foldable&rh=n%3A1389432031&ref=nb_sb_noss");
		//WebElement value = driver.findElement(By.xpath("//span[text()='Samsung Galaxy Z Fold5 5G (Phantom Black, 12GB RAM, 512GB Storage)']/ancestor::div[@class='sg-col sg-col-4-of-12 sg-col-4-of-16 sg-col-8-of-20 sg-col-8-of-24']//span[@class='a-price-whole']"));
		WebElement value = driver.findElement(By.xpath("//span[text()='Samsung Galaxy Z Fold5 5G (ICY Blue, 12GB RAM, 512GB Storage)']/ancestor::div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 sg-col-12-of-24 s-list-col-right']//span[@class='a-price-whole']")); 
		System.out.println(value.getText());
		
		

	}

}
