import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;

public class Assignment2ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// close web notifications and open web page
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		// Land on the URL
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Delete cookies
		driver.manage().deleteAllCookies();
		// Maximize window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		// close cookies
		
		// select adult count
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement adult = driver.findElement(By.id("Adults"));
		Actions actions = new Actions(driver);
		actions.moveToElement(adult).click().perform();
		Select s = new Select(adult);
		s.selectByValue("5");
		// select child count
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement child = driver.findElement(By.id("Childrens"));
		Actions action1 = new Actions(driver);
		actions.moveToElement(child).click().perform();
		Select a = new Select(child);
		a.selectByValue("2");
		//Click more options
		
		//select current date
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement FromDate=driver.findElement(By.xpath("//input[@id='DepartDate']"));
		FromDate.sendKeys("05/05/2020");
		//driver.findElement(By.cssSelector(".ui-state-active")).click();
		//Select origin&destination
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Origin=driver.findElement(By.id("FromTag"));
		Origin.sendKeys("BLR");
		Thread.sleep(500);
		Origin.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Destination=driver.findElement(By.id("ToTag"));
		Destination.sendKeys("MAA");
		Thread.sleep(500);
		Destination.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		 	//MoreOptionslink
		 	 driver.findElement(By.id("MoreOptionsLink")).click();
		 	Thread.sleep(2000);
			//Carrier
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	WebElement Carrier=driver.findElement(By.id("carrier"));
			Actions action2 = new Actions(driver);
			actions.moveToElement(Carrier).click().perform();
			Carrier.sendKeys("Spicejet");
			Thread.sleep(500);
			Origin.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.id("SearchBtn")).click();

	}
}
