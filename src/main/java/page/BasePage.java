package page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class BasePage {
	
	public  void selectElement(WebElement element) {
		 Select sel = new Select(element);
		   //sel.getAllSelectedOptions();
		}
	public int  randomNumber(int numbers) {
		Random random = new Random();
		int number = random.nextInt(numbers);
		return number;
		
	}

}
