package scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pom.SkillraryHomePage;
import Pom.TestingPage;
import Pom.demoSkillrarypage;
import generic_Library.BasicClass;

public class TestCase1 extends BasicClass{
@Test
public void tc1() throws Throwable {
	SkillraryHomePage s =new SkillraryHomePage(driver);
	
	Thread.sleep(3000);
     s.gearsButton();
    
     Thread.sleep(3000); 		
     s.skillraraydemoappWebElement();
     utiles.childBrowser(driver);
     demoSkillrarypage dS = new demoSkillrarypage(driver);
    utiles.dropDown(dS.getsearchDd(),pdata.getPropertydata("coursedd"));
    TestingPage tP = new TestingPage(driver);
    utiles.Scrolling(driver, tP.getFbIcon());
    Thread.sleep(3000);
    tP.fbIconWebElement();
     
}
}
