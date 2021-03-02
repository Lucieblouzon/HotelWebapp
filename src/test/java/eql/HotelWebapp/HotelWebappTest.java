package eql.HotelWebapp;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HotelWebappTest {

	WebDriver driver;

	@Before

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver2.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void TestJPetStore() throws Exception {

		driver.get("http://192.168.1.19:9999/HotelWebapp-1.0-SNAPSHOT/");
		
		driver.findElement(By.xpath("//select")).click();
		
		driver.findElement(By.xpath("//option[@value='Paris']")).click();
		
		driver.findElement(By.xpath("//button")).click();
		
				
	}
	

}
