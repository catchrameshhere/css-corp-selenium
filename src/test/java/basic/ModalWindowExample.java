package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalWindowExample extends Base{
	
	public void modalWindowDemo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginLink =  wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Sign In")));
		
		
		//login button click
		loginLink.click();
		
		//email
		WebElement email = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("luser"))));
		email.sendKeys("dan@gmail.com");
		
	}

	public static void main(String[] args) {
		ModalWindowExample obj = new ModalWindowExample();
		obj.setupBrowser("chrome", "https://www.geeksforgeeks.org/java/");
		obj.modalWindowDemo();

	}

}
