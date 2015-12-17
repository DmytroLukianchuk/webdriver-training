package com.lukiacnhuk.webdriver;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by qa1 on 12/17/15.
 */
public class MainTest {

    @Test
    public void testCompareSourcesFirefoxChrome() throws Exception {
        String url = "http://www.google.com";
        String sourceChrome = Main.getSourceChrome(url);
        String sourceFF = Main.getSourceFF(url);
        assertNotEquals("Source are not equal", sourceChrome, sourceFF);
    }
}