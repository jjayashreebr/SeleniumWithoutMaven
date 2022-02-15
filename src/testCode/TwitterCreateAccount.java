package testCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class TwitterCreateAccount {
	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir") + "/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		// set system property for chrome driver  WebDriver 
		
		//driver = new ChromeDriver();  
		driver.get("https://twitter.com/?lang=en"); 

		//sign up with phone or email - option
		driver.findElement(By.xpath("//span[(text()='Sign up with phone or email')]")).click(); 

		//switch to login pop up
		driver.switchTo().activeElement();  
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("jay"); 

		//change to email 
		driver.findElement(By.xpath("//span[text()='Use email instead']")).click();
		 
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jjay051021@gmail.com");    



		//for scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		//calendar
		Select s = new Select(driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_1_LABEL']")));
		s.selectByVisibleText("January");

		 s = new Select(driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_2_LABEL']")));
		s.selectByVisibleText("1");


		 s = new Select(driver.findElement(By.xpath("//select[@aria-labelledby='SELECTOR_3_LABEL']")));
		s.selectByVisibleText("2000");

		driver.findElement(By.xpath("//span[(text()='Next')]")).click();

		//for next click
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[(text()='Next')]")));

		driver.findElement(By.xpath("//span[(text()='Next')]")).click();


		//scroll down
		js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[(text()='Sign up')]")));

		driver.findElement(By.xpath("//span[(text()='Sign up')]")).click();


		//verfication_code
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='verfication_code']")));

		driver.findElement(By.xpath("//input[@name='verfication_code']")).sendKeys("286786"); 

		driver.findElement(By.xpath("//span[(text()='Next')]")).click();




		//scroll down
		js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[(text()='Options')]")));

		driver.findElement(By.xpath("//span[(text()='Options')]")).click();

		//switch focus
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//span[(text()='Sign out')]")).click();








	
	
	
driver.quit();
	


	}
}
