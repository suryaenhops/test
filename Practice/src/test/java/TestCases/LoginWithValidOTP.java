package TestCases;
import org.testng.annotations.Test;
import Base.TestBase;
import pages.Login;

public class LoginWithValidOTP  extends TestBase{
	
	
	@Test
	public static void loginTest() throws InterruptedException {
		Login.login("9618840516","11111");
		
	}
	
	
	

}
