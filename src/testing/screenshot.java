package testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		TakesScreenshot sh=(TakesScreenshot)driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\selenium\\ss.png");
		Files.copy(src, dst);
		driver.quit();
		
	}

}
