package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.Footer_PageObject;
import PageObjectModel.Header_PageObject;
import Resources.BaseClass;
import Resources.Constants;

@Test
	public class Footertestcases extends BaseClass {

		public void footerobjects () {
			
			Footer_PageObject FPO= new Footer_PageObject(driver);
			Header_PageObject HPO = new Header_PageObject(driver);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
			
			
			
			//information
			
			FPO.ClickAboutus().click();
			FPO.ClickDeliveryClick().click();
			FPO.ClickPrivacyPolicy().click();
			FPO.Termsandconditions().click();
			
			
			//customer service
			FPO.Clickcontactus().click();
			HPO.EnterName().sendKeys(Constants.nameforcontactus);
			HPO.EnterEmailAddress().sendKeys(Constants.emailforcontactus);
			HPO.AddEnquiryMessage().sendKeys(Constants.enquiry);
			HPO.ClickonSubmit().click();
			
			//Returns click
			FPO.Returns().click();
			FPO.Enterfirstname().sendKeys(Constants.firstname);
			FPO.Enterlastname().sendKeys(Constants.lastname);
			FPO.Enteremail().sendKeys(Constants.email);
			FPO.Entertelephone().sendKeys(Constants.telephone);
			FPO.Enterorderid().sendKeys(Constants.orderid);
			FPO.EnterProductname().sendKeys(Constants.productname);
			FPO.EnterProductcode().sendKeys(Constants.productcode);
			FPO.EnterQuantity().sendKeys(Constants.quantity);
			FPO.EnterReasonForReturn().click();
			FPO.Askproductisopened().click();
			FPO.Clicksubmit().click();
			
			
			
		}
	
}
