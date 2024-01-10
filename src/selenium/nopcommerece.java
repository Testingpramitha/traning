package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerece {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/registerresult/1");
		driver.findElement(By.xpath("//a[text()=\"Gift Cards \"] ")).click();
		driver.findElement(By.xpath("//button[text()=\"Add to cart\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"giftcard_43_RecipientName\"]")).sendKeys("pramitha",Keys.TAB,"pramitha1905@gmail.com",Keys.TAB,"pp",Keys.TAB,"pramitha1800@gmail.com",Keys.TAB,"xxxx",Keys.TAB,"2",Keys.TAB,Keys.ENTER);
	}

}
