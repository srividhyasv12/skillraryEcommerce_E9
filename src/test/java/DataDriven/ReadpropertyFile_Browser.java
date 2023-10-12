package DataDriven;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadpropertyFile_Browser {
public static void main(String[] args) throws IOException, Throwable {
	

	Properties p=new Properties();
	FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\Data.properties");
	p.load(fis);
	String appurl =p.getProperty("url");
	String user= p.getProperty("username");
	String paswsword =p.getProperty("password");
	String browser=p.getProperty("browser");
	WebDriver driver;
	if (browser.equals("edge")) {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	}else
	{
		System.setProperty("Webdriver.chrome.driver","");
		driver = new ChromeDriver();
	}
	
	
	driver.manage().window().maximize();
	

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.get(appurl);
driver.findElement(By.id("email")).sendKeys("admin");
driver.findElement(By.id("pass")).sendKeys("admin");
}
}