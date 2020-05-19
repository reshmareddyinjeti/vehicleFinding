package com.vehicle.qa;

import com.vehicle.qa.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverFactory driverFactory=new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.setupUrl("https://covercheck.vwfsinsuranceportal.co.uk/");
        driverFactory.maximize();
        driverFactory.waits();
    }
    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }
}

