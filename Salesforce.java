package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("UserFirstName")).sendKeys("Tejasvini");
		driver.findElement(By.name("UserLastName")).sendKeys("Reddipalli");
		driver.findElement(By.name("UserEmail")).sendKeys("abc@gmail.com");
		
		WebElement drop1 = driver.findElement(By.name("UserTitle"));
		Select drpdwn1 = new Select(drop1);
		drpdwn1.selectByValue("Developer");
		
		driver.findElement(By.name("CompanyName")).sendKeys("ABC");
		
		WebElement drop2 = driver.findElement(By.name("CompanyEmployees"));
		Select drpdwn2 = new Select(drop2);
		drpdwn2.selectByValue("1600");
		
		driver.findElement(By.name("UserPhone")).sendKeys("9876543210");
		driver.findElement(By.className("checkbox-ui")).click();
		driver.findElement(By.name("start my free trial")).click();
	}

}
