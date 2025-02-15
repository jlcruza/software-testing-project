package org.example.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BaseWebElementActions {
    protected final long WAIT_AFTER_CLICK = 500;
    protected final String endpoint;
    protected final WebDriver driver;

    public BaseWebElementActions(WebDriver driver, String endpoint) {
        this.driver = driver;
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    protected WebElement getById(String id) {
        return driver.findElement(By.id(id));
    }

    protected List<WebElement> getByClassname(String classname) {
        return driver.findElements(By.className(classname));
    }

    private boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }

    public void goToEndOfPage()
    {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.build().perform();
    }

    public String getTextFromElement(WebElement element) {
        return getTextFromElement(element, true);
    }

    public String getTextFromElement(WebElement element, boolean shouldMove) {
        if(shouldMove)
            moveToElement(element);
        String text = element.getText();
        return (isNullOrEmpty(text)) ? element.getDomProperty("value") : text;
    }

    private void moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.build().perform();
    }

    protected void clickElement(WebElement element) {
        moveToElement(element);
        element.click();
        try {
            Thread.sleep(WAIT_AFTER_CLICK);
        } catch (InterruptedException e) {
            // Do nothing
        }
    }

    protected void writeInElement(WebElement element, String text) {
        moveToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    protected void selectOptionInElement(WebElement element, Select select, String text) {
        moveToElement(element);
        select.selectByVisibleText(text);
    }

    protected String getSelectedOption(Select select){
        return getTextFromElement(select.getFirstSelectedOption(), false);
    }
}
