package com.vinh.tests;

import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import webdriver.DriverManager;
import webdriver.local.LocalDriverManager;

import java.io.IOException;

public class BaseTest {

	protected WebDriver driver;

	@BeforeTest
	@Parameters({"runWhere", "browserName"})
	public void beforeTest(String runWhere, String browserName) throws InvalidTokenException, AgentConnectException, ObsoleteVersionException, IOException {
		driver = new LocalDriverManager().createInstance(runWhere, browserName);
		DriverManager.setDriver(driver);
	}

	@AfterTest
	public void afterTest() {
		DriverManager.quit();
	}
}
