package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Clicking {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
				driver.manage().window().maximize();
				

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
//entering the url
				driver.get("https://demoapp.skillrary.com/product.php?product=java ");
				 WebElement plus  = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));//address of plus icon
				 Thread.sleep(3000);
				 Actions a =new Actions(driver);
				 a.doubleClick(plus).perform();
				driver.findElement(By.xpath("i//[@class='fa fa-shopping-cart']")).click();//need to fix
				 
}}
