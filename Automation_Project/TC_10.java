package Automation_Project;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class TC_10 extends BaseSuite {
		@Test
		public void TestCase_10() {
		
			driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Computers']")).click();
			driver.findElement(By.xpath("//a[@title='Show products in category Accessories'][normalize-space()='Accessories']")).click();
			driver.findElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'TCP Instructor Led Training')]")).click();
			driver.findElement(By.id("add-to-cart-button-66")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
			driver.findElement(By.id("termsofservice")).click();
			driver.findElement(By.xpath("//button[@id='checkout']")).click();
			
			
			
			//---------- VALIDAION---------------//
		driver.navigate().back();
		String txt = driver.findElement(By.xpath("//h1[normalize-space()='Shopping cart']")).getText();
		Assert.assertEquals(txt, "Shopping cart");
		Reporter.log("SHOPPING CART PAGE IS DISPLAYED SUCCESSFULLY", true);

			
		}

	}

