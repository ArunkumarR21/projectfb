package fb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\fb1\\projectfb\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Arunb22@gmai.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File as = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(as);
		File des = new File ("C:\\Users\\Hp\\eclipse-workspace\\fb\\Screenshot\\fb.png");
		FileUtils.copyFile(as, des);
		Thread.sleep(7000);
		driver.findElement(By.className("_97w4")).click();
		
		
	} 

}
