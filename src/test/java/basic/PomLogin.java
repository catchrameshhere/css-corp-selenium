package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin {
	
	/*
	 * @FindBy
	 * initElements
	 * @CacheLookUp
	 */
	
	@CacheLookup
	@FindBy(id = "email")
	WebElement email;
	
	
	@CacheLookup
	@FindBy(id = "pass")
	WebElement pass;
	
	@CacheLookup
	@FindBy(tagName = "button")
	WebElement loginBtn;
	
	private WebDriver driver;
	
	public PomLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginWithCredentials(String username, String password) {

		
		//WebElement email = driver.findElement(By.id("email"));
		
		email.clear();
		email.sendKeys(username);

		pass.clear();
		pass.sendKeys(password);
		
//		loginBtn.click();
	}

}
