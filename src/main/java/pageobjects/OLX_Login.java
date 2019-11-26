package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OLX_Login {


public WebDriver driver ;
	
	By ContulMeu=By.xpath("//strong[contains(text(),'Contul meu')]");
	
	By ContFacebook=By.id("fblogin");
	
	
	
	public OLX_Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver ;
	}

	public WebElement getContulMeu()
	{
		return driver.findElement(ContulMeu);
		}
	
	public WebElement getContFacebook()
	{
		return driver.findElement(ContFacebook);
		}
}