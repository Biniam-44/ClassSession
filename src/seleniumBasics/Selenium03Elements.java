package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium03Elements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nebiy\\OneDrive\\Desktop\\ChromeDrive\\chromedriver.exe");
		
		// We are creating a WebDriver object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		/********************************** Static Drop downs **************************************/
		
		Select s = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
		
		s.selectByValue("USD");
		
		s.selectByIndex(2);
		
		s.selectByVisibleText("Select");
		
		/********************************** Dynamic Drop Downs ***************************************/
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[9]/a")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[2]/a")).click();
		
		/********************************* Calendars *************************************************/
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.className("ui-state-highlight")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
		System.out.println("Return Date field value is " + driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		
		/********************************* DropDown  *****************************************************/
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		
		se.selectByVisibleText("3");
		
		Select sec = new Select (driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		
		sec.selectByIndex(4);
		
		
		/********************************** Checkbox ***********************************/

		System.out.println("The check box value is " + driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
		System.out.println("The check box value is " + driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		System.out.println("Round Trip value is " + driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		
		System.out.println("Round Trip value is " +  driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).isSelected());

	}

}
