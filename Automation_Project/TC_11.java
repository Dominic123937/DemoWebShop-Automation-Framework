package Automation_Project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_11  extends BaseSuite{
	@Test
	public void TestCase_11() {
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Apparel & Shoes']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Blue and green Sneaker']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-28']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		
		
		//---------- VALIDAION---------------//

		Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));
		Reporter.log("Checkout page opened successfully", true);


	}

}
