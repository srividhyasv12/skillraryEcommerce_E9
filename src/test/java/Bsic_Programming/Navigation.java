apackage Bsic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable {
		
		
		//driver related statement
		WebDriverManager.edgedriver().setup();
		
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		//wait
		Thread.sleep(3000);

		//MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
		//it open the applications
		driver.get("https://www.facebook.com/");
		
		//wait
				Thread.sleep(3000);
				
				//navigating one webpage to another
				driver.navigate().to("https://www.amazon.com/");Thread.sleep(3000);
				
				//navigating back
				driver.navigate().back();Thread.sleep(3000);
				
				//navigate forward
				driver.navigate().forward();Thread.sleep(3000);
				
				driver.navigate().refresh();
		
				Thread.sleep(5000);
				//close the page
				driver.quit();//--------> OR driver.close();
		
			}

}
