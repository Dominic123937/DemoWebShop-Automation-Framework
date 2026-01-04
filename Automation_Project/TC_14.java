package Automation_Project;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_14 extends BaseSuite{
	@Test
	public void TestCase_14() {
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Books']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Fiction']")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		String text=driver.findElement(By.xpath("//h1[normalize-space()='Compare products']")).getText();
		Assert.assertEquals(text, "Compare products");
		Reporter.log("PRODUCT HAS BEEN SUCCESSFULLY ADDED TO COMPARE PRODUCTS",true);
	}

}

