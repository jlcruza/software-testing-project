package org.example.dto;

import org.openqa.selenium.WebElement;

public class ResultCard {

    private String title;

    private String text;

    private WebElement button;

    public ResultCard() {

    }

    public ResultCard(String title, String text, WebElement element) {
        this.title = title;
        this.text = text;
        this.button = element;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public WebElement getButton() {
        return button;
    }

    public void setButton(WebElement button) {
        this.button = button;
    }
}
