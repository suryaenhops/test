package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void startBrowser(){		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.creditmantri.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	
	@AfterTest
	public static void closedDriver(){
		driver.quit();
	}

}
