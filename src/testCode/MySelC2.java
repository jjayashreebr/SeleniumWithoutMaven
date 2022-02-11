package testCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MySelC2 {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir") + "/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Deleting all the cookies
		driver.manage().deleteAllCookies();

		// Specifiying pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// launching the specified URL
		driver.get("http://output.jsbin.com/usidix/1");

		// Locating the elements using name locator for the text box
		WebElement element1= driver.findElement(By.xpath("//input[@type=\"button\"]"));
		element1.click();
		
		//alert
		Alert a = driver.switchTo().alert();
		String msg= a.getText();
		System.out.println(msg);
		a.accept();
		

	
		
		

		// close driver
		driver.quit();

	}
	
	/*
	 * // launch Fire fox and direct it to the Base URL driver.get(baseUrl);
	 * 
	 * // get the actual value of the title actualTitle = driver.getTitle(); String
	 * baseUrl = "http://demo.guru99.com/test/newtours/"; String expectedTitle =
	 * "Welcome: Mercury Tours"; String actualTitle = "";
	 * 
	 * compare the actual title of the page the result as "Passed" or "Failed"
	 * 
	 * if (actualTitle.contentEquals(expectedTitle)) {
	 * System.out.println("Test Passed!"); } else {
	 * System.out.println("Test Failed"); }
	 * 
	 * driver.findElement(By.name("userName")).sendKeys("hello");
	 * driver.findElement(By.name("password")).sendKeys("hello");
	 */

	;

}
