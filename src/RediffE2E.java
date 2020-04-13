import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffE2E {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.get("http://rediff.com");
		//Regular Expresssion
         driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
         driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
         driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
         driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
         //driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
         
		//driver.close();		
	}

}
