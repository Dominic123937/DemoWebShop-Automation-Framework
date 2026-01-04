package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_06 extends BaseSuite {
	@Test
	public void TestCase_6() {
		String org="Shopping cart";
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Computers']")).click();
		driver.findElement(By.xpath("//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='14.1-inch Laptop']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']")).click();
		
		
		 driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
		 
		 WebElement drop = driver.findElement(By.xpath("//select[@id='CountryId']"));
		 Select sc = new Select(drop);
		 sc.selectByVisibleText("Brazil");
	String txt=	 driver.findElement(By.xpath("//h1[normalize-space()='Shopping cart']")).getText();
		 Assert.assertEquals(org, txt);
		 Reporter.log("DIRECTED TO SHPPING CART", true);
		 Reporter.log("ITEM COUNTRY DROPDOWN HAS BEEN SUCCESSFULLY CHANGED",true);
		 
	}

}
