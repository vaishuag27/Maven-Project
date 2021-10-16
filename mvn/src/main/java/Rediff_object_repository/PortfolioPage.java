package Rediff_object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortfolioPage {

	WebDriver localdriver;
	public PortfolioPage (WebDriver driver)
	{
		this.localdriver = driver;
	}
	
	@FindBy(xpath="//a[@id='createPortfolio']")
	public WebElement createPFButton;
	
	public void clickcreatePF() {
		createPFButton.click();
	}

	public void createPFButton() {
		// TODO Auto-generated method stub
		
	}
	
}
