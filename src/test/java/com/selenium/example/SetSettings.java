package com.selenium.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;
import java.util.logging.StreamHandler;

/**
 * Created by Lenovo on 08.01.2017.
 */
public class SetSettings {
    private WebDriver driver;
    private String baseUrl= "http://www.seleniumhq.org/";

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterClass
    public  void tearDown(){
        driver.quit();
    }
}
