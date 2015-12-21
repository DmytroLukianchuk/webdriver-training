package com.lukiacnhuk.webdriver.taskone;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

/**
 * Created by qa1 on 12/17/15.
 */
public class TaskOneTest {
    public static String getSourceChrome(String url) {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get(url);
        String pageSource = chromeDriver.getPageSource();
        chromeDriver.close();
        chromeDriver.quit();

        return pageSource;

    }

    public static String getSourceFF(String url) {
        WebDriver fireFoxDriver = new FirefoxDriver();
        fireFoxDriver.get(url);
        String pageSource = fireFoxDriver.getPageSource();
        fireFoxDriver.close();
        fireFoxDriver.quit();

        return pageSource;
    }


    @Test
    public void CompareSourcesFirefoxChromeTest() throws Exception {
        String url = "http://www.google.com";
        String sourceChrome = TaskOneTest.getSourceChrome(url);
        String sourceFF = TaskOneTest.getSourceFF(url);
        assertNotEquals("Source are not equal", sourceChrome, sourceFF);
    }
}