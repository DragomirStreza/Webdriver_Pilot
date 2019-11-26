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


import pageobjects.OLX_Login;

import resources.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class OLX_Access_CreeazaCont extends Base {

	
	
	
	@Parameters({"URL","QNummer","TSSPasswort"})
	
	@Test

public void OLX_Access_CreeazaCont(String URL,String QNummer,String TSSPasswort) throws IOException
	{
		driver =  initializeDriver() ;
	
		
		
		driver.get(URL);
	
		OLX_Login e=new OLX_Login(driver);
	
		e.getContulMeu().click();
		
		e.getContFacebook().click();
	
	}	
	}