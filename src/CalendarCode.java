//trial examples
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CalendarCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//TO land the required webpage
		driver.get("https://www.path2usa.com/travel-companions");
		//Select date
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		
		List <WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
			
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
			}
			
		}
		
	}
			
				
	}


