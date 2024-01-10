package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		WebElement ele= driver.findElement(By.id("country-list"));
		//ele.click();
		Select s=new Select(ele);
		s.selectByVisibleText("India");
		//handling drop down by using for loop
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.findElement(By.xpath("//span[@class=\"bwc__sc-1nbn7v6-10 cntvL ellipsis\"]")).click();
        List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]/li"));
        for (WebElement cityname : list) {
        	String s1="Bengaluru";
        	if(cityname.getText().contains(s1))
        	{
        		cityname.click();
        		break;
        	}
        				
		}
		
	}

}
