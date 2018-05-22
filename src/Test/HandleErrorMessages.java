package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleErrorMessages {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("signin")).click();
		String ErrorMessage = driver.findElement(By.id("username-error")).getText();
		System.out.println(ErrorMessage);
    }
}