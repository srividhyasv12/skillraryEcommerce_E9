package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_upload {
	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
				driver.manage().window().maximize();
				

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
Thread.sleep(3000);
driver.get("https://www.foundit.in/");
driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\rajes\\Documents\\SHARVESH NAME TAG.docx");






/*	//usename:password@url
	driver.get("https://www.naukri.com/registration/createAccount? ");
	//associate with input tag
	driver.findElement(By.id("resumeupload")).sendKeys("\"C:\\Users\\rajes\\Documents\\selenium\\se.PNG\"");*/

}
}