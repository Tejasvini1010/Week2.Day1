package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Tejasvini");
		driver.findElement(By.name("lastname")).sendKeys("Reddipalli");
		driver.findElement(By.name("reg_email__")).sendKeys("tejasviniharish@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("day")).sendKeys("10");
		driver.findElement(By.id("month")).sendKeys("Oct");
		driver.findElement(By.id("year")).sendKeys("1993");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.name("websubmit")).click();
	}

}
