package com.vehicle.qa.pages;
import com.vehicle.qa.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    public static String vehicleRegNumber;
    @FindBy(id = "vehicleReg")
    private WebElement vehicleReg;
    //search box
    @FindBy(css = ".track-search")
    private WebElement findVehicleButton;
    //search button

    public void customerEnterRegistrationNumber(String regNumber) {
        vehicleReg.sendKeys(regNumber);
        vehicleRegNumber=regNumber;
    }
    public void magnifierGlass(){
        findVehicleButton.click();

    }
}
