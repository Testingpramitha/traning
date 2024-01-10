package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownforloop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.findElement(By.xpath("//span[@class=\"bwc__sc-1nbn7v6-10 cntvL ellipsis\"]")).click();
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]/li"));
        for (WebElement cityname : list) {
         	String s1="Bengaluru";
        	if(cityname.getText().equals(s1))
        	{
        		cityname.click();
        		break;
        	}
        				
		}

	}

}
