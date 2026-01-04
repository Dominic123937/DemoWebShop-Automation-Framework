package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_18 extends BaseSuite{
	@Test
	public void TestCase_18() {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("//a[normalize-space()='About us']")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("about-us"));
		Reporter.log("NAVIGATED TO ABOUT US PAGE SUCCESSFULLY", true);

		driver.navigate().back();
		//------------------ CONTACT-US-----------------------//
		
		/*driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();
		boolean textfield=driver.findElement(By.id("FullName")).isDisplayed();
		Assert.assertEquals(textfield, true);
		Reporter.log("CONTACT US PAGE IS NAVIGATED SUCCESSFULLY", true); */
	}

}
