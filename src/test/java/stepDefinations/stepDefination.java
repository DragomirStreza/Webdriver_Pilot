package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.OLX_Cautare;
import pageobjects.OLX_Login;

import resources.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination extends Base
{
	
	  private static Logger log =LogManager.getLogger(Base.class.getName());
	
	  @Given("^Initialize the chrome browser$")
	    public void initialize_the_chrome_browser() throws Throwable {
		driver =  initializeDriver() ;
		 log.info("Webdriverul initializat");
	    }

	  @And("^Navigate to \"([^\"]*)\"$")
	    public void navigate_to_something(String strArg1) throws Throwable {
	      driver.get(strArg1); 
	      log.info("Accesat OLX.ro");
	    }

	    @When("^User press on 'Contul meu' and \"([^\"]*)\"$")
	    public void user_press_on_contul_meu_and_something(String strArg1) throws Throwable {
	     OLX_Login e=new OLX_Login(driver);
		
			e.getContulMeu().click();
			log.info("Accesat <Contul Meu>");
	    }

	    @When("^User enter \"([^\"]*)\" car model in search bar and press on \"([^\"]*)\" button$")
	    public void user_enter_something_car_model_in_search_bar_and_press_on_something_button(String strArg1, String strArg2) throws Throwable {
	      	OLX_Cautare z=new OLX_Cautare(driver);
		z.getBaraCautare().click();
		z.getBaraCautare().sendKeys("BMW");
			
		OLX_Cautare t=new OLX_Cautare(driver);
		t.getButonCautaAcum().click();
		log.info("Introdus un model de masina si apasat pe <Cautare>");
	    }

	    @Then("^User is sucessfully logged in OLX and Facebook account credentials are displayed$")
	    public void user_is_sucessfully_logged_in_olx_and_facebook_account_credentials_are_displayed() throws Throwable {
	       	OLX_Login e=new OLX_Login(driver);
	        e.getContFacebook().click();
	        log.info("Accesata logarea cu Facebook");
	    }

	    @Then("^Sales offers for specific car model are displayed$")
	    public void sales_offers_for_specific_car_model_are_displayed() throws Throwable {
	    	  log.info("Sunt afisate rezultatele cautarii dupa un model de masina");
	    }

	  

	}
	