package coms.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Devices extends Base {

	@Test(priority = 9)
	public static void devices() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Devices = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/div[1]/div/section/div[2]/tfb-product-list/tfb-product-grid/div/tfb-virtual-scroller/div/div/div/div/span[1]/a"));

		Devices.click();

	}

	@Test(priority = 10)
	public void SelctedColour() {

		WebElement Glow = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/div[1]/div/section/div/tfb-product-detail/div/section/section[2]/tfb-product-sku-picker/div[2]/div/div[2]/span[2]/div/button"));

		Glow.click();

		WebElement ColourText = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/div[1]/div/section/div/tfb-product-detail/div/section/section[2]/tfb-product-sku-picker/div[2]/div/div[1]"));
		String Colour = ColourText.getText();
		String expected = "Cosmic Gray";

		Assert.assertEquals(Colour, expected);
		System.out.println(Colour + " Colour is Ok");
	}

	@Test(priority = 11)
	public void price() {

		String Price = driver.findElement(By.xpath("//div//span[contains(@class, 'device-price')]")).getText();
		String expected = "$1,399.99";
		Assert.assertEquals(Price, expected);
		System.out.println(Price + " Price is Ok");

	}

	@Test(priority = 12)
	public void memory() throws InterruptedException {

		WebElement Clr = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/div[1]/div/section/div/tfb-product-detail/div/section/section[2]/tfb-product-sku-picker/div[2]/div/div[2]/span[1]/div/button"));
		Clr.click();

		WebElement Clr_Text = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/div[1]/div/section/div/tfb-product-detail/div/section/section[2]/tfb-product-sku-picker/div[2]/div/div[1]"));
		Thread.sleep(2000);
		String Colour2 = Clr_Text.getText();
		String Text = "Cosmic Black";
		Assert.assertEquals(Colour2, Text);

		driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/div[1]/div/section/div/tfb-product-detail/div/section/section[2]/tfb-product-sku-picker/div[1]/div/div/div[2]/button"))
				.click();
		String Price = driver.findElement(By.xpath("//div//span[contains(@class, 'device-price')]")).getText();
		String expecteds = "$1,599.99";
		Assert.assertEquals(Price, expecteds);
		System.out.println(Price);
		System.out.println(Price + " Price is Ok");
	}

	@Test(priority = 13)
	public void feature() {

		driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/div[1]/div/section/div/tfb-product-detail/div/section/section[2]/tfb-product-title/div/div/a"))
				.click();

		// int list =
		// driver.findElements(By.xpath("//ul[contains(@class,'container__features')]//li")).size();
		// System.out.println(list.get(i));

		String list1 = driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/div[1]/div/section/div/tfb-product-detail/div/tfb-product-feature/div/div[2]/ul/li[1]/div[1]"))
				.getText();
		String text = "Ultra Bright Night";

		Assert.assertEquals(list1, text);
	}

	@Test(priority = 14)
	public void ContactUs() throws InterruptedException {

		try {
		driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/div[1]/div/section/div/tfb-product-detail/div/section/section[2]/tfb-product-pricing/div/div/div[3]/a"))
				.click();

		// Fill the contact Us form

		// Enter First Name
		driver.findElement(By.xpath("//input[contains(@name, 'First Name')]")).sendKeys("Akash");

		// Enter Last Name
		driver.findElement(By.xpath("//input[contains(@name, 'Last Name')]")).sendKeys("Kumar");

		// Enter Phone Number
		driver.findElement(By.xpath("//input[contains(@name, 'Phone')]")).sendKeys("8285314693");

		// Enter Email Address
		driver.findElement(By.xpath("//input[contains(@name, 'Email')]")).sendKeys("abhinav@yopmail.com");

		// Enter Zip Code
		driver.findElement(By.xpath("//input[contains(@name, 'Zip')]")).sendKeys("250003");

		// Enter Company Name
		driver.findElement(By.xpath("//input[contains(@name, 'Company')]")).sendKeys("abc");

		Thread.sleep(2000);
		// Select checkbox
		driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/tfb-header/div/div/div/div/div/div[2]/div/div[2]/form/div[4]/div/div/div[1]/label/div"))
				.click();

		// Click Submit button
		driver.findElement(By.xpath(
				"/html/body/tfb-activation-root/tfb-header/div/div/div/div/div/div[2]/div/div[2]/form/div[6]/button"))
				.click();
		}
		catch(Exception e){
			System.out.println("Captcha");
		}
	}

}
