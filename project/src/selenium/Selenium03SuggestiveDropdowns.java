package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium03SuggestiveDropdowns {

	public static void main(String[] args) {

		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\ngetaneh\\Desktop\\selenium\\Chrome exec\\chromedriver.exe");
		  
		  // Create WebDriver Object 
		  WebDriver driver = new ChromeDriver();
		  
		  // Browse mytrip.com 
		  driver.get("https://www.makemytrip.com/");
		  
		  // Maximize windows 
		  driver.manage().window().maximize();
		  
		  // Click on from to enable the from dropdown
		  driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		  
		  // Clear from dropdown
		  driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
		  
		  // Search for mum/ Mumbai
		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		  
		  // Go down to the dropdown suggestion list
		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.
		  ARROW_DOWN);
		  
		  // Hit enter from the keyboard
		  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.
		  ENTER);
		  
		  // Search for Che/ Chennai
		  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Che");
		  
		  // Hit enter from the keyboard
		  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.
		  ENTER);
		  
		  // Go down to the dropdown suggestion list
		  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.
		  ARROW_DOWN);
		  
		  // Hit enter from the keyboard
		  driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.
		  ENTER);
		  
		  //driver.close();
		 
		
		
		/*********************************************Refactor the above Code for the duplicate elements ********************************************************************/
		

	}

}
