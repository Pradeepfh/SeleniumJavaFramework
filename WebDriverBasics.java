package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverBasics{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Win10\\Downloads\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.youtube.com/");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
