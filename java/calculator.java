import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        if (people <= 0) {
            System.out.println("Invalid number of people");
        } else {
            System.out.println("Each person pays: " + (bill / people));
        }
        sc.close();
    }
}
