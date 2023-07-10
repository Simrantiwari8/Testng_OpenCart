package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartobjects {

	public WebDriver driver;

	public AddToCartobjects(WebDriver driver2) {
		this.driver = driver2;

	}

	private By search = By.xpath("//input[@placeholder='Search']");
	private By searchbtnclick = By.xpath("//button[@class='btn btn-default btn-lg']");
	private By addtowishlist = By.xpath("//button[@data-original-title='Add to Wish List']");
	private By openproduct = By.xpath("//a[contains(text(),'Samsung SyncMaster 941BW')]");
	private By addtocart = By.xpath("//button[@id='button-cart']");
	private By cartclick = By.xpath("//span[@id='cart-total']");
	private By viewcartclick = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	private By addingtocart = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	private By addtocart_ = By.xpath("(//i[@class='fa fa-shopping-cart'])[4]");

	public By price1 = By.xpath("(//p[@class='price'])[1]");
	public By totalexpectedprice = By.xpath("//td[contains(text(),'$365.20')]");

	public WebElement search() {
		return driver.findElement(search);
	}

	public WebElement searchbtnclick() {
		return driver.findElement(searchbtnclick);
	}

	public WebElement addtowishlist() {
		return driver.findElement(addtowishlist);
	}

	public WebElement openproduct() {
		return driver.findElement(openproduct);
	}

	public WebElement addtocart() {
		return driver.findElement(addtocart);
	}

	public WebElement cartclick() {
		return driver.findElement(cartclick);
	}

	public WebElement viewcartclick() {
		return driver.findElement(viewcartclick);
	}

	public WebElement addingtocart() {
		return driver.findElement(addingtocart);
	}

	public WebElement price1() {
		return driver.findElement(price1);
	}

	public WebElement totalexpectedprice() {
		return driver.findElement(totalexpectedprice);
	}

	public WebElement addtocart_() {
		return driver.findElement(addtocart_);
	}

	
}
