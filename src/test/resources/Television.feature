@TV
Feature: Tv validation


  Background:
    Given User launches flipkart application
    And User login flipkart by using credentials

  Scenario: Mobile validation 
    When User search tv
    And user select the tv
    And User navigates into new window and click on add to cart
    Then user validate the cart page

 
