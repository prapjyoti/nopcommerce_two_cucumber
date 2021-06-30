Feature: Build Your Own Computer Purchase

  As a user I want buy a product

  Background:
    Given I am on home page
@Smoke@Sanity@Regression
  Scenario: user should arrange product in alphabetical order successfully
    Given I am on computer page
    And   I click on desktop link
    And I sort product list as Z to A
    Then I should sort the products in Z to A order
@Smoke@Regression
  Scenario: Verify user should added the product in shopping cart successfully
    Given I am mousehover on  computer link
    And I click on desktop link
    And I sort the product in A to Z list
    And I click on add to cart button
    Then I should navigate to build your own page
    And I select the processor from dropdown
    And  I select the ram from dropdown
    And I click on Hdd radio <"400 GB [+$100.00]">
    And I click on os vista premium radio button<"Vista Premium [+$60.00]">
    And I click on software microsoftoffice checkbox<"Microsoft Office [+$50.00]">
    And I click on total commander checkbox<"Total Commander [+$5.00]">
    Then I verify that amount in total price
    When I click on add to cart for product
    Then I should see the message that product successfully added to cart
    Then I click on display popup message



