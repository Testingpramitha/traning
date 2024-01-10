package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class luma {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("//a[text()=\"Create an Account\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("gadige",Keys.TAB,"pramitha",Keys.TAB,"pramitha001@gmail.com",Keys.TAB,"Doreman123@",Keys.TAB,"Doreman123@",Keys.TAB,Keys.ENTER);
	    String s= driver.findElement(By.xpath("(//div[@class=\"box-content\"])[1]")).getText();
	    String req_name="pramitha001@gmail.com";
	  // System.out.println(s);
	   String[] name=s.split("\n");
	   String user=name[1];
	   System.out.println(user);
	   if(user.equalsIgnoreCase(req_name))
	   {
		   System.out.println("matched");
	   }
	   else
	   {
		   System.out.println("not");
	   }
	   

	}
	}


