package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFrame {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	//Switch to third frame
	driver.switchTo().frame(2); // by index
	//driver.switchTo().frame("classFrame"); //by name
	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	Thread.sleep(3000);
	//Switch to top window from the third frame
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	//Switch to third frame
	driver.switchTo().frame(0);
	driver.findElement(By.linkText("org.openqa.selenium")).click();
    }
}