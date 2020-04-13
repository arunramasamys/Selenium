import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

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
		//TO validate whether Title is correct
		//System.out.println(driver.getTitle());
		//Validate by grabbing the URL whether we are landed on correct URL
		//System.out.println(driver.getCurrentUrl());
		//TO print page source-
		//System.out.println(driver.getPageSource());
		//To hit another website from google and to return back
		driver.get("http://facebook.com");
		//To go back to google homepage
		//driver.navigate().back();
				//TO close all browsers opened by selenium(mainly child windows)
		//driver.quit();
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//To close current browser
         driver.findElement(By.cssSelector("#email")).sendKeys("This is a trial");
         driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
         //driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
         
		//driver.close();		
	}

}
