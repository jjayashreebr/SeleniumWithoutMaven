package testCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class MySelC4 {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/ajax.html");
		// identify element
		/*
		 * driver.findElement(By.id("yes")).click();
		 * driver.findElement(By.id("buttoncheck")).click();
		 * 
		 * String out = driver.findElement(By.cssSelector(".radiobutton")).getText();
		 * System.out.println("when yes is clicked "+out);
		 * 
		 * driver.findElement(By.id("no")).click();
		 * driver.findElement(By.id("buttoncheck")).click();
		 * 
		 * out = driver.findElement(By.cssSelector(".radiobutton")).getText();
		 * System.out.println("when no is clicked "+out);
		 */

		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("Number of elements:" + elements.size());

		for (int i = 0; i < elements.size(); i++) {
			System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));

		}

		driver.quit();
	}
}
