import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Driver Object for chrome browser
		//WEbdriver is a interface - it gives all methods to automate
		//Class name = ChromeDriver
	    //X driver = new X();
		System.setProperty("webdriver.chrome.driver","C:\\Sulochana\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//TO land the required webpage
		driver.get("http://jqueryui.com/droppable/");
		//driver.switchTo().frame(1);(Frame index can be given)
		//to get number of frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//tagname.classname-css selector1
		//tagname[class='value'] - css selector2
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		//For an action clause you need to build and perform
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
	}

}
