package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionkeyss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@name=\"text1\"]")).sendKeys("pramitha");
		Actions act=new Actions(driver);
		//CTRL+A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//button[@id=\"compareButton\"]")).click();
		Thread.sleep(3000);
	    String s=driver.findElement(By.xpath("//span[text()=\"The two texts are identical!\"]")).getText();
         System.out.println(s);
	}

}
