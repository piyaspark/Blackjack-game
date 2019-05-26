Feature: Betting money
  As a player
  I want to bet my money on gambling
  So that if i am the winner, i will get my betting money.

  Background:
    Given a player with money 1000 in balance

  Scenario: Show player's money and bet money
    When I want to bet 100
    Then The system show i have 900 in my balance
    And Bet money is 100

  Scenario: Bet with negative number
    When I want to bet -300
    Then a player with money 700 in balance
    And Bet money is 300


