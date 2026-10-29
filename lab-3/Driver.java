
public class Driver {
public static void main(String[] args) {
Point[] points = {
new Point(1, 2),
new Point(3, 4),
new Point(1, 2),
new Point(5, 6),
new Point(3, 4)
};

int distinctCount = 0;
for (int i = 0; i < points.length; i++) {
boolean alreadyExists = false;
boolean seen = false;
for (int k = 0; k < i; k++) {
if (points[i].equals(points[k])) {
alreadyExists = true;
seen = true;
break;
}
}
if (!alreadyExists) {
distinctCount++;
}
}
System.out.println("Distinct: " + distinctCount);
System.out.println("Roll No: 25AIML021");
}
}