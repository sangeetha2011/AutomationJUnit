package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveButton;
import page.Toggle;
import util.BrowserFactory;

public class RemoveOptionTest {
	WebDriver driver;
	@Test
	public void removeOption() {
		
		 driver = BrowserFactory.init();
		 Toggle toggle = PageFactory.initElements(driver, Toggle.class);
		 
		 RemoveButton removeButton = PageFactory.initElements(driver, RemoveButton.class);
		 toggle.addOptions();
		 removeButton.remove_checkButton();
		 removeButton.remove_Button();

}
}