interface Switchable {
void on();
void off();
default void toggle() {
off();
on();
}
}
class Fan implements Switchable {
public void on() {
System.out.println("Fan is ON");
}
public void off() {
System.out.println("Fan is OFF");
}
}
class Light implements Switchable {
public void on() {
System.out.println("Light is ON");
}
public void off() {
System.out.println("Light is OFF");
}
}

@FunctionalInterface
interface SwitchPermission {
boolean maySwitchOn(Switchable device, int hour);
}

public class RemoteControl {
public static void main(String[] args) {
Switchable[] devices = {
new Fan(),
new Light()
};
System.out.println("Toggling devices:");
for (Switchable device : devices) {
device.toggle();
}
SwitchPermission permission1 = new SwitchPermission() {
public boolean maySwitchOn(Switchable device, int hour) {
return hour >= 6 && hour <= 22;
}
};
System.out.println("\nAnonymous Class:");
for (Switchable device : devices) {
if (permission1.maySwitchOn(device, 18)) {
device.on();
} else {
System.out.println("Device cannot be switched on");
}
}
SwitchPermission permission2 =
(device, hour) -> hour >= 6 && hour <= 22;
System.out.println("\nLambda Expression:");
for (Switchable device : devices) {
if (permission2.maySwitchOn(device, 23)) {
device.on();
} else {
System.out.println("Device cannot be switched on");
}
}
}
}