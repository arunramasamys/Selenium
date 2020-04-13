import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//To get the number of checkboxes
		Thread.sleep(5000);
		//To select a checkbox
		driver.findElement(By.cssSelector("input[id*='Student']")).click();
//To print the number of check boxes
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	//To assert the number of checkboxes
	 Assert.assertEquals((driver.findElements(By.cssSelector("input[type='checkbox']")).size()), 6);
	 //TO click the passenger
	 driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
	// Selection of Adults
	    WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
	    Select adultsdrp = new Select(Adults);
	    adultsdrp.selectByValue("2");
	    // Selection of Childs
	    Thread.sleep(2000L);
	  	   WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
	    Select childsdrp = new Select(childs);
	    childsdrp.selectByValue("4");
	    driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();
	    System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());
//Selection of Currency
	    WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
	    Select s = new Select(currency);
	    s.selectByVisibleText("USD");
	    //Print and validate all pax info
	    System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());
	    Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText(),"2 Adult");
	}	
}
