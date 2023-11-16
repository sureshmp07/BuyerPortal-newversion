package testing.dev;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_FinancingPageTest extends BaseTest {

//	@Test	(priority=1)
//	public void signInPageTest() throws InterruptedException, IOException
//	
//	{
//		buyersign.signIn(properties.getProperty("dev_email"),properties.getProperty("dev_pass"),properties.getProperty("assert_business"));
//
//	}
	@Test	(priority=1)
	public void signUpPageTest1() throws IOException, InterruptedException 
	{
		
		signup.fbsignUp1(properties.getProperty("fb_emailnew"),properties.getProperty("fb_passnew"),properties.getProperty("commercial"),properties.getProperty("terms"),properties.getProperty("privacy"),properties.getProperty("assertfb"));
	    
	}
	
   @Test(priority=2)
	public void financingpage_basicbusiness() throws InterruptedException, IOException
	{
	   financepage.financePage1(properties.getProperty("detailsname"),properties.getProperty("taxid"), properties.getProperty("registrationaddress"), properties.getProperty("detailsstate"), properties.getProperty("detailscity"), properties.getProperty("countername"), properties.getProperty("countertaxid"), properties.getProperty("counterregistrationaddress"),properties.getProperty("countercity"));
		
	}
   
   @Test(priority=3)
	public void financingpage_TradeDocuments() throws InterruptedException, AWTException, IOException
	{
	   financepage.financePage2(properties.getProperty("filepath"),properties.getProperty("tradeamount"),properties.getProperty("amounttofinance"));
		
	}

}
