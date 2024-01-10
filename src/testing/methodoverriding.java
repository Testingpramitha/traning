package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

class redcolour
{
	public void m1()
	{
		System.out.println("this is red");
	}
}
class pinkcolour extends redcolour
{
	public void m1()
	{
		System.out.println("pinkcolour");
	}
}

public class methodoverriding {
	public static void main(String[] args) {
		
		pinkcolour p=new pinkcolour();
		p.m1();
		
		
	}
}


