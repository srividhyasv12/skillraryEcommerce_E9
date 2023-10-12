package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getSize {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//managing drivers
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				//maximize the browser
						driver.manage().window().maximize();
						
		//***********//implicitwait*************//only for find element and find elements
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
						
		//entering the url
						driver.get("https://www.facebook.com/");
						WebElement emailTF = driver.findElement(By.xpath("//input[@id='email']"));
						Dimension size = emailTF.getSize();
						int h = size.getHeight();
						int w = size.getWidth();
						System.out.println(h);
						System.out.println(w);
					
}
}