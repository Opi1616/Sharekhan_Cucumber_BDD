Feature: TradeNow Page Feature
Background: Login with credentials
    Given user is on ShareKhan page
    Given user has already logged in shareKhan
      | username | password  |
      |  3504691 | Rohi@1918 |
      
Scenario: TradeNow Page elements displayed
    Given user is on TradeNow Page
    Then TradeNow Page Elements should be displayed
    
 Scenario: MarkeWatch page elemets buttons Is Disabled
   Given user is on TradeNow Page
    Then user verifed the Normal Order is underlined
    And user verifed the option Place Order button is disabled
    And user verifed the option reset button is disabled
    And user is logout the ShareKhan Page 
    
 Scenario: Buy order   
  Given user is on TradeNow Page
  Then verify that theuser is able to place order
  
