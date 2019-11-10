package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium05SuggestiveDDRefactor {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDrive\\chromedriver.exe");
		
		// We are creating a WebDriver object
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		WebElement fromDropDown = driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity inactiveWidget')]//label"));
		fromDropDown.click();
		
		WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromCity.sendKeys("newyork");
		fromCity.sendKeys(Keys.ARROW_DOWN);
		fromCity.sendKeys(Keys.ENTER);
		
		WebElement toCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toCity.sendKeys("dfw");
		toCity.sendKeys(Keys.ARROW_DOWN);
		toCity.sendKeys(Keys.ENTER);

	}

}
