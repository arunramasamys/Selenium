import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonExample {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//TO land the required webpage
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement move =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
		//move to specific element
		a.moveToElement(move).contextClick().build().perform();
	}

}
