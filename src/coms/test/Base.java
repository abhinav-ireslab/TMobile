package coms.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {

		public static WebDriver driver;

		@Test(priority = 1)
		public static void setup() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\E2E\\eclipse-workspace\\TMobile\\Driver\\chromedriver.exe");
			// driver = new FirefoxDriver();
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.t-mobile.com/business/cell-phones");

		}

	}
