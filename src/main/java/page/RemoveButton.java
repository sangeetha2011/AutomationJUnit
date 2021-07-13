package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveButton extends BasePage {
	
		 
		WebDriver driver;
			public RemoveButton (WebDriver driver) {
				this.driver = driver;
			}
			
			
			@FindBy(how = How.CSS,using ="input[type='checkbox'][name='todo[2]']")WebElement CHECKBOX_ELEMENT;
			@FindBy(how = How.CSS,using ="input[value='Remove']")WebElement Remove_button;
			
			

	
	
	
	public void remove_checkButton() {
		
		CHECKBOX_ELEMENT.click();
		
	}
	
	public void remove_Button() {
		Remove_button.click();
		
	}
	
	
	
	
}