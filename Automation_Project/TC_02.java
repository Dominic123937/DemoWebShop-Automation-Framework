package Automation_Project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_02 extends BaseSuite {
	@Test
	public void TestCase_2() {
		String info = "Build your own cheap computer";
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Computers']")).click();
		driver.findElement(By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Build your own cheap computer']")).click();
		String text = driver.findElement(By.xpath("//h1[normalize-space()='Build your own cheap computer']")).getText();
		Assert.assertEquals(info, text);
		Reporter.log("CLICKED ON PRODUCT PAGE");
		Reporter.log("PRODUCT PAGE IS DISPLAYED",true);
		
	}
}
