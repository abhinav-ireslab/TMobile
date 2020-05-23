package coms.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T_Mobile extends Base {

	

	@Test(priority = 2)
	public static void header() {
		int HeaderElement = driver.findElements(By.xpath("//div[@class='header-navigation__bar']//div")).size();

		try {

			for (int j = 0; j <= HeaderElement; j++) {

				List<WebElement> header = driver.findElements(By.xpath("//div[@class='header-navigation__bar']//div"));
				WebElement headerlist = header.get(j);
				System.out.println("Header Element: " + headerlist.getText());

			}
		} catch (Exception e) {
			System.out.println(" Not Execute");

		}
	}

	@Test(priority = 3)
	public void footer() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,10000)");

		int FooterElement = driver.findElements(By.xpath("//div[@class='footer__links']//ul//li")).size();

		try {
			for (int i = 0; i <= FooterElement; i++) {

				List<WebElement> ele = driver.findElements(By.xpath("//div[@class='footer__links']//ul//li"));

				WebElement list = ele.get(i);
				// list.click();
				System.out.println("Print footer Element: " + list.getText());

			}
		} catch (Exception e) {

		}
	}

	@Test(priority = 4)
	public void plan() {

		WebElement plans = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/tfb-header/div/header/div[1]/div[1]/div/div[2]/div[2]/ul/li[1]/button"));

		if (plans.isDisplayed()) {

			plans.click();
			System.out.println("Plans avalable and click successfully");
		} else {
			System.out.println("Plans not available");
		}
	}

	@Test(priority = 6)
	public void coverage() {

		WebElement coverage = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/tfb-header/div/header/div[1]/div[1]/div/div[2]/div[2]/ul/li[2]/button"));

		if (coverage.isDisplayed()) {

			coverage.click();
			System.out.println("Coverage available and click successfully");

		} else {

			System.out.println("Coverage not available");
		}
	}

	@Test(priority = 7)
	public void Devices() {

		WebElement coverage = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/tfb-header/div/header/div[1]/div[1]/div/div[2]/div[2]/ul/li[3]/button"));

		if (coverage.isDisplayed()) {

			coverage.click();
			System.out.println("Devices available and click successfully");

		} else {

			System.out.println("Devices not available");
		}
	}
	
	@Test(priority = 8)
	public void BusinessSolution() {

		WebElement coverage = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/tfb-header/div/header/div[1]/div[1]/div/div[2]/div[2]/ul/li[4]/button"));

		if (coverage.isDisplayed()) {

			coverage.click();
			System.out.println("Business Solution available and click successfully");

		} else {

			System.out.println("Business Solution not available");
		}
	}
}

