package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Selenium06Assertion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDrive\\chromedriver.exe");
		
		// We are creating a WebDriver object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement roundTrip = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		
		roundTrip.click();
		
		Assert.assertEquals(true, roundTrip.isSelected());
		
		WebElement oneWay = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']"));
		
		Assert.assertEquals(false, oneWay.isSelected());
		
		WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		Select s = new Select(currency);
		
		s.selectByIndex(2);
		
		WebElement value = s.getFirstSelectedOption();
		
		String currencyValue = value.getText();
		
		Assert.assertEquals(currencyValue, "AED");
		
		WebElement travlersCount = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		
		travlersCount.click();
		
		WebElement adultCount = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		WebElement childCount = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		
		Select se = new Select(adultCount);
		
		se.selectByVisibleText("6");
		
		Select sec = new Select(childCount);
		
		sec.selectByVisibleText("3");
		
		String travlers = travlersCount.getText();
		
		Assert.assertEquals(travlers, "6 Adult, 3 Child");
		
		System.out.println("Test Completed!");
		
		

	}

}
