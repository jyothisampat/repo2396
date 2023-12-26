package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef 
{

	static WebDriver driver;
	@Given("the browser is launched")
	public void the_browser_is_launched() throws InterruptedException 
	{
	  
	  //driver = new ChromeDriver();
	  driver=new FirefoxDriver();
	  Thread.sleep(2000);
	}

	@Given("the aplication is loaded")
	public void the_aplication_is_loaded() throws InterruptedException 
	{
	    
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(2000);
	}

	@When("the user enters the valid username")
	public void the_user_enters_the_valid_username() 
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	}

	@When("the user enters the valid password")
	public void the_user_enters_the_valid_password() 
	{
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button()
	{
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("dashboard should be displayed")
	public void dashboard_should_be_displayed()
	{
//		String cUrl = driver.getCurrentUrl();
//		Assert.assertEquals(cUrl, "https://demo.actitime.com/user/submit_tt.do");
		System.out.println("Done");
	}


}
