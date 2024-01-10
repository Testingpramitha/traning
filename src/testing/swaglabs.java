package testing;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class swaglabs {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.TAB.ENTER);
		 WebElement ele= driver.findElement(By.className("product_sort_container"));
		 Select s=new Select(ele);
		 s.selectByValue("az");
		 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		 s.selectByValue("za");
		 driver.findElement(By.xpath("//button[text()=\"Add to cart\"]")).click();
		// s.selectByValue("lohi");
		 //driver.findElement(By.xpath("//button[text()=\"Add to cart\"]")).click();
		 //s.selectByValue("hilo");
		 //driver.findElement(By.xpath("//button[text()=\"Add to cart\"]")).click();
		 driver.findElement(By.id("shopping_cart_container")).click();
		 driver.findElement(By.id("checkout")).click();
		 driver.findElement(By.id("first-name")).sendKeys("gadige",Keys.TAB,"pramitha",Keys.TAB,"500077",Keys.TAB,Keys.TAB,Keys.ENTER);
		  List<WebElement>e= driver.findElements(By.xpath("//div[@class=\"inventory_item_name\"]"));
		  for (WebElement product: e) {
			 String name= product.getText();
			 System.out.println(name);
			
		}
		 List<WebElement> prices= driver.findElements(By.xpath("//div[@class=\"summary_info_label\"]"));
		 for (WebElement price : prices) {
		String cost=price.getText();
		System.out.println(cost);
			
		}
	     String pp=	driver.findElement(By.xpath("//div[@class=\"summary_info_label summary_total_label\"]")).getText();
	     System.out.println(pp);
	     driver.findElement(By.id("finish")).click();
         String greeting=driver.findElement(By.className("complete-header")).getText();
         System.out.println(greeting);
        driver.findElement(By.id("back-to-products")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
        driver.close();
	}

}
