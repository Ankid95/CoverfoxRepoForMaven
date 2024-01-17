package active__POM__class_coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNG5 {
	
		@FindBy(xpath = "(//input[@type=\"number\"])[1]")private WebElement EnterPincode;
		@FindBy(xpath = "(//input[@type=\"number\"])[2]")private WebElement EnterMobNo;	
		@FindBy(className = "next-btn")   private WebElement ContinueButton;
		@FindBy(xpath = "//div[contains(text(),'Please')]") private WebElement errormsg;
		public 	 TestNG5 (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public void EnterPincodeOnHealth_plan_Page(String pincode)
		{
			EnterPincode.sendKeys(pincode);
		}

		public void EnterMobNoOnHealth_plan_Page(String mobno)
		{
			EnterMobNo.sendKeys(mobno);	
		}
		public boolean validatemsg()
		{
			boolean result = errormsg.isDisplayed();
			return result;
		}
		public void ClickOnContinueButton() {
			ContinueButton.click();
		}
}
