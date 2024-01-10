package testing;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demowebshop {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random r=new Random();
		int n=r.nextInt(1000000);
		String data="virat"+n;
		String data1="Doraman"+n;
		driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.className("ico-register")).click();
      	driver.findElement(By.id("gender-female")).click();
     	driver.findElement(By.id("FirstName")).sendKeys("Gadige");
    	driver.findElement(By.id("LastName")).sendKeys("pramitha");
		driver.findElement(By.id("Email")).sendKeys(data+"@gmail.com");
		driver.findElement(By.id("Password")).sendKeys(data1);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data1);
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
		driver.findElement(By.id("newsletter-email")).sendKeys(data);
		driver.findElement(By.id("pollanswers-2")).click();
		//driver.findElement(By.id("vote-poll-1")).click();
	    List<WebElement> list=driver.findElements(By.xpath("(//ul[@class=\"list\"])[1]//a"));
	    String productname="Gift Cards";
	    for (WebElement ele : list) {
	    	if(ele.getText().equalsIgnoreCase(productname))
	    	{
	    		ele.click();
	    		break;
	    	}
	   
			
		}
	    driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
	    driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("pramitha");
	    driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys(data+"@gmail.com");
	    driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-1\"]")).click();
	 	driver.findElement(By.xpath("//span[text()=\"Shopping cart\"]")).click();
	    driver.findElement(By.id("termsofservice")).click();
	    driver.findElement(By.id("checkout")).click();
	    driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("charani");
	    WebElement ele1= driver.findElement(By.id("BillingNewAddress_CountryId"));
	    Select s=new Select(ele1);
	    s.selectByVisibleText("India");
	    driver.findElement(By.id("BillingNewAddress_City")).sendKeys("hyderabad",Keys.TAB,"abc",Keys.TAB,"def",Keys.TAB,"500077",Keys.TAB,"8125680331",Keys.TAB,"12345hjgh",Keys.TAB,Keys.ENTER);
	    driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
	    driver.findElement(By.xpath("(//input[@type=\"button\"])[4]")).click();
	    driver.findElement(By.xpath("(//input[@type=\"button\"])[4]")).click();
	    driver.findElement(By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]")).click();
	    String greetings=driver.findElement(By.xpath("//strong[text()=\"Your order has been successfully processed!\"]")).getText();
	    System.out.println(greetings);
	    driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
	    //driver.switchTo().alert().dismiss();
	    driver.close();
	}

}
