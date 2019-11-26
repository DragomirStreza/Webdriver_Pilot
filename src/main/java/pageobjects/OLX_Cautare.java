
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OLX_Cautare {


public WebDriver driver ;
	
	By BaraCautare=By.id("headerSearch");
	
	By ButonCautaAcum=By.id("submit-searchmain");

	
	public OLX_Cautare(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver ;
	}

	public WebElement getBaraCautare()
	{
		return driver.findElement(BaraCautare);
		}
	
	
public WebElement getButonCautaAcum() {
		// TODO Auto-generated method stub
		return driver.findElement(ButonCautaAcum);
	}
	
	
}