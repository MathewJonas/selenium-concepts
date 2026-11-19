package methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// navigate().to - accepts url in String and in url object format
		//driver.get("https://the-internet.herokuapp.com/");
		
			URL myurl = new URL("https://the-internet.herokuapp.com/");
			driver.navigate().to(myurl);
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			
			driver.navigate().back();
			System.out.println(driver.getCurrentUrl()); //"https://the-internet.herokuapp.com/"
			
			driver.navigate().forward();
			System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/
			
			driver.navigate().refresh();  //refresh the web page
	
		driver.manage().window().maximize();

	}

}
