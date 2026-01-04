package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01 extends BaseSuite {
	
	@Test
	public void Books() {
		String title="Books";
	  driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Books']")).click();
	 String actual = driver.findElement(By.xpath("//h1[normalize-space()='Books']")).getText();
	 JavascriptExecutor js =(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,400)");
	 
	 driver.findElement(By.xpath("//a[@title='Show details for Health Book']")).click();
	 driver.navigate().back();
	
	 Assert.assertEquals(title, actual);
	 Reporter.log("BOOKS PAGE DISPLAYED",true);
	
	
	}

}
