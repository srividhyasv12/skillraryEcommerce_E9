package TestNg_Failing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	@Test
public void amz() {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	//maximize the browser
			driver.manage().window().maximize();
			

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
//entering the url
			driver.get("https://www.amazon.in/");
}
}
