
public class CardTest {
public static void main(String[] args) {
Card[] list = new Card[5];
int count = 0;
Card[] arr = {
new Card("Ace", "Spades"),
new Card("King", "Hearts"),
new Card("Queen", "Hearts"),
new Card("Ace", "Spades"),
new Card("Jack", "Clubs")
};
for (Card c : arr) {
boolean found = false;
for (int i = 0; i < count; i++) {
if (list[i].same(c)) {
found = true;
break;
}
}
if (found) {
System.out.print("Duplicate found: ");
c.show();
System.out.println();
break;
}
list[count] = c;
count++;
}
System.out.println("Roll No: 25AIML021");

}
}