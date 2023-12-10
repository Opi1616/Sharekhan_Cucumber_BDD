Feature: MarketWatchPage Feature

  Background: Login with credentials
    Given user is on ShareKhan page
    Given user has already logged in shareKhan
      | username | password  |
      |  3504691 | Rohi@1918 |

  Scenario: MarkeWatchPage elements displayed
    Given user is on MarkeWatch page
    Then MarketPage Elements should be displayed

  Scenario: MarkeWatch page elemets buttons Is Disabled
    Given user is on MarkeWatch page
    Then user verifed the My watchlist is underlined
    And user verifed the option Chain button is disabled

  Scenario: WatchList create and then script create and delete the Watchlist
    Given user is on MarkeWatch page
    Then user created watchList
    Then user deleted the WatchList
    And user is logout the ShareKhan Page
    
    Scenario: WatchList create and then Rename the watchlist
     Given user is on MarkeWatch page
    Then user created watchList
    Then user renamed the watchList
    And user is logout the ShareKhan Page
    
