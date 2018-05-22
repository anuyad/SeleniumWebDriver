package Test;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleCheckbox {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.carmax.com/search#BT=0&Distance=250&ExposedCategories=249+250+1001+1000+265+999+772&ExposedDimensions=249+250+1001+1000+265+999+772&Page=1&PerPage=20&SortKey=0&Zip=04106");
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/section/div/div/div/div/div[4]/div[1]/div/label")).isDisplayed());
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/section/div/div/div/div/div[4]/div[1]/div/label")).isEnabled());
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/section/div/div/div/div/div[4]/div[1]/div/label")).isSelected());
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/section/div/div/div/div/div[4]/div[1]/div/label")).click();
//	WebElement Checkbox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/section/div/div/div/div/div[4]/div[1]/div/label"));
//	boolean isClick = Checkbox.isSelected();
//	System.out.println(isClick);
	Thread.sleep(5000);
	//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/section/div/div/div/div/div[4]/div[1]/div/label")).isSelected());
	System.out.println(driver.findElement(By.xpath("//*[@name='Honda']")).isSelected());
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/section/div/div/div/div/div[4]/div[1]/div/label")).click();
	System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/section/div/div/div/div/div[4]/div[1]/div/label")).isSelected());	
    }
}