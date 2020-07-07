package Assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Ex1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("mohanraj@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Welcome@123");
		WebElement ss = driver.findElement(By.xpath("//input[@value='Log in']"));
		ss.click();
		System.out.println(ss.getAttribute("class"));
		byte[] ss1 = ss.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos = new FileOutputStream("Usericon1.png");
		fos.write(ss1);


	}

}
