package eval_16_08_25;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.workday.com/en-us/company/latest/events-webinars/devcon.html?step=step1_default");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
			File target = new File("C:\\Users\\rania\\OneDrive\\Desktop\\evalSS\\evl.png");
			FileUtils.copyFile(sourcefile, target);

	}

}
