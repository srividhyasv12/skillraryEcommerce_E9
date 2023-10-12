import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
				driver.manage().window().maximize();
				

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
//entering the url
				driver.get("https://demoapp.skillrary.com/ ");
				WebElement mS =driver.findElement(By.xpath("//select[@id='cars']"));
				Select s = new Select(mS);
				System.out.println(s.isMultiple());
				s.selectByIndex(0);
				
				Thread.sleep(3000);
				s.selectByValue("299");
				Thread.sleep(3000);
				//s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
				
				//s.deselectByIndex(0);
				Thread.sleep(3000);
				s.deselectByValue("299");
				Thread.sleep(3000);
				//s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");
				List<WebElement>values =s.getAllSelectedOptions();
				for(WebElement b:values) {
					System.out.println(b.getText());
				}
				Thread.sleep(5000);
	driver.close();			

}}