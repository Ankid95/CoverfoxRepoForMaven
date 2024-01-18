package active__BASE__Coverfox;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lunching__URL_BASE_Coverfox
{   protected static WebDriver driver;
	
	public static void URL_lunching_BASE_class()
	{
		driver =new ChromeDriver();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		//Reporter.log("opening the browser", true);
	}

	public static void close__Browser()
	{  // Reporter.log("closing the browser", true);
		driver.close();
	}
	
}
