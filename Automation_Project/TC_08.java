package Automation_Project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_08 extends BaseSuite{
	
	@Test
	public void TestCase_08() {
		
		String org="Email a friend";
		
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Gift Cards']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='$5 Virtual Gift Card']")).click();
		
		//-------------------TO EMAIL TO ANOTHER PERSON-----------------------//
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
	String text=	driver.findElement(By.xpath("//h1[normalize-space()='Email a friend']")).getText();
	Assert.assertEquals(text, org);
	Reporter.log("EMAILED TO FRIEND SUCCESSFULLY",true);
	}

}
