package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeExample extends Base{
	
	public void iframeDemo() {
		//index
//		driver.switchTo().frame(1);
		
		//id or name
//		driver.switchTo().frame("iframeResult");
		
		//webelement
		WebElement iframeElem = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframeElem);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		//switch to base page
		driver.switchTo().defaultContent();
		
		//parent page
		driver.switchTo().parentFrame();
		
		
	}

	public static void main(String[] args) {
		IframeExample obj = new IframeExample();
		obj.setupBrowser("chrome", "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		obj.iframeDemo();

	}

}
