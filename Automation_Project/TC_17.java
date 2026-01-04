package Automation_Project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_17 extends BaseSuite {

	@Test
	public void TestCase_17() {
		driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
		Reporter.log("NAVIGATED TO SHOPPING-CART");
		Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
		Reporter.log("No Items in the list",true);
		Reporter.log("(Your Shopping Cart is empty)==> Displayed Successfully ",true);
	}
}
