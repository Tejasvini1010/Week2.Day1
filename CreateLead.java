package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
	//	driver.close();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//	WebElement webUser = driver.findElement(By.id("username"));
	//	webUser.sendKeys("demosalesmanager");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title1 = "My Home | opentaps CRM";
		String hometitle = driver.getTitle();
		if (title1.equals(hometitle))
			System.out.println("In home page");
		else
			System.out.println("Not in home page");
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tejasvini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Reddipalli");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/10/1993");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Teju");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Harish");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Insurance");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Ticker");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Just for testing purpose");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Please stay safe");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("61");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("6000");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tejasvini1010@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9003214295");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Me");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ani");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("address");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600061");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("110");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Ani");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address2");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("110");
		
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpdwn1 = new Select(drop1);
		drpdwn1.selectByIndex(1);
		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpdwn2 = new Select(drop2);
		drpdwn2.selectByValue("CATRQ_ROADNTRACK");
		WebElement drop3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpdwn3 = new Select(drop3);
		drpdwn3.selectByIndex(8);
		WebElement drop4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpdwn4 = new Select(drop4);
		drpdwn4.selectByIndex(1);
		WebElement drop5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpdwn5 = new Select(drop5);
		drpdwn5.selectByValue("ARA - Argentinian Austral");
		WebElement drop6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpdwn6 = new Select(drop6);
		drpdwn6.selectByValue("California");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
	//	driver.close();
	}

}
