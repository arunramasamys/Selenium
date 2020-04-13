import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//*curreny select
		//WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	   // System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
	    //Select s = new Select(currency);
	    //s.selectByVisibleText("USD");
	    	// s.selectByValue("INR");
	 	// s.selectByIndex(2); 
		Thread.sleep(5000);
	     driver.findElement(By.id("divpaxinfo")).click();
	 	 WebElement pax= driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	 	 Select s = new Select(pax);
	 	 s.selectByValue("5");
	 	 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	 
	 	 
	}	
}
