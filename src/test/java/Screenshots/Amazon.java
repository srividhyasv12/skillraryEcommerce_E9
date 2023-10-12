package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws IOException  {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
				driver.manage().window().maximize();
				

	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
	//entering the url
				driver.get("https://www.amazon.in/");
				//downcating
				TakesScreenshot ts = (TakesScreenshot)driver;
			File src	= ts.getScreenshotAs(OutputType.FILE);
			File dest =new File("./Screenshots/amazon.png");
			FileUtils.copyFile(src, dest);
			
}}
