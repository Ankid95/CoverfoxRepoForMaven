package active__POM__class_coverfox;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class TestNG6 
{
	@FindBy(xpath = "//div[contains(text(),'matching Health')]")private WebElement textofmatchingpolicy;
	@FindBy(id = "plans-list")private List<WebElement>planlist;
	@FindBy(xpath = "//div[text()='Sort Plans']")private WebElement sortfield;
	public TestNG6(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public int resultOfListedPolicy() throws InterruptedException
	{  Thread.sleep(5000);
		String text = textofmatchingpolicy.getText();
		Thread.sleep(5000);
		System.out.println(text);
		String splittext[] = text.split(" ");
		String ar = splittext[0];
		System.out.println(ar);
		int int_totallist = Integer.parseInt(ar);
		System.out.println(int_totallist);
		return int_totallist;



		

	}
	public int bannerresult() throws InterruptedException
	{  Thread.sleep(1000);
		int totallist = planlist.size();
		Thread.sleep(2000);
		System.out.println(totallist);
		return totallist;
	}
	public boolean sortplanelementpresency()
	{ Reporter.log("checking the short palne is present or not",true);
		boolean result = sortfield.isDisplayed();
		return result;
	}
	
	}
	
	
	
	
