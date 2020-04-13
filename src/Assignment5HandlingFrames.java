import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5HandlingFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement MultipleWindow = (By.xpath("//a[contains(text(),'Multiple Windows')]"));
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		System.out.println(driver.findElements(By.tagName("frame")).size());

		driver.switchTo().frame("frame-top");//.frame(string)

		driver.switchTo().frame("frame-middle");//.frame(string)

		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText());

		driver.switchTo().defaultContent();

		driver.navigate().back();

		System.out.println(driver.getTitle());

		}

		
	}

