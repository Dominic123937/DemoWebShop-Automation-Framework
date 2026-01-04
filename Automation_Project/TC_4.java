package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_4 extends BaseSuite {
	
	@Test
	public void Testcase_4() {
		String act_txt="Electronics";
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Electronics']")).click();
		driver.findElement(By.xpath("//a[@title='Show products in category Camera, photo'][normalize-space()='Camera, photo']")).click();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)");
		driver.navigate().back();
	String txt=	 driver.findElement(By.xpath("//h1[normalize-space()='Electronics']")).getText();
		 Assert.assertEquals(act_txt, txt);
		 Reporter.log("ELECTRONICS PAGE GOT LOADED SUCCESFULY",true);
		 
	}

}
