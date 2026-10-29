import java.util.Scanner;

public class DriverC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] logs = {
            "10:05 Om Hello there",
            "10:10 Mansi How are you?",
            "MalformedLine",
            "10:15 Radhika hello everyone"
        };

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        ChatFilter cf = new ChatFilter();

        String report = cf.filterMessages(logs, keyword);

        System.out.println("\nMatches: " + cf.getMatches());
        System.out.println(report);

        sc.close();
    }
}
