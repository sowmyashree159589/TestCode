

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
WebDriver driver;
By logout=By.id("Log Out");
public LogOut(WebDriver driver)
{
	this.driver=driver;
}
public void clickOnLogout()
{
	driver.findElement(logout).click();
}
}
