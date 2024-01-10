package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		int row = driver.findElements(By.xpath("//table[@id=\"countries\"]//tr")).size();
	    System.out.println(row);
	   int coloumn=  driver.findElements(By.xpath("//table[@id=\"countries\"]//tr[1]/td")).size();
	    System.out.println(coloumn);
		System.out.println("Country"+"    "+"Capital(s)"+"    "+"Currency"+"    "+"Primary Language(s)");
		/*for(int r=2;r<=row;r++)
		{
			for(int c=2;c<=coloumn;c++)
			{
				Thread.sleep(3000);
			String s=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(s+"\t");

			}
			System.out.println();
		}*/
		//clicking on checkbox
		/*for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
			
			if(author.equals("Amit"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(author+"    "+bookname);
			}
			
		}//table[@name="BookTable"]//tr["+r+"]//td[2]

		
	    */
	    for(int r=2;r<=row;r++)
	    	{
	    	for(int c=1;c<=coloumn;c++)
	    	{
	    	String data1=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td["+c+"]")).getText();
	    		String data="English";
	    		if(data1.equalsIgnoreCase(data))
	    		{
	    		//driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[1]/input")).click();
	    			Thread.sleep(3000);
	    			driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]/td[1]//input")).click();
	
				}
	    		}

	    	
	    		    }
	
		
	}
	}


