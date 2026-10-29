public class FractionTest {
public static void main(String[] args) {
Fraction a = new Fraction(1, 2);
Fraction b = new Fraction(2, 4);
Fraction c = new Fraction(3, 6);
a.show();
System.out.println();
b.show();
System.out.println();
c.show();
System.out.println();
System.out.println("a equals b: " + a.same(b));
System.out.println("b equals c: " + b.same(c));
System.out.println("a equals c: " + a.same(c));
System.out.println("Roll No: 25AIML021");
}
}