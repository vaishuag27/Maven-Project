package rediff_tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Rediff_object_repository.LandingPage;
import Rediff_object_repository.PortfolioPage;
import Rediff_object_repository.SigninPage;



public class signin_createpf {
	
	@Test
	public void signin() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//src//test//resources//drivers//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		
		 LandingPage landingpage = new LandingPage(driver);
		 PageFactory.initElements(driver,landingpage );
		 
		 SigninPage signinpage ;
		 signinpage= landingpage.SignInClick();
		 
		 signinpage.enteremail("vgadewar27@gmail.com");
		 signinpage.enterpassword("Vgadewar27");
		 
		 PortfolioPage pfpage;
		 pfpage=signinpage.SignInClick();
		 pfpage.clickcreatePF();
		 Thread.sleep(3000);
		 pfpage.createPFButton();
	}

}
