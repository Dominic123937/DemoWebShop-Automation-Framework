package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_07 extends BaseSuite {
	@Test
	public void TestCase_07() {
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Jewelry']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Create Your Own Jewelry']")).click();
		WebElement quantity=driver.findElement(By.id("addtocart_71_EnteredQuantity"));
		quantity.clear();
		quantity.sendKeys("20");
		boolean x = quantity.isDisplayed();
		Assert.assertEquals(x, true);	
		Reporter.log("PRODUCT QUANTITY HAS BEEN CHANGED",true);
	}

}
