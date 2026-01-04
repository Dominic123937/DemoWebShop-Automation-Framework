package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_05 extends BaseSuite {
	@Test
	public void TestCase() {
		String text = "shopping cart";
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Digital downloads']")).click();
	WebElement drop=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
	
	Select sc = new Select(drop);
	sc.selectByIndex(1);
	driver.findElement(By.xpath("//a[normalize-space()='3rd Album']")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-53']")).click();
	
	driver.navigate().back();
	
	driver.findElement(By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//h2[1]//a[1]")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-51']")).click();
	
	String msg=driver.findElement(By.xpath("//a[normalize-space()='shopping cart']")).getText();
	Assert.assertEquals(text,msg);

	Reporter.log(" MULTIPLE PRODUCTS HAS BE ADDED TO CART SUCCESSFULLY", true);
	}
	
}
