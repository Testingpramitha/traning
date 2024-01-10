package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele=driver.findElement(By.id("KeeploggedIncheckBox"));
		ele.click();
		//validation of attribute
		if(ele.isEnabled())
		{
			System.out.println("attribure in ebabled");
		}
		else
		{
			System.out.println("attribute is disabled");
		}
		//validation of checkbox
		if(ele.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
		//validation of message displayed
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//div[text()='login']")).click();
		Thread.sleep(3000);
		 WebElement errmssg= driver.findElement(By.className("errmsg"));
		 if(errmssg.isDisplayed())
		 {
			 System.out.println("errmssg is displaying");
		 }
		 else
		 {
			 System.out.println("errmssg is not displaying");
		 }
	}

}
