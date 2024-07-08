import java.util.Scanner;

public class SafeInput {

    // Method A: getNonZeroLenString
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    // Method B: getInt
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.next(); // clear the invalid input
            }
            pipe.nextLine(); // clear the newline character
        } while (!validInput);
        return retInt;
    }

    // Method C: getDouble
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                pipe.next(); // clear the invalid input
            }
            pipe.nextLine(); // clear the newline character
        } while (!validInput);
        return retDouble;
    }

    // Method D: getRangedInt
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                if (retInt >= low && retInt <= high) {
                    validInput = true;
                } else {
                    System.out.println("Input out of range. Please enter a value between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.next(); // clear the invalid input
            }
            pipe.nextLine(); // clear the newline character
        } while (!validInput);
        return retInt;
    }

    // Method E: getRangedDouble
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                if (retDouble >= low && retDouble <= high) {
                    validInput = true;
                } else {
                    System.out.println("Input out of range. Please enter a value between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                pipe.next(); // clear the invalid input
            }
            pipe.nextLine(); // clear the newline character
        } while (!validInput);
        return retDouble;
    }

    // Method F: getYNConfirm
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("N")) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        } while (!validInput);
        return response.equalsIgnoreCase("Y");
    }

    // Method G: getRegExString
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString = "";
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextLine()) {
                retString = pipe.nextLine();
                if (retString.matches(regEx)) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please match the pattern: " + regEx);
                }
            } else {
                System.out.println("Invalid input. Please enter a valid string.");
                pipe.next(); // clear the invalid input
            }
        } while (!validInput);
        return retString;
    }

    // Method H: prettyHeader
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgWidth = msg.length();
        int padding = (totalWidth - msgWidth - 6) / 2;

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        if (msgWidth % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("***");

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
