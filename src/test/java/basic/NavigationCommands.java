package basic;

import org.openqa.selenium.By;

public class NavigationCommands extends Base{
	
	public void navDemo() throws InterruptedException {
		
		//Thread.sleep is used only for demo purpose
			
		System.out.println("page title = " + driver.getTitle());
		//to
		System.out.println("******Navigating to youtube page******");
		Thread.sleep(5000);
		driver.navigate().to("https://www.youtube.com");
		System.out.println("page title = " + driver.getTitle());
		
		//back
		System.out.println("******Navigating back to google page******");
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("page title = " + driver.getTitle());
		
		//forward
		System.out.println("******Navigating forward to youtube page******");
		Thread.sleep(5000);
		driver.navigate().forward();
		System.out.println("page title = " + driver.getTitle());
		
		//refresh
		System.out.println("******Refreshing youtube page******");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
	}


	public static void main(String[] args) {
		NavigationCommands obj = new NavigationCommands();
		obj.setupBrowser("chrome", "https://www.facebook.com");

		obj.demo();
//		
//		try {
//			obj.navDemo();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
