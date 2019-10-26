package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium04SuggestiveDropdownsRefactor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ngetaneh\\Desktop\\selenium\\Chrome exec\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// Browse mytrip.com
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		
		fromCity.click();
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		
		from.clear();
		from.sendKeys("mum");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		WebElement destination =  driver.findElement(By.xpath("//input[@placeholder='To']"));
		
		destination.sendKeys("Che");
		destination.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
	}

}
