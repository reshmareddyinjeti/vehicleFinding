package com.vehicle.qa.pages;

import com.vehicle.qa.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ResultsPage extends DriverFactory {
  public String getUrl(){
    return driver.getCurrentUrl();
  }
  //  public static String startDate;
   // public static String endDate;
    /*@FindBy(xpath = "//span[contains(text(),'09 FEB 2022 : 16 : 26')]")
    private WebElement coverStartDate;
    @FindBy(xpath = "//span[contains(text(),'18 FEB 2022 : 23 : 59')]")
    private WebElement coverEndDate;

    public String resultStartDate() {
        startDate=coverStartDate.getText();
        return startDate;
    }
    public String resultEndDate(){
        endDate= coverEndDate.getText();
        return endDate;
    }*/
    @FindBy(css=".result")
    private WebElement regResult;
    public String getRegResult(){
      return regResult.getText();
    }
}