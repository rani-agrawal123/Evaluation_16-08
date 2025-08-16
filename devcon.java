package eval_16_08_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class devcon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.workday.com/en-us/company/latest/events-webinars/devcon.html?step=step1_default");
		
		driver.manage().window().maximize();
		
		
//		Header Title
		WebElement title = driver.findElement(By.xpath("//div[@class='logo-wrapper']"));
		
		System.out.println("Title: "+title.isDisplayed());	
		
		Thread.sleep(3000);
		driver.quit();
	}

}
