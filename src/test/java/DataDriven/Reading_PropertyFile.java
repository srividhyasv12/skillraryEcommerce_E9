package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_PropertyFile {
public static void main(String[] args) throws IOException, Throwable {
	Properties p=new Properties();
	FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\Data.properties");
	p.load(fis);
	String appurl =p.getProperty("url");
	String user= p.getProperty("username");
	String paswsword =p.getProperty("password");
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	Thread.sleep(3000);

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.get(appurl);
driver.findElement(By.id("email")).sendKeys("admin");
driver.findElement(By.id("pass")).sendKeys("admin");
}
}
