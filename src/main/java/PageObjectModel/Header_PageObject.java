package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header_PageObject {

	public WebDriver driver;
	

	public Header_PageObject(WebDriver driver2) {
		this.driver = driver2;
	}
	
	//Currency
	private By Currency= By.xpath("//span[class='hidden-xs hidden-sm hidden-md'][1]");
	private By Currency_Option= By.xpath("//button[class='currency-select btn btn-link btn-block'][3]"); //US Doller
	
	
	
	//contact us
	private By phone= By.xpath("//i[class='fa fa-phone']");
	private By YourName= By.xpath("//input[id='input-name']");
	private By EmailAddress= By.xpath("//input[id='input-email']");
	private By Enquiry= By.xpath("//textarea[id='input-enquiry']");
	private By SubmitButton= By.xpath("//input[@type='submit']");
	
	
	
	//My Account
	private By MyAccount= By.xpath("//i[class='hidden-xs hidden-sm hidden-md'][3]");
	private By Login= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']");
	private By Email= By.xpath("//input[id='input-email']");
	private By Password= By.xpath("//input[id='input-password']");
	private By LoginClick= By.xpath("//input[type='submit']");
	private By errormsg=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	//Wishlist
	private By Wishlist= By.xpath("[class'hidden-xs hidden-sm hidden-md']");

	
	//Shopping cart
	private By Shoppingcart= By.xpath("//span[class='hidden-xs hidden-sm hidden-md'][5]");
	private By Shoppingcart_qty= By.xpath("//button[@class='btn btn-primary'])[1]");
	private By Shoppingcart_refresh= By.xpath("//i[@class='fa fa-refresh'])[1]");
	
	//Checkout
	private By Checkout= By.xpath("//span[class='hidden-xs hidden-sm hidden-md'][6]");
	private By EstimateShippingTax= By.xpath("//a[@class='accordion-toggle collapsed'][2]");
	private By country= By.xpath("//select[@id='input-country']");
	private By state= By.xpath("//select[@id='input-zone']");
	private By postcode= By.xpath("//input['@id=input-postcode']");
	private By click_getquotes= By.xpath("//button[@id='button-quote']");
	
	

	
	
	public WebElement EnterCurrency () {
		return driver.findElement(Currency);
	}
	
	public WebElement EnterCurrency_Option () {
		return driver.findElement(Currency_Option);
	}
	
	public WebElement  ClickPhoneMenuTab() {
		return driver.findElement(phone);
	}
	
	public WebElement EnterName() {
		return driver.findElement(YourName);
	}
	
	public WebElement EnterEmailAddress () {
		return driver.findElement(EmailAddress);
	}
	
	public WebElement  AddEnquiryMessage() {
		return driver.findElement(Enquiry);
	}
	
	public WebElement  ClickonSubmit() {
		return driver.findElement(SubmitButton);
	}
	
	public WebElement  ClickOnMyAccMenu() {
		return driver.findElement(MyAccount);
	}
	
	public WebElement  ClickOnLoginOption() {
		return driver.findElement(Login);
	}
	
	public WebElement  EnterEmail() {
		return driver.findElement(Email);
	}
	
	public WebElement  EnterPassword() {
		return driver.findElement(Password);
	}
	
	public WebElement  ClickonLoginButton() {
		return driver.findElement(LoginClick);
	}
	
	public WebElement errormsg() {
		return driver.findElement(errormsg);
	}

	public WebElement Wishlist() {
		return driver.findElement(Wishlist);
	}
	
	public WebElement  ClickOnShoppingCartMenu() {
		return driver.findElement(Shoppingcart);
	}
	
	public WebElement  EnterQty() {
		return driver.findElement(Shoppingcart_qty);
	}
	
	public WebElement  clickRefresh() {
		return driver.findElement(Shoppingcart_refresh);
	}
	
	public WebElement  ClickOnCheckoutMenu() {
		return driver.findElement(Checkout);
	}
	
	public WebElement  ClickOnestimateshippingtax() {
		return driver.findElement(EstimateShippingTax);
	}
	
	public WebElement  SelectCountry() {
		return driver.findElement(country);
	}
	
	public WebElement  SelectRegionState() {
		return driver.findElement(state);
	}
	
	public WebElement  EnterPostCode() {
		return driver.findElement(postcode);
	}
	
	public WebElement  clickGetQuotes() {
		return driver.findElement(click_getquotes);
	}
	
	
		
	
	
	
}
