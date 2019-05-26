Feature: Check the result
  As a developer
  I want to make sure that my result logic is right
  So that the game is on the rule

  Background:
    Given i have 1 deck of cards

  Scenario: Player have points more than dealer
    When player draw a card with suit SPADES and rank JACK from the decks
    And player draw a card with suit SPADES and rank KING from the decks
    And dealer draw a card with suit DIAMONDS and rank EIGHT from the decks
    And dealer draw a card with suit DIAMONDS and rank KING from the decks
    Then player will have total points equals 20
    And dealer will have total points equals 18
    And player have more points than dealer
    And player is the winner

  Scenario: Player is busted
    When player draw a card with suit SPADES and rank EIGHT from the decks
    And player draw a card with suit SPADES and rank JACK from the decks
    And player draw a card with suit SPADES and rank SEVEN from the decks
    And dealer draw a card with suit DIAMONDS and rank EIGHT from the decks
    And dealer draw a card with suit DIAMONDS and rank KING from the decks
    Then player will have total points equals 25
    And player is busted
    And dealer will have total points equals 18
    And dealer is the winner

  Scenario: Ace can be one or eleven
    When player draw a card with suit SPADES and rank JACK from the decks
    And player draw a card with suit SPADES and rank ACE from the decks
    Then player will have total points equals 21

    When player draw a card with suit SPADES and rank FIVE from the decks
    Then player will have total points equals 16





