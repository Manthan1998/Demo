Feature: TestMeApp login and add to cart zz

  Background: Launching of the testmeapp zz
    Given App is launched with the url zz

  Scenario Outline: Login of the user
    Given Enter the username "<User>" zz
    Then Enter the password "<Pass>" zz
    Then User clicks on the login button zz

    Examples: 
      | User         | Pass        |
      | Ajaypal22995 | Ajay@22995  |
      | Lalitha      | Password123 |

  Scenario: Add & remove to cart zz
    Then Select the product from all categories zz
    Then click on add to cart zz
    Then click on cart button zz
    Then click on remove button zz
