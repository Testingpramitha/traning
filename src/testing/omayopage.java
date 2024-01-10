package testing;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class omayopage {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html?m=0");
		driver.findElement(By.id("radio2")).click();
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(3000);
	Alert alt=driver.switchTo().alert();
	Thread.sleep(3000);
	alt.sendKeys("pramitha");
	Thread.sleep(3000);
	alt.accept();
	driver.findElement(By.id("confirm")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.name("textboxn")).sendKeys("pramithaaa");
	driver.findElement(By.className("classone")).sendKeys("cheety");
	driver.findElement(By.xpath("(//input[@type=\"text\"])[9]")).sendKeys("vibha");
	driver.findElement(By.name("vehicle")).click();
	driver.findElement(By.name("accessories")).click();
	WebElement ele= driver.findElement(By.id("testdoubleclick"));
	Actions act=new Actions(driver);
	act.doubleClick(ele).perform();
	Thread.sleep(3000);
	/*driver.findElement(By.className("dropbtn")).click();
	driver.findElement(By.xpath("//a[text()=\"Gmail\"]")).click();*/
	WebElement ele3=driver.findElement(By.id("multiselect1"));
	Select s1=new Select(ele3);
	s1.selectByValue("audix");
    WebElement ele4=driver.findElement(By.id("drop1"));
    Select s2=new Select(ele4);
    s2.selectByValue("mno");
    List<WebElement> table= driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
    for (WebElement web : table) {
    	 String s4= web.getText();
    	System.out.println(s4);
		
	}
    driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("pramitha");
    driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("doreman123@");
    WebElement dis=driver.findElement(By.id("but1"));
    dis.click();
    if(dis.isEnabled())
    {
    	System.out.println("Attribute is enabled");
    	
    }
    else
    {
    	System.out.println("Attribute is disabled");
    }
	
	WebElement ena=	driver.findElement(By.id("but2"));
	ena.click();
	if(ena.isEnabled())
	{
		System.out.println("Attribute is enabled");
	}
	else
	{
		System.out.println("Attribute is disabled");
	}
	driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
	} 
	

}
