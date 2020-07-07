package Assignment;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day6_Ex3 {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://demowebshop.tricents.com");
		}
	

	@Test(priority=1)
	public void verifyTitle() throws InterruptedException {

		String actualTitle = driver.getTitle();
		String expectedTitle = "HugeDomains.com - TriCents.com is for sale (Tri Cents)";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();		
	}
	
	
}

