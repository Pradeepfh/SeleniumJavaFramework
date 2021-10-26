package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathApproches {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win10\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//a[@class= 'vdicon']")).click();
		//driver.findElement(By.xpath("//a[@class='vdicon']")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Rediffmail')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Money')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Trends')]")).click();
		
	}

}
