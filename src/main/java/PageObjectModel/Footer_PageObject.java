package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer_PageObject {
	
	
	public WebDriver driver;
	
	public Footer_PageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	
	//Information
	private By Aboutusclick= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=4']");
	private By Deliveryinfoclick= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=6']");
	private By privacypolicyclick= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=3']");
	private By termsandcondclick= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=5']");
	
	
	//Customer service
	private By contactusclick= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/contact'][2]");
	private By Returnsclick= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/return/add']");
	//private By sitemapclick= By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/sitemap']");
	
	//Returns click
	private By FirstName= By.xpath("//input[@id='input-firstname']");
	private By LastName= By.xpath("//input[@id='input-lastname']");
	private By Email= By.xpath("//input[@id='input-email']");
	private By Telephone= By.xpath("//input[@id='input-telephone']");
	private By Orderid= By.xpath("//input[@id='input-order-id']");
	private By ProductName= By.xpath("//input[@id='input-product']");
	private By ProductCode= By.xpath("//input[@id='input-model']");
	private By Quantity= By.xpath("//input[@id='input-quantity']");
	private By ReasonForReturn= By.xpath("//input[@name='return_reason_id'][5]");
	private By productisopened= By.xpath("//input[@name='opened'][1]");
	private By faultyorotherdetails= By.xpath("//textarea[@id='input-comment']");
	private By submitbutton= By.xpath("//input[@value='Submit']");
	
	
	
	

	public WebElement ClickAboutus () {
		return driver.findElement(Aboutusclick);
	}
	
	public WebElement ClickDeliveryClick () {
		return driver.findElement(Deliveryinfoclick);
	}
	
	public WebElement  ClickPrivacyPolicy() {
		return driver.findElement(privacypolicyclick);
	}
	
	public WebElement Termsandconditions () {
		return driver.findElement(termsandcondclick);
	}
	
	public WebElement Clickcontactus () {
		return driver.findElement(contactusclick);
	}
	
	public WebElement  Returns() {
		return driver.findElement(Returnsclick);
	}
	
	public WebElement  Enterfirstname() {
		return driver.findElement(FirstName);
	}
	public WebElement Enterlastname() {
		return driver.findElement(LastName);
	}
	public WebElement  Entertelephone() {
		return driver.findElement(Telephone);
	}
	
	public WebElement  Enteremail() {
		return driver.findElement(Email);
	}
	
	public WebElement  Enterorderid() {
		return driver.findElement(Orderid);
	}
	
	public WebElement  EnterProductname() {
		return driver.findElement(ProductName);
	}
	
	public WebElement  EnterProductcode() {
		return driver.findElement(ProductCode);
	}
	

	public WebElement EnterQuantity() {
		return driver.findElement(Quantity);
	}
	
	public WebElement EnterReasonForReturn() {
		return driver.findElement(ReasonForReturn);
	}
	
	public WebElement  Askproductisopened() {
		return driver.findElement(productisopened);
	}
	
	public WebElement Enterfaultyorotherdetails() {
		return driver.findElement(faultyorotherdetails);
	}
	public WebElement  Clicksubmit() {
		return driver.findElement(submitbutton);
	}
	
	
	
}
