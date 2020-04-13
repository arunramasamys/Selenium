import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Driver Object for chrome browser
		//WEbdriver is a interface - it gives all methods to automate
		//Class name = ChromeDriver
	    //X driver = new X();
		System.setProperty("webdriver.ie.driver","C:\\Sulochana\\Selenium\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
