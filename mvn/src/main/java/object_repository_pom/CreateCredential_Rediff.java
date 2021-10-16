package object_repository_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCredential_Rediff {

	WebDriver localdriver;
	public  CreateCredential_Rediff(WebDriver driver)
	{
		this.localdriver = driver;
	}

	@FindBy(xpath="//input[@id='useremail']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='userpass']")
	public WebElement userpass;
	
	@FindBy(xpath="//input[@id='loginsubmit']")
	public WebElement submit;
	
	public void enteruser( String user) {
		username.sendKeys(user);
	}
	public void enterpass( String pass) {
		userpass.sendKeys(pass);
}
	public void elementClick() {
		submit.click();
}
}
