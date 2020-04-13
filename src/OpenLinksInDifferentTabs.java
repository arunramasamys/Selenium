import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class OpenLinksInDifferentTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
				driver.get("http://qaclickacademy.com/practice.php");
				Thread.sleep(2000);
				System.out.println(driver.findElements(By.tagName("a")).size());
				//Limiting WebdriverScope to footer section
				WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
				System.out.println(footerdriver.findElements(By.tagName("a")).size());
				//Limiting WebdriverScope to 1st column in footer section
				WebElement Column1Footer=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				System.out.println(Column1Footer.findElements(By.tagName("a")).size());
				//Click on each link from 1st column and check the pages are opened in different tabs
				for(int i=0;i<Column1Footer.findElements(By.tagName("a")).size();i++)
				{
					String ClickOnLinkTabs = Keys.chord(Keys.CONTROL,Keys.ENTER);
					Column1Footer.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTabs);
					//Move to different tabs and get title
					Thread.sleep(5000);	
					
				}
				Set<String> abc = driver.getWindowHandles();
				Iterator<String> it = abc.iterator();
				while(it.hasNext())
					{
					Thread.sleep(500);
						driver.switchTo().window(it.next());
						System.out.println(driver.getTitle());
					}
					
					
				}
		}	

