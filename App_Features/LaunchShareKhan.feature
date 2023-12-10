Feature: launch ShareKhan

  Scenario: launch ShareKhan on browser
    Given user is on ShareKhan page
    When user gets the title of the page
    Then page title should be "Sharekhan, Stock Market, Online Share Trading, Online Broking, Market Today, Live Quotes, Sensex, Nifty."

  Scenario: MARKET is displayed
    Given user is on ShareKhan page
    Then MARKET,NEW TOMARKET,SUPERINVESTOR,ACTIVETRADER,MUTUALFUNDS,RESEARCH,EDUCATIONFIRST & PRODUCTSANDSERVICES should be displayed

  Scenario: Menu and Menu Element is displayed
    Given user is on ShareKhan page
    Then Menu and Menu Element is displayed

  Scenario: mouse hovers on Menu links
    Given user is on ShareKhan page
    Then Mouse hoverover on Market,New To Market,Super Investor,Active Trader,Mutal Funds,Research,Education First and Product and Services

  Scenario: Login with correct credentials
    Given user is on ShareKhan page
    When user enters username "3504691"
    And user enters password "Rohi@1918"
    And user clicks on Login button
 
