package com.lukiacnhuk.webdriver;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by qa1 on 12/17/15.
 */

public class Main {

    public static String getSourceChrome(String url) {
        WebDriver chrm = new ChromeDriver();
        chrm.get(url);
        String pageSource = chrm.getPageSource();
        chrm.close();
        chrm.quit();

        return pageSource;

    }

    public static String getSourceFF(String url) {
        WebDriver ff = new FirefoxDriver();
        ff.get(url);
        String pageSource = ff.getPageSource();
        ff.close();
        ff.quit();

        return pageSource;
    }
}
