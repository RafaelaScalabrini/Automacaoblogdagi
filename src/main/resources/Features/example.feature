

Feature: Fill out the form, click on the Enter Vehicle Data tab and press next

  Scenario: Enter Vehicle Data Form
    Given I enter the Enter vehicle data page
    When Fill out the form, Enter Vehicle Data tab and if you select the next button
    Then Then the system will go to the Enter Insurant Data page
    Given I enter the Insurant Data
    When Fill out the form, Enter Insurant Data tab and if you select the next button
    Then Then the system will go to the Enter Insurant Data page
    Given I enter the Enter product data
    When Fill out the form, Enter product data tab and if you select the next button
    Then Then the system will go to the Enter product data
    Given I enter the Select Price Option
    When Fill out the form, Select Price Option tab and if you select the next button
    Then Then the system will go to the  Send Quote
    Given I enter the Send Quote
    When Fill out the form, Send Quote tab and if you select the next button
    Then Then the system should display Sending e-mail success!”