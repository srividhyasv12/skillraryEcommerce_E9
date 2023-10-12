package scripts;

import org.testng.annotations.Test;

import Pom.SkillraryHomePage;
import Pom.demoSkillrarypage;
import Pom.downloadInvoicePage;
import generic_Library.BasicClass;

public class TestCase_2 extends BasicClass{
	@Test
	public void tc2() throws Throwable {
		SkillraryHomePage s =new SkillraryHomePage(driver);
		
	     s.gearsButton();
	    		
	     s.skillraraydemoappWebElement();
	     utiles.childBrowser(driver);
	     demoSkillrarypage dS = new demoSkillrarypage(driver);
	     Thread.sleep(3000);
	     dS.feedbackButton();
	     Thread.sleep(3000);
	     downloadInvoicePage dI = new downloadInvoicePage(driver);
	     dI.DownloadInvoiceWebElement();
	}

	
}
