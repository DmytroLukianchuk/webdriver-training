package com.lukiacnhuk.webdriver.tasktwo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by qa1 on 12/17/15.
 */
public class TaskOncePerClassTwoTest {
    private static WebDriver chromeDriver;

    @BeforeClass
    public static void setUp() throws Exception {
        chromeDriver = new ChromeDriver();
        System.out.println("init driver");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        chromeDriver.close();
        chromeDriver.quit();
        System.out.println("quit driver");
    }

    @Test
    public void test1() {
        chromeDriver.get("http://www.facebook.com");
        System.out.println("test1");
        assertTrue(chromeDriver.getTitle().toLowerCase().contains("facebook"));
        assertEquals("Facebook - Log In or Sign Up", chromeDriver.getTitle());
    }

    @Test
    public void test2() {
        chromeDriver.get("http://www.twitter.com");
        System.out.println("test2");

    }

    @Test(expected = NoSuchElementException.class)
    public void test3() {
        chromeDriver.get("http://www.google.com");
        System.out.println("test3");

        chromeDriver.findElement(By.id("not-existing"));
    }

}
