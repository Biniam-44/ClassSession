package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDrive\\chromedriver.exe");
		
		// We are creating a WebDriver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://eaapp.somee.com/");
		
		/* Different ways to find a locators 
		    By Id
		    By Link Text
		    By Name
		    By class name
		    By Xpath
		    By css */
		
		// We're finding an element by ID
		driver.findElement(By.id("registerLink")).click();
		
		// We're finding an element by Link Text
		driver.findElement(By.linkText("Login")).click();
		
		// We're finding an element by Name
		driver.findElement(By.name("UserName")).sendKeys("My user");
		
		// We're finding an element by XPath
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("My password");
		
		//html/body/div[2]/div/div[2]/section/form/div[1]/div/input
		
		// We're finding an element by CssSelector
		driver.findElement(By.cssSelector("#loginForm > form > div:nth-child(5) > div > input")).click();

	}

}
