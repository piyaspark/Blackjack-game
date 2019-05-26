Feature: Draw cards
  As a player
  I want to draw cards
  So that i can have more points

  Background:
    Given i have 1 deck of cards

  Scenario: Draw a card
    When i want to draw a card with suit SPADES and rank TWO from the decks
    Then i will have my first card is |♠2| in my hand