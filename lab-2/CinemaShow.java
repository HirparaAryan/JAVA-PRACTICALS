public class CinemaShow {
private String Ɵtle;
private int seatsAvailable;
private final int capacity;
private static int totalBooked = 0;
public CinemaShow(String Ɵtle, int capacity) {
this.Ɵtle = Ɵtle;
this.capacity = capacity;
this.seatsAvailable = capacity;
}
public CinemaShow(String Ɵtle) {
this(Ɵtle, 100);
}
public boolean book(int seats) {
if (seats > seatsAvailable) {
return false;
}
seatsAvailable = seatsAvailable - seats;
totalBooked += seats;
return true;
}
public void cancel(int seats) {
seatsAvailable += seats;
if (seatsAvailable >= capacity) {
seatsAvailable = capacity;
}
}
public int getSeatsAvailable() {
return seatsAvailable;
}

public static int getTotalBooked() {
return totalBooked;
}
public static void main(String[] args) {
CinemaShow movie = new CinemaShow("Avengers", 50);
boolean status;
status = movie.book(20);
System.out.println(status);
System.out.println(movie.getSeatsAvailable());
status = movie.book(15);
System.out.println(status);
System.out.println(movie.getSeatsAvailable());
status = movie.book(20);
System.out.println(status);
System.out.println(movie.getSeatsAvailable());
movie.cancel(10);
System.out.println(movie.getSeatsAvailable());
status = movie.book(15);
System.out.println(status);
System.out.println(movie.getSeatsAvailable());
System.out.println(CinemaShow.getTotalBooked());
System.out.println("25AIML021");
}
}