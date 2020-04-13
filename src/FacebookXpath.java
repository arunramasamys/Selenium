import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Driver Object for chrome browser
		//WEbdriver is a interface - it gives all methods to automate
		//Class name = ChromeDriver
	    //X driver = new X();
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//TO land the required webpage
		driver.get("https://www.google.com");
		driver.get("http://facebook.com");
		//XPAth syntax tagName[@attribute='value']
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("This is my first code");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//Css syntax tagname[attribute='value'] or 
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("This is my first code");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("This is my first code");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123456");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		//To close current browser
         //driver.findElement(By.cssSelector("#email")).sendKeys("This is a trial");
         //driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
         //driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
         
		//driver.close();		
	}

}
