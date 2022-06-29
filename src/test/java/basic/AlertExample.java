package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertExample extends Base{
	
	public void alertDemo() {
		WebElement promptAlert = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		
		promptAlert.click();
	
		//get message
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		
		//ok or submit or yes or accept
//		driver.switchTo().alert().accept();
		
		//dismiss or cancel or close or keyboard escape key
//		driver.switchTo().alert().dismiss();
		
		//sendkeys
		driver.switchTo().alert().sendKeys("hello");
		
		
		
	}

	public static void main(String[] args) {
		AlertExample obj = new AlertExample();
		obj.setupBrowser("firefox", "https://the-internet.herokuapp.com/javascript_alerts");
		obj.alertDemo();

	}

}
