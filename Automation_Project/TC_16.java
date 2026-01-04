package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_16 extends BaseSuite{
	@Test
	public void TestCase_16() {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("//a[normalize-space()='My account']")).click();
		
		
		Assert.assertTrue(driver.getCurrentUrl().contains("customer"));
		Reporter.log("ACCOUNT PAGE OPENED SUCCESSFULLY", true);



		Reporter.log("ENTERED INTO ACCOUNT PAGE",true);
		Reporter.log("DETAILS ARE DISPLAYED",true);
	}
}
