package basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {
	
	String hubUrl = "http://172.24.112.1:4444";
	String applnUrl = "https://www.facebook.com";
	String browser = "safari";
	
	WebDriver driver;
	
	
	public void setupGrip() {
		//add capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(browser);
		
		//invoking remote browser
		try {
			driver = new RemoteWebDriver(new URL(hubUrl), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		//url
		driver.get(applnUrl);		
	}
	
	public void titleValidation() {
		System.out.println(driver.getTitle());
	}
	

	public static void main(String[] args) {
		GridExample obj = new GridExample();
		obj.setupGrip();
		obj.titleValidation();
	}

}
