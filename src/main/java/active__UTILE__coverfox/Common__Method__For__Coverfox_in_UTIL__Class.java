package active__UTILE__coverfox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Common__Method__For__Coverfox_in_UTIL__Class 
{   public static String Excel__Method(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{ Reporter.log("Reading the data from excel", true);
	FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\myexcelsheet.xlsx");
	Sheet sheetfortest = WorkbookFactory.create(myfile).getSheet(sheetname);
    String rowcellvalue = sheetfortest.getRow(row).getCell(cell).getStringCellValue();
    return rowcellvalue;
	
	}
	
public static void TakeScreenShort(WebDriver driver,String tcname) throws IOException
{Reporter.log("taking scnshort the data from excel", true);
	File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\selenium screenshort\\"+tcname+".jpg");
	FileHandler.copy(Source, dest);
}

public  static void implicit(WebDriver driver,int sec)

{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec))	;
	
}

public static void Excuter(WebDriver driver,WebElement element)
{
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView();", element);
}
	
public static String readdatafrompropertifile(String key) throws IOException
{
	Properties p=new Properties();
	 FileInputStream myfile = new FileInputStream(System.getProperty("user.dir")+"\\propertiesfileread.properties");
p.load(myfile);
String value =  p.getProperty(key);
return value;
  
}	
}
