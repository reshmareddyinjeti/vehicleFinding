package com.vehicle.qa.stepDef;

import com.vehicle.qa.pages.HomePage;
import com.vehicle.qa.pages.ResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef {
    private ResultsPage resultsPage = new ResultsPage();
    private HomePage homePage=new HomePage();
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        String actualUrl=resultsPage.getUrl();
      assertThat(actualUrl, Matchers.endsWith("co.uk/"));
    }

    @When("^I enter the vehicle Registration Number \"([^\"]*)\"$")
    public void iEnterTheVehicleRegistrationNumber(String regNumber){
        homePage.customerEnterRegistrationNumber(regNumber);
    }

    @And("^I click the Find vehicle$")
    public void iClickTheFindVehicle() {
     homePage.magnifierGlass();
    }

    @Then("^I should see the respective results successfully\\.$")
    public void iShouldSeeTheRespectiveResultsSuccessfully() {
       /* String actualStartDate= vehicleRegister.resultStartDate();
        String actualEndDate= vehicleRegister.resultEndDate();
        assertThat(actualStartDate,Matchers.equalTo(vehicleRegister.startDate));
        assertThat(actualEndDate,Matchers.equalTo(vehicleRegister.endDate));
        System.out.println("expected");*/
       String actualRegResult=resultsPage.getRegResult();
       assertThat(actualRegResult,Matchers.endsWith(homePage.vehicleRegNumber));
        }
    }


