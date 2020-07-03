package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3_Ex3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//ul[@class= \"top-menu\"]/li[2]/a"))).perform();
		act.click(driver.findElement(By.xpath("//ul[@class= \"top-menu\"]/li[2]/ul/li[3]/a"))).perform();
		System.out.println("Navigated page : " + driver.getCurrentUrl());
		driver.close();

	}

}
