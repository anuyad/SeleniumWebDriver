package Test;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	 public static void main(String[] args) {
     String projectpath=System.getProperty("user.dir");
	 System.out.println(projectpath);
	 String driverpath=projectpath + "//driver//chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", driverpath);
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.thoughtworks.com/"); 
     }
}