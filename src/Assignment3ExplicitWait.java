import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;

public class Assignment3ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// close web notifications and open web page
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		// Land on the URL
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		// Maximize window
		driver.manage().window().maximize();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		// close cookies
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
	}
}
