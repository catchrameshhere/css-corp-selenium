package basic;

public class PomDemo extends Base{
	
	public void loginTestCase() {
		String username = "dan@gmail.com";
		String password = "test1234";
		
		//pom call
		PomLogin login = new PomLogin(driver);
		login.loginWithCredentials(username, password);
	}

	public static void main(String[] args) {
		PomDemo obj = new PomDemo();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.loginTestCase();
	}

}
