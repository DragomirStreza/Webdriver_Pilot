package TFW_Test;






import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import pageobjects.OLX_Cautare;
import pageobjects.OLX_Login;

import resources.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class OLX_Cautare_Test extends Base {

	
	
	
	@Parameters({"URL","QNummer","TSSPasswort"})
	
	@Test

public void OLX_Cautare(String URL,String QNummer,String TSSPasswort) throws IOException
	{
		driver =  initializeDriver() ;
	
		
		
		driver.get(URL);
	
		OLX_Cautare z=new OLX_Cautare(driver);
	z.getBaraCautare().click();
	z.getBaraCautare().sendKeys("BMW");
		
	OLX_Cautare t=new OLX_Cautare(driver);
	t.getButonCautaAcum().click();
	
	}	
	}