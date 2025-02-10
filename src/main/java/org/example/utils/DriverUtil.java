package org.example.utils;

import org.example.constants.BrowserEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.example.configs.Defaults.DEFAULT_BROWSER;

public class DriverUtil {
    public static WebDriver getDriver(String url) {
        return getDriver(DEFAULT_BROWSER, url);
    }

    public static WebDriver getDriver(BrowserEnum browser, String url) {
        WebDriver driver = (browser == BrowserEnum.CHROME) ? new ChromeDriver() : new SafariDriver();

        driver.navigate().to(url);

        return driver;
    }
}
