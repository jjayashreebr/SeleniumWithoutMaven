package testCode;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class MySelC3 {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir") + "/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		ChromeOptions op = new ChromeOptions();
		op.setAcceptInsecureCerts(true);
		
		op.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.manage().deleteAllCookies();
		driver.get("https://www.cnn.com");
		

		driver.quit();

	}

}
