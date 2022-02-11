package testCode;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MySelC6 {
	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir") + "/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		/*
		 * 1. Enter text for email address and passwd 2. Display a message stating :
		 * Text entered 3. Clear the data in the text boxes or
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String baseUrl = "https://demo.guru99.com/test/login.html";
		driver.get(baseUrl);

		// identify element
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("cool@gmail.com");
		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys("cool");
		
		  
		  driver.switchTo().frame(driver.findElement(By.id("ccpa-consent-notice")));
		  driver.findElement(By.id("saveAndExit")).click();
		 

		driver.switchTo().defaultContent();

		WebElement SubmitLogin = driver.findElement(By.id("SubmitLogin"));
		SubmitLogin.click();
		WebElement msg = driver.findElement(By.xpath("//h3"));
		String text = msg.getText();
		System.out.println("msg: " + text);
		
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("passwd")).clear();
		driver.findElement(By.id("SubmitLogin")).click();

	}
}
