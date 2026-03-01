package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static AndroidDriver driver;
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    public static AndroidDriver getDriver() {
        return driver;
    }


    public static void initializeDriver(UiAutomator2Options capabilities) {
        try {
            driver = new AndroidDriver(new URL(APPIUM_URL), capabilities);
            System.out.println("✓ Driver inicializado correctamente");
        } catch (MalformedURLException e) {
            throw new RuntimeException("Error al inicializar driver: " + e.getMessage());
        }
    }



}
