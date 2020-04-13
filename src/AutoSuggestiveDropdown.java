import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
				Thread.sleep(7000);
				driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	     //driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity inactiveWidget')]//label")).click();
	     WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
	     Thread.sleep(1000);
	     source.click();
	     source.sendKeys("Ahm");
	     Thread.sleep(1000);
	     source.sendKeys(Keys.ARROW_DOWN);
	     source.sendKeys(Keys.ENTER);
	    // System.out.println(driver.findElement(By.xpath("//input[@placeholder='From']")).getText());
	     source = driver.findElement(By.xpath("//input[@placeholder='To']"));
	     Thread.sleep(1000);
	     source.click();
	     Thread.sleep(1000);
	     source.sendKeys("DEL");
	     for(int i=1;i<5;i++)
	     {
	     source.sendKeys(Keys.ARROW_DOWN);
	     }
	     source.sendKeys(Keys.ENTER);
	     //System.out.println(driver.findElement(By.xpath("//input[@placeholder='From']")).getText());
	    // System.out.println(driver.findElement(By.xpath("//input[@placeholder='To']")).getText());
	}	
}
