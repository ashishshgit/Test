package test;

import org.openqa.selenium.By;
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
	driver.findElement(By.id("identifierId")).sendKeys("as@gmil.com");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();;
}

@AfterTest
void tearDown()

{   
	
	driver.close();
}

}
