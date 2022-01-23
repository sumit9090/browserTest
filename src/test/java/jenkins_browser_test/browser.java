package jenkins_browser_test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class browser {
	
	@Test
	public void invokeTest()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromepath\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.out.println("testing");
		driver.get("https://google.com");
	}
	

}
