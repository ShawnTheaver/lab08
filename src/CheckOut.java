import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        boolean moreItems;

        do {
            double price = SafeInput.getRangedDouble(in, "Enter the price of the item", 0.50, 10.00);
            total += price;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (moreItems);

        System.out.printf("Your total cost is: $%.2f%n", total);
    }
}
