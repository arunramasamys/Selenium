import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("This is my first code");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
		//driver.get("http://facebook.com");
		//To go back to google homepage
		//driver.navigate().back();
				//TO close all browsers opened by selenium(mainly child windows)
		//driver.quit();
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//To close current browser
		
		//driver.close();		
	}

}
