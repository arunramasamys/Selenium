import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4HandlingMultipleWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement MultipleWindow = (By.xpath("//a[contains(text(),'Multiple Windows')]"));
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Click Here")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parendwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		System.out.println("childwindowtext");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		//System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(parendwindow);
		System.out.println("parentwindowtext");
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
	}

}