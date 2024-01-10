package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
    int n=driver.findElements(By.xpath("//tbody[@style=\"box-sizing:inherit\"]/tr")).size();
    System.out.println(n);
    String n1= driver.findElement(By.xpath("//tbody[@style=\"box-sizing:inherit\"]/tr[2]/td[3]")).getText();
    System.out.println(n1);
    //driver.quit();
}
}
