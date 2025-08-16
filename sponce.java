package eval_16_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sponce {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.workday.com/en-us/company/latest/events-webinars/devcon.html?step=step1_default");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sponsorship")).click();

		driver.findElement(By.id("FirstName")).sendKeys("Rani");
		driver.findElement(By.id("LastName")).sendKeys("Agrawal");
		driver.findElement(By.id("Email")).sendKeys("agrawal2003r@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("Masai");
		
	
		Thread.sleep(2000);
		driver.quit();
	}

}
