package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
	
	WebDriver driver;
	
		public void setupBrowser(String browser, String url) {
		String currDir = System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir + "\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", currDir + "\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		
		else {
			System.out.println("valid browser was not provided, hence quitting the automation");
			System.exit(0);
		}
		 
		//implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//page load timeout ==> pom
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		//script load timeout
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1));
		
		//maximize the window
//		driver.manage().window().maximize();
		
		//open url
		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
	}
}
