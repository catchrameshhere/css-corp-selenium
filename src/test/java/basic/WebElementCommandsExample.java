package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommandsExample extends Base{

	public void fetchOperatoion() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement instaLink = driver.findElement(By.partialLinkText("Instagram"));
		WebElement welMsg = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		driver.findelement(by.id("email")])



		//get attr
		//		System.out.println(email.getAttribute("name"));
		//		System.out.println("tool tip of insta link - " + instaLink.getAttribute("title"));

		//get text
		//		System.out.println("welcome message = " + welMsg.getText());
		//		System.out.println("button textg = " + loginBtn.getText());

		//get css
		//		System.out.println("login button text size = " + loginBtn.getCssValue("font-size"));

		//get location
		//		System.out.println("Point = " + loginBtn.getLocation());
		//		System.out.println("Point x = " + loginBtn.getLocation().x);
		//		System.out.println("Point y = " + loginBtn.getLocation().getY());

		//get size
		//		System.out.println("Dimension = " + loginBtn.getSize());
		//		System.out.println("Dimension height= " + loginBtn.getSize().height);
		//		System.out.println("Dimension width= " + loginBtn.getSize().width);


		//get tagname
		System.out.println(email.getTagName());
	}


	public void actionsDemo() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgot"));
		WebElement loginForm = driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));

		//send keys
//		email.sendKeys("dan@gmail.com");
		
		//clear
//		email.clear();
//		email.sendKeys("john@gmail.com");
		
		//click
//		loginBtn.click();
//		forgotPassword.click();
		
		//submit
//		loginBtn.submit();
		loginForm.click();
		
	}
	
	public void stateExample() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement hiddenElem = driver.findElement(By.name("jazoest"));
		
		//is displayed
//		System.out.println("is the email element displayed = " + email.isDisplayed());
//		System.out.println("is the hidden element displayed = " + hiddenElem.isDisplayed());
		
		//is enabled
//		System.out.println("is the email element editable or enabled = " + email.isEnabled());
		
		//is selected
		driver.findElement(By.partialLinkText("Sign Up")).click();
		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[contains(@id,'u_0_3')]"));
		
		System.out.println("Before clicking on the male radio btn, is it selected - " + maleRadioBtn.isSelected());
		System.out.println("**********clicking on the radio btn*********");
		maleRadioBtn.click();
		System.out.println("After clicking on the male radio btn, is it selected - " + maleRadioBtn.isSelected());
	}

	public static void main(String[] args) {
		WebElementCommandsExample obj =  new WebElementCommandsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
//		obj.fetchOperatoion();
//		obj.actionsDemo();
		obj.stateExample();
	}

}



















