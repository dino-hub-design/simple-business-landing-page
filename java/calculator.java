public class Calculator {

    // Calculate total with tax
    public static double calculateTotal(double amount, double taxRate) {
        return amount + (amount * taxRate);
    }

    // Split bill between people
    public static double splitBill(double total, int people) {
        if (people <= 0) {
            throw new IllegalArgumentException("Number of people must be greater than zero.");
        }
        return total / people;
    }

    // Calculate percentage discount
    public static double applyDiscount(double amount, double discountPercent) {
        return amount - (amount * discountPercent / 100);
    }
}
