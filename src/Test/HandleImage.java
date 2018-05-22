package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleImage {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
		System.out.println(driver.findElement(By.id("hplogo")).getAttribute("alt"));
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		
		driver.navigate().to("https://www.seleniumhq.org/");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[2]/center/a/img")).click();
	}		
}