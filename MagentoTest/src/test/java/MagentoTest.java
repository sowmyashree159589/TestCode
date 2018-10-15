

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class MagentoTest {
	@Test
public void posCredentials( )throws Exception {
	
	String url="http://www.magento.com";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	Main m=new Main(driver);
	m.clickOnMyAcc();
	Thread.sleep(3000);
	Login login=new Login(driver);
	login.typeEmail("sucheendra.abc@gmail.com");
	login.typePwd("Welcome123");
	login.clickOnLogin();
	Thread.sleep(3000);
	LogOut logout=new LogOut(driver);
	logout.clickOnLogout();
	
	driver.quit();
	
}
}
