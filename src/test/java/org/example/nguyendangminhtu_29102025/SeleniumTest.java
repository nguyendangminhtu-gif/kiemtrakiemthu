package org.example.nguyendangminhtu_29102025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void moMenu() throws InterruptedException{
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("menu-item--mega")).click();
        Thread.sleep(2000);
    }
}