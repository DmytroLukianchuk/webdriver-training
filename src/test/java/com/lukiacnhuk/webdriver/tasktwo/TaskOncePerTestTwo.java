package com.lukiacnhuk.webdriver.tasktwo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by qa1 on 12/17/15.
 */
public class TaskOncePerTestTwo {
    private WebDriver chrm;

    @Before
    public void setUp() throws Exception {
        chrm = new ChromeDriver();
        System.out.println("init driver");
    }

    @After
    public void tearDown() throws Exception {
        chrm.close();
        chrm.quit();
        System.out.println("quit driver");

    }

    @Test
    public void test1() {
        chrm.get("http://www.google.com");
        System.out.println("test1");
    }

    @Test
    public void test2() {
        chrm.get("http://www.google.com");
        System.out.println("test2");


    }

    @Test
    public void test3() {
        chrm.get("http://www.google.com");
        System.out.println("test3");


    }


}
