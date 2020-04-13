import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCartExample {

	public static void main(String[] args) throws InterruptedException {

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };

		System.setProperty("webdriver.gecko.driver", "C:\\Sulochana\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		WebDriverWait w = new WebDriverWait(driver,5);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
				driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
				driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	//explicit wait until specific element appears
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemNeededList = Arrays.asList(itemsNeeded);

			if (itemNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}

}