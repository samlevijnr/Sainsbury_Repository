package uk.co.sainsburys.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import uk.co.sainsburys.pages.HomePage;



public class ProductSearchTest {

WebDriver driver;
HomePage HomePage_Instance; 

@BeforeTest()
public void launchDriver(){
	//System.setProperty("webdriver.gecko.driver","D:\\Firefox\\geckodriver.exe");
	System.setProperty("webdriver.gecko.driver", "D:/Selenium/gecko19/geckodriver.exe");
	 
    driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.sainsburys.co.uk/");	
}

@Test(priority=1)
public void searchProducts(){
	HomePage_Instance = new HomePage(driver);
	HomePage_Instance.enterProductName();
}

@AfterTest()
public void tearDown() throws InterruptedException{
	Thread.sleep(10000);
	driver.close();
}
}
