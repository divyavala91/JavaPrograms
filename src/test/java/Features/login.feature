# Created by Zadmin at 18-05-2019
Feature: Application login

  Scenario Outline: Home page default login
    Given User is on landing page
    When User login into application with <username> and <password>
    Then Home page is populated
    And All the other pages are present "true"

    Examples:
    |username |password |
    |jin      |1234     |
    |john     |4321     |

