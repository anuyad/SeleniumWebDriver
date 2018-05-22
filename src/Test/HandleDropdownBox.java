package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownBox {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
		Select dropDown = new Select (driver.findElement(By.name("country")));
		//dropDown.selectByIndex(223); // select an item by index
		//dropDown.selectByVisibleText("Australia");
		List<WebElement> e = dropDown.getOptions();
		int itemsCount = e.size();
		System.out.println(itemsCount);
    }
}