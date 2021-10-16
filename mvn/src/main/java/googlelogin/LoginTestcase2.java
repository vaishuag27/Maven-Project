package googlelogin;


import org.testng.annotations.Test;

import googleacc.Signin_Unable_page;
import googleacc.Signin_email_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class LoginTestcase2 {
	
	//Signin_email_page emailpage;
	//Signin_pwd_page pwdpage;
	Signin_Unable_page signinunable;
	
	
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		
		Signin_email_page emailpage=new Signin_email_page(driver);
		
		PageFactory.initElements(driver, emailpage);
		
		emailpage.enteremailid("kamath");
		signinunable = emailpage.clickNext();
		
		Thread.sleep(5000);
		signinunable.clickTerms();

		System.out.println("End of code");
		
	}

}
