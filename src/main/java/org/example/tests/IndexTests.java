package org.example.tests;

import org.junit.Assert;
import org.junit.Test;

public class IndexTests extends BaseTest {

    @Test
    public void verifyTitle() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("", "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
    }
}
