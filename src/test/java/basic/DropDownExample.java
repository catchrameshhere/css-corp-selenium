package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample extends Base {
	
	public void dropDownDemo() {
		
		Select month = new Select(driver.findElement(By.id("month")));
		//index
//		month.selectByIndex(2);
		
		//value
//		month.selectByValue("5");
		
		//visible text
//		month.selectByVisibleText("Sep");
		
		//is multiple
//		System.out.println("is month dropdow multi select - " + month.isMultiple());
		
		//first value
//		WebElement firstSelectedOption = month.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
		
		//all selected values
//		List<WebElement> allSelectedValues = month.getAllSelectedOptions();
//		for (WebElement elem : allSelectedValues) {
//			System.out.println(elem.getText());
//		}
		
		//get options
		List<WebElement> options = month.getOptions();
		for (WebElement elem : options) {
			System.out.println(elem.getText());
		}
		
			
	}

	public static void main(String[] args) {
		DropDownExample obj = new DropDownExample();
		obj.setupBrowser("chrome", "https://www.facebook.com/reg/");
		obj.dropDownDemo();

	}

}
