package org.example.tests;

import org.example.compose.IndexComposeActions;
import org.example.constants.BrowserEnum;
import org.example.constants.TargetUrlEnum;
import org.example.utils.DriverUtil;
import org.example.utils.TargetUrlUtil;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected final BrowserEnum browser = BrowserEnum.CHROME;
    protected final TargetUrlEnum targetUrl = TargetUrlEnum.GITHUB_PAGES;
    protected WebDriver driver;
    protected String url;

    protected IndexComposeActions indexComposeActions;

    @Before
    public void setup() {
        url = TargetUrlUtil.getUrl(targetUrl);
        driver = DriverUtil.getDriver(browser, url);

        indexComposeActions = new IndexComposeActions(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
