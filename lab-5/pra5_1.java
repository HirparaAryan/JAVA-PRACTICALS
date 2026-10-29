public class pra5_1 {

public static void main(String[] args) {
Shape[] shapes = {
new circle(5),
new rectangle(4, 6),
new triangle(3, 8),
new circle(2)
};
double total = 0;
double largest = 0;
for (int i = 0; i < shapes.length; i++) {
double a = shapes[i].area();
System.out.println("Area = " + a);
total += a;
if (a > largest) {
largest = a;
}
}
System.out.println("Total Area = " + total);
System.out.println("Largest Area = " + largest);
}
}
abstract class Shape {
public abstract double area();
}
class circle extends Shape{
private double radius;
public circle(double radius) {


this.radius = radius;
}
public double area() {
return Math.PI * radius * radius;
}
}
class rectangle extends Shape {
private double length;
private double width;
public rectangle(double l, double w) {
this.length = l;
this.width = w;
}
public double area() {
return length * width;
}
}
class triangle extends Shape {
private double base;
private double height;
public triangle(double b, double h) {
this.base = b;
this.height = h;
}
public double area() {
return 0.5 * base * height;
}
}