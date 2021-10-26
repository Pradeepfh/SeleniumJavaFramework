package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win10\\Downloads\\Driver\\chromedriver.exe");
		WebDriver dd = new ChromeDriver();
		
		dd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		dd.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert aa= dd.switchTo().alert();
		System.out.println(aa.getText());
		String s = aa.getText();
		
		if(s.equals("Enter your email or mobile phone number")){
			System.out.println("correct msg");
		}
		else {System.out.println("incorrect msg");
		
		}
		Thread.sleep(500);
		aa.accept();
		

	}

}
