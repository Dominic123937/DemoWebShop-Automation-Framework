package Automation_Project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_13 extends BaseSuite{
	@Test
	public void TestCase_13() {
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Digital downloads']")).click();
		driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div[1]/div[2]/h2[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-52']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Wishlist']")).click();
		boolean element=driver.findElement(By.xpath("//a[normalize-space()='Music 2']")).isDisplayed();
		
		Assert.assertEquals(element, true);
		Reporter.log("ELEMENT HAS BEEN ADDED TO WISHLIST",true);
	}

}
