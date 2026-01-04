package Automation_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseSuite {
	public WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("bathu@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("a98c@tajM$Ya");
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	/*@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		System.out.println("LogOut successfully");
	}*/
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("CLOSED THE WEB BROWSER",true);
		driver.close();
	}
}
