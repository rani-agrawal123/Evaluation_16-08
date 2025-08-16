package eval_16_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class register {

	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void visiteSite() {
         driver.get("https://www.workday.com/en-us/company/latest/events-webinars/devcon.html?step=step1_default");
		
		 driver.manage().window().maximize();
		
	}
	@Test
	void title() throws InterruptedException {
        WebElement title = driver.findElement(By.xpath("//div[@class='logo-wrapper']"));
		
		System.out.println("Title: "+title.isDisplayed());	
		
//		Thread.sleep(3000);
//		driver.quit();
	}
	
	@Test
	void watch(){
		driver.findElement(By.linkText("Watch On Demand")).click();		
		
		driver.get("https://event.workday.com/flow/workday/devcon25/WorkdayDevConReg/login");
	}
	
	@Test
	void register() throws InterruptedException {
		driver.get("https://event.workday.com/flow/workday/devcon25/WorkdayDevConReg/login");
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
//		Thread.sleep(2000);
//		driver.quit();
	}
	
	@Test
	void fillDetail() throws InterruptedException{
		driver.get("https://event.workday.com/flow/workday/devcon25/WorkdayDevConReg/createaccount");
		driver.findElement(By.id("formAttendee-firstname")).sendKeys("Rani");
		driver.findElement(By.id("formAttendee-lastname")).sendKeys("Agrawal");
		driver.findElement(By.id("formAttendee-email")).sendKeys("agrawal2003r@gmail.com");
		driver.findElement(By.id("formAttendee-jobtitle")).sendKeys("Fresher");
		driver.findElement(By.id("formAttendee-companyname")).sendKeys("Masai");
		
		
		driver.findElement(By.id("formAttendee-countryId")).click();
		
		driver.findElement(By.id("password")).sendKeys("Rani@135790");
		
		driver.findElement(By.id("confirmpassword")).sendKeys("Rani@135790");
		
		driver.findElement(By.id("wf-btn-submit")).click();	
		Thread.sleep(1000);
		driver.get("https://event.workday.com/flow/workday/devcon25/WorkdayDevConReg/page/personaldomainerror");
		
		
		Thread.sleep(4000);
		driver.quit();
		
	}
	
}
