$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/result.feature");
formatter.feature({
  "line": 1,
  "name": "Check the result",
  "description": "As a developer\nI want to make sure that my result logic is right\nSo that the game is on the rule",
  "id": "check-the-result",
  "keyword": "Feature"
});
formatter.before({
  "duration": 156156,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "i have 1 deck of cards",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "StepDefBlackjack.a_deck_of_cards(int)"
});
formatter.result({
  "duration": 117249576,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Player have points more than dealer",
  "description": "",
  "id": "check-the-result;player-have-points-more-than-dealer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "player draw a card with suit SPADES and rank JACK from the decks",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "player draw a card with suit SPADES and rank KING from the decks",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "dealer draw a card with suit DIAMONDS and rank EIGHT from the decks",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "dealer draw a card with suit DIAMONDS and rank KING from the decks",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "player will have total points equals 20",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "dealer will have total points equals 18",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "player have more points than dealer",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "player is the winner",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "SPADES",
      "offset": 29
    },
    {
      "val": "JACK",
      "offset": 45
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 7979217,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "SPADES",
      "offset": 29
    },
    {
      "val": "KING",
      "offset": 45
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 875718,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dealer",
      "offset": 0
    },
    {
      "val": "DIAMONDS",
      "offset": 29
    },
    {
      "val": "EIGHT",
      "offset": 47
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 310232,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dealer",
      "offset": 0
    },
    {
      "val": "DIAMONDS",
      "offset": 29
    },
    {
      "val": "KING",
      "offset": 47
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 323115,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "20",
      "offset": 37
    }
  ],
  "location": "StepDefBlackjack.i_will_have_total_points(String,int)"
});
formatter.result({
  "duration": 102554462,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dealer",
      "offset": 0
    },
    {
      "val": "18",
      "offset": 37
    }
  ],
  "location": "StepDefBlackjack.i_will_have_total_points(String,int)"
});
formatter.result({
  "duration": 152594,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBlackjack.more_point_than()"
});
formatter.result({
  "duration": 7234746,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    }
  ],
  "location": "StepDefBlackjack.is_the_winner(String)"
});
formatter.result({
  "duration": 88440,
  "status": "passed"
});
formatter.before({
  "duration": 31073,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "i have 1 deck of cards",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "StepDefBlackjack.a_deck_of_cards(int)"
});
formatter.result({
  "duration": 458453,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Player is busted",
  "description": "",
  "id": "check-the-result;player-is-busted",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "player draw a card with suit SPADES and rank EIGHT from the decks",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "player draw a card with suit SPADES and rank JACK from the decks",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "player draw a card with suit SPADES and rank SEVEN from the decks",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "dealer draw a card with suit DIAMONDS and rank EIGHT from the decks",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "dealer draw a card with suit DIAMONDS and rank KING from the decks",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "player will have total points equals 25",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "player is busted",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "dealer will have total points equals 18",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "dealer is the winner",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "SPADES",
      "offset": 29
    },
    {
      "val": "EIGHT",
      "offset": 45
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 102727,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "SPADES",
      "offset": 29
    },
    {
      "val": "JACK",
      "offset": 45
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 3087929,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "SPADES",
      "offset": 29
    },
    {
      "val": "SEVEN",
      "offset": 45
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 247087,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dealer",
      "offset": 0
    },
    {
      "val": "DIAMONDS",
      "offset": 29
    },
    {
      "val": "EIGHT",
      "offset": 47
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 358984,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dealer",
      "offset": 0
    },
    {
      "val": "DIAMONDS",
      "offset": 29
    },
    {
      "val": "KING",
      "offset": 47
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 96045,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "25",
      "offset": 37
    }
  ],
  "location": "StepDefBlackjack.i_will_have_total_points(String,int)"
});
formatter.result({
  "duration": 159698,
  "status": "passed"
});
formatter.match({
  "location": "StepDefBlackjack.player_is_busted()"
});
formatter.result({
  "duration": 145625,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dealer",
      "offset": 0
    },
    {
      "val": "18",
      "offset": 37
    }
  ],
  "location": "StepDefBlackjack.i_will_have_total_points(String,int)"
});
formatter.result({
  "duration": 105597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dealer",
      "offset": 0
    }
  ],
  "location": "StepDefBlackjack.is_the_winner(String)"
});
formatter.result({
  "duration": 236953,
  "status": "passed"
});
formatter.before({
  "duration": 103978,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "i have 1 deck of cards",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "StepDefBlackjack.a_deck_of_cards(int)"
});
formatter.result({
  "duration": 1451187,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Ace can be one or eleven",
  "description": "",
  "id": "check-the-result;ace-can-be-one-or-eleven",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "player draw a card with suit SPADES and rank JACK from the decks",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "player draw a card with suit SPADES and rank ACE from the decks",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "player will have total points equals 21",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "player draw a card with suit SPADES and rank FIVE from the decks",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "player will have total points equals 16",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "SPADES",
      "offset": 29
    },
    {
      "val": "JACK",
      "offset": 45
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 445327,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "SPADES",
      "offset": 29
    },
    {
      "val": "ACE",
      "offset": 45
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 82544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "21",
      "offset": 37
    }
  ],
  "location": "StepDefBlackjack.i_will_have_total_points(String,int)"
});
formatter.result({
  "duration": 8040754,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "SPADES",
      "offset": 29
    },
    {
      "val": "FIVE",
      "offset": 45
    }
  ],
  "location": "StepDefBlackjack.draw_card_from_the_deck(String,String,String)"
});
formatter.result({
  "duration": 87536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "player",
      "offset": 0
    },
    {
      "val": "16",
      "offset": 37
    }
  ],
  "location": "StepDefBlackjack.i_will_have_total_points(String,int)"
});
formatter.result({
  "duration": 87561,
  "status": "passed"
});
formatter.before({
  "duration": 1212444,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "i have 1 deck of cards",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "StepDefBlackjack.a_deck_of_cards(int)"
});
formatter.result({
  "duration": 296587,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "",
  "description": "",
  "id": "check-the-result;",
  "type": "scenario",
  "keyword": "Scenario"
});
});