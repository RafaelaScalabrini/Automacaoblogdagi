

Feature: 3 Test Scenarios from the Agibank Blog

  Scenario: Select news on the Agibank website
    Given that the user is on the application's home page
    When the user selects a specific news item from the Agibank menu
    Then the selected news is displayed in full screen with details
  Scenario: Search for careers
    Given that the user is on the home page of the Agi blog website: https://blogdoagi.com.br/
    When the user searches for a career
    Then a list of results related to the search is displayed
  Scenario: Subscribe to receive the main news from the Agi Blog
    Given that the user is on the Agi Blog home page
    When the user enters their email address in the newsletter subscription box and clicks the "Subscribe" button
    Then user then receives a subscription confirmation message and is added to the newsletter subscriber list
