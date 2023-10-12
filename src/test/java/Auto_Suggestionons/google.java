package Auto_Suggestionons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {
	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
				driver.manage().window().maximize();
				

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
//entering the url
				driver.get("https://www.google.com/");
				//address of search text field
				driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
				Thread.sleep(3000);
				//adress of firstsearch option
	List<WebElement> allvalues= driver.findElements(By.xpath("//li[@data-view-type='1']"));
	Thread.sleep(3000);
	System.out.println(allvalues.size());
	for(WebElement b: allvalues) {
		System.out.println(b.getText());
		
	}
	Thread.sleep(3000);
	driver.close();
}
}