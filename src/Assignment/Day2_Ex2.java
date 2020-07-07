package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Ex2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 							
		driver.manage().window().maximize(); 							
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,30); 
		
		driver.get("http://examples.codecharge.com/Store/Default.php");
		String actualTitle = driver.getTitle();	
		String expectedTitle = "Online Bookstore";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");

	}

	
}
