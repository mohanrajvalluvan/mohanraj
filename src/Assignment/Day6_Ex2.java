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
import org.testng.annotations.Test;

public class Day6_Ex2 {

	@Test(priority=1)
	public void verifyTitle() throws InterruptedException {

		// login method 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://magento.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "eCommerce Platforms | Best eCommerce Software for Selling Online | Magento";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();		
	}
	
	
}

