package com.qa.swiggy.testbase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class testbase {

    public static AppiumDriver<MobileElement> driver;
    public static Properties prop;

    public testbase() {
        prop = new Properties();
        FileInputStream fp = null;
        try {
            fp = new FileInputStream("C:\\Users\\ptw\\Desktop\\Framework_Swiggy\\src\\main\\java\\com\\qa\\swiggy\\config\\config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(fp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialisation() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus3T");
        dcap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dcap.setCapability(MobileCapabilityType.UDID, "192.168.0.102:5555");
        dcap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        dcap.setCapability("appPackage", "in.swiggy.android");
        dcap.setCapability("appActivity", "in.swiggy.android.activities.HomeActivity");

        URL url = new URL("http:127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(url, dcap);

    }




}
