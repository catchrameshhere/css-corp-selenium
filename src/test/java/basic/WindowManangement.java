package basic;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

public class WindowManangement extends Base{
	
	public void winMgtDemo() {
		
		/*
		//window related commands
		driver.getWindowHandle(); //current active window id from the driver instance
		driver.getWindowHandles();//all the windows id opened by the driver instance
		driver.switchTo().window("<window-id>");//switch to corresponding browser/tab
		
		//closing browser related
		driver.close();//to close to tab
		driver.quit();//quit the browser
		*/
		
		System.out.println("****************Inital check******************");
		System.out.println("current active window id - " + driver.getWindowHandle());
		System.out.println("total window's open - " + driver.getWindowHandles());
		System.out.println("page title = " + driver.getTitle());
		
		System.out.println("\n********opening insta page**************");
		
		driver.findElement(By.partialLinkText("Instagram")).click();
		
		System.out.println("****************After opening insta page******************");
		System.out.println("current active window id - " + driver.getWindowHandle());
		System.out.println("total window's open - " + driver.getWindowHandles());
		System.out.println("page title = " + driver.getTitle());
		
		
		System.out.println("\n\n------------------Switiching to insta page----------------------------");
		
		ArrayList<String> tabs =  new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println("****************After switching to insta page******************");
		System.out.println("current active window id - " + driver.getWindowHandle());
		System.out.println("total window's open - " + driver.getWindowHandles());
		System.out.println("page title = " + driver.getTitle());
		
		
		System.out.println("\n\n------------------closing the insta page----------------------------");
		driver.close();
		
		System.out.println("\n\n------------------switching back to fb page----------------------------");
		driver.switchTo().window(tabs.get(0));
		System.out.println("page title = " + driver.getTitle());
		System.out.println("current active window id - " + driver.getWindowHandle());
		System.out.println("total window's open - " + driver.getWindowHandles());
		
		
		System.out.println("\n\n------------------closing the entire browser----------------------------");
		driver.quit();
//		System.out.println("page title = " + driver.getTitle());
//		System.out.println("current active window id - " + driver.getWindowHandle());
//		System.out.println("total window's open - " + driver.getWindowHandles());
				
	}

	public static void main(String[] args) {
		WindowManangement obj = new WindowManangement();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.winMgtDemo();

	}

}
