Feature: PortFolio Page feature

  Background: Login with credentials
    Given user is on ShareKhan page
    Given user has already logged in shareKhan
      | username | password  |
      |  3504691 | Rohi@1918 |

  Scenario: portFolioPage elements displayed
    Given user is on portFolio page
    Then Name and SearchBar Elements should be displayed
    And user is logout the ShareKhan Page

  Scenario: Add Virtual and Add Scrip and then delete the scrip
    Given user is on portFolio page
    Then user is add the virtual
    And user is add the scrip
    Then user is delete the scrip
    Then user is delete the virtual
    And user is logout the ShareKhan Page

  Scenario: User should rename the virtual portFolio
    Given user is on portFolio page
    Then user is add the virtual
    And user renamed the virtual
    And user is logout the ShareKhan Page
    
  Scenario: User Mouse hover over on the elements
   Given user is on portFolio page
    Then user mouse Hover On portFolio  Elements
     And user is logout the ShareKhan Page
  
