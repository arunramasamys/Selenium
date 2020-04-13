import java.time.Duration;
import java.util.function.*;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;


public class FluentWaitTest {

	public static void main(String[] args) throws InterruptedException {
		// close web notifications and open web page
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
			// Maximize window
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	
		WebElement foo = wait.until(new Function<WebDriver,WebElement> ()
		{
			public WebElement apply(WebDriver driver) {
			if( driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			{
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
			}
			else
			{
				return null;
			}
			}
		});
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).getText());
}

}
