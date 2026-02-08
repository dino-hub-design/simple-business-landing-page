import java.util.ArrayList;
import java.util.Scanner;

class Lead {
    String name;
    String email;
    String message;

    Lead(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nEmail: " + email + "\nMessage: " + message + "\n----------------------";
    }
}

public class LeadCollector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lead> leads = new ArrayList<>();

        System.out.println("=== BusinessCo Lead Collector (Console Demo) ===");

        while (true) {
            System.out.println("\n1) Add new lead");
            System.out.println("2) View all leads");
            System.out.println("3) Exit");
            System.out.print("Choose option: ");

            String choice = sc.nextLine().trim();

            if (choice.equals("1")) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter email: ");
                String email = sc.nextLine();

                System.out.print("Enter message: ");
                String message = sc.nextLine();

                leads.add(new Lead(name, email, message));
                System.out.println("\n✅ Lead saved!");

            } else if (choice.equals("2")) {
                if (leads.isEmpty()) {
                    System.out.println("\n(No leads yet)");
                } else {
                    System.out.println("\n=== Leads ===");
                    for (Lead lead : leads) {
                        System.out.println(lead);
                    }
                }

            } else if (choice.equals("3")) {
                System.out.println("\nGoodbye!");
                break;

            } else {
                System.out.println("\n❌ Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
