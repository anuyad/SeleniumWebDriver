package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiLinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("wikipedia.org")) {
			System.out.println("This is an internal link");
		}	
		else {
			System.out.println("This is an external link");
		}
		driver.navigate().back();
		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		url = driver.getCurrentUrl();
		
		if (!url.contains("wikipedia.org")) {
			System.out.println("This is an external link");
		}
		else {
			System.out.println("This is an internal link");
		}
		driver.close();
	}
}

