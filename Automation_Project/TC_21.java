package Automation_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_21 extends BaseSuite {
	@Test
	public void TestCase_21() {
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("//a[normalize-space()='News']")).click();
		driver.findElement(By.id("newsletter-email")).sendKeys("bathu@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(
		        By.id("newsletter-result-block"), "Thank you"));
		String msg = driver.findElement(By.id("newsletter-result-block")).getText();

		Assert.assertTrue(
		        msg.contains("Thank you") || msg.contains("already subscribed"),
		        "Newsletter message not displayed");

		Reporter.log("SUBCRIBED TO THE NEWSETTLER IN DEMO WEBSHOP", true);



	
	}

}
