package active__POM__class_coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNG_2 
{
	@FindBy(className = "next-btn") private WebElement nextbutton;
	
	public TestNG_2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonnextbutton() throws InterruptedException
	{ Thread.sleep(1000);
		nextbutton.click();
	}
}
