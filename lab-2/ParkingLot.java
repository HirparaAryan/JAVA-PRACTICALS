public class ParkingLot {
private int twoWheelers;
private int fourWheelers;
private final int twoCap;
private final int fourCap;
private static long revenue = 0;
public ParkingLot(int twoCap, int fourCap) {
this.twoCap = twoCap;
this.fourCap = fourCap;
twoWheelers = 0;
fourWheelers = 0;
}
public void park(String vehicleType) {
if ("two".equals(vehicleType)) {
if (twoWheelers >= twoCap) {
System.out.println("Full");
} else {
twoWheelers++;
revenue = revenue + 20;
System.out.println("Two-wheeler parked");
}
} else if ("four".equals(vehicleType)) {
if (fourWheelers >= fourCap) {
System.out.println("Full");

} else {
fourWheelers++;
revenue = revenue + 40;
System.out.println("Four-wheeler parked");
}
}
}
public void leave(String vehicleType) {
if ("two".equals(vehicleType)) {
if (twoWheelers != 0) {
twoWheelers--;
}
}
if ("four".equals(vehicleType)) {
if (fourWheelers != 0) {
fourWheelers--;
}
}
}
public static void main(String[] args) {
ParkingLot lot = new ParkingLot(2, 2);
lot.park("two");
lot.park("two");
lot.park("two");
lot.park("four");
lot.park("four");
lot.park("four");
lot.leave("two");
System.out.println("Two Wheelers: " + lot.twoWheelers);
lot.leave("four");
System.out.println("Four Wheelers: " + lot.fourWheelers);
System.out.println("Revenue: " + ParkingLot.revenue);
System.out.println("25AIML021");
}
}