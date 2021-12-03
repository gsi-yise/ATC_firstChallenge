Feature: First Google Search
  I want open the first result of my Google search

  Scenario: First Google Search Result
    Given User launch Chrome browser
    When User opens URL: "https://www.google.com"
    And User types in the search box the criteria "uciencia 2021"
    And User clic on the search button
    Then User clic the first result on the list if contains the criteria
    And The user close browser