package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// Create Chrome Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ngetaneh\\Desktop\\selenium\\Chrome exec\\chromedriver.exe");
		
		// Create WebDriver Object
		WebDriver driver = new ChromeDriver();
		
		// Go to the URL that we need to test
		driver.get("https://google.com");
		
		// Method to get/ validate the Title of the website
		String title = driver.getTitle();
		System.out.println(title);
		
		// Method to get/ validate the current url of the website
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// Method to get the pagesource of our application
		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		// Go to yahoo.com
		driver.get("https://yahoo.com");
		
		// Class Work Get the title,URL and print it on the console
		String yahooTitle = driver.getTitle();
		System.out.println(yahooTitle);
		
		String yahooUrl = driver.getCurrentUrl();
		System.out.println(yahooUrl);
		
		// Method to get back to the previous site
		driver.navigate().back();
		
		// To implicitly wait for some amount of time 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// Class Work Get the title,URL and print it on the console
		String googleTitle = driver.getTitle();
		System.out.println(googleTitle);

		String googleUrl = driver.getCurrentUrl();
		System.out.println(googleUrl);
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// MEthod used to close current browser
		driver.close();
		
		//Method used to close all open browsers using selenium 
		driver.quit();
		
		

	}

}
