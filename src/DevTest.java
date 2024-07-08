import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String nonZeroLenString = SafeInput.getNonZeroLenString(in, "Enter a non-empty string");
        System.out.println("You entered: " + nonZeroLenString);

        // Test getInt
        int integer = SafeInput.getInt(in, "Enter an integer");
        System.out.println("You entered: " + integer);

        // Test getDouble
        double dbl = SafeInput.getDouble(in, "Enter a double");
        System.out.println("You entered: " + dbl);

        // Test getRangedInt
        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer in range", 1, 10);
        System.out.println("You entered: " + rangedInt);

        // Test getRangedDouble
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double in range", 1.0, 10.0);
        System.out.println("You entered: " + rangedDouble);

        // Test getYNConfirm
        boolean ynConfirm = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("You answered: " + (ynConfirm ? "Yes" : "No"));

        // Test getRegExString
        String regExString = SafeInput.getRegExString(in, "Enter a SSN (format: xxx-xx-xxxx)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered: " + regExString);

        // Test prettyHeader
        SafeInput.prettyHeader("Welcome to the Program");
    }
}
