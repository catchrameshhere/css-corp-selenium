package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollExample extends Base{
	
	public void youtubeExample() {
		setupBrowser("chrome", "https://www.youtube.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
	}
	
	public void githubExample() {
		setupBrowser("chrome", "https://github.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public void amazonExample() {
		
		String url = "https://www.amazon.in/Samsung-Galaxy-M12-Storage-Processor/dp/B08XJCMGL7/ref=sr_1_5?"
				+ "crid=281IGW9NX5WLC&keywords=samsung&qid=1656503284&sprefix=samsung%2Caps%2C256&sr=8-5&th=1";
		
		setupBrowser("chrome", url);
		
		WebElement techDetails = driver.findElement(By.xpath("//h1[text()='Technical Details']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", techDetails);

	}

	public static void main(String[] args) {
		ScrollExample obj = new ScrollExample();
//		obj.youtubeExample();
//		obj.githubExample();
		obj.amazonExample();

	}

}
