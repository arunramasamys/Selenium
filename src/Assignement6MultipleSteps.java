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

public class Assignement6MultipleSteps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
				driver.get("http://qaclickacademy.com/practice.php");
				Thread.sleep(2000);
				driver.findElement(By.id("checkBoxOption1")).click();
				////verify checkbox is selected
				Thread.sleep(2000);
				String s =driver.findElement(By.id("checkBoxOption1")).getAttribute("value");
				Thread.sleep(2000);
		        System.out.println(s);
		         Select P = new Select(driver.findElement(By.id("dropdown-class-example")));
			 	 P.selectByVisibleText(s);
			 	 
		        
		        
		        
		        //driver.findElement(By.id("name")).sendKeys(s);
		       // driver.findElement(By.id("alertbtn")).click();
		        //System.out.println(driver.switchTo().alert().getText());
		       // driver.switchTo().alert().accept();
				//Step 2 ===== grab the label of selected checkbox
			//WebElement Label = driver.findElement(By.xpath("//*[text()='Option1']"));
				//System.out.println(Label.getText());
				//Step 3 ===== select option from dropdown. here option should select come from step 2
				//driver.findElement(By.id("dropdown-class-example"));
				//Label.click();
				//Step 4 Enter text in Edit box
				
				}
		}	

