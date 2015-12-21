package com.lukiacnhuk.webdriver.tasktwo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by qa1 on 12/17/15.
 */
public class TaskOncePerTestTwoTest {
    private WebDriver chromeDriver;

    @Before
    public void setUp() throws Exception {
        chromeDriver = new ChromeDriver();
        System.out.println("init driver");
    }

    @After
    public void tearDown() throws Exception {
        chromeDriver.close();
        chromeDriver.quit();
        System.out.println("quit driver");

    }

    @Test
    public void test1() {
        chromeDriver.get("http://www.google.com");
        System.out.println("test1");
    }

    @Test
    public void test2() {
        chromeDriver.get("http://www.google.com");
        System.out.println("test2");


    }

    @Test
    public void test3() {
        chromeDriver.get("http://www.google.com");
        System.out.println("test3");


    }


}
