public class Fraction {
private int num, den;
public Fraction(int num, int den) {
int x = gcd(Math.abs(num), Math.abs(den));
this.num = num / x;
this.den = den / x;
}
private int gcd(int a, int b) {
if (b == 0)
return a;
return gcd(b, a % b);
}
public void show() {
System.out.print(num + "/" + den);
}
public boolean same(Fraction f) {
return num == f.num && den == f.den;
}
}
