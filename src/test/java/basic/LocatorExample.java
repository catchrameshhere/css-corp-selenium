package basic;

import org.openqa.selenium.By;

public class LocatorExample extends Base{
	
	public void locatorDemo() {
		//id
//		driver.findElement(By.id("email")).sendKeys("dan@gmail.com");
		
		//name
//		driver.findElement(By.name("email")).sendKeys("from name attr");
		
		//class
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("from class attr");//error
//		driver.findElement(By.className("inputtext")).sendKeys("from class attr-1");
//		driver.findElement(By.className("_55r1")).sendKeys("from class attr-2");
//		driver.findElement(By.className("_6luy")).sendKeys("from class attr-3");
		
		//tagname
//		driver.findElement(By.tagName("button")).click();
		
		//link text ==> tagname ==> "a"
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partial link
//		driver.findElement(By.partialLinkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.partialLinkText("For")).click();
//		driver.findElement(By.partialLinkText("ord?")).click();
//		driver.findElement(By.partialLinkText("got")).click();
//		driver.findElement(By.partialLinkText("swor")).click();
//		driver.findElement(By.partialLinkText("en pas")).click();
//		driver.findElement(By.partialLinkText("?")).click();
//		driver.findElement(By.partialLinkText("F")).click();
		
		//xpath
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from xpath");
		
		//absolute path
//		String path = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input";
//		driver.findElement(By.xpath(path)).sendKeys("from abs path");
//		
		
		//relative path
//		String path = "//form/div[1]/div[1]/input";
//		driver.findElement(By.xpath(path)).sendKeys("from relative path");
		
		$x("//input[@id='email']")
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test");
		
		//tagname
		$x("//button")
		
		//attribute
		$x("//input[@id='email']")
		$x("//input[@name='email']")
		$x("//input[@class='inputtext _55r1 _6luy']")
		$x("//input[@type='text']")
		$x("//input[@placeholder='Email address or phone number']")
		$x("//input[@aria-label='Email address or phone number']")
		$x("//input[@autofocus='1']")
		$x("//input[@data-testid='royal_email']")
		
		//functions
		//starts-with
		$x("//input[starts-with(@id,'email')]")
		$x("//input[starts-with(@id,'emai')]")
		$x("//input[starts-with(@id,'ema')]")
		$x("//input[starts-with(@id,'em')]")
		$x("//input[starts-with(@id,'e')]")
		
		//contains
		$x("//input[contains(@id,'email')]")
		$x("//input[contains(@id,'emai')]")
		$x("//input[contains(@id,'ema')]")
		$x("//input[contains(@id,'em')]")
		$x("//input[contains(@id,'e')]")
		
		$x("//input[contains(@id,'mail')]")
		$x("//input[contains(@id,'ail')]")
		$x("//input[contains(@id,'il')]")
		$x("//input[contains(@id,'l')]")
		
		$x("//input[contains(@id,'mai')]")
		$x("//input[contains(@id,'ai')]")
		$x("//input[contains(@id,'ma')]")
		$x("//input[contains(@id,'i')]")
		$x("//input[contains(@id,'m')]")
		
		//text()
		$x("//h2[text()='Facebook helps you connect and share with the people in your life.']")
		$x("//button[text()='Log In']")
		$x("//a[text()='Forgotten password?']")
		
		//starts-with + text()
		$x("//a[starts-with(text(),'Forgotten password?')]")
		$x("//a[starts-with(text(),'Forgotte')]")
		$x("//a[starts-with(text(),'Forgotten')]")
		$x("//a[starts-with(text(),'F')]")
		$x("//a[starts-with(text(),'Forgotten pa')]")
		$x("//a[starts-with(text(),'For')]")
		
		
		//contains + test()
		$x("//a[contains(text(),'Forgotten password?')]")
		$x("//a[contains(text(),'Forgotten pa')]")
		$x("//a[contains(text(),'For')]")
		$x("//a[contains(text(),'password?')]")
		$x("//a[contains(text(),'ord?')]")
		$x("//a[contains(text(),'tten pass')]")
		$x("//a[contains(text(),'?')]")
		
		//Advanced xpath
		//and
		$x("//input[@id='email' and @name='email']")
		$x("//input[@id='email' and @name='email' and @data-testid='royal_email']")
		
		//or
		$x("//input[@id='email' or @name='email']")
		$x("//button[text()='Log In' or text()='लॉग इन करें']")
		$x("//input[@id='email' or @name='email' or @data-testid='royal_email']")
		
		//or + and
		$x("//input[@id='email' or @name='email' and @data-testid='royal_email']")
		$x("//input[@id='email' and @name='email' or @data-testid='royal_email']")
		
		//index
		//if elements are part of the result
		$x("//input")[3]
				
		//if the elements are siblings
		$x("//select[2]")//month
		$x("//select[3]")//year
		
		//chained
		$x("//span/select[1]")
		$x("//form//select[1]")
		$x("//form//select[@id='day']")
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//css
//		driver.findElement(By.cssSelector("#email")).sendKeys("from css");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		LocatorExample obj = new LocatorExample();
		obj.setupBrowser("chrome", "https://www.facebook.com/login");
		obj.locatorDemo();
	}

}
