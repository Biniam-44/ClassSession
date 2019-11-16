package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class Selenium07Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDrive\\chromedriver.exe");
		
		
		// We are creating a WebDriver object
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		
		  WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		  
		  alert.click(); 
		  Alert switchAlert = driver.switchTo().alert();
		  System.out.println(switchAlert.getText()); switchAlert.accept();
		 
		
		/*
		 * WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		 * 
		 * name.sendKeys("Nebyou");
		 * 
		 * 
		 * 
		 * WebElement confirmAlert =
		 * driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		 * 
		 * confirmAlert.click(); Alert switchAlert = driver.switchTo().alert();
		 * 
		 * String alertMessage = confirmAlert.getText();
		 * 
		 * //Assert.assertEquals(alertMessage,
		 * "Hello Nebyou, Are you sure you want to confirm?"); Thread.sleep(10000);
		 * 
		 * switchAlert.accept();
		 */
	}

}
