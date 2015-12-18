package com.lukiacnhuk.webdriver.taskfour;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeoutTest {

        @Test(timeout = 10000)
        public void test1() {
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.facebook.com");
            driver.findElement(By.id("u_0_i"));
            driver.close();
            driver.quit();
        }
}
