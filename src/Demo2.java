import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Driver Object for chrome browser
		//WEbdriver is a interface - it gives all methods to automate
		//Class name = ChromeDriver
	    //X driver = new X();
		System.setProperty("webdriver.gecko.driver","C:\\Sulochana\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
