public class Thermostat {
private String locaƟon;
private int temperature;
private static final int MIN = 16;
private static final int MAX = 30;
private static int acƟveCount = 0;
// Constructor with locaƟon and starƟng temperature
public Thermostat(String locaƟon, int startTemp) {
this.locaƟon = locaƟon;
int temp = startTemp;
if (temp < MIN || temp > MAX) {
temp = 22;
}
temperature = temp;

acƟveCount++;
}
// Constructor with only locaƟon
public Thermostat(String locaƟon) {
this(locaƟon, 22);
}
public void raise() {
if (temperature == MAX) {
System.out.println("Already at maximum (30)");
} else {
temperature++;
}
}
public void lower() {
if (temperature == MIN) {
System.out.println("Already at minimum (16)");
} else {
temperature--;
}
}
public int getTemperature() {
return temperature;
}
public static int getAcƟveCount() {
return acƟveCount;
}
public static void main(String[] args) {
Thermostat first = new Thermostat("Living Room", 22);
Thermostat second = new Thermostat("Bedroom");
System.out.println("Increasing Temperature:");
for (int count = 1; count <= 10; count++) {
first.raise();
int current = first.getTemperature();
System.out.println(current);
}
System.out.println("Decreasing Temperature:");

for (int count = 1; count <= 20; count++) {
first.lower();
int current = first.getTemperature();
System.out.println(current);
}
System.out.println("Active Thermostats: " + Thermostat.getAcƟveCount());
}
}