Feature: Draw cards
  As a player
  I want to draw cards
  So that i can have more points

  Background:
    Given i have 1 deck of cards

  Scenario: Draw a card
    When player draw a card with suit SPADES and rank TWO from the decks
    Then i will have card with suit SPADES and rank TWO in my hand
    And player will have total points equals 2
    And the amount of card in the deck is 51

  Scenario: Draw many cards
    When player draw a card with suit HEARTS and rank FOUR from the decks
    And player draw a card with suit DIAMONDS and rank EIGHT from the decks
    And player draw a card with suit CLUBS and rank JACK from the decks
    Then i will have card with suit DIAMONDS and rank EIGHT in my hand
    And i will have card with suit HEARTS and rank FOUR in my hand
    And i will have card with suit CLUBS and rank JACK in my hand
    And player will have total points equals 22
    And the amount of card in the deck is 49

