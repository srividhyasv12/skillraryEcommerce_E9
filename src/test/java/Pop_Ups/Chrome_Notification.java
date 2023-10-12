package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Notification {
public static void main(String[] args) throws Throwable {
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajes\\eclipse-workspace\\Qco_Soejvd_E9\\src\\main\\resources\\chromedriver (1).exe");
	Thread.sleep(3000);
			WebDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	driver.get("https://www.yatra.com/");
	Thread.sleep(4000);
	

		/*ChromeOptions disable = new ChromeOptions();
		disable.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajes\\eclipse-workspace\\Qco_Soejvd_E9\\src\\main\\resources\\chromedriver (1).exe");
		Thread.sleep(3000);
				WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		Thread.sleep(4000);*/
	}
}
