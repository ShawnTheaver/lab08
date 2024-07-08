import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter a SSN (format: xxx-xx-xxxx)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered SSN: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Enter a UC Student M number (format: Mxxxxx)", "^[Mm]\\d{5}$");
        System.out.println("You entered M number: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("You entered menu choice: " + menuChoice);
    }
}
