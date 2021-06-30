Feature: Home Page Functionality

  As a user I want to check home page different links functionality

  Background:
    Given I am on home page
  @Smoke@Sanity
  Scenario: User Should Navigate To ComputerPage Successfully
    When I click on computer link
    Then I should navigate to computer page successfully

  @Smoke@Regression
  Scenario: User should Navigate to electronics page successfully
    When  I click on electronics link then
    Then  I should navigate to electronics page successfully
  @Regression
  Scenario: User should navigate to Apparel page successfully
    When I click on Apparel link
    Then I should navigate apparel page successfully
  @Regression
  Scenario: User should navigate to DigitalDownloads successfully
    When I click on DigitalDownloads link
    Then I navigate digitaldownloads page successfully
@Regression
  Scenario: User should navigate to Books page successfully
    When  I click on Books link
    Then  I navigate books page successfully
 @Regression
  Scenario: User should navigate to Jewelry page successfully
    When I click on Jewelry link
    Then I navigate to Jewelry page successfully
@Regression
  Scenario: User should navigate to GiftCards page successfully
    When I click on GiftCards link
    Then I navigae to GiftCards page successfully


