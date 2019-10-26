package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium02E2ESpice {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ngetaneh\\Desktop\\selenium\\Chrome exec\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	WebElement roundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
	roundTrip.click();
	
	Assert.assertTrue(roundTrip.isSelected());
	WebElement departure  = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	departure.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Bengaluru (BLR)')]")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
	WebElement date = driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']"));
	Assert.assertNotNull(date);
	
	//Thread.sleep(1000);
	//
	
	driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default'][contains(text(),'26')]")).click();
	
	Thread.sleep(1000L);
	
	System.out.println("TEST COMPLETED!!!!");
	//WebElement date = driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']"));
	System.out.println(date.getText());
	}

}
//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'23')]