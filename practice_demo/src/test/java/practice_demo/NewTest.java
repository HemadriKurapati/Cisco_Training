package practice_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void test1() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\Documents\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	 // tearDown();
  }
  @AfterClass
  public void tearDown() {
	  driver.quit();
  }
}
