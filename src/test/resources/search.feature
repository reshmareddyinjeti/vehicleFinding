@smoke
Feature: Search Vehicle
  As a end user
  I Want to check vehicle existence
  So That i can see the respective results

  Scenario:Vehicle Registration
    Given I am on Homepage
    When I enter the vehicle Registration Number "OV12UYY"
    And I click the Find vehicle
    Then I should see the respective results successfully.

