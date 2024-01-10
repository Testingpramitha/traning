package testing;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\traning\\Servers\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions)
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String req_month="May";
		String req_year="2020";
		int Req_year=Integer.parseInt(req_year);
		String req_date="19";
		String cur_month=driver.findElement(By.className("ui-datepicker-month")).getText();
		//String cur_year= driver.findElement(By.className("ui-datepicker-year")).getText();
		//int Curr_year=Integer.parseInt(cur_year);
		while(true)
		{
		 cur_month=driver.findElement(By.className("ui-datepicker-month")).getText();
		 String cur_year= driver.findElement(By.className("ui-datepicker-year")).getText();
		 int Curr_year=Integer.parseInt(cur_year);
			     if(Req_year>Curr_year)
	     {
		if((req_month.equalsIgnoreCase(cur_month)&&(req_year.equalsIgnoreCase(cur_year))))
				{
			     break;
				}
		  driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		
		}
	     else {
	    	 if((req_month.equalsIgnoreCase(cur_month)&&(req_year.equalsIgnoreCase(cur_year))))
				{
			     break;
				}
	    	 driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
		}
		}
		  List<WebElement> ele=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		  for (WebElement date : ele) {
			  if(date.getText().equalsIgnoreCase(req_date))
			  {
				  date.click();
				  break;
			  }
			  
			
	
	
		  }
	}
}
		  
	        



