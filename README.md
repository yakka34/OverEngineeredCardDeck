Experiment to find out if generic card deck implementation can be used for completely different card games.
Yes, it’s possible.

Decks operate on the following principles:
1)	Deck must implement Deck-Interface
2)	Deck can hold any element that implement the Card-interface
3)	Deck must be built by extending BaseDeckBuilder

Two examples

Standard playing card represents regular deck of cards including club, diamond, hearth and spade and ranks through 1-13 (+Joker).
Playing card deck uses stack data model to represent real world deck.

Stonehearth mimics hearthstone where cards have wide variety of stats.
This deck includes minion, spell, weapon and hero cards. 
Stonehearth deck implementation is different from playing card deck. 
Deck doesn’t allow duplicates in addition in stoneheart deck is the same thing as players hand, there is no deck to which draw from.
