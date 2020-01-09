Feature: TestMeApp login and add to cart

  Background: Launching of the testmeapp
    Given App is launched with the url

  Scenario Outline: Login of the user
    Given Enter the username "<User>"
    Then Enter the password "<Pass>"
    Then User clicks on the login button
    Then Select the product from all categories
    Then click on add to cart
    Then click on cart button
    Then click on remove button

    Examples: 
      | User    | Pass        |
      | Lalitha | Password123 |
      | Lalitha | Password123 |
