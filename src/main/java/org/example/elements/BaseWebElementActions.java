package org.example.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BaseWebElementActions {
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

    protected List<WebElement> getByClassname(String classname){
        return driver.findElements(By.className(classname));
    }

    public String getTextFromElement(WebElement element){
        moveToElement(element);
        return element.getText();
    }

    private void moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.build().perform();
    }

    protected void clickElement(WebElement element) {
        moveToElement(element);
        element.click();
    }

    protected void writeInElement(WebElement element, String text) {
        moveToElement(element);
        element.sendKeys(text);
    }

    protected void selectOptionInElement(WebElement element, Select select, String text) {
        moveToElement(element);
        select.selectByValue(text);
    }
}
