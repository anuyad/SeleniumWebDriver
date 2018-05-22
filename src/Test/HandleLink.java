package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleLink {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
//		driver.findElement(By.className("gb_P")).click();
//		driver.findElement(By.linkText("Gmail")).click();
//		driver.findElement(By.partialLinkText("mail")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).click();
		WebElement Gmail_Link=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[1]/a"));
		Boolean LinkStatus = Gmail_Link.isDisplayed(); 
		System.out.println(LinkStatus);
		
		LinkStatus = Gmail_Link.isEnabled();
		System.out.println(LinkStatus);
		
		String LinkName = Gmail_Link.getText();
		System.out.println(LinkName);
		Gmail_Link.click();
}
}