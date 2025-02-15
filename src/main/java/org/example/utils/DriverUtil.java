package org.example.utils;

import org.example.constants.BrowserEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import static org.example.configs.Defaults.DEFAULT_BROWSER;

public class DriverUtil {
    public static WebDriver getDriver(String url) {
        return getDriver(DEFAULT_BROWSER, url);
    }

    public static WebDriver getDriver(BrowserEnum browser, String url) {

        WebDriver driver;

        switch(browser){
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                FirefoxOptions options = new FirefoxOptions();
                options.enableBiDi();
                options.addArguments("--width=2560");
                options.addArguments("--height=1440");
                driver = new FirefoxDriver(options);
                break;
            case SAFARI:
                driver = new SafariDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }

        driver.navigate().to(url);

        return driver;
    }
}
