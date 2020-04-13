import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RahulShettyAcademySitePractise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Sulochana\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				Thread.sleep(5000L);
				//driver.findElement(By.xpath("//legend[contains(text(),'Checkbox Example')]"));
		//To select a checkbox
				driver.findElement(By.id("checkBoxOption1")).click();
				Thread.sleep(2000L);
System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
				Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
				driver.findElement(By.id("checkBoxOption1")).click();
				Thread.sleep(2000L);
				System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
				Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
				System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	 String text= "check";
	 driver.findElement(By.id("name")).sendKeys(text);
	 driver.findElement(By.cssSelector("[id='alertbtn']")).click();
	 System.out.println(driver.switchTo().alert().getText());
	 driver.switchTo().alert().accept();
	 driver.findElement(By.id("confirmbtn")).click();
	 System.out.println(driver.switchTo().alert().getText());
			 driver.switchTo().alert().dismiss();
		
	}	
}
