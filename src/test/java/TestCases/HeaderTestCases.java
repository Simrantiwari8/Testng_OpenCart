package TestCases;

import PageObjectModel.Header_PageObject;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class HeaderTestCases extends BaseClass{
	
	public void verifyHeader() {
	
		Header_PageObject HPO = new Header_PageObject(driver);
		
		
		
		//currency 
		HPO.EnterCurrency().click();
		HPO.EnterCurrency_Option().click();
		
		//Phone
		HPO.ClickPhoneMenuTab().click();
		HPO.EnterName().sendKeys();
		
		//Login
		HPO.ClickOnMyAccMenu().click();
		HPO.ClickOnLoginOption().click();
		HPO.EnterEmail().sendKeys(Constants.username);
		HPO.EnterPassword().sendKeys(Constants.password);
		HPO.ClickonLoginButton().click();
		CommonMethods.handleassertion(HPO.errormsg().getText(), Constants.errormsg);  
		
		
		
		//contact us
		HPO.ClickPhoneMenuTab().click();
		HPO.EnterName().sendKeys(Constants.nameforcontactus);
		HPO.EnterEmailAddress ().sendKeys(Constants.emailforcontactus);
		HPO.AddEnquiryMessage().sendKeys(Constants.enquiry);
		HPO.ClickonSubmit().click();
		
		//WISHLIST
		HPO.Wishlist().click();
		
		//SHOPPINGCART
	    HPO.ClickOnShoppingCartMenu().click();
	    HPO.EnterQty().sendKeys();;
	    HPO.clickRefresh().click();
	    
	    //checkout
		HPO.ClickOnCheckoutMenu().click();
		HPO.ClickOnestimateshippingtax().click();
		HPO.clickGetQuotes().click();
	
		
		}
		
		
	}
	
	
	


