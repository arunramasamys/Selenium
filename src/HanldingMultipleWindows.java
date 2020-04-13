import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HanldingMultipleWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println("BeforeSwitching");
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parendwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		System.out.println("AfterSwitching");
				System.out.println(driver.getTitle());
			
		driver.switchTo().window(parendwindow);
		System.out.println("SwitchingBackToParent");
		System.out.println(driver.getTitle());
	}

}