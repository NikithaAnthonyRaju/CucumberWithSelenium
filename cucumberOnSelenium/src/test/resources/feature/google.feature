Feature: Google - launch Gmail

Background:
	Given Application URL & driver details from Configuration file
	#When reading a Json "testData2222.json"

  Scenario: launch the browser in Chrome
    Given Application URL & driver details from Configuration file
    When launch the application on browser 
    Then navigate to forWork Page
    And Click on Get Started button
    
  @Tag  
  Scenario: launch the browser in Firefox
    Given Application URL & driver details from Configuration file
