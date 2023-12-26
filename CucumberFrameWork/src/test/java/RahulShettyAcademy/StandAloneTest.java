package RahulShettyAcademy;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class StandAloneTest 
{
	public static void main(String[] args) 
	{
//		WebDriverManager.chromedriver().create();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().create();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
	}

}
