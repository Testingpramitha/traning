package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dmart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://naveenautomationlabs.com/opencart/");
	Random r=new Random();
	int n=r.nextInt(1000000);
	String data="virat"+n;
	driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"input-firstname\"]")).sendKeys("Gadige",Keys.TAB,"pramitha",Keys.TAB,data+"@gmail.com",Keys.TAB,"8125680331",Keys.TAB,"Doreman123@",Keys.TAB,"Doreman123@");
    driver.findElement(By.name("agree")).click();
    driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    driver.findElement(By.xpath("//a[text()=\"Desktops\"]")).click();
    driver.findElement(By.xpath("//a[text()=\"Show All Desktops\"]")).click();
    driver.findElement(By.xpath("(//button[@type=\"button\"])[9]")).click();
    driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
     WebElement ele= driver.findElement(By.xpath("//select[@id=\"input-option217\"]"));
     Select s=new Select(ele);
     s.selectByValue("3");
     Thread.sleep(3000);
     driver.findElement(By.id("input-option209")).sendKeys("xxxx");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@id=\"button-upload222\"]")).sendKeys("C:\\Users\\PRAMITHA\\Documents\\Firstmock.doc");
     driver.findElement(By.xpath("//input[@name=\"quantity\"]")).sendKeys("4");
     driver.findElement(By.xpath("//button[@id=\"button-cart\"]")).click();
     //Laptop and notebooks
     driver.findElement(By.xpath("//a[text()=\"Laptops & Notebooks\"]")).click();
     driver.findElement(By.xpath("//a[text()=\"Show All Laptops & Notebooks\"]")).click();
     driver.findElement(By.xpath("//a[text()=\"MacBook\"]")).click();
     driver.findElement(By.xpath("//button[text()=\"Add to Cart\"]")).click();
     driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
     driver.findElement(By.xpath("(//i[@class=\"fa fa-share\"])[2]")).click();
     driver.findElement(By.xpath("//input[@id=\"input-payment-firstname\"]")).sendKeys("gadige",Keys.TAB,"Pramitha",Keys.TAB,"Charani",Keys.TAB,"hyderabad",Keys.TAB,"xxxx",Keys.TAB,"xxx",Keys.TAB,"500077",Keys.TAB,"india",Keys.TAB,"Inida");
     WebElement ele1= driver.findElement(By.xpath("//select[@id=\"input-payment-zone\"]"));
    Select s1=new Select(ele1);
    s1.selectByValue("3513");
    driver.findElement(By.xpath("//input[@id=\"button-payment-address\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//textarea[@name=\"comment\"]")).sendKeys("xxxx");
    driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
    driver.findElement(By.id("button-payment-method")).click();
    //component module
    driver.findElement(By.xpath("//a[text()=\"Components\"]")).click();
    driver.findElement(By.xpath("//a[text()=\"Show All Components\"]")).click();
    driver.findElement(By.xpath("(//a[text()=\"Monitors (2)\"])[2]")).click();
    driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
    driver.findElement(By.xpath("//strong[text()=\" Checkout\"]")).click();
    driver.findElement(By.xpath("//input[@id=\"button-payment-address\"]")).click();
    driver.findElement(By.xpath("//textarea[@name=\"comment\"]")).sendKeys("xxcxx");
    driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
    driver.findElement(By.xpath("//input[@id=\"button-payment-method\"]")).click();
    //Tablets
    driver.findElement(By.xpath("//a[text()=\"Tablets\"]")).click();
    driver.findElement(By.xpath("//a[text()=\"Samsung Galaxy Tab 10.1\"]")).click();
    //driver.findElement(By.xpath("(//a[text()=\"Samsung Galaxy Tab 10.1\"])[2]")).click();
    driver.findElement(By.xpath("//button[@id=\"button-cart\"]")).click();
    driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
    //driver.findElement(By.xpath("//a[text()=\"Checkout\"]")).click();
    driver.findElement(By.xpath("(//i[@class=\"fa fa-share\"])[2]")).click();
    //Software
    driver.findElement(By.xpath("//a[text()=\"Software\"]")).click();
    //phones and PADs
      driver.findElement(By.xpath("//a[text()=\"Phones & PDAs\"]")).click();
   // driver.findElement(By.xpath("(//a[text()=\"HTC Touch HD\"])[2]")).click();
     driver.findElement(By.xpath("//a[text()=\"HTC Touch HD\"]")).click();
    driver.findElement(By.xpath("//button[@id=\"button-cart\"]")).click();
    driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
    driver.findElement(By.xpath("//strong[text()=\" Checkout\"]")).click();
    driver.findElement(By.xpath("//a[text()=\"Checkout\"]")).click();
    //Cameras module
	driver.findElement(By.xpath("//a[text()=\"Cameras\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"Canon EOS 5D\"]")).click();
	driver.findElement(By.xpath("//button[text()=\"Add to Cart\"]")).click();
	driver.findElement(By.xpath("//strong[text()=\" Checkout\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"button-payment-address\"]")).click();
	driver.findElement(By.xpath("//textarea[@name=\"comment\"]")).sendKeys("xxxx");
	driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"button-payment-method\"]")).click();
	//M3Players
	driver.findElement(By.xpath("//a[text()=\"MP3 Players\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"Show All MP3 Players\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"iPod Classic\"]")).click();
	driver.findElement(By.xpath("//button[@id=\"button-cart\"]")).click();
	driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
	driver.findElement(By.xpath("//strong[text()=\" Checkout\"]")).click();
	driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
	driver.findElement(By.xpath("//input[@id=\"button-account\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"input-payment-firstname\"]")).sendKeys("xxx",Keys.TAB,"xxx",Keys.TAB,"pramitha1905@gmail.com",Keys.TAB,"00000000",Keys.TAB,"xxx",Keys.TAB,"xxxx",Keys.TAB,"xxx",Keys.TAB,"xxx",Keys.TAB,"xxx");
	WebElement ele3= driver.findElement(By.xpath("//select[@id=\"input-payment-country\"]"));
	Select s4=new Select(ele3);
	Thread.sleep(3000);
	s4.selectByVisibleText("Afghanistan");
	 WebElement ele5= driver.findElement(By.xpath("//select[@name=\"zone_id\"]"));
	 Select s5=new Select(ele5);
	 Thread.sleep(3000);
	 s5.selectByIndex(5);
	 //driver.findElement(By.xpath("//input[@id=\"button-guest-shipping\"]")).click();
	 driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
	 driver.findElement(By.xpath("//textarea[@name=\"comment\"]")).sendKeys("xxx");
	 driver.findElement(By.xpath("//input[@id=\"button-shipping-method\"]")).click();
	 driver.findElement(By.xpath("//input[@name=\"agree\"]")).click();
	 driver.findElement(By.xpath("//input[@id=\"button-payment-method\"]")).click();
	 driver.findElement(By.xpath("//input[@id=\"button-confirm\"]")).click();
	 driver.findElement(By.xpath("//a[text()=\"Continue\"]")).click();
	
	
	
    
    
}
}