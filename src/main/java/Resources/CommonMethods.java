package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void handleassertion(String actualString,String expectedString) {
		SoftAssert assertion=new SoftAssert();
		String actual=actualString;
		String expected=expectedString;
		assertion.assertEquals(actual, expected);
		assertion.assertAll();
		
	}
	
	public static void selectdropdown(WebElement dropdown,String value ) {
		Select s=new Select(dropdown);
		s.selectByVisibleText(value);
	}
	
	public static double pricehandling (String price1) {
		String price=price1;
		String pr[]=price.split("\\s+");
		System.out.println(pr);
		String a=pr[0];
		System.out.println("Method:"+a);
		String removeDoller=a;
		String AfterRemoveDoller=removeDoller.replaceAll("[$]","");
		System.out.println("Before parseDouble:"+AfterRemoveDoller);
		double d=Double.parseDouble(AfterRemoveDoller);
		System.out.println("After parseDouble:="+d);
		return d;
		
	}
	
	public static void mouseoverhandle(WebElement mouseover,WebDriver driver) throws InterruptedException {
		WebElement MO=mouseover;
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(MO).perform();
	}	
	
}
