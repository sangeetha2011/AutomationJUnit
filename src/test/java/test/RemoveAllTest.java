package test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.RemoveButton;
import page.Toggle;
import util.BrowserFactory;

public class RemoveAllTest {

	
		WebDriver driver;
		@Test
	public void checking_remove_all_Option() {
			
			 driver = BrowserFactory.init();
			 Toggle toggle = PageFactory.initElements(driver, Toggle.class);
			 
			 RemoveButton removeButton = PageFactory.initElements(driver, RemoveButton.class);
			 toggle.addOptions();
			 toggle.clicktogglebox();
			 removeButton.remove_Button();

			
			
			
		}	
		@After
		public void tearDown() {
			driver.close();
			driver.quit();
		}
	
	
	
	
	
}
