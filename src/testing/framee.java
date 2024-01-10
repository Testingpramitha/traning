package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framee {
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.switchTo().frame(3);
	Thread.sleep(3000);
	driver.findElement(By.id("firstName")).sendKeys("pramitha");
}
}
