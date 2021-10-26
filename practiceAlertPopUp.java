package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win10\\Downloads\\Driver\\chromedriver.exe");
		
		WebDriver a = new ChromeDriver();
		a.get("https://mail.rediff.com/cgi-bin/login.cgi");
		a.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert al = a.switchTo().alert();
		System.out.println("alert.getText()");
		String s = al.getText();
		if(s.equals("Please enter a valid user name")) {
			System.out.println("Correct msg");
		}
			else {System.out.println("in correct msg");
			}
		Thread.sleep(500);
		al.accept();
	
	}

}
