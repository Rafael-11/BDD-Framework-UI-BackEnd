@wip
Feature: User on login page

  Background: Environment is ready
    Given user is already on on login page

  Scenario:user able to login to app
    When I enters 'username'
    And I enters 'password'
    And  I click on 'login btn'
    Then I should see 'title'