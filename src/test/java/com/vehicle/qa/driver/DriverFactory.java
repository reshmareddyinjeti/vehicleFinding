package com.vehicle.qa.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory() {
        PageFactory.initElements(driver, this);
    }

    public void setupUrl(String Url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Url);

    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void waits() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    public void closeBrowser() {

        driver.quit();
    }

}


