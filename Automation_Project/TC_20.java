package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_20 extends BaseSuite{
	@Test
	public void TestCase_20() {
		driver.findElement(By.id("small-searchterms")).sendKeys("SKY",Keys.ENTER);
		driver.findElement(By.id("As")).click();
		driver.findElement(By.id("Pf")).sendKeys("1000");
		driver.findElement(By.id("Pt")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@class='button-1 search-button']")).click();
		
		String txt = driver.findElement(By.xpath("//strong[@class='result']")).getText();
		if(txt.contains("matched your criteria.")) {
			Reporter.log("SEARCHED A PRODUCT", true);
			Reporter.log("THE SEARCHED PRODUCT IS NOT AVAILABLE",true);
		}
	}

}
