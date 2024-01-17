package active__TestNG__Coverfox;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import active__BASE__Coverfox.Lunching__URL_BASE_Coverfox;
import active__POM__class_coverfox.TestNG;
import active__POM__class_coverfox.TestNG4;
import active__POM__class_coverfox.TestNG5;
import active__POM__class_coverfox.TestNG_2;
import active__UTILE__coverfox.Common__Method__For__Coverfox_in_UTIL__Class;
@Listeners(listners.Listner.class)
public class Pincode_error_Msg extends Lunching__URL_BASE_Coverfox{
	 TestNG t11;
	  TestNG_2 t22;
	  TestNG4 t44;
	  TestNG5 t55;
	  
	  
	 @BeforeClass
	public void beforeaction()
	{
	  URL_lunching_BASE_class();
		t11=new TestNG(driver);
		t22=new TestNG_2(driver);
		t44=new TestNG4(driver);
		t55=new TestNG5(driver);
				
}
		@BeforeMethod
		public void entermemberdetails() throws InterruptedException, IOException
		{
			t11.clickonfemalebutton();
			Thread.sleep(5000);
			t22.clickonnextbutton();
			Thread.sleep(5000);
			t44.clickonselectage(Common__Method__For__Coverfox_in_UTIL__Class.readdatafrompropertifile("age"));
			Thread.sleep(8000);
			t44.clickonNextbuttononmemberpage();
			Thread.sleep(8000);
			t55.EnterMobNoOnHealth_plan_Page(Common__Method__For__Coverfox_in_UTIL__Class.readdatafrompropertifile("mob"));
			Thread.sleep(8000);
			t55.ClickOnContinueButton();
		}
  
	 @Test
  public void  Pincode_errormethod() 
  { Reporter.log("validating error msg", true);
	 boolean errorresult = t55.validatemsg();
	 Assert.assertTrue(errorresult, "msg nt display tc failed"); 
  }
 
}
