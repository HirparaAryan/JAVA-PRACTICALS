package discount;
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
List<Double> prices =
Arrays.asList(100.0, 200.0, 500.0, 1000.0);
DiscountRule tenPercent =
price -> price * 0.90;
DiscountRule twentyPercent =
price -> price * 0.80;
DiscountRule flat50 =
price -> price - 50;
System.out.println("1. 10% Discount");
System.out.println("2. 20% Discount");

System.out.println("3. Flat 50 Discount");
System.out.print("Choose discount: ");
int choice = sc.nextInt();
DiscountRule selectedRule;
switch (choice) {
case 1:
selectedRule = tenPercent;
break;
case 2:
selectedRule = twentyPercent;
break;
case 3:
selectedRule = flat50;
break;
default:
System.out.println("Invalid choice");
return;
}
System.out.println("\nPrices after discount:");
for (double price : prices) {
System.out.println(
price + " -> " + selectedRule.apply(price)
);
}
}
}