package org.example.tests;

import org.junit.Assert;
import org.junit.Test;

public class IndexTests extends BaseTest {

    @Test
    public void testFilterByBrand() throws InterruptedException {
        indexComposeActions.clearAllSearchbar();

    }

    @Test
    public void testFilterByModel() throws InterruptedException {
        indexComposeActions.clearAllSearchbar();

    }

    @Test
    public void testFilterByYear() throws InterruptedException {
        indexComposeActions.clearAllSearchbar();

    }

    @Test
    public void testCheckPopupFirstCard() throws InterruptedException {
        indexComposeActions.clearAllSearchbar();
    }

    @Test
    public void testCheckPopupSecondCard() throws InterruptedException {
        indexComposeActions.clearAllSearchbar();

    }

    @Test
    public void verifyTitle() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("", "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
    }
}
