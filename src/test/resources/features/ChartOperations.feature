
Feature: ChartOperations

  Scenario: Add one item to the chart and check
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Clicks login button
    And Add to Chart Sauce Labs Backpack
    And Go to the chart
    Then The item must be selected

  Scenario: Add one item and remove and check
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Clicks login button
    And Add to Chart Sauce Labs Backpack
    And Remove the Sauce Labs Backpack
    And Go to the chart
    Then The chart must be empty

  Scenario: Add two items to the chart and check
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Clicks login button
    And Add to Chart Sauce Labs Backpack
    And Add to Chart Sauce Labs Bike Light
    And Go to the chart
    Then The two items must be selected

  Scenario: Add three items to the chart and check
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Clicks login button
    And Add to Chart Sauce Labs Backpack
    And Add to Chart Sauce Labs Bike Light
    And Add to Chart Sauce Labs Bolt T-Shirt
    And Go to the chart
    Then The three items must be selected

  Scenario: Add two items and remove them and check
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Clicks login button
    And Add to Chart Sauce Labs Backpack
    And Remove the Sauce Labs Backpack
    And Add to Chart Sauce Labs Bike Light
    And Remove the Sauce Labs Bike Light
    And Go to the chart
    Then The chart must be empty

  Scenario: Add four items to the chart and check
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Clicks login button
    And Add to Chart Sauce Labs Backpack
    And Add to Chart Sauce Labs Bike Light
    And Add to Chart Sauce Labs Bolt T-Shirt
    And Add to Chart Sauce Labs Fleece Jacket
    And Go to the chart
    Then The four items must be selected

  Scenario: Add two items and remove them and check
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Clicks login button
    And Add to Chart Sauce Labs Backpack
    And Remove the Sauce Labs Backpack
    And Add to Chart Sauce Labs Bike Light
    And Remove the Sauce Labs Bike Light
    And Add to Chart Sauce Labs Fleece Jacket
    And Remove Chart Sauce Labs Fleece Jacket
    And Go to the chart
    Then The chart must be empty

  Scenario: Add all items to the chart and check
    Given User is in saucedemo webpage
    When User fills username input
    And Fills password input
    And Clicks login button
    And Add to Chart Sauce Labs Backpack
    And Add to Chart Sauce Labs Bike Light
    And Add to Chart Sauce Labs Bolt T-Shirt
    And Add to Chart Sauce Labs Fleece Jacket
    And Add to Chart Sauce Labs Onesie
    And Go to the chart Test.allTheThings() T-Shirt (Red)
    Then The four items must be selected