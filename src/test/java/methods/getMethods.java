package methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getMethods {
	@Test
	void getMethod() {

		WebDriver driver = new ChromeDriver();
		// get() - opens the url in browser
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		// getTitle() - returns the current title
		System.out.println(driver.getTitle());

		// getCurrentUrl() - get current page url
		System.out.println(driver.getCurrentUrl());

		// getPageSource() - returns page source code
		// System.out.println(driver.getPageSource());

		// returns browser generated window id of single window
		String windowId = driver.getWindowHandle();
		System.out.println("windowId of current page is " + windowId);

		// returns browser generated window id of multiple windows that are open
		driver.findElement(By.linkText("A/B Testing")).click();
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("windowIds of pages is " + windowIds);

		driver.quit();

	}
}
