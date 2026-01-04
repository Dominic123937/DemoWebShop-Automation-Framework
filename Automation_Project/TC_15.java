package Automation_Project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_15 extends BaseSuite{
	@Test
	public void TestCase_15() {
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Books']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Copy of Computing and Internet EX']")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		driver.findElement(By.xpath("//input[@title='Remove']")).click();
		String text=driver.findElement(By.xpath("//div[@class='page-body']")).getText();
		Assert.assertEquals(text, "You have no items to compare.");
		Reporter.log("PRODUCT HAS BEEN REMOVED SUCCESSFULLY ADDED TO COMPARE PRODUCTS",true);
	}

}
