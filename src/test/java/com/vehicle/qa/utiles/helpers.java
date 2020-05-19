package com.vehicle.qa.utiles;

import com.vehicle.qa.driver.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class helpers extends DriverFactory {
    // method for capture screen shot
    public void captureScreenShot(WebDriver driver, String screenShotName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./reshma/Homepage.png"));
        System.out.println("SceenShotTaken");

    }
}