package com.testng.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AndroidIND {
	private AndroidDriver driver;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		stagingP30();
	}

	public void stagingP30() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "985b208e");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appActivity", "com.ctclogindemo.Splash_Screen_Activity");
		desiredCapabilities.setCapability("appPackage", "com.ctclogindemo");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("platformVersion", "11");
//		desiredCapabilities.setCapability("appium:Authentication",
//				"YXgvTEkyeGp5NTIvTVdpeHNxd3JWK3JBOGZJUGhQUmtZZmUwNTlCRVBCSWxXMVFVZ01CWXpoRzZwdVZZeHA0SGtBLzMvVmJh");
		desiredCapabilities.setCapability("udid", "985b208e"); // android
		// desiredCapabilities.setCapability("browserName","android");
		desiredCapabilities.setCapability("app",
				"https://ctc-device-farm-stg.s3.amazonaws.com/e93f2c5ea2704337954468b7ced9f961/lambdaStorage/407079db-46c7-495f-b348-76bca2b69149/407079db46c7495fb34876bca2b69149.apk");
		desiredCapabilities.setCapability("appium:AuthToken", "d63c5c99-4ab0-4efe-82f1-868c46f62e37");
		desiredCapabilities.setCapability("appium:SessionName", "<TestName>");
//		desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		URL remoteUrl = new URL("https://stg-mobilecloud-ap-south.quinnox.info:443/wd/hub");
		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	}

	@Test(priority = 5)
	public void logout() throws InterruptedException {
		System.out.println(driver.getSessionId());
		Thread.sleep(10000);
		driver.findElement(By.className("android.widget.ImageView")).click();
		driver.findElement(By.className("android.widget.FrameLayout")).click();
		Thread.sleep(10000);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
