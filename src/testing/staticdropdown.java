package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class staticdropdown {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//select[@class=\"col-lg-3\"]"));
		Select s= new Select(ele);
		Thread.sleep(3000);
		s.selectByIndex(3);
	}

}
