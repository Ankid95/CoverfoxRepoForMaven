package active__TestNG__Coverfox;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import active__BASE__Coverfox.Lunching__URL_BASE_Coverfox;
import active__POM__class_coverfox.TestNG4;
import active__POM__class_coverfox.TestNG5;
import active__POM__class_coverfox.TestNG6;
import active__POM__class_coverfox.TestNG_2;
import active__UTILE__coverfox.Common__Method__For__Coverfox_in_UTIL__Class;
import active__POM__class_coverfox.TestNG;
@Listeners(listners.Listner.class)
public class Active_CoverFoxTestClass extends Lunching__URL_BASE_Coverfox{
public static Logger logger;
TestNG t1;
TestNG_2 t2;
TestNG4 t4;
TestNG5 t5;
TestNG6 t6;


	
	@BeforeClass
	public void beforeaction()
	{   
		logger=logger.getLogger("coverfoxFtestngclass");
		PropertyConfigurator.configure("log4j.properties");
	logger.debug("test class visible");
		
		URL_lunching_BASE_class();
		logger.info("brwserlunching");
		t1=new TestNG(driver);
		t2=new TestNG_2(driver);
		t4=new TestNG4(driver);
		t5=new TestNG5(driver);
		t6=new TestNG6(driver);
		
		
	}
	@BeforeMethod
	public void entermemberdetails() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		t1.clickonfemalebutton();
		logger.info("clicking on gender button");
		Thread.sleep(3000);
		t2.clickonnextbutton();
		logger.info("clicking on next button");
		Thread.sleep(3000);
		t4.clickonselectage(Common__Method__For__Coverfox_in_UTIL__Class.Excel__Method("Sheet2", 0, 2));
		logger.info("selecting age");
		Thread.sleep(3000);
		t4.clickonNextbuttononmemberpage();
		logger.info("clickonNextbuttononmemberpage");
		Thread.sleep(3000);
		t5.EnterPincodeOnHealth_plan_Page(Common__Method__For__Coverfox_in_UTIL__Class.Excel__Method("Sheet2", 0, 3));
		logger.info("EnterPincodeOnHealth_plan_Page");
	
		Thread.sleep(3000);
		t5.EnterMobNoOnHealth_plan_Page(Common__Method__For__Coverfox_in_UTIL__Class.Excel__Method("Sheet2", 0, 0));
		logger.info("EnterMobNoOnHealth_plan_Page");
		Thread.sleep(3000);
		t5.ClickOnContinueButton();
		logger.info("ClickOnContinueButton");
		Thread.sleep(3000);
	}
	
  @Test
  
  
  public void s() throws InterruptedException, IOException  
  {
	  int getresult = t6.resultOfListedPolicy();
	  logger.error("tc fail");
	  Thread.sleep(10000);
	  int actualresult = t6.bannerresult();
	  Thread.sleep(10000);
	  logger.fatal("fatal for logger");
	  SoftAssert s=new SoftAssert();
       s.assertEquals(getresult,actualresult,"result met tc pass");
      Thread.sleep(10000);
	  //Assert.assertFalse( t6.sortplanelementpresency(), "validation is not done/sort plan is absent tc failed");
	  s.assertAll();
// Common__Method__For__Coverfox_in_UTIL__Class.TakeScreenShort(driver, "D:\\selenium screenshort");
	  
  }
 

}  
  

