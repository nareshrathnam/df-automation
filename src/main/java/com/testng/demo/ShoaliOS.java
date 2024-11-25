package com.testng.demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class ShoaliOS {
	private IOSDriver driver;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "00008110-001875623C46401E");
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("automationName", "XCUITest");
		desiredCapabilities.setCapability("platformVersion", "16");
		desiredCapabilities.setCapability("udid", "00008110-001875623C46401E");
		// desiredCapabilities.setCapability("show6KK7N19418003936XcodeLog", "true");
		// desiredCapabilities.setCapability("appium:Authentication",
		// "WmhiWUwydGowczJlQUd5dHRhd3FRTHlOL2ZCTmh2WUZVT1NpNTg5clB3TU1CQWhJWjhSVjhLbElhblR3cFNnc0lWNDJGZz09");
		desiredCapabilities.setCapability("app",
				"https://ctc-device-farm-uk-qyrus.s3.eu-west-2.amazonaws.com/shoal/lambdaStorage/1b40eff4-7a12-487e-b028-9424da68787a/1b40eff47a12487eb0289424da68787a.ipa");
		desiredCapabilities.setCapability("appium:AuthToken", "29710491-5f12-4e11-88b0-9e227b1c1e0f");
		desiredCapabilities.setCapability("appium:SessionName", "<TestName>");
		URL remoteUrl = new URL("https://mobilecloud-uk.quinnox.info/wd/hub");

		driver = new IOSDriver(remoteUrl, desiredCapabilities);

	}

	@Test(priority = 1)
	public void alerts() throws Exception {
		Thread.sleep(10000);
		System.out.println(driver.getSessionId());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
