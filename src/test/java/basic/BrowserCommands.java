package basic;

public class BrowserCommands extends Base{
	
	public void browserCommandsDemo() {
		//get
//		driver.get("https://www.youtube.com");
		
		//get title
//		String title = driver.getTitle();
//		System.out.println("page title - " + title);
		
		//get url
//		String url = driver.getCurrentUrl();
//		System.out.println("url = " + url);
		
		
		//Thread.sleep is used for demonstration purpose only
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//closing tab
//		driver.close();
		
		//close the browser
		driver.quit();
		
	}

	public static void main(String[] args) {
		BrowserCommands obj = new BrowserCommands();
		obj.setupBrowser("chrome", "https://www.fb.com");
		obj.browserCommandsDemo();
	}

}
