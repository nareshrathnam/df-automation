package com.testng.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class UsIosIpad6thGen {
	private IOSDriver driver;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "fa41c917a8a7c7e3c8c322f10ed760a8803ab0b6");
		desiredCapabilities.setCapability("platformName", "iOS");
		desiredCapabilities.setCapability("automationName", "XCUITest");
		desiredCapabilities.setCapability("platformVersion", "14.2");
		desiredCapabilities.setCapability("udid", "00008101-000815DA01C2001E");
		// desiredCapabilities.setCapability("show6KK7N19418003936XcodeLog", "true");
		// desiredCapabilities.setCapability("appium:Authentication",
		// "WmhiWUwydGowczJlQUd5dHRhd3FRTHlOL2ZCTmh2WUZVT1NpNTg5clB3TU1CQWhJWjhSVjhLbElhblR3cFNnc0lWNDJGZz09");
		desiredCapabilities.setCapability("app",
				"https://ctc-device-farm-stg.s3.us-west-1.amazonaws.com/general/lambdaStorage/ee0b1565-85de-4ee4-beb3-b49eac474169/ee0b156585de4ee4beb3b49eac474169.ipa");
		desiredCapabilities.setCapability("appium:AuthToken", "124542d2-759e-4b69-8297-c14c2909d53d");
		desiredCapabilities.setCapability("appium:SessionName", "<TestName>");
		URL remoteUrl = new URL("https://stg-mobilecloud-ap-south.quinnox.info/wd/hub");

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
