package Bsic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_Browser {

	public static void main(String[] args) throws Throwable {
		
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		
		//opens the empty browser
		WebDriver driver = new EdgeDriver();
		
		Thread.sleep(3000);
		//MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
	}
}
