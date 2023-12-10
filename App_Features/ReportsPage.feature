Feature: ReportsPage Feature
Background: Login with credentials
    Given user is on ShareKhan page
    Given user has already logged in shareKhan
      | username | password  |
      |  3504691 | Rohi@1918 |
      
Scenario: ReportsPage elements displayed
    Given user is on Reports Page
    Then Reports Page all corresponding links should be displayed
    And user is logout the ShareKhan Page   