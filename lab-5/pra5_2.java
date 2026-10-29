public class pra5_2 {

public static void main(String[] args) {
Employee[] employees = {
new fulltime("Aryan", 101, 50000),
new parttime("Rahul", 102, 80, 500),
new intern("Jiya", 103, 15000),
new fulltime("Karan", 104, 60000),
new intern("Riya", 105, 12000)
};
double total = 0;
for (int i = 0; i < employees.length; i++) {
double salary = employees[i].monthlysalary();
System.out.println(employees[i].getname() + " Salary = " + salary);
if (employees[i] instanceof intern) {
System.out.println("Note: This employee is an Intern.");
}
total += salary;
}
System.out.println("Total Salary = " + total);
}
}
abstract class Employee {
private String name;
private int id;
public Employee(String name, int id) {
this.name = name;
this.id = id;
}
public String getname() {

return name;
}
public int getid() {
return id;
}
public abstract double monthlysalary();
};
class fulltime extends Employee {
private double fixedSalary;
public fulltime(String name, int id, double fixedSalary) {
super(name, id);
this.fixedSalary = fixedSalary;
}
public double monthlysalary() {
return fixedSalary;
}
}
class parttime extends Employee {
private double hours;
private double rate;
public parttime(String name, int id, double hours, double rate) {
super(name, id);
this.hours = hours;
this.rate = rate;
}
public double monthlysalary() {
return hours * rate;
}
}
class intern extends Employee {
private double stipend;
public intern(String name, int id, double stipend) {
super(name, id);
this.stipend = stipend;

}
public double monthlysalary() {
return stipend;
}
}