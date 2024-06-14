package co.com.globallogic.certification.ibank.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriver {

    public static AndroidDriver app() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "12.0");
        caps.setCapability("NoReset", "true");
        caps.setCapability("appPackage", "com.experitest.ExperiBank");
        caps.setCapability("appActivity", "com.experitest.ExperiBank.LoginActivity");
        //caps.setCapability("udid", "emulator-5554");
        caps.setCapability("autoGrantPermissions", true);

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);

        return driver;
    }
}
