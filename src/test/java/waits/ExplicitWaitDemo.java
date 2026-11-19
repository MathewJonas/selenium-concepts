package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {
	@Test
	void waited() {
	
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
   WebElement usrname= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
   usrname.sendKeys("Admin");
   
   WebElement pwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
   pwd.sendKeys("admin123");
   
   WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
   login.click();
   
   //driver.close();

}
}
