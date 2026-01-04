package Automation_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_12 extends BaseSuite{
	@Test
	public void Testcase_12() {
		WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		search.sendKeys("SHOES");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	String txt=	driver.findElement(By.xpath("//strong[@class='result']")).getText();
	Assert.assertEquals(txt.equals("No products were found that matched your criteria."),true);
	Reporter.log("NO PRODUCTS WERE FOUND",true);
	}

}
