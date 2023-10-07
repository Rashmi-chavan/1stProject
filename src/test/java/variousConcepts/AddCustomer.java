package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AddCustomer {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void LoginTest() {
		// storing web elements
		// element list using Webelements
		// type name=value(creating variable)

		 WebElement USERNAME_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
		 WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//input[@id='password']"));
		 WebElement SIGN_ELEMENT = driver.findElement(By.xpath("//button[text()='Sign in']"));
		 WebElement DASHBOARD_HEADER_ELEMENT =driver.findElement(By.xpath("//h2[text()=' Dashboard ']"));
		 USERNAME_ELEMENT.sendKeys("demo@techfios.com");//(by using webelement)
		 PASSWORD_ELEMENT.sendKeys("abc123");//(by using webelement)
		 SIGN_ELEMENT.click();//(by using webelement)
		 
		 
		//Assert.assertTrue("Dashboard page is not found", DASHBOARD_HEADER_ELEMENT.isDisplayed());
//element list using By class
		
		//By USERNAME_FIELD = By.xpath("//input[@id='username']");
		//By PASSWORD_FIELD = By.xpath("//input[@id='password']");
		//By SING_IN_FIELD = By.xpath("//button[text()='Sign in']");
		//By DASHBOARD_HEADER_FIELD = By.xpath("(//h2[text()=' Dashboard ']");
		//driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");// (by using by class)
		//driver.findElement(PASSWORD_FIELD).sendKeys("abc123");// (by using by class)
		//driver.findElement(SING_IN_FIELD).click();// (by using by class)
	    //Assert.assertTrue("Dashboard page is not found", driver.findElement(DASHBOARD_HEADER_FIELD).isDisplayed());

		// driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		// driver.findElement(By.xpath("//button[text()='Sign in']")).click();

	}
	private void DASHBOARD_HEADER_ELEMENT() {
		// TODO Auto-generated method stub
		
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
