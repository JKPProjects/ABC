package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import POM.FBHomepageLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class StepDefinition
{
	public WebDriver driver;
	public FBHomepageLogin loginpage;
	
	@Given("user open the browser")
	public void user_open_the_browser() 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
	    driver=new ChromeDriver(option);
	    loginpage=new FBHomepageLogin(driver);
	}

	@Given("user entered the url {string}")
	public void user_entered_the_url(String url)
	{
	   driver.get(url);
	}

	@When("user entered email as {string} and password as {string}")
	public void user_entered_email_as_and_password_as(String email, String password)
	{
	   
		loginpage.emailid(email);
		loginpage.passwordid(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button()
	{
	    
		loginpage.loginid();
	}

	@When("user validate the title of the webpage and title should be {string}")
	public void user_validate_the_title_of_the_webpage_and_title_should_be(String expected)
	{
	    String actual=driver.getTitle();
	    Assert.assertEquals(expected, actual,"Not matching");
	    System.out.println("Title is matching");
//	    driver.switchTo().alert().accept();
	  	
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException
	{
		loginpage.profileid();
		Thread.sleep(3000);
		loginpage.logoutid();
		driver.quit();
	}

}
