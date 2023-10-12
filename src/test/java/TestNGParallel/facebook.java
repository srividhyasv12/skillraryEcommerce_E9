package TestNGParallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
@Test
public void fb() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	//maximize the browser
			driver.manage().window().maximize();
			

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
//entering the url
			driver.get("https://www.facebook.com/");
}
}

