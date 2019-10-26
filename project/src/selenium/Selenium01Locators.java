package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01Locators {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ngetaneh\\Desktop\\selenium\\Chrome exec\\chromedriver.exe");
		
		// Create WebDriver Object
		WebDriver driver = new ChromeDriver();
		driver.get("http://eaapp.somee.com/");
		
		// To find an element by ID
		driver.findElement(By.id("registerLink")).click();
		
		// To find an element by Link text
		driver.findElement(By.linkText("Login")).click();
		
		// To find an element by Class Name
		driver.findElement(By.className("form-control")).sendKeys("username");
		
		// To find an element by Name
		driver.findElement(By.name("Password")).sendKeys("password");
		
		// To find an element by xpath
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
		
		// To find an element by CSS
		driver.findElement(By.cssSelector("#loginForm > form > div:nth-child(5) > div > input")).click();

	}

}
