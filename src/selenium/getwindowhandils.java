package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandils {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()=\"✕\"]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()=\"APPLE iPhone 13 (Blue, 128 GB)\"]")).click();
		//driver.findElement(By.xpath("//div[text()=\"APPLE iPhone 13 (Midnight, 128 GB)\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"APPLE iPhone 13 (Pink, 128 GB)\"]")).click();
		String pagetitle="iPhone 13-Advanced Dual‐Camera system,A15 Bionic Chip & more";
	    Set<String> windowid=driver.getWindowHandles();
	    for (String id: windowid) {
	    String title=driver.switchTo().window(id).getTitle();
	    if(pagetitle.equals(title))
	    {
	    String name_phone=driver.findElement(By.xpath("//span[text()=\"APPLE iPhone 13 (Pink, 128 GB)\"]")).getText();
	    System.out.println(name_phone);
	    }
			
		}
	    
		}
	    
	}


