package active__POM__class_coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNG 
{
	@FindBy(xpath = "//div[text()='Female']")  private WebElement femealebutton;
	
	
	public TestNG (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonfemalebutton()
	{
		femealebutton.click();
	}
}
