package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get(" https://www.google.com/");
    String pageTitle = driver.getTitle();
    if (pageTitle.equals("Google")) {
    	System.out.println("Google Applicaiton launched...Passed");
    }
    else {
    	System.out.println("Google Application not launched...Failed");
    }	
    driver.close();
  }
}
