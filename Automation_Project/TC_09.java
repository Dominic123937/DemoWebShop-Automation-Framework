package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_09  extends BaseSuite{
	@Test
	public void TestCase_09() {
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Jewelry']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Black & White Diamond Heart']")).click();
		driver.findElement(By.id("add-to-cart-button-14")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
		
	
		driver.findElement(By.id("checkout")).click();
		
		boolean caution = driver.findElement(By.xpath("//div[@id='terms-of-service-warning-box']")).isDisplayed();
		Assert.assertEquals(caution, true);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")).click();
		Reporter.log("CAUTION MESSAGE HAS BEEN CLOSED");
	}

}
