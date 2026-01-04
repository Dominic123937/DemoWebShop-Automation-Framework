package Automation_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_19 extends BaseSuite{
	@Test
	public void TestCase_19() {
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Alert ref = driver.switchTo().alert();
	String txt=	ref.getText();
		ref.accept();
	if(txt.contains("search keyword")) {
		Reporter.log("ALERT HANDLED SUCCESSFULLY",true);
	}
	}

}
