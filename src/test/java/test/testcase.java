package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testcase {
	public static WebDriver driver;
@BeforeTest
void setup()
{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://gmail.com");
}
@Test
void Login()

{
	
	System.out.print(driver.getTitle());
	
}

@AfterTest
void tearDown()

{
	driver.close();
}

}
