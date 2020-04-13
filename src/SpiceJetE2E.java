import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;

public class SpiceJetE2E {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Land on the URL
		driver.get("https://www.spicejet.com/");
				Thread.sleep(7000);
				//TO check if return date is enabled
			 	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				//Select radio button round trip
			 	//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
			 	//TO check if return date is enabled
			 	//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			 	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

			 	{

			 	     System.out.println("Oneway enabled");

			 	     Assert.assertTrue(true);

			 	}

			 	else

			 	{

			 	     Assert.assertTrue(false);

			 	}
	     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	 	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	 	Thread.sleep(2000);
	 	//method1
	 	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	 	//method2 -parent child relationship
	 	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	 	System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
	 	System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
	 	//Select current date
	 	driver.findElement(By.cssSelector(".ui-state-active")).click();
	 	//Select pax
	 	  driver.findElement(By.id("divpaxinfo")).click();
		 	 WebElement pax= driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		 	 Select s = new Select(pax);
		 	 s.selectByValue("5");
		 	 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 	//*curreny select
				WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			   System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
			    Select a = new Select(currency);
			    a.selectByVisibleText("USD");
			    System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
				//click search icon
			    driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_btn_FindFlights\']")).click();
			 				    
	 	//TO check if return date is enabled
	 	//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Todate']"))	.isEnabled());	
	 	//Select radio button round trip
	 	//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	 	//TO check if return date is enabled
	 	//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Todate']")).isEnabled());	
	 	
		 
	}	
}
