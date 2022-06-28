package basic;

public class Test extends Base{
	
	public void printPageTitle() {
		System.out.println(driver.getTitle());
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.printPageTitle();

	}

}
