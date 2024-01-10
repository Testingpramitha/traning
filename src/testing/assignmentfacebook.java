package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentfacebook {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		String s="Places";
		
	    List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"uiList pageFooterLinkList _509- _4ki _703 _6-i\"]/li"));
	    System.out.println(list.size());
	    for (WebElement data : list) {
	    	if(data.getText().contains(s))
	    	{
	    		data.click();
	    		break;
	    	}
	    	
			}
			
		}

		
	}


