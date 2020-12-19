package com.vinh.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

	@Test(testName = "Example Test #1")
	public void sample() {
		driver.navigate().to("https://example.testproject.io/web/");

		driver.findElement(By.cssSelector("#name")).sendKeys("John Smith");
		driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		driver.findElement(By.cssSelector("#login")).click();

		boolean passed = driver.findElement(By.cssSelector("#logout")).isDisplayed();
		if (passed) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}
}
