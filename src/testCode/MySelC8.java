package testCode;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import java.time.Duration;
import java.util.List;

public class MySelC8 {
	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir") + "/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		/*
		 * 1. Enter text for email address and passwd 2. Display a message stating :
		 * Text entered 3. Clear the data in the text boxes or
		 */
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.guru99.com/test/guru99home/" );
		String eTitle = "Demo Guru99 Page";

		//get the actual value of the title
		String aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		
		  driver.switchTo().frame(driver.findElement(By.id("ccpa-consent-notice")));
		  
		    WebElement close = driver.findElement(By.xpath("//*[@id=\"saveAndExit\"]"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			wait.until(ExpectedConditions.elementToBeClickable(close));
			close.click();
		  
	
		  driver.switchTo().defaultContent();
	
	
driver.quit();
	


	}
}
