package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHomepageLogin
{
	public WebDriver driver;
	
	@FindBy(name="email")
	private WebElement emaillink;
	
	@FindBy(id="pass")
	private WebElement passwordlink;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginlink;
	
	@FindBy(xpath = "(//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'])[1]")
	private WebElement profileLink;
	
	@FindBy(xpath = "//span[text()='Log Out']")
	private WebElement logoutLink;
	
	public FBHomepageLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void emailid(String email)
	{
		emaillink.sendKeys(email);
	}
	public void passwordid(String password)
	{
		passwordlink.sendKeys(password);
	}
	public void loginid() 
	{
		loginlink.click();
	}
	public void profileid() 
	{
		profileLink.click();
	}
	public void logoutid() 
	{
		logoutLink.click();
	}

}
