package active__POM__class_coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestNG4 {
	@FindBy(id = "Age-You") private WebElement selectage;
	@FindBy(className = "next-btn") private WebElement nextbuttononmemberpage;

	public TestNG4(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 public void clickonselectage(Object object)
	 {
		 Select s=new Select(selectage);
		 s.selectByValue(object+"y");
	 }

	public void clickonNextbuttononmemberpage()
	{
		nextbuttononmemberpage.click();
	}
}
