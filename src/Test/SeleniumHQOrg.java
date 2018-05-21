package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHQOrg {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div/div/div[2]/div/form/fieldset/div[32]/div/select/option[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div/div/div[2]/div/form/fieldset/div[32]/div/select/option[5]")).click();
		//driver.findElement(By.xpath("//option[text()='Navigation Commands']"));
		
		
		//driver.findElement(By.id("menu_download")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/a")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table[1]/tbody/tr[1]/td[4]/a")).click();
		//driver.close();
	}
}
