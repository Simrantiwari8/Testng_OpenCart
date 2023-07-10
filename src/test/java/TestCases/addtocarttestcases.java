package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.AddToCartobjects;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

@Test
public class addtocarttestcases extends BaseClass {
	
	public void addtocartobjects() throws InterruptedException {
		
		
		AddToCartobjects ATCO=new AddToCartobjects(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		//adding products to cart and verifying their price
		ATCO.search().click();
		ATCO.search().sendKeys(Constants.search1);
		ATCO.searchbtnclick().click();
		ATCO.addingtocart().click();
		String price1=ATCO.price1().getText();
		double d1=CommonMethods.pricehandling(price1);
		
		ATCO.search().clear();
		
		ATCO.search().sendKeys(Constants.search);
		ATCO.searchbtnclick().click();
		ATCO.addtocart_().click();
		String price2=ATCO.price1().getText();
		double d2=CommonMethods.pricehandling(price2);
		
		//actual price addition
		double add=d1+d2;
		String Actualpriceconvert=Double.toString(add);
		String actualprice$=("$"+Actualpriceconvert);
		System.out.println("addition of Actual Price = "+ actualprice$);
		Thread.sleep(5000);
		
		
		ATCO.cartclick().click();
		
		
		//expected price
		String expectedprice=ATCO.totalexpectedprice().getText();
		double d3=CommonMethods.pricehandling(expectedprice);
		String expectedpriceconverted=Double.toString(d3);
		String expectedprice$=("$"+expectedpriceconverted);
		
		System.out.println("addition of Expected price :"+expectedprice$);
		
		if(actualprice$.equals(expectedprice$)) {
			
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		

}
}
