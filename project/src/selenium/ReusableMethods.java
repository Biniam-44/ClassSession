package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethods {
	WebDriver driver = new ChromeDriver();
	
	public void IntitalizeDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ngetaneh\\Desktop\\selenium\\Chrome exec\\chromedriver.exe");
		
	}
	
	public void BrowseAndValidateGoogle() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ngetaneh\\Desktop\\selenium\\Chrome exec\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		// Method to get/ validate the Title of the website
		String title = driver.getTitle();
		System.out.println(title);

		// Method to get/ validate the current url of the website
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
