package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Udemy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.udemy.com/");
		  driver.findElement(By.cssSelector("a[class='btn btn-quaternary']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("id_email")).sendKeys("anuyad@iquadra.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("whoami123");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='submit']")).click();
		  driver.close();
		}
}
