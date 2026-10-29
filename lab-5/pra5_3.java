public class pra5_3 {

public static void main(String[] args) {
Media[] media = {
new movie("Avengers", 101, 3),
new book("Harry PoƩer", 102, 5),
new game("FIFA 25", 103, 2),
new movie("Interstellar", 104, 4)
};
double total = 0;
for (int i = 0; i < media.length; i++) {
double fee = media[i].latefee();
System.out.println(media[i].geƟd() + " " + media[i].geƫtle() + " Late Fee = " + fee);
total += fee;
}
System.out.println("Total Late Fees = " + total);
}
}
abstract class Media {
private String Ɵtle;
private int id;
protected int latedays;

public Media(String Ɵtle, int id, int latedays) {
this.Ɵtle = Ɵtle;
this.id = id;
this.latedays = latedays;
}
public String geƫtle() {
return Ɵtle;
}
public int geƟd() {
return id;
}
public abstract double latefee();
}
class movie extends Media {
public movie(String Ɵtle, int id, int latedays) {
super(Ɵtle, id, latedays);
}
public double latefee() {
return latedays * 10;
}
}
class book extends Media {
public book(String Ɵtle, int id, int latedays) {
super(Ɵtle, id, latedays);
}
public double latefee() {
return latedays * 5;
}
}
class game extends Media {
public game(String Ɵtle, int id, int latedays) {
super(Ɵtle, id, latedays);
}
public double latefee() {

return latedays * 15;
}
}