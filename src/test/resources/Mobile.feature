#Author: karthi@your.domain.com
@Mobile
Feature: Mobile Purchase Validation

Background:
    Given User launches flipkart application
    And User login flipkart by using credentials

  Scenario: Mobile validation 
    When User search mobiles
    And user select the mobile
    And User navigates into new window and click on add to cart
    Then user validate the cart page

@1dim @Data
  Scenario: Mobile validation one Dim list
    When User search mobiles by using one dim list
      | realme | iPhone | SAMSUNG |
    And user select the mobile
    And User navigates into new window and click on add to cart
    Then user validate the cart page

@Data
  Scenario: Mobile validation one Dim map
    When User search mobiles by using one dim map
      | phone1 | iPhone  |
      | phone2 | realme  |
      | phone3 | SAMSUNG |
    And user select the mobile
    And User navigates into new window and click on add to cart
    Then user validate the cart page

  Scenario Outline: 
    When User search mobiles "<phone>"
    And user select the mobile
    And User navigates into new window and click on add to cart
    Then user validate the cart page

    Examples: 
      | phone   |
      | iPhone  |
      | realme  |
      | SAMSUNG |
