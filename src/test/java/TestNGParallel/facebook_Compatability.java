package TestNGParallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_Compatability {
	@Parameters({"browsername"})//give once after converting into suite fille
@Test
public void fbc(String browser){
	WebDriver driver;
	if(browser.equals("edge")) {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
}
	else {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajes\\eclipse-workspace\\Qco_Soejvd_E9\\src\\main\\resources\\chromedriver (1).exe");
		driver = new ChromeDriver();
	}
	//maximize the browser
			driver.manage().window().maximize();
			

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
//entering the url
			driver.get("https://www.facebook.com/");
}
}
