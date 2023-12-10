Feature: ShareKhan Accounts Page feature

  Background: Login with credentials
    Given user is on ShareKhan page
    Given user has already logged in shareKhan
      | username | password  |
      |  3504691 | Rohi@1918 |

  Scenario: Accounts elements displayed
    Given user is on Accounts page
    Then Account bank Deatils all Elements should be displayed

  Scenario: Bank Account No match
    Given user is on Accounts page
    Then user gets Banks Account Deatils this Info should be match with user Account Deatils
    And user is logout the ShareKhan Page

  Scenario: Select the dropDown values
    Given user is on Accounts page
    Then user selects IPO Account
    Then user selects EMF Account
    And user is logout the ShareKhan Page
