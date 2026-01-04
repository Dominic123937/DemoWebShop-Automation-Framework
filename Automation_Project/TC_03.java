package Automation_Project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class TC_03 extends BaseSuite{
	public void TestCase_3() {
		String text = "shopping cart";
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Computers']")).click();
		driver.findElement(By.xpath("//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='14.1-inch Laptop']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']")).click();
		// ------------------- CAPTURING THE MESSAGAE OF ADD TO CART---------------------------//
		
		String msg=driver.findElement(By.xpath("//a[normalize-space()='shopping cart']")).getText();
		Assert.assertEquals(text,msg);
		Reporter.log("NAVIGATED TO PRODUCT PAGE",true);
		Reporter.log("PRODUCT HAS BE ADDED TO CART SUCCESSFULLY", true);
		
	}

}
