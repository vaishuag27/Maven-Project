package mvn.mvn;




import googleacc.Signin_Unable_page;
import googleacc.Signin_email_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Rediff_object_repository.LandingPage;
import object_repository_pom.CreateCredential_Rediff;
import object_repository_pom.CreatePortfolio_Rediff;





public class LoginTestRediffMoney {
	
	//Signin_email_page emailpage;
	//Signin_pwd_page pwdpage;
	Signin_Unable_page signinunable;
	
	
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/");
		
			driver.manage().window().maximize();
			Thread.sleep(3000);
		
		
		//***************************Signin page**************************************
		
	LandingPage signinpage = new LandingPage(driver);
	PageFactory.initElements(driver,signinpage);
		
	signinpage.elementClickSignin();
	Thread.sleep(3000);
		
		
	//***************************************Create Credentials**************************
	
	 CreateCredential_Rediff credential = new  CreateCredential_Rediff(driver);
	 PageFactory.initElements(driver,credential);
	 
	 credential.enteruser("Vgadewar27@gmail.com");
	 credential.enterpass("Vgadewar27@");
	 credential.elementClick();
	 Thread.sleep(3000);
	 
	//***************************************Create portfolio**************************
	 CreatePortfolio_Rediff crtPortF = new  CreatePortfolio_Rediff(driver);
	 PageFactory.initElements(driver,crtPortF);
	 crtPortF.elementClick();
	 crtPortF.elementClear();
	
      crtPortF.elementAdd("My PF");
	  crtPortF.crtPfButton();
	
	driver.quit();
	}
	
	
}

