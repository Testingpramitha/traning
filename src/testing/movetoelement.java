package testing;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class movetoelement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	    WebElement ele=	driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
	    Actions act=new Actions(driver);
	   // act.moveToElement(ele).perform();
	    //act.doubleClick(ele).perform();
	    act.moveToElement(ele).contextClick().perform();
	}

}
