package org.example.elements;

import org.example.dto.ResultCard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class IndexPageElements extends BaseWebElementActions {

    public IndexPageElements(WebDriver driver, String endpoint) {
        super(driver, endpoint);
    }

    protected WebElement addCarButton() {
        return getById("add-car-btn");
    }

    protected WebElement brandSearchBar() {
        return getById("brand-searchbar");
    }

    protected WebElement brandSearchButton() {
        return getById("brand-search-btn");
    }

    protected WebElement brandClearButton() {
        return getById("brand-clear-btn");
    }

    protected WebElement modelSearchBar() {
        return getById("model-searchbar");
    }

    protected WebElement modelSearchButton() {
        return getById("model-search-btn");
    }

    protected WebElement modelClearButton() {
        return getById("model-clear-btn");
    }

    protected WebElement yearSearchBar() {
        return getById("year-searchbar");
    }

    protected WebElement yearSearchButton() {
        return getById("year-search-btn");
    }

    protected WebElement yearClearButton() {
        return getById("year-clear-btn");
    }

    protected WebElement popupCard() {
        return getById("popup-card");
    }

    protected WebElement popupCardTitle() {
        return getById("popup-card-title");
    }

    protected WebElement popupCardHeader() {
        return getById("popup-card-header");
    }

    protected Select popupSelectBrand(){
        return new Select(popupCardHeader());
    }

    protected WebElement popupCardText() {
        return getById("popup-card-text");
    }

    protected WebElement popupCardYear() {
        return getById("popup-card-year");
    }

    protected WebElement popupCardUpdateButton() {
        return getById("popup-card-update-btn");
    }

    protected WebElement popupCardDeleteButton() {
        return getById("popup-card-delete-btn");
    }

    protected WebElement popupCardCloseButton() {
        return getById("popup-card-close-btn");
    }

    protected List<WebElement> resultCardTitle() {
        return getByClassname("result-card-title");
    }

    protected List<WebElement> resultCardText() {
        return getByClassname("result-card-text");
    }

    protected List<WebElement> resultCardButton() {
        return getByClassname("result-card-button");
    }

    public List<ResultCard> getCards() {
        List<ResultCard> result = new ArrayList<>();
        List<WebElement> titles = resultCardTitle();
        List<WebElement> texts = resultCardText();
        List<WebElement> buttons = resultCardButton();

        for (int i = 0; i < titles.size(); i++) {
            result.add(new ResultCard(
                    getTextFromElement(titles.get(i), false),
                    getTextFromElement(texts.get(i), false),
                    buttons.get(i)));
        }

        return result;
    }

    public void clickResultCardByIndex(int index) {
        clickElement(getCards().get(index).getButton());
    }

    public ResultCard getFirstCard() {
        return getCards().get(0);
    }

    public ResultCard getLastCard() {
        int length = getResultCardCount();
        return getCards().get(length - 1);
    }

    public int getResultCardCount() {
        return resultCardTitle().size();
    }

}