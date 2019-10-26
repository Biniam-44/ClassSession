package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01Basics {

	
	// Main method is the first place where the code execution starts
	public static void main(String[] args) {
		
		// We use this method to invoke the chrome browser from the path we saved the chrome executable file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDrive\\chromedriver.exe");
		
		
		// We are creating a WebDriver object
		WebDriver driver = new ChromeDriver();
		
	
		// It will redirect us to the website we need
		driver.get("https://www.gmail.com/");
	
		// It will get us the title of the website we're browsing
		System.out.println(driver.getTitle());
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// It will get the url of the website that we're browsing
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// We don't need to crate an object for methods inside the class
		Dagem();
		
		// We have to crate an object if the method is outside the class
		Name nameObject = new Name();
		nameObject.Rediet();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		// Will go back to the previous website
		driver.navigate().back();
		
		// It will wait for 10 seconds 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		// It will go to the next url we browsed 
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		// Will close the current browser opened by selenium
		//driver.close();
		
		// Will close all the browsers opened by selenium
		driver.quit();
		
		

	}
	
	public static void Dagem() {
		
		System.out.println("My name is dagem");
	}

}
