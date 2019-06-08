package pages;

import org.openqa.selenium.By;

import Base.TestBase;

public class Login extends TestBase{
	
	public static By login_btn=By.xpath("//a[text()='Login']");
	public static By mobileNumber_txt=By.id("l-mobile-number");
	public static By otp_btn=By.id("login-otp");
	public static By otp_txt=By.id("otpid");
	public static By verifyMobile_btn=By.xpath("//input[@data-type='login']");
	public static By alertClose=By.xpath("//div[text()='CLOSE']");
	public static By creditmantri_logo=By.xpath("//img[@src='/bundle/cm-logo.png']");
	
	
	public static void login(String mobile, String Otp) throws InterruptedException{
		
		driver.findElement(login_btn).click();
		Thread.sleep(2000);
		driver.findElement(mobileNumber_txt).sendKeys(mobile);
		Thread.sleep(2000);

		driver.findElement(otp_btn).click();
		Thread.sleep(2000);

		driver.findElement(otp_txt).sendKeys(Otp);
		Thread.sleep(2000);

		//driver.findElement(verifyMobile_btn).click();	
		Thread.sleep(5000);

	}

}
