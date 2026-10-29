@FunctionalInterface
interface Notifier {
void send(String message);
}
// Marker interface
interface Urgent {
}
public class NotificationDemo {
public static void main(String[] args) {
// Normal notifier
Notifier email = message ->
System.out.println("Email sent: " + message);
// SMS is marked as Urgent
Notifier sms = (Notifier & Urgent) message ->
System.out.println("SMS sent: " + message);
Notifier[] senders = {email, sms};
String message = "Meeting at 10 AM";
for (Notifier sender : senders) {
sender.send(message);
// Send again if sender is marked Urgent
if (sender instanceof Urgent) {
sender.send(message);
}

}
}
}