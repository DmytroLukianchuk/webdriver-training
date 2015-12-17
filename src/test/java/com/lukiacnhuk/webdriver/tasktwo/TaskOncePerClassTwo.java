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
public class TaskOncePerClassTwo {
    private static WebDriver chrm;

    @BeforeClass
    public static void setUp() throws Exception {
        chrm = new ChromeDriver();
        System.out.println("init driver");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        chrm.close();
        chrm.quit();
        System.out.println("quit driver");
    }

    @Test
    public void test1() {
        chrm.get("http://www.facebook.com");
        System.out.println("test1");
        assertTrue(chrm.getTitle().toLowerCase().contains("facebook"));
        assertEquals("Facebook - Log In or Sign Up", chrm.getTitle());
    }

    @Test
    public void test2() {
        chrm.get("http://www.twitter.com");
        System.out.println("test2");
    }

    @Test(expected = NoSuchElementException.class)
    public void test3() {
        chrm.get("http://www.google.com");
        System.out.println("test3");

        chrm.findElement(By.id("not-existing"));
    }

}
