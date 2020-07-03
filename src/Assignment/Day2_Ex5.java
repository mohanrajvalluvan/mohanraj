package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2_Ex5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		System.out.println("Home page : " + driver.getTitle());
		driver.findElement(By.name("user_login")).sendKeys("Raj");
		driver.findElement(By.name("user_password")).sendKeys("pass$123");
		driver.findElement(By.name("first_name")).sendKeys("Mohanraj");
		driver.findElement(By.name("last_name")).sendKeys("Valluvan");
		driver.findElement(By.name("email")).sendKeys("mohanraj@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("3/22,Raj House");
		driver.findElement(By.name("city")).sendKeys("Salem");
		Select sel = new Select(driver.findElement(By.name("state_id")));
		sel.selectByIndex(0); // no dropdown value exist
		driver.findElement(By.name("zip")).sendKeys("63601");
		Select sel1 = new Select(driver.findElement(By.name("country_id")));
		sel1.selectByIndex(0); // no dropdown value exist
		Select sel2 = new Select(driver.findElement(By.name("gender_id")));
		sel2.selectByIndex(0); // no dropdown value exist
		driver.findElement(By.name("Insert")).click();

	}

}
