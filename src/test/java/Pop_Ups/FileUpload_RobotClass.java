package Pop_Ups;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_RobotClass {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajes\\eclipse-workspace\\Qco_Soejvd_E9\\src\\main\\resources\\chromedriver (1).exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	driver.get("https://www.naukri.com/registration/createaccount?othersrcp=22636");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	
	Robot r=new Robot();
	StringSelection str =new StringSelection("C:\\Users\\rajes\\Documents\\SHARVESH NAME TAG.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	
	r.keyRelease(KeyEvent.VK_CONTROL);      //uifyuugu
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3000);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	/*System.setProperty("webdriver.chrome.driver","C:\\Users\\rajes\\eclipse-workspace\\Qco_Soejvd_E9\\src\\main\\resources\\chromedriver (1).exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	driver.get("https://www.yatra.com/");
	Thread.sleep(4000);
	
	/*Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_ENTER);*/
	
	
}
}
