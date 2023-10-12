package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadWrite_ExcelFile {
public static void main(String[] args) throws Throwable  {
	FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\sele.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	
	

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.get(url);
String title = driver.getTitle();
//writing data
wb.getSheet("Sheet1").createRow(8).createCell(0).setCellValue(title);
FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\sele.xlsx");
wb.write(fos);
}
}