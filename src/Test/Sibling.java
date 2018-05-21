package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.qaclickacademy.com/");
	    driver.findElement(By.linkText("Interview Guide")).click();
	  // Syntax to traverse between the siblings- Xpath/following-siblings::tagName[sibling number]
	  driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li")).click();
	  driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li[1]")).click();
	  driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li[2]")).click();
	  driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li[3]")).click();
}
}