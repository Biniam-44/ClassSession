package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium02StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ngetaneh\\Desktop\\selenium\\Chrome exec\\chromedriver.exe");

		// Create WebDriver Object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		/****************************Static Drop Downs  ***********************************/
		
		// We will use the select class to select a static drop down value
		// We will know if the drop down is a static dropdown if it have a select attribute on the element 
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
		
		// We can select the drop down by value
		s.selectByValue("USD");
		
		// We can select the drop down by Index
		s.selectByIndex(2);
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000L);
		
		Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
		
		s1.selectByValue("5");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		/****************************Dynamic Drop Downs  ***********************************/
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();
		
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Hyderabad (HYD)')]")).click();
		
		
		/************************* Calendars ******************************************/
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		
		Thread.sleep(1000L);
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		
		/************************* CheckBoxes ******************************************/
		
		
		// input[type='checkbox'] the common css for the checkboxes
		
		System.out.println("Check box value is : " + driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		System.out.println("Check box value is : " + driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		System.out.println("Check box number count on the page is : " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
	}

}
