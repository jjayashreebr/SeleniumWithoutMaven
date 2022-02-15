package testCode;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import java.time.Duration;
import java.util.List;

public class MySelC7 {
	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir") + "/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		/*
		 * 1. Enter text for email address and passwd 2. Display a message stating :
		 * Text entered 3. Clear the data in the text boxes or
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String baseUrl = "https://demoqa.com/select-menu";
		driver.get(baseUrl);
		
		//driver.findElement(By.cssSelector(".css-1uccc91-singleValue")).click();
		Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
		s.selectByValue("1");
		s.selectByVisibleText(baseUrl);
		List<WebElement> myList = s.getOptions();
		s.getFirstSelectedOption();
		
		
		myList.stream().forEach(t->System.out.println(t.getText()));
		
		driver.quit();

		


	}
}
