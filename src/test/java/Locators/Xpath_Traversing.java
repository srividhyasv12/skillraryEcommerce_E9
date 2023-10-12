package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Traversing {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
		
		
		
		WebDriver driver = new EdgeDriver();
		
		
		Thread.sleep(3000);

		
		driver.manage().window().maximize();
		
		
		/*driver.get("https://www.amazon.in/s?k=mobile&rh=n%3A1389401031&ref=nb_sb_noss");
WebElement value = driver.findElement(By.xpath("//span[text()='Redmi 12C (Matte Black, 4GB RAM, 64GB Storage) | High Performance Mediatek Helio G85 | Big 17cm(6.71) HD+ Display with 5000mAh(typ) Battery']/../../../../../..//span[@class='a-price-whole']"));
System.out.println(value.getText());*/


//EXMPLE IM DOING
driver.get("https://www.amazon.in/");

Thread.sleep(3000);

driver.get("https://www.amazon.in/s?hidden-keywords=B0B3RRWSF6+%7C+B0B5B6PQCT+%7C+B0BF57RN3K+%7C+B0B6BLTGTT+%7C+B0B854R7NS+%7C+B0B5LVS732+%7C+B0BJ72WZQ7+%7C+B09NVPSCQT+%7C+B0B53QFZPY+%7C+B0B3RSDSZ3+%7C+B0B5DDJNH4+%7C+B0BP18W8TM+%7C+B0BF563HB4+%7C+B09V12K8NT+%7C+B09YV4MW2T+%7C+B0B5LW5DFQ+%7C+B0B6BPX5S9+%7C+B09YV42QHZ+%7C+B0B5LWP12T+%7C+B0BF4YBLPX+%7C+B0BRJF98R9+%7C+B0B53NXFFR+%7C+B09RK7XWQS+%7C+B0BBVKRP7B+%7C+B0BMM4MBT2&_encoding=UTF8&content-id=amzn1.sym.1d9c4ea9-3ab9-42b8-b5d3-076dd8040b34&pd_rd_r=d05689b6-c0df-4bec-810d-1493b9810dfb&pd_rd_w=EEMnw&pd_rd_wg=PvKmc&pf_rd_p=1d9c4ea9-3ab9-42b8-b5d3-076dd8040b34&pf_rd_r=569E8RQK3GWEV9F4ZPB3&ref=pd_gw_unk");
WebElement watch = driver.findElement(By.xpath("//span[text()='Noise Pulse 2 Max 1.85\" Display, Bluetooth Calling Smart Watch, 10 Days Battery, 550 NITS Brightness, Smart DND, 100 Sports Modes, Smartwatch for Men and Women (Jet Black)']/../../../../../../../../..//span[@class='a-price-whole']"));
System.out.println(watch.getText());
	}

}
