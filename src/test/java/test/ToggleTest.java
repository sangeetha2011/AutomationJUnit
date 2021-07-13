package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.Toggle;
import util.BrowserFactory;


public class ToggleTest {
	WebDriver driver;
	@Test
	public void toggleTest() throws InterruptedException {
		
		 driver = BrowserFactory.init();
		 Toggle toggle = PageFactory.initElements(driver, Toggle.class);
		 toggle.addOptions();
		 toggle.clicktogglebox();
		 toggle.Test_CheckBox_Check();
		 
		  
		 
		
		

}
}