package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isselected {

	public static void main(String[] args) {
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
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();//address of create a account
				//adress of radio button
			WebElement FemaleRadioButton	= driver.findElement(By.xpath("//input[@value='1']"));
			FemaleRadioButton.click();
			if(FemaleRadioButton.isSelected()) {
				System.out.println("pass ;);););)");
			}
			else
			{
				System.out.println("fail;(;(;(");
			}
				
				
				
	}

}
