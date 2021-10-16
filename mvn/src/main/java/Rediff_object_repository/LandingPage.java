package Rediff_object_repository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver localdriver;
	public LandingPage(WebDriver driver)
	{
		this.localdriver = driver;
	}

	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public WebElement signin;

	
	public SigninPage SignInClick() {
		signin.click();
		SigninPage signinpage = new SigninPage(localdriver);
		PageFactory.initElements(localdriver, signinpage);
		return signinpage;
	}


	public void elementClickSignin() {
		// TODO Auto-generated method stub
		
	}
}
