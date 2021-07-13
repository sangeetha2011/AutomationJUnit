package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Toggle extends BasePage {
	 
	WebDriver driver;
		public Toggle (WebDriver driver) {
			this.driver = driver;
		}
		@FindBy(how = How.NAME, using ="allbox")WebElement TOGGLEBOX_ELEMENTS;
		
		@FindBy(how = How.CSS,using ="input[type='checkbox'][name='todo[3]']")WebElement CCHECKBOX_ELEMENT; 
		@FindBy(how = How.CSS,using ="input[type='text'][name='data']")WebElement  ADD_CATEGORY;  
		@FindBy(how = How.CSS,using ="input[type='submit'][value='Add']")WebElement  ADD_BUTTON;  
		@FindBy(how = How.CSS,using ="div[id='todos-content']")WebElement  CONTENT_LIST;  
		
		
		
		public void addOptions() {
			
			for(int i =1;i<=3;i++) {
			ADD_CATEGORY.sendKeys("Random"+i+randomNumber(200));
			ADD_BUTTON.click();
			
		}
		}
		
		
		
		public void clicktogglebox() {
			
			TOGGLEBOX_ELEMENTS.click();	
		}
	 
		public void Test_CheckBox_Check()throws InterruptedException {
			CONTENT_LIST.isSelected();
			
		}
}
