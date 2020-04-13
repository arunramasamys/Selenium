import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		//Child parent traverse
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(" //input[@name='q']")).sendKeys("Udemy certificate");
       // WebElement element = driver.findElement(By.name("q"));
        //element.sendKeys("Cheese!");
        //element.submit();
		//TO land the required webpage
		//driver.findElement(By.xpath("//*[@title='search']")).sendKeys("This is my first code");
		//driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//To close current browser
         //driver.findElement(By.cssSelector("#email")).sendKeys("This is a trial");
         //driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
         //driver.findElement(By.xpath("//*[@id=\'login_form\']/table/body/tr[3]/td[2]/div/a")).click();
         
		//driver.close();		
	}

}
