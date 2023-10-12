package Bsic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.gecko.driver", "\"C:\\Users\\rajes\\Pictures\\geckodriver.exe\"");
WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	

	driver.get("https://www.woodenstreet.com/");
Thread.sleep(2000);
}
}
