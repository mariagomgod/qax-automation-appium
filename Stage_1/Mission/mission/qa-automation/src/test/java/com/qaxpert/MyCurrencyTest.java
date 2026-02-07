package com.qaxpert;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MyCurrencyTest {

    public static void main(String[] args) {
        try {

            UiAutomator2Options options = new UiAutomator2Options()
                    .setDeviceName("Pixel_9_Pro")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setApp(AndroidAppiumDemo.class.getClassLoader().getResource("myCurrencyTest.apk").getPath());

            URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

            AppiumDriver driver = new AndroidDriver(appiumServerUrl, options);

            System.out.println("✅ My Currency Test inicializado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
