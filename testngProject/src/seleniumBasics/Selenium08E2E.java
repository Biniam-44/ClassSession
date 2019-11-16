package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium08E2E {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDrive\\chromedriver.exe");
		
		// We are creating a WebDriver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://eaapp.somee.com/");
		
		WebElement register = driver.findElement(By.linkText("Register"));

		register.click();
		
		WebElement registerUserName = driver.findElement(By.xpath("//input[@id='UserName']"));
		WebElement registerPwd = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement registerConfirmPwd = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		WebElement registerEmail = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement registerBtn = driver.findElement(By.xpath("//input[@class='btn btn-default']"));
		
		registerUserName.sendKeys("technotest");
		String userName = registerUserName.getAttribute("value");
		
		registerPwd.sendKeys("Techno@123");
		registerConfirmPwd.sendKeys("Techno@123");
		
		registerEmail.sendKeys("technotest@technotest.com");
		String email = registerEmail.getAttribute("value");
		registerBtn.click();
		
		
		
		
		  WebElement userNameExistsError = driver.findElement(By.
		  xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/ul[1]/li[1]"));
		  WebElement emailExistsError = driver.findElement(By.
		  xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/ul[1]/li[2]"
		  )); String unValidation = userNameExistsError.getText();
		  
		  String emailValidation = emailExistsError.getText();
		  
		  
		  System.out.println("User name is " + userName);
		  
		  System.out.println("Email is " + email); Assert.assertEquals(unValidation,
		  "Name " + userName + " is already taken.");
		  Assert.assertEquals(emailValidation, "Email '" + email +
		  "' is already taken.");
		 
		
		

	}

}
