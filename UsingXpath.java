package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingXpath {

	public static void main(String[] args) {
		
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Win10\\Downloads\\Driver\\chromedriver.exe");
	
			
			//WebDriver wd = new ChromeDriver();
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Win10\\Downloads\\Driver\\geckodriver.exe");
			WebDriver wd = new FirefoxDriver();
		    wd.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk-21%26ascsubtag%3D_k_Cj0KCQjwpf2IBhDkARIsAGVo0D0Kgr0t3b4Po1X9q2zRZgo8MlhI8bvPFnkNX5707iYiAPm2bjcQzEwaAgZEEALw_wcB_k_%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjwpf2IBhDkARIsAGVo0D0Kgr0t3b4Po1X9q2zRZgo8MlhI8bvPFnkNX5707iYiAPm2bjcQzEwaAgZEEALw_wcB%26network%3Dg%26ref_%3Dnav_ya_signin&prevRID=MGHNZQVQG9XX37ADHB50&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//xpath:
			//wd.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Francis");
			//wd.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9167314452");
			/*wd.findElement(By.xpath("secondaryLoginClaim")).sendKeys("pradeephandi");
			wd.findElement(By.xpath("//input[@id='continue']")).click();*/
			
//className:		
				
			//wd.findElement(By.className("a-input-text a-span12 auth-autofocus auth-required-field")).sendKeys("Pramod");
			//wd.findElement(By.className("a-input-text a-span12 a-spacing-micro auth-required-field auth-require-phone-validation")).sendKeys("Handiavar");
			/*wd.findElement(By.className("a-input-text a-span12 auth-require-email-validaton")).sendKeys("pramod@gmial");
			System.out.println(wd.getTitle());*/
			
//cssSelector:
		    
			wd.findElement(By.cssSelector("#ap_customer_name")).sendKeys("Francis");
			wd.findElement(By.cssSelector("#ap_phone_number")).sendKeys("9845317522");
	
	
	}

}
