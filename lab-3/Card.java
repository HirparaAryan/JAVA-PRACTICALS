public class Card {
private String rank, suit;
public Card(String rank, String suit) {
this.rank = rank;
this.suit = suit;
}

public void show() {
System.out.print(rank + " of " + suit);
}
public boolean same(Card c) {
return rank.equals(c.rank) && suit.equals(c.suit);
}
}