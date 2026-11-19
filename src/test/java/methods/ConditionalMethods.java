package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConditionalMethods {
	@Test
	void conditionalMethod() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// System.out.println(driver.getTitle());

		// isDisplayed() - returns the a boolean if the webelement is present or not

		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("Display status of the logo"+logo.isDisplayed());
		
		
		//isEnabled() is used for input box, checkbox, dropdown box, radio button to if these are enabled or not
		Boolean disp =  driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println("the submit is enabled"+disp);
		
		//isSelected() - used for input box, checkbox, dropdown box, radio button to if these are selected or not
		Boolean select =  driver.findElement(By.className("username")).isSelected();
		System.out.println(select); //false
		
		driver.close(); // closes the single browser window where ever the driver is focused.
		//driver.quit() // closes multiple browser window
	}
}
