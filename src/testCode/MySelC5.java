package testCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class MySelC5{
   public static void main(String[] args) {
	   String path = System.getProperty("user.dir") + "/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://www.tutorialspoint.com/about/about_team.htm");
      // identify element
      WebElement l = driver.findElement(By.linkText("Team"));
      // href value from getAttribute()
      String v = l.getAttribute("href");
      System.out.println("Href value of link: "+ v);
      driver.quit();
   }
} 
